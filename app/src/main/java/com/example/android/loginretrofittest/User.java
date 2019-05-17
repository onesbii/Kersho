package com.example.android.loginretrofittest;

public class User {


    private int id;

    private int type;

    private String username;

    private int area;

    private int kitchen;


    public User(int id, int type, String username, int area, int kitchen) {
        this.id = id;
        this.type = type;
        this.username = username;
        this.area = area;
        this.kitchen = kitchen;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public String getUsername() {
        return username;
    }

    public int getArea() { return area; }

    public int getKitchen() { return kitchen; }
}
