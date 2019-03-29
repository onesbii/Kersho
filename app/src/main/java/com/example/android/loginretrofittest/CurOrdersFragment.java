package com.example.android.loginretrofittest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurOrdersFragment extends Fragment {

    private RecyclerView recyclerView;
    private OrdersAdapter ordersAdapter;
    private List<Dishes> dishesList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_current, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        Call<OrdersItem> call = RetrofitClient.getInstance().getApi().getOrders("Main Dish", "Nasr City");
        call.enqueue(new Callback<OrdersItem>() {

            @Override
            public void onResponse(Call<OrdersItem> call, Response<OrdersItem> response) {


                dishesList = response.body().getDishes();
                ordersAdapter = new OrdersAdapter(getActivity(), dishesList);
                recyclerView.setAdapter(ordersAdapter);

            }

            @Override
            public void onFailure(Call<OrdersItem> call, Throwable t) {

            }
        });


    }
}
