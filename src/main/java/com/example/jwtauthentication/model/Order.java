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
    private String DeliveryMode;
    private Delivery Delivery;
    private String OrderStatus;
    private String CustomerName;
    private String CustomerEmail;
    private String Currency;
    private String Voucher;
    private Date OrderDate;
    private Double OrderPrice;
    private Double FinalOrderPrice;

    public Double getOrderPrice() {
        return OrderPrice;
    }

    public Double getFinalOrderPrice() {
        return FinalOrderPrice;
    }

    public void setFinalOrderPrice(Double finalOrderPrice) {
        FinalOrderPrice = finalOrderPrice;
    }
    public boolean applyVoucher(String Voucher) {
        this.applyVoucher(Voucher);
        // Code to apply the voutcher
        this.setFinalOrderPrice(this.getOrderPrice()/2);
        return true;
    }


}
