package com.example.android.loginretrofittest;

public class Dishes {

    private String type;
    private String dishName;
    private String location;

    public Dishes(String type, String dishName, String location) {
        this.type = type;
        this.dishName = dishName;
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public String getDishName() {
        return dishName;
    }

    public String getLocation() {
        return location;
    }
}
