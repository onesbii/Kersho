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
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurOrdersFragment extends Fragment {

    private RecyclerView recyclerView;
    private OrdersAdapter ordersAdapter;
    private List<Orders> ordersList;
//    private List<Dishes> dishesList;


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

//        Call<OrdersItem> call = RetrofitClient.getInstance().getApi().getOrders("Main Dish", "Maadi");
        Call<KitchenOrders> call = RetrofitClient.getInstance().getApi().getOrders(3);
        call.enqueue(new Callback<KitchenOrders>() {

            @Override
            public void onResponse(Call<KitchenOrders> call, Response<KitchenOrders> response) {


//                dishesList = response.body().getDishes();
//                ordersAdapter = new OrdersAdapter(getActivity(), dishesList);
                ordersList = response.body().getOrders();
                ordersAdapter = new OrdersAdapter(getActivity(), ordersList);
                recyclerView.setAdapter(ordersAdapter);

            }

            @Override
            public void onFailure(Call<KitchenOrders> call, Throwable t) {

                Toast.makeText(getContext(),t.getMessage(),Toast.LENGTH_LONG).show();

            }
        });


    }
}
