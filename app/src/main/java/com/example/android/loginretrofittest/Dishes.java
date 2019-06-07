package com.example.android.loginretrofittest;

public class Dishes {

    private String dishName;
    private String location;
    private int kitchen;

    public Dishes(String dishName, String location, int kitchen) {
        this.dishName = dishName;
        this.location = location;
        this.kitchen = kitchen;
    }

    public String getDishName() {
        return dishName;
    }

    public String getLocation() {
        return location;
    }

    public int getKitchen() {
        return kitchen;
    }
}