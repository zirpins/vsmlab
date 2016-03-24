package de.hska.iwi.vslab;

import org.springframework.web.client.RestTemplate;

public class SpringRestDemoClient {
	// Thread save
	private static RestTemplate restTemplate = new RestTemplate();

	public static void main(String[] args) {
		String url = "http://localhost:8080/hello";
		String msg = restTemplate.getForObject(url, String.class);
		System.out.println(msg);
	}

}
