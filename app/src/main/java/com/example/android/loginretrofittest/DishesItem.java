package com.example.android.loginretrofittest;

import java.util.ArrayList;
import java.util.List;

public class DishesItem {

   private ArrayList<Dishes> dishes;

    public DishesItem(ArrayList<Dishes> dishes) {
        this.dishes = dishes;
    }

    public ArrayList<Dishes> getDishes() {
        return dishes;
    }
}
