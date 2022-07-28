package com.example.jwtauthentication.serviceimpl;

import com.example.jwtauthentication.model.Customer;
import com.example.jwtauthentication.services.CustomerSearch;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CustomerSearchImpl implements CustomerSearch {

    RestTemplate restTemplate=new RestTemplate();

    @Override
    public Customer getCustomer(String id) {
        return restTemplate.getForObject("http://localhost:8080/"+id, Customer.class);
    }


}
