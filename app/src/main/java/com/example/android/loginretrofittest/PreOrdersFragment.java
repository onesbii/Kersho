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
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PreOrdersFragment extends Fragment {

    private RecyclerView recyclerView;
    private OrdersAdapter ordersAdapter;
    private List<Orders> ordersList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_previous, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        Call<KitchenOrders> call = RetrofitClient.getInstance().getApi().getAllOldOrders();
        call.enqueue(new Callback<KitchenOrders>() {

            @Override
            public void onResponse(Call<KitchenOrders> call, Response<KitchenOrders> response) {

                ordersList = response.body().getOrders();
                ordersAdapter = new OrdersAdapter(getActivity(), ordersList);
                recyclerView.setAdapter(ordersAdapter);

            }

            @Override
            public void onFailure(Call<KitchenOrders> call, Throwable t) {

                Toast.makeText(getContext(),t.getMessage(),Toast.LENGTH_LONG).show();

                Log.i("error: ", t.getMessage());

            }
        });


    }
}
