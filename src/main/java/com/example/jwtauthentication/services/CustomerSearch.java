package com.example.jwtauthentication.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerSearch {
       List<String> getCustomer(String  id);
}
