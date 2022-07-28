package com.example.jwtauthentication.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Home {
    @RequestMapping("/welcome")
//    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String welcome() {
        String text = "this is private page ";
        text+= "this page is not allowed to unauthenticated users";
        return text;
    }

    @GetMapping("/user")
    @PreAuthorize("hasAuthority('USER')")
    public Principal save(Principal principal) {
        return principal;
    }



    @RequestMapping("/getusers")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String getUser() {
        return "{\"name\":\"Gaurav\"}";
    }
}
