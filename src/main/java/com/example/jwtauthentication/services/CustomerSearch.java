package com.example.jwtauthentication.services;

import com.example.jwtauthentication.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerSearch {
      Customer getCustomer(String  id);
}
