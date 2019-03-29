package com.example.android.loginretrofittest;


//TODO relative layout check in orderitem.xml

import java.util.List;

public class OrdersItem {

    private List<Dishes> dishes;

    public OrdersItem(List<Dishes> dishes) {
        this.dishes = dishes;
    }

    public List<Dishes> getDishes() {
        return dishes;
    }
}
