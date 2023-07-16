package com.threemeadows.a3mcafeteria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SnackDetails extends AppCompatActivity {

    TextView mheading,mdetails;
    ImageView mLargeImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_details);

        Intent intent = getIntent();
        String snackName = intent.getStringExtra(Snack.KEY_SNACK_NAME);
        String snackDescription = intent.getStringExtra(Snack.KEY_SNACK_DESCRIPTION);
        int imageId = intent.getIntExtra(Snack.KEY_SNACK_LARGE_IMAGE_ID,-1);

        mheading = findViewById(R.id.tv_details);
        mdetails = findViewById(R.id.tv_heading);
        mLargeImage = findViewById(R.id.iv_snack_large);


        mheading.setText(snackName);
        mdetails.setText(snackDescription);

        if(imageId != -1){

            mLargeImage.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), imageId));
        }




    }
}