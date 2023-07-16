package com.threemeadows.a3mcafeteria;

import java.util.ArrayList;

public class Drinks {

    public static final String KEY_DRINK_DESCRIPTION = "KEY_DRINK_DESCRIPTION";
    public static final String KEY_DRINK_LARGE_IMAGE_ID = "KEY_DRINK_LARGE_IMAGE_ID";
    public static final String KEY_DRINK_NAME = "KEY_DRINK_NAME";

    private String mName;
    private String mDescription;
    private int mSmallImageSrcId;
    private int mLargeImageSrcId;

    public Drinks(String mName, String mDescription, int mSmallImageSrcId, int mLargeImageSrcId) {
        this.mName = mName;
        this.mDescription = mDescription;
        this.mSmallImageSrcId = mSmallImageSrcId;
        this.mLargeImageSrcId = mLargeImageSrcId;
    }

    public static ArrayList<Drinks> loadDrinkData(){

        ArrayList<Drinks> drinks = new ArrayList<>(1);

        drinks.add(new Drinks(
                "Vodka",
                "Vodka is a clear distilled alcoholic beverage. Different varieties originated in Poland, Russia," +
                        " and Sweden. Vodka is composed mainly of water and ethanol but sometimes with traces of " +
                        "impurities and flavourings.",
                R.drawable.vodkasmall,
                R.drawable.vodkalarge

        ));

        drinks.add(new Drinks(
                "Beer",
                " a carbonated, fermented alcoholic beverage that is usually made from malted" +
                        " cereal grain (especially barley), is flavored with hops, and typically contains" +
                        " less than a 5% alcohol content",
                R.drawable.beersmall,
                R.drawable.beerlarge

        ));

        drinks.add(new Drinks(
                "Rum",
                "Rum is a liquor made by fermenting and then distilling" +
                        " sugarcane molasses or sugarcane juice. The distillate, a clear liquid, is" +
                        " usually aged in oak barrels.",
                R.drawable.rumsmall,
                R.drawable.rumlarge

        ));

        drinks.add(new Drinks(
                "Wisky",
                "Whisky or whiskey is a type of distilled alcoholic" +
                        " beverage made from fermented grain mash. Various grains" +
                        " (which may be malted) are used for different varieties,",
                R.drawable.wiskysmall,
                R.drawable.wiskylarge

        ));

        return drinks;


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
