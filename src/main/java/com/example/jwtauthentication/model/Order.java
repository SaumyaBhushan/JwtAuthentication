package com.example.jwtauthentication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String orderID;
    private String CustomerID;
    private Product[] Cart;
    private Delivery Delivery;
    private String OrderStatus;
    private String CustomerName;
    private String CustomerEmail;
    private String Currency;
    private Date OrderDate;
    private Double OrderPrice;
    private Double FinalOrderPrice;

}
