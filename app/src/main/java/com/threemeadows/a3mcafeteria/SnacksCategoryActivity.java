package com.threemeadows.a3mcafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Scanner;

public class SnacksCategoryActivity extends AppCompatActivity {
    private static final String TAG = "SnacksCategoryActivity";


    private ListView mLvSnacksCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks_category);



//        ArrayAdapter<Snack> snackAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
//                Snack.loadSnacksData());

        mLvSnacksCategories = findViewById(R.id.lv_snacks_categories);
        ArrayList<Snack> snacks = Snack.loadSnacksData();
        SnackAdapter snackAdapter = new SnackAdapter(this,snacks);
        mLvSnacksCategories.setAdapter(snackAdapter);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i(TAG,"onItemClick: inside snacksCategoryActivity Item at position "+ i+ " clicked");

                    Intent snackDetailIntent = new Intent(SnacksCategoryActivity.this, SnackDetails.class);
                    snackDetailIntent.putExtra(Snack.KEY_SNACK_NAME,snacks.get(i).getmName());
                    snackDetailIntent.putExtra(snacks.get(i).KEY_SNACK_DESCRIPTION, snacks.get(i).getmDescription());
                    snackDetailIntent.putExtra(snacks.get(i).KEY_SNACK_LARGE_IMAGE_ID,snacks.get(i).getmLargeImageSrcId());
                    startActivity(snackDetailIntent);

                }


            };


        mLvSnacksCategories.setOnItemClickListener(onItemClickListener);


    }
}