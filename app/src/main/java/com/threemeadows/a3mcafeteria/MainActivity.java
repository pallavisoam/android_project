package com.threemeadows.a3mcafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    ListView mLvMainCafe;

    private static final int POSITION_CATEGORY_SNACKS = 0;
    private static final int POSITION_CATEGORY_DRINKS = 1;
    private static final int POSITION_CATEGORY_STORES = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLvMainCafe = findViewById(R.id.iv_cafeteria_main_categories);



        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i(TAG,"onItemClick: Item at position "+ i+ " clicked");

                switch (i) {

                    case POSITION_CATEGORY_SNACKS:
                    Intent intent = new Intent(MainActivity.this, SnacksCategoryActivity.class);
                    startActivity(intent);
                    break;

                    case POSITION_CATEGORY_DRINKS:{
                        Intent drinkIntent = new Intent(MainActivity.this, DrinkCategoryActivity.class);
                        startActivity(drinkIntent);
                        break;
                    }
                }
            }
        };


        mLvMainCafe.setOnItemClickListener(itemClickListener);




    }
}