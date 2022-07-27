package com.example.JwtAuthentication.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {
//    @Autowired
//    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userDetails) throws UsernameNotFoundException {
        if(userDetails.equals("Gaurav")){
            List<String> authorites = new ArrayList<>();
            authorites.add("user");
            authorites.add("Admin");
              return new User("Gaurav", "Gaurav123",new ArrayList<>());
        }else {
            throw new UsernameNotFoundException("Invalid User");
        }
    }
}
