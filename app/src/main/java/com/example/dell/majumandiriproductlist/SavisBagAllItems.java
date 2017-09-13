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

public class SavisBagAllItems extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonSavisBagAromaticJasmine,
            R.id.buttonSavisBagAromaticKrampoel,
            R.id.buttonSavisBagAromaticLemongrass,
            R.id.buttonSavisBagAromaticPandanus,
            R.id.buttonSavisBagClassicClassic,
            R.id.buttonSavisBagClassicEarl,
            R.id.buttonSavisBagClassicEnglish,
            R.id.buttonSavisBagClassicGreen,
            R.id.buttonSavisBagClassicOolong,
            R.id.buttonSavisBagClassicWhite,
            R.id.buttonSavisBagFruitBlackcurrant,
            R.id.buttonSavisBagFruitLemon,
            R.id.buttonSavisBagFruitLychee,
            R.id.buttonSavisBagFruitMango,
            R.id.buttonSavisBagFruitPomegranate,
            R.id.buttonSavisBagHerbExotic,
            R.id.buttonSavisBagHerbJava,
            R.id.buttonSavisBagJapaneseMatcha
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button jasmine;
    Button krampoel;
    Button lemongrass;
    Button pandanus;
    Button classic;
    Button earl;
    Button english;
    Button green;
    Button oolong;
    Button white;
    Button blackcurrant;
    Button lemon;
    Button lychee;
    Button mango;
    Button pomegranate;
    Button exotic;
    Button java;
    Button matcha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savis_bag_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarSavisBagAllItems);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (ScrollView) findViewById(R.id.savisBagAllItemsContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set buttons
        jasmine = (Button)findViewById(R.id.buttonSavisBagAromaticJasmine);
        krampoel = (Button)findViewById(R.id.buttonSavisBagAromaticKrampoel);
        lemongrass = (Button)findViewById(R.id.buttonSavisBagAromaticLemongrass);
        pandanus = (Button)findViewById(R.id.buttonSavisBagAromaticPandanus);
        classic = (Button)findViewById(R.id.buttonSavisBagClassicClassic);
        earl = (Button)findViewById(R.id.buttonSavisBagClassicEarl);
        english = (Button)findViewById(R.id.buttonSavisBagClassicEnglish);
        green = (Button)findViewById(R.id.buttonSavisBagClassicGreen);
        oolong = (Button)findViewById(R.id.buttonSavisBagClassicOolong);
        white = (Button)findViewById(R.id.buttonSavisBagClassicWhite);
        blackcurrant = (Button)findViewById(R.id.buttonSavisBagFruitBlackcurrant);
        lemon = (Button)findViewById(R.id.buttonSavisBagFruitLemon);
        lychee = (Button)findViewById(R.id.buttonSavisBagFruitLychee);
        mango = (Button)findViewById(R.id.buttonSavisBagFruitMango);
        pomegranate = (Button)findViewById(R.id.buttonSavisBagFruitPomegranate);
        exotic = (Button)findViewById(R.id.buttonSavisBagHerbExotic);
        java = (Button)findViewById(R.id.buttonSavisBagHerbJava);
        matcha = (Button)findViewById(R.id.buttonSavisBagJapaneseMatcha);

        jasmine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jasmine);
            }
        });

        krampoel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(krampoel);
            }
        });

        lemongrass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(lemongrass);
            }
        });

        pandanus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(pandanus);
            }
        });

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

        exotic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(exotic);
            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(java);
            }
        });

        matcha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(matcha);
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
            LayoutInflater inflater = (LayoutInflater)SavisBagAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonSavisBagAromaticJasmine:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_aromatic_jasmine_label);
                    textWeightEdit.setText(R.string.Savis_bag_aromatic_jasmine_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_aromatic_jasmine_price);
                    break;
                case R.id.buttonSavisBagAromaticKrampoel:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_aromatic_krampoel_label);
                    textWeightEdit.setText(R.string.Savis_bag_aromatic_krampoel_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_aromatic_krampoel_price);
                    break;
                case R.id.buttonSavisBagAromaticLemongrass:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_aromatic_lemongrass_label);
                    textWeightEdit.setText(R.string.Savis_bag_aromatic_lemongrass_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_aromatic_lemongrass_price);
                    break;
                case R.id.buttonSavisBagAromaticPandanus:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_aromatic_pandanus_label);
                    textWeightEdit.setText(R.string.Savis_bag_aromatic_pandanus_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_aromatic_pandanus_price);
                    break;
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
                case R.id.buttonSavisBagHerbExotic:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_herb_exotic_label);
                    textWeightEdit.setText(R.string.Savis_bag_herb_exotic_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_herb_exotic_price);
                    break;
                case R.id.buttonSavisBagHerbJava:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_herb_java_label);
                    textWeightEdit.setText(R.string.Savis_bag_herb_java_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_herb_java_price);
                    break;
                case R.id.buttonSavisBagJapaneseMatcha:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_bag_japanese_matcha_label);
                    textWeightEdit.setText(R.string.Savis_bag_japanese_matcha_weight);
                    textPerCrtEdit.setText(R.string.Savis_bag_japanese_matcha_price);
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
