package com.example.JwtAuthentication.serviceimpl;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomUserDetailsService implements UserDetailsService {
//    @Autowired

    public UserDetails loadUserByUsername(String userDetails) throws UsernameNotFoundException {
        if(userDetails.equals("Gaurav")){
            Set<GrantedAuthority> authorities = new HashSet<>();
         //   authorities.add(new SimpleGrantedAuthority("Admin"));
            authorities.add(new SimpleGrantedAuthority("USER"));
              return new User("Gaurav","Gaurav123", Collections.unmodifiableCollection(authorities));
        }else {
            throw new UsernameNotFoundException("Invalid User");
        }
    }

}