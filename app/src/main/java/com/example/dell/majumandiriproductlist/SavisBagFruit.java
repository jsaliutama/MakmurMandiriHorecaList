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
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;

public class SavisBagFruit extends AppCompatActivity {

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
    int[] buttonList = {
            R.id.buttonSavisBagFruitBlackcurrant,
            R.id.buttonSavisBagFruitLemon,
            R.id.buttonSavisBagFruitLychee,
            R.id.buttonSavisBagFruitMango,
            R.id.buttonSavisBagFruitPomegranate
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button blackcurrant;
    Button lemon;
    Button lychee;
    Button mango;
    Button pomegranate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savis_bag_fruit);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarSavisBagFruit);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (ScrollView) findViewById(R.id.savisBagFruitContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Setup buttons
        blackcurrant = (Button)findViewById(R.id.buttonSavisBagFruitBlackcurrant);
        lemon = (Button)findViewById(R.id.buttonSavisBagFruitLemon);
        lychee = (Button)findViewById(R.id.buttonSavisBagFruitLychee);
        mango = (Button)findViewById(R.id.buttonSavisBagFruitMango);
        pomegranate = (Button)findViewById(R.id.buttonSavisBagFruitPomegranate);

        blackcurrant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(blackcurrant);
            }
        });

        lemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(lemon);
            }
        });

        lychee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(lychee);
            }
        });

        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(mango);
            }
        });

        pomegranate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(pomegranate);
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
            LayoutInflater inflater = (LayoutInflater)SavisBagFruit.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonSavisBagFruitBlackcurrant:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_fruit_blackcurrant_label);
                    textWeightEdit.setText(R.string.Savis_bag_fruit_blackcurrant_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_fruit_blackcurrant_price);
                    break;
                case R.id.buttonSavisBagFruitLemon:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_fruit_lemon_label);
                    textWeightEdit.setText(R.string.Savis_bag_fruit_lemon_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_fruit_lemon_price);
                    break;
                case R.id.buttonSavisBagFruitLychee:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_fruit_lychee_label);
                    textWeightEdit.setText(R.string.Savis_bag_fruit_lychee_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_fruit_lychee_price);
                    break;
                case R.id.buttonSavisBagFruitMango:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_fruit_mango_label);
                    textWeightEdit.setText(R.string.Savis_bag_fruit_mango_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_fruit_mango_price);
                    break;
                case R.id.buttonSavisBagFruitPomegranate:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_fruit_pomegranate_label);
                    textWeightEdit.setText(R.string.Savis_bag_fruit_pomegranate_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_fruit_pomegranate_price);
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
