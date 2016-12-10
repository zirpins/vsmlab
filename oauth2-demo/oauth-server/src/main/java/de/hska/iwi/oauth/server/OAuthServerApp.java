package de.hska.iwi.oauth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author Adelheid Knodel
 */
@SpringBootApplication
@EnableResourceServer
public class OAuthServerApp {


    public static void main(String[] args) {
        SpringApplication.run(OAuthServerApp.class, args);
    }





}
