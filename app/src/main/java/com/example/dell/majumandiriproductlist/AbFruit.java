package com.example.dell.majumandiriproductlist;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class AbFruit extends AppCompatActivity {

    //Constants
    final String WHITE = "#ffffff";
    final String BLACK = "#000000";
    final String GREY = "#a6a6a6";
    final float BACKGROUND_NORMAL = 1.0f;
    final float BACKGROUND_DIM = 0.7f;
    final float BACKGROUND_GONE = 0.0f;

    LinearLayout contentLayout;
    PopupWindow popUpWindow;
    Button btnClose;

    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;
    Button abPineapple;
    Button abCocktail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab_fruit);

        Toolbar abToolbarFruit = (Toolbar)findViewById(R.id.toolbarAbFruit);
        setSupportActionBar(abToolbarFruit);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Set content
        contentLayout = (LinearLayout) findViewById(R.id.abFruitContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set buttons
        abPineapple = (Button)findViewById(R.id.buttonAbPineapple);
        abCocktail = (Button)findViewById(R.id.buttonAbCocktail);

        abPineapple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abPineapple);
            }
        });

        abCocktail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abCocktail);
            }
        });
    }

    private void btnOnClick(Button b) {
        try {
            //Blur the background
            abPineapple.setAlpha(BACKGROUND_GONE);
            abCocktail.setAlpha(BACKGROUND_GONE);
            abPineapple.setClickable(false);
            abCocktail.setClickable(false);
            contentLayout.setBackgroundColor(Color.parseColor(BLACK));
            contentLayout.setAlpha(BACKGROUND_DIM);

            //Generate helper function
            Helpers helpers = new Helpers(getApplicationContext());

            //Show the popup window
            LayoutInflater inflater = (LayoutInflater)AbFruit.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonAbPineapple:
                    imageView.setImageResource(R.drawable.ab_pineapple_l);
                    textNameEdit.setText(R.string.AB_fruit_pineapple_label);
                    textWeightEdit.setText(R.string.AB_fruit_pineapple_weight);
                    textPerCrtEdit.setText(R.string.AB_fruit_pineapple_price);
                    break;
                case R.id.buttonAbCocktail:
                    imageView.setImageResource(R.drawable.ab_fruit_cocktail_l);
                    textNameEdit.setText(R.string.AB_fruit_cocktail_label);
                    textWeightEdit.setText(R.string.AB_fruit_cocktail_weight);
                    textPerCrtEdit.setText(R.string.AB_fruit_cocktail_price);
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
            abPineapple.setAlpha(BACKGROUND_NORMAL);
            abCocktail.setAlpha(BACKGROUND_NORMAL);
            abPineapple.setClickable(true);
            abCocktail.setClickable(true);
            popUpWindow.dismiss();
        }
    };
}
