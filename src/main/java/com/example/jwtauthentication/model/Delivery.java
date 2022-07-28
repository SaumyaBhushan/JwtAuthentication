package com.example.jwtauthentication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Delivery {
    private String DeliveryID;
    private String DeliveryType;
    private String DeliveryAddress;
    private String DeliveryMode;
    private String TrackingNumber;
    private String CourierType;

}
