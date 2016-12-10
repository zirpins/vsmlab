package de.hska.iwi.client.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AnonymousAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Adelheid Knodel
 */
//Enable OAuth2 Single Sign On
//    an OAuth2 client authentication filter is added to the Spring http security chain. 
//    It can be used to authenticate users and request access code for resource access.

@Configuration
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {

 @Autowired
 protected void init(AuthenticationManagerBuilder builder) {
     if (!builder.isConfigured()) {
         builder.authenticationProvider(new AnonymousAuthenticationProvider("default"));
     }
 }

 
 /*
		The "/", "/login" and "/webjars/**" paths are configured to not require any authentication. 
		All other paths must be authenticated.     
	*/
 @Override
 protected void configure(HttpSecurity http) throws Exception {
     http.antMatcher("/**")
             .authorizeRequests()
             .antMatchers("/", "/login**", "/webjars/**").permitAll()
             .anyRequest().authenticated();
 }

}