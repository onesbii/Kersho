package com.example.android.loginretrofittest;

public class User {


    private int id;

    private int type;

    private String username;


    public User(int id, int type, String username) {
        this.id = id;
        this.type = type;
        this.username = username;
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
}
