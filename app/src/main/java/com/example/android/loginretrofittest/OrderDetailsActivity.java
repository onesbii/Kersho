package com.example.android.loginretrofittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OrderDetailsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Dishes> dishesList;
    private DishesAdapter dishesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

    }

    private void dishesDetails(){

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Call<DishesItem> call = RetrofitClient.getInstance().getApi().getDishesItem(2);
        call.enqueue(new Callback<DishesItem>() {
            @Override
            public void onResponse(Call<DishesItem> call, Response<DishesItem> response) {

                dishesList = response.body().getDishes();
                dishesAdapter = new DishesAdapter(OrderDetailsActivity.this, dishesList);
                recyclerView.setAdapter(dishesAdapter);

            }

            @Override
            public void onFailure(Call<DishesItem> call, Throwable t) {

                Toast.makeText(OrderDetailsActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }
}
