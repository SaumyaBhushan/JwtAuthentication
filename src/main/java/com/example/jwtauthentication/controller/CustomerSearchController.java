package com.example.jwtauthentication.controller;

import com.example.jwtauthentication.model.Customer;
import com.example.jwtauthentication.services.CustomerSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerSearchController {
    @Autowired
  private CustomerSearch customerSearch;
    @GetMapping(value = "/{id}")
    public Customer getOrderByIDs(@PathVariable String id) {
         return customerSearch.getCustomer(id);
    }
}
