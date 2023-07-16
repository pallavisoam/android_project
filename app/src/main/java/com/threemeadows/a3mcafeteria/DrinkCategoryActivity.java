package com.threemeadows.a3mcafeteria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

public class DrinkCategoryActivity extends AppCompatActivity {
    private static final String TAG = "DrinkCategoryActivity";

    private RecyclerView mRvDrinkCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        mRvDrinkCategories = findViewById(R.id.rv_drink_categories);
        DrinksAdapter drinksAdapter = new DrinksAdapter(Drinks.loadDrinkData());
        mRvDrinkCategories.setAdapter(drinksAdapter);
        mRvDrinkCategories.setLayoutManager(new LinearLayoutManager(this));

    }
}