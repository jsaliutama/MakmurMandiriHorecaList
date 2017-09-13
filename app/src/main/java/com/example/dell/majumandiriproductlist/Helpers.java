package com.example.dell.majumandiriproductlist;

import android.content.Context;
import android.util.DisplayMetrics;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Joshua Saliutama on 8/27/2017.
 */

public class Helpers extends AppCompatActivity {
    //Default constructor

    Context context;

    public Helpers(Context a){
        context = a;
    }

    public int pxToDp(int px) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return Math.round(px / (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }

    public int dpToPx(int dp) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }
}
