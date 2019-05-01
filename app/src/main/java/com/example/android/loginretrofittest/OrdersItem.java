package com.example.android.loginretrofittest;


//TODO relative layout check in orderitem.xml

import java.util.List;

public class OrdersItem {

    private List<Orders> orders;

    public OrdersItem(List<Orders> orders) {
        this.orders = orders;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    //    private List<Dishes> dishes;
//
//    public OrdersItem(List<Dishes> dishes) {
//        this.dishes = dishes;
//    }
//
//    public List<Dishes> getDishes() {
//        return dishes;
//    }
}
