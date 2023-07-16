package com.threemeadows.a3mcafeteria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinksDetails extends AppCompatActivity {

    ImageView ivLargeDrinkImage;
    TextView tvDrinkHeading;
    TextView tvDrinkDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_details);

        Intent intent = getIntent();
        ivLargeDrinkImage = findViewById(R.id.iv_image_large);
        tvDrinkHeading = findViewById(R.id.tv_heading);
        tvDrinkDescription = findViewById(R.id.tv_details);

        String drinkName = intent.getStringExtra(Drinks.KEY_DRINK_NAME);
        String drinkDetail = intent.getStringExtra(Drinks.KEY_DRINK_DESCRIPTION);
        int largeImageId = intent.getIntExtra(Drinks.KEY_DRINK_LARGE_IMAGE_ID,-1);

        tvDrinkHeading.setText(drinkName);
        tvDrinkDescription.setText(drinkDetail);

        if(largeImageId != -1){
            ivLargeDrinkImage.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),largeImageId));
        }
    }
}