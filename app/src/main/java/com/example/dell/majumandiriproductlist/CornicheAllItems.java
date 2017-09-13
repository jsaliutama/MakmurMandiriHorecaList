package com.example.dell.majumandiriproductlist;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class CornicheAllItems extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonCornicheFluffy,
            R.id.buttonCornicheMega,
            R.id.buttonCornicheMiniAssorted,
            R.id.buttonCornicheMiniWhite,
            R.id.buttonCornicheSnowWhite,
            R.id.buttonCornicheTeddyApple,
            R.id.buttonCornicheTeddyAssorted,
            R.id.buttonCornicheTeddyChoco,
            R.id.buttonCornicheTeddyMango
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button fluffy;
    Button mega;
    Button miniAssorted;
    Button miniWhite;
    Button snowWhite;
    Button teddyApple;
    Button teddyAssorted;
    Button teddyChoco;
    Button teddyMango;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corniche_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarCornicheAllItems);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (ScrollView) findViewById(R.id.cornicheAllItemsContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Setup buttons
        fluffy = (Button)findViewById(R.id.buttonCornicheFluffy);
        mega = (Button)findViewById(R.id.buttonCornicheMega);
        miniAssorted = (Button)findViewById(R.id.buttonCornicheMiniAssorted);
        miniWhite = (Button)findViewById(R.id.buttonCornicheMiniWhite);
        snowWhite = (Button)findViewById(R.id.buttonCornicheSnowWhite);
        teddyApple = (Button)findViewById(R.id.buttonCornicheTeddyApple);
        teddyAssorted = (Button)findViewById(R.id.buttonCornicheTeddyAssorted);
        teddyChoco = (Button)findViewById(R.id.buttonCornicheTeddyChoco);
        teddyMango = (Button)findViewById(R.id.buttonCornicheTeddyMango);

        fluffy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(fluffy);
            }
        });

        mega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(mega);
            }
        });

        miniAssorted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(miniAssorted);
            }
        });

        miniWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(miniWhite);
            }
        });

        snowWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(snowWhite);
            }
        });

        teddyApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(teddyApple);
            }
        });

        teddyAssorted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(teddyAssorted);
            }
        });

        teddyChoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(teddyChoco);
            }
        });

        teddyMango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(teddyMango);
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
            LayoutInflater inflater = (LayoutInflater)CornicheAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonCornicheFluffy:
                    imageView.setImageResource(R.drawable.corniche_fluffy_l);
                    textNameEdit.setText(R.string.Corniche_fluffy_label);
                    textWeightEdit.setText(R.string.Corniche_fluffy_weight);
                    textPerCrtEdit.setText(R.string.Corniche_fluffy_price);
                    break;
                case R.id.buttonCornicheMega:
                    imageView.setImageResource(R.drawable.corniche_mega_l);
                    textNameEdit.setText(R.string.Corniche_mega_label);
                    textWeightEdit.setText(R.string.Corniche_mega_weight);
                    textPerCrtEdit.setText(R.string.Corniche_mega_price);
                    break;
                case R.id.buttonCornicheMiniAssorted:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Corniche_mini_assorted_label);
                    textWeightEdit.setText(R.string.Corniche_mini_assorted_weight);
                    textPerCrtEdit.setText(R.string.Corniche_mini_assorted_price);
                    break;
                case R.id.buttonCornicheMiniWhite:
                    imageView.setImageResource(R.drawable.corniche_mini_white_l);
                    textNameEdit.setText(R.string.Corniche_mini_white_label);
                    textWeightEdit.setText(R.string.Corniche_mini_white_weight);
                    textPerCrtEdit.setText(R.string.Corniche_mini_white_price);
                    break;
                case R.id.buttonCornicheSnowWhite:
                    imageView.setImageResource(R.drawable.corniche_snow_white_l);
                    textNameEdit.setText(R.string.Corniche_snow_white_label);
                    textWeightEdit.setText(R.string.Corniche_snow_white_weight);
                    textPerCrtEdit.setText(R.string.Corniche_snow_white_price);
                    break;
                case R.id.buttonCornicheTeddyApple:
                    imageView.setImageResource(R.drawable.corniche_apple_l);
                    textNameEdit.setText(R.string.Corniche_teddy_apple_label);
                    textWeightEdit.setText(R.string.Corniche_teddy_apple_weight);
                    textPerCrtEdit.setText(R.string.Corniche_teddy_apple_price);
                    break;
                case R.id.buttonCornicheTeddyAssorted:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Corniche_teddy_assorted_label);
                    textWeightEdit.setText(R.string.Corniche_teddy_assorted_weight);
                    textPerCrtEdit.setText(R.string.Corniche_teddy_assorted_price);
                    break;
                case R.id.buttonCornicheTeddyChoco:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Corniche_teddy_choco_label);
                    textWeightEdit.setText(R.string.Corniche_teddy_choco_weight);
                    textPerCrtEdit.setText(R.string.Corniche_teddy_choco_price);
                    break;
                case R.id.buttonCornicheTeddyMango:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Corniche_teddy_mango_label);
                    textWeightEdit.setText(R.string.Corniche_teddy_mango_weight);
                    textPerCrtEdit.setText(R.string.Corniche_teddy_mango_price);
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
