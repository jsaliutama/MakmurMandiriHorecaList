package com.example.dell.majumandiriproductlist;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;

public class JwAllItems extends AppCompatActivity {
    //Constants
    final String WHITE = "#ffffff";
    final String BLACK = "#000000";
    final String GREY = "#a6a6a6";
    final float BACKGROUND_NORMAL = 1.0f;
    final float BACKGROUND_DIM = 0.7f;
    final float BACKGROUND_GONE = 0.0f;

    ScrollView contentLayout;
    PopupWindow popUpWindow;
    Button btnClose;
    int[] buttonList = {R.id.buttonJwApple,
            R.id.buttonJwAppleCelebration,
            R.id.buttonJwBlueCocktail,
            R.id.buttonJwPinkCocktail,
            R.id.buttonJwPurpleCocktail,
            R.id.buttonJwRedCocktail,
            R.id.buttonJwRedGrape,
            R.id.buttonJwRoseCelebration,
            R.id.buttonJwWhiteGrape
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button apple;
    Button appleCeleb;
    Button blue;
    Button pink;
    Button purple;
    Button red;
    Button redGrape;
    Button rose;
    Button white;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jw_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarJwAllItems);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Set background
        contentLayout = (ScrollView)findViewById(R.id.jwContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set buttons
        apple = (Button)findViewById(R.id.buttonJwApple);
        appleCeleb = (Button)findViewById(R.id.buttonJwAppleCelebration);
        blue = (Button)findViewById(R.id.buttonJwBlueCocktail);
        pink = (Button)findViewById(R.id.buttonJwPinkCocktail);
        purple = (Button)findViewById(R.id.buttonJwPurpleCocktail);
        red = (Button)findViewById(R.id.buttonJwRedCocktail);
        redGrape = (Button)findViewById(R.id.buttonJwRedGrape);
        rose = (Button)findViewById(R.id.buttonJwRoseCelebration);
        white = (Button)findViewById(R.id.buttonJwWhiteGrape);

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(apple);
            }
        });

        appleCeleb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(appleCeleb);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(blue);
            }
        });

        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(pink);
            }
        });

        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(purple);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(red);
            }
        });

        redGrape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(redGrape);
            }
        });

        rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(rose);
            }
        });

        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(white);
            }
        });
    }

    private void btnOnClick(Button b) {
        try {
            //Blur the background
            for (int id : buttonList) {
                Button btn = (Button)findViewById(id);
                btn.setAlpha(BACKGROUND_GONE);
                btn.setClickable(false);
            }
            contentLayout.setBackgroundColor(Color.parseColor(BLACK));
            contentLayout.setAlpha(BACKGROUND_DIM);

            //Generate helper function
            Helpers helpers = new Helpers(getApplicationContext());

            //Show the popup window
            LayoutInflater inflater = (LayoutInflater)JwAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonJwApple:
                    imageView.setImageResource(R.drawable.jw_apple_l);
                    textNameEdit.setText(R.string.JW_apple_label);
                    textWeightEdit.setText(R.string.JW_apple_weight);
                    textPerCrtEdit.setText(R.string.JW_apple_price);
                    break;
                case R.id.buttonJwAppleCelebration:
                    imageView.setImageResource(R.drawable.jw_apple_celebration_l);
                    textNameEdit.setText(R.string.JW_apple_celebration_label);
                    textWeightEdit.setText(R.string.JW_apple_celebration_weight);
                    textPerCrtEdit.setText(R.string.JW_apple_celebration_price);
                    break;
                case R.id.buttonJwBlueCocktail:
                    imageView.setImageResource(R.drawable.jw_blue_cocktail_l);
                    textNameEdit.setText(R.string.JW_blue_cocktail_label);
                    textWeightEdit.setText(R.string.JW_blue_cocktail_weight);
                    textPerCrtEdit.setText(R.string.JW_blue_cocktail_price);
                    break;
                case R.id.buttonJwPinkCocktail:
                    imageView.setImageResource(R.drawable.jw_pink_cocktail_l);
                    textNameEdit.setText(R.string.JW_pink_cocktail_label);
                    textWeightEdit.setText(R.string.JW_pink_cocktail_weight);
                    textPerCrtEdit.setText(R.string.JW_pink_cocktail_price);
                    break;
                case R.id.buttonJwPurpleCocktail:
                    imageView.setImageResource(R.drawable.jw_purple_cocktail_l);
                    textNameEdit.setText(R.string.JW_purple_cocktail_label);
                    textWeightEdit.setText(R.string.JW_purple_cocktail_weight);
                    textPerCrtEdit.setText(R.string.JW_purple_cocktail_price);
                    break;
                case R.id.buttonJwRedCocktail:
                    imageView.setImageResource(R.drawable.jw_red_cocktail_l);
                    textNameEdit.setText(R.string.JW_red_cocktail_label);
                    textWeightEdit.setText(R.string.JW_red_cocktail_weight);
                    textPerCrtEdit.setText(R.string.JW_red_cocktail_price);
                    break;
                case R.id.buttonJwRedGrape:
                    imageView.setImageResource(R.drawable.jw_red_grape_l);
                    textNameEdit.setText(R.string.JW_red_grape_label);
                    textWeightEdit.setText(R.string.JW_red_grape_weight);
                    textPerCrtEdit.setText(R.string.JW_red_grape_price);
                    break;
                case R.id.buttonJwRoseCelebration:
                    imageView.setImageResource(R.drawable.jw_rose_l);
                    textNameEdit.setText(R.string.JW_rose_celebration_label);
                    textWeightEdit.setText(R.string.JW_rose_celebration_weight);
                    textPerCrtEdit.setText(R.string.JW_rose_celebration_price);
                    break;
                case R.id.buttonJwWhiteGrape:
                    imageView.setImageResource(R.drawable.jw_white_grape_l);
                    textNameEdit.setText(R.string.JW_white_grape_label);
                    textWeightEdit.setText(R.string.JW_white_grape_weight);
                    textPerCrtEdit.setText(R.string.JW_white_grape_price);
                    break;
            }
            //Setup close button
            btnClose= (Button)layout.findViewById(R.id.button_close);
            btnClose.setOnClickListener(button_close);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private View.OnClickListener button_close = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            contentLayout.setBackgroundColor(Color.parseColor(WHITE));
            contentLayout.setAlpha(BACKGROUND_NORMAL);
            for (int id : buttonList) {
                Button btn = (Button)findViewById(id);
                btn.setAlpha(BACKGROUND_NORMAL);
                btn.setClickable(true);
            }
            popUpWindow.dismiss();
        }
    };
}
