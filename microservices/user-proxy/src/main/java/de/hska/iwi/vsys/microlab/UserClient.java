package de.hska.iwi.vsys.microlab;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Component
public class UserClient {

	private final Map<Long, User> userCache = new LinkedHashMap<Long, User>();

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "getUsersCache", commandProperties = {
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "2") })
	public Iterable<User> getUsers() {
		Collection<User> users = new HashSet<User>();
		User[] tmpusers = restTemplate.getForObject("http://user-service/users", User[].class);
		Collections.addAll(users, tmpusers);
		userCache.clear();
		users.forEach(u -> userCache.put(u.getId(), u));
		return users;
	}

	@HystrixCommand(fallbackMethod = "getUserCache", commandProperties = {
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "2") })
	public User getUser(Long userId) {
		User tmpuser = restTemplate.getForObject("http://user-service/users/" + userId, User.class);
		userCache.putIfAbsent(userId, tmpuser);
		return tmpuser;
	}

	public Iterable<User> getUsersCache() {
		return userCache.values();
	}

	public User getUserCache(Long userId) {
		return userCache.getOrDefault(userId, new User());
	}

}
