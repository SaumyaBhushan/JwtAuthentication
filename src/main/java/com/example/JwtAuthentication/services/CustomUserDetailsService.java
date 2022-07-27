package com.example.JwtAuthentication.services;

import com.example.JwtAuthentication.model.CustomUserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {
//    @Autowired

    @Override
    public CustomUserDetails loadUserByUsername(String userDetails) throws UsernameNotFoundException {
        if(userDetails.equals("Gaurav")){
            List<String> authorites = new ArrayList<>();
            authorites.add("user");
            authorites.add("Admin");
              return new CustomUserDetails("gaurav@gmail.com","Gaurav","Gaurav");
        }else {
            throw new UsernameNotFoundException("Invalid User");
        }
    }

}
