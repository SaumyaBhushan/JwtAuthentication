package com.example.JwtAuthentication.services;

import com.example.JwtAuthentication.model.CustomUserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface CustomUserDetailIn {

    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
    public CustomUserDetails loadUserByEmail(String email) throws UsernameNotFoundException;

}
