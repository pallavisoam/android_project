package com.threemeadows.a3mcafeteria;

import java.util.ArrayList;

public class Snack {

    public static final String KEY_SNACK_DESCRIPTION = "KEY_SNACK_DESCRIPTION";
    public static final String KEY_SNACK_LARGE_IMAGE_ID = "KEY_SNACK_LARGE_IMAGE_ID";
    public static final String KEY_SNACK_NAME = "KEY_SNACK_NAME";

    private String mName;
    private String mDescription;
    private int mSmallImageSrcId;
    private int mLargeImageSrcId;

    public Snack(String mName, String mDescription, int mSmallImageSrcId, int mLargeImageSrcId) {
        this.mName = mName;
        this.mDescription = mDescription;
        this.mSmallImageSrcId = mSmallImageSrcId;
        this.mLargeImageSrcId = mLargeImageSrcId;
    }

    @Override
    public String toString(){
        return mName;
    }

    public static ArrayList<Snack> loadSnacksData(){
            ArrayList<Snack> snacks = new ArrayList<>();

        snacks.add(new Snack(
                "phona",
                "Tasty and Spicy Rice Flakes.",
                R.drawable.snack_poha_small,
                R.drawable.snack_poha
        ));

        snacks.add(new Snack(
                "Samosa",
                "Fried pastry with spicy potato fillings",
                R.drawable.snack_samosa_small,
                R.drawable.snack_samosa
        ));

        snacks.add(new Snack(
                "Bhelpuri",
                "Assorted PUffed rice with spices and vegetables",
                R.drawable.snack_bhelpuri_small,
                R.drawable.snack_bhelpuri
        ));

        return snacks;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getmSmallImageSrcId() {
        return mSmallImageSrcId;
    }

    public void setmSmallImageSrcId(int mSmallImageSrcId) {
        this.mSmallImageSrcId = mSmallImageSrcId;
    }

    public int getmLargeImageSrcId() {
        return mLargeImageSrcId;
    }

    public void setmLargeImageSrcId(int mLargeImageSrcId) {
        this.mLargeImageSrcId = mLargeImageSrcId;
    }
}

