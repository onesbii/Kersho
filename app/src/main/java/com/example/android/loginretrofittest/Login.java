package com.example.android.loginretrofittest;

public class Login {

    private boolean error;

    private String message;

    private User user;

    public Login(boolean error, String message, User user) {
        this.error = error;
        this.message = message;
        this.user = user;
    }

    public boolean isError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() { return user; }

}
