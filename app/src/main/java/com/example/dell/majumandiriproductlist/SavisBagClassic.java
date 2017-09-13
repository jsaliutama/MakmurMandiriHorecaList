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

public class SavisBagClassic extends AppCompatActivity {

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
            R.id.buttonSavisBagClassicClassic,
            R.id.buttonSavisBagClassicEarl,
            R.id.buttonSavisBagClassicEnglish,
            R.id.buttonSavisBagClassicGreen,
            R.id.buttonSavisBagClassicOolong,
            R.id.buttonSavisBagClassicWhite
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button classic;
    Button earl;
    Button english;
    Button green;
    Button oolong;
    Button white;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savis_bag_classic);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarSavisBagClassic);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (ScrollView) findViewById(R.id.savisBagClassicContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Setup buttons
        classic = (Button)findViewById(R.id.buttonSavisBagClassicClassic);
        earl = (Button)findViewById(R.id.buttonSavisBagClassicEarl);
        english = (Button)findViewById(R.id.buttonSavisBagClassicEnglish);
        green = (Button)findViewById(R.id.buttonSavisBagClassicGreen);
        oolong = (Button)findViewById(R.id.buttonSavisBagClassicOolong);
        white = (Button)findViewById(R.id.buttonSavisBagClassicWhite);

        classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(classic);
            }
        });

        earl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(earl);
            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(english);
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(green);
            }
        });

        oolong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(oolong);
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
            LayoutInflater inflater = (LayoutInflater)SavisBagClassic.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonSavisBagClassicClassic:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_classic_classic_label);
                    textWeightEdit.setText(R.string.Savis_bag_classic_classic_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_classic_classic_price);
                    break;
                case R.id.buttonSavisBagClassicEarl:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_classic_earl_label);
                    textWeightEdit.setText(R.string.Savis_bag_classic_earl_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_classic_earl_price);
                    break;
                case R.id.buttonSavisBagClassicEnglish:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_classic_english_label);
                    textWeightEdit.setText(R.string.Savis_bag_classic_english_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_classic_english_price);
                    break;
                case R.id.buttonSavisBagClassicGreen:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_classic_green_label);
                    textWeightEdit.setText(R.string.Savis_bag_classic_green_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_classic_green_price);
                    break;
                case R.id.buttonSavisBagClassicOolong:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_classic_oolong_label);
                    textWeightEdit.setText(R.string.Savis_bag_classic_oolong_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_classic_oolong_price);
                    break;
                case R.id.buttonSavisBagClassicWhite:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_classic_white_label);
                    textWeightEdit.setText(R.string.Savis_bag_classic_white_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_classic_white_price);
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
