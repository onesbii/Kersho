package com.example.android.loginretrofittest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class OrdersActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

//    private TextView textViewOrders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        BottomNavigationView navigationView = findViewById(R.id.navigationView);
        navigationView.setOnNavigationItemSelectedListener(this);

//        textViewOrders = findViewById(R.id.textViewOrders);
//
//        User user = SharedPrefManager.getInstance(this).getSavedUser();
//        textViewOrders.setText("User " + user.getUsername() + "\n"
//                + "Type " + user.getType() + "\n"
//                + "ID " + user.getId() + "\n"
//        );

        displayFragment(new CurOrdersFragment());
    }

    private void displayFragment (Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.relativeCont, fragment)
                .commit();

    }

    //here we check if user is NOT logged in then direct user to main activity to login
    @Override
    protected void onStart() {
        super.onStart();

        if (!SharedPrefManager.getInstance(this).isLoggedIn()) {
            Intent intent = new Intent(OrdersActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;

        switch (item.getItemId()){
            case R.id.menuCurOrders:
                fragment = new CurOrdersFragment();
                break;
            case R.id.menuPreOrders:
                fragment = new PreOrdersFragment();
                break;
        }
        if (fragment != null){
            displayFragment(fragment);
        }

        return false;
    }
}

//TODO: refresh layout "https://www.youtube.com/watch?v=K0-e5vfmzbA&list=PLk7v1Z2rk4hhYrhtRtAX2zVm-FHV38-TQ&index=3"