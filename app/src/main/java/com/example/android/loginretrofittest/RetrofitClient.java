package com.example.android.loginretrofittest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//here we created a retrofit client class that will hold the variable we define
//such as the base URL and instance from the retrofit client class
//and a retrofit objet that we will later buld it
public class RetrofitClient {

    private static final String BASE_URL = "http://52.15.188.41/cookhouse/public/index.php/";
    private static RetrofitClient mInstance;
    private Retrofit retrofit;

 //here we created a constructor that will build the retrofit object
    private RetrofitClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

//now we will need an instance from that retrofit client

    public static RetrofitClient getInstance(){
        if (mInstance == null){
            mInstance = new RetrofitClient();
        }
        return mInstance;
    }

// now we need one more method to get the api
    public JsonPlaceHolderApi getApi(){
        return retrofit.create(JsonPlaceHolderApi.class);
    }

}
