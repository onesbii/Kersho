package com.example.android.loginretrofittest;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefManager {
//todo change sharedpref caps
    private static final String SHARED_PREF = "KershoLogin";

    private static final String KEY_ID = "id";
    private static final String KEY_TYPE = "type";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_AREA = "area";
    private static final String KEY_KITCHEN = "kitchen";


    private static SharedPrefManager mInstance;
    private Context mContext;

    //alt ins to create constructor for context
    public SharedPrefManager(Context mContext) {
        this.mContext = mContext;
    }

//now we wel create a method that will return the instance of type sharedprefmanager
//which we will pass context in it (as its an instance from sharedprefmanager above)

    public static SharedPrefManager getInstance(Context mContext) {

        if (mInstance == null) {

            mInstance = new SharedPrefManager(mContext);
        }
        return mInstance;
    }

    //now we create method that takes a object from 'User' and create the 'shared preferences'
//'mode private' means that this preferences is only shared in this app, not among all apps
//then we create 'editor' object of 'shared preferences'
//then we put all data from the 'user' object (in this case type & username) inside 'shared preferences'
//then we 'apply'
    public void saveUser(User user) {

        SharedPreferences sharedPreferences = mContext.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putInt(KEY_ID, user.getId());
        editor.putInt(KEY_TYPE, user.getType());
        editor.putString(KEY_USERNAME, user.getUsername());
        editor.putInt(KEY_AREA, user.getArea());
        editor.putInt(KEY_KITCHEN, user.getKitchen());
        editor.apply();

    }

    public boolean isLoggedIn() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE);
        return sharedPreferences.getInt("id", -1) != -1;

    }

//this method to return user if logged in
    public User getSavedUser() {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE);


//TODO set constant keys
        return new User(
                sharedPreferences.getInt(KEY_ID, -1),
                sharedPreferences.getInt(KEY_TYPE, -1),
                sharedPreferences.getString(KEY_USERNAME, null),
                sharedPreferences.getInt(KEY_AREA, -1),
                sharedPreferences.getInt(KEY_KITCHEN, -1)
        );
    }

//this method when user wants to log out
//we will call the shared pref object as above, and also we will call the editor to clear all saved data
//note: editor.clear() is pre defined method, we just created a method with the sama name
    public void clear(){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.clear();
        editor.apply();

    }
}
