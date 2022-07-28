package com.example.jwtauthentication.serviceimpl;

import com.example.jwtauthentication.model.Order;
import com.example.jwtauthentication.services.OrderSearch;

public class OrderSearchimpl implements OrderSearch {

    @Override
    public Order getOrderDetailsbyID(String orderId) {
        return null;
    }

    @Override
    public Order[] getOrderDetailsbyCustomerID() {
        return new Order[0];
    }

    @Override
    public String getOrderStatusbyID() {
        return null;
    }

    @Override
    public Order[] searchOrderByDate(String orderDate) {
        return new Order[0];
    }

    @Override
    public Order[] searchOrderByOrderNo(String orderNumber) {
        return new Order[0];
    }

    @Override
    public Order[] searchOrderByCustomerName(String customerName) {
        return new Order[0];
    }

    @Override
    public Order[] searchOrderByDeliveryMode(String deliveryMode) {
        return new Order[0];
    }

    @Override
    public Order[] searchOrderByOrderStatus(String orderStatus) {
        return new Order[0];
    }

    @Override
    public String applyVoucher(String voucher,String orderId) {
        Order o=this.getOrderDetailsbyID(orderId);
        o.applyVoucher(voucher);
        return "Success";
    }
    @Override
    public String cancelOrderById(String orderId) {
        Order o=this.getOrderDetailsbyID(orderId);
        o.setOrderStatus("Cancel");
        return "Success";
    }

}
