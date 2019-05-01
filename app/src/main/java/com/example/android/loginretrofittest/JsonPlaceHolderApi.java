package com.example.android.loginretrofittest;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface JsonPlaceHolderApi {

    @FormUrlEncoded
    @POST("admin_login")
    Call<Login> userLogin(
            @Field("user") String user,
            @Field("password") String password
    );


    @FormUrlEncoded
    @POST("get_kitchen_current_orders")
    Call<OrdersItem> getOrders(
            @Field("kitchen") int kitchen
    );


//    @FormUrlEncoded
//    @POST("get_menu")
//    Call<OrdersItem> getOrders(
//            @Field("type") String type,
//            @Field("location") String location
//    );


 /*
    @GET("posts")
    Call <List<Post>> getPosts(
            @Query("userId") Integer[] userId,
            @Query("_sort") String sort,
            @Query("_order") String order
    );

    @GET("posts")
    Call <List<Post>> getPosts(@QueryMap Map<String, String> parameters);

    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);

/////////////////////////////////////////////////////////////////////////////////////////////////////

    @POST("posts")
    Call<Post> createPost(@Body Post post);

    @FormUrlEncoded
    @POST("posts")
    Call<Post> createPost(
            @Field("userId") int userId,
            @Field("title") String title,
            @Field("body") String text
    );

    @FormUrlEncoded
    @POST("posts")
    Call<Post> createPost(@FieldMap Map<String, String> fields);

/////////////////////////////////////////////////////////////////////////////////////////////////////


*/
}
