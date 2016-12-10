package de.hska.iwi.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ClientController {

  
	  @Autowired
	  OAuth2RestTemplate template;

  
// 
//  https://spring.io/guides/tutorials/spring-boot-oauth2/
  
  @Bean
  public OAuth2RestTemplate oauth2RestTemplate(OAuth2ProtectedResourceDetails resource, OAuth2ClientContext context) {
  	return new OAuth2RestTemplate(resource, context);
  }
  
  
   @RequestMapping("/books")
  public String books() {
	   System.out.println("test template" + template.toString());
      return template.getForObject("http://localhost:8082/books", String.class);
  }

  @RequestMapping("/user")
  public String user() {
      return template.getForObject("http://localhost:8081/auth/user", String.class);
  }
}

