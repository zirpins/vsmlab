package de.hska.iwi.oauth.server.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author Adelheid Knodel
 */
@RestController
public class UserInfoController {

    @RequestMapping(value = "/user")
    public Principal userInfo(@AuthenticationPrincipal Principal user) {
    	// System.out.println("------------ getting user information -----------");
        return user;
    }
}
