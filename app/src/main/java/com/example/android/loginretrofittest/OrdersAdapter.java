package com.example.android.loginretrofittest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.OrdersViewHolder> {

    private Context mContext;
//TODO replace 'User' with 'OrdersItem'
    //private List<OrdersItem> OrdersList;
    private List<Orders> ordersList;
//    private List<Dishes> dishesList;
//TODO replace 'User' with 'OrdersItem'


    public OrdersAdapter(Context mContext, List<Orders> mOrdersList) {
        this.mContext = mContext;
        this.ordersList = mOrdersList;
    }


//    public OrdersAdapter(Context mContext, List<Dishes> mDishesList) {
//        this.mContext = mContext;
//        this.dishesList = mDishesList;
//    }

    @NonNull
    @Override
    public OrdersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.orders_item, parent, false);
        return new OrdersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrdersViewHolder ordersViewHolder, int position) {

        //TODO comment name and uncomment orders
        Orders orders = ordersList.get(position);
//        Dishes dishes = dishesList.get(position);

//        User user = mOrdersList.get(position);
//

        ordersViewHolder.textViewOrderId.setText(orders.getOrderId());
        ordersViewHolder.textViewLocation.setText(orders.getLocation());
        ordersViewHolder.textViewSubtotal.setText(orders.getSubtotal());

//        ordersViewHolder.textViewDishType.setText(dishes.getType());
//        ordersViewHolder.textViewDishName.setText(dishes.getDishName());
//        ordersViewHolder.textViewDishLocation.setText(dishes.getLocation());

    }

    @Override
    public int getItemCount() {

        return ordersList.size();
//        return dishesList.size();
    }

    public class OrdersViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewOrderId;
        public TextView textViewLocation;
        public TextView textViewSubtotal;

//        public TextView textViewDishType;
//        public TextView textViewDishName;
//        public TextView textViewDishLocation;


        public OrdersViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewOrderId = itemView.findViewById(R.id.textViewOrderId);
            textViewLocation = itemView.findViewById(R.id.textViewLocation);
            textViewSubtotal = itemView.findViewById(R.id.textViewSubtotal);


//            textViewDishType = itemView.findViewById(R.id.textViewDishType);
//            textViewDishName = itemView.findViewById(R.id.textViewDishName);
//            textViewDishLocation = itemView.findViewById(R.id.textViewDishLocation);

        }
    }
}

//TODO XML differences
