package com.example.android.loginretrofittest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import retrofit2.Callback;

public class DishesAdapter extends RecyclerView.Adapter<DishesAdapter.DishesViewHolder> {

    private Context mContext;
    private List<Dishes> dishesList;

    public DishesAdapter(Context mContext, List<Dishes> mDishesList) {
        this.mContext = mContext;
        this.dishesList = mDishesList;
    }


    @NonNull
    @Override
    public DishesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.dishes_item, parent, false);
        return new DishesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DishesViewHolder dishesViewHolder, int position) {

        Dishes dishes = dishesList.get(position);

        dishesViewHolder.textViewDishName.setText(dishes.getDishName());
        dishesViewHolder.textViewLocation.setText(dishes.getLocation());
        dishesViewHolder.textViewKitchen.setText(String.valueOf(dishes.getKitchen()));

    }

    @Override
    public int getItemCount() {

        return dishesList.size();
    }

    public class DishesViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewDishName;
        public TextView textViewLocation;
        public TextView textViewKitchen;
        public CardView cardView;

        public DishesViewHolder(@NonNull View itemView){
            super(itemView);

            textViewDishName = itemView.findViewById(R.id.textViewDishName);
            textViewLocation = itemView.findViewById(R.id.textViewLocation);
            textViewKitchen = itemView.findViewById(R.id.textViewKitchen);

            cardView = itemView.findViewById(R.id.cardViewDishes);
        }
    }
}
