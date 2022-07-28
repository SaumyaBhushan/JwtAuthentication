package com.example.jwtauthentication.serviceimpl;

import com.example.jwtauthentication.services.CustomerSearch;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CustomerSearchImpl implements CustomerSearch {

    RestTemplate restTemplate=new RestTemplate();

    @Override
    public List<String> getCustomer(String id) {
        List customer= restTemplate.getForObject("http://localhost:8080/"+id, List.class);
         return   customer;
    }


}
