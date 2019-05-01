package com.example.android.loginretrofittest;

import java.util.ArrayList;

public class KitchenOrders {

    private boolean error;
    private String message;
    private ArrayList<Orders> orders;

    public KitchenOrders(boolean error, String message, ArrayList<Orders> orders) {
        this.error = error;
        this.message = message;
        this.orders = orders;
    }

    public boolean isError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public ArrayList<Orders> getOrders() {
        return orders;
    }
}
