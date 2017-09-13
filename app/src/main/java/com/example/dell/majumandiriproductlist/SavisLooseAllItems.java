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

public class SavisLooseAllItems extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonSavisLooseAromaticLemon,
            R.id.buttonSavisLooseAromaticMoroccan,
            R.id.buttonSavisLooseAromaticPandanus,
            R.id.buttonSavisLooseAromaticRoyal,
            R.id.buttonSavisLooseAromaticSekar,
            R.id.buttonSavisLooseFlowerBunaken,
            R.id.buttonSavisLooseFlowerChamomile,
            R.id.buttonSavisLooseFlowerRose,
            R.id.buttonSavisLooseClassicEarl,
            R.id.buttonSavisLooseClassicJava,
            R.id.buttonSavisLooseClassicJewel,
            R.id.buttonSavisLooseClassicSilver,
            R.id.buttonSavisLooseClassicSumatra,
            R.id.buttonSavisLooseFruitSenggigi,
            R.id.buttonSavisLooseHerbChocolate,
            R.id.buttonSavisLooseHerbExotic,
            R.id.buttonSavisLooseHerbJava,
            R.id.buttonSavisLooseHerbPeppermint,
            R.id.buttonSavisLooseJapaneseMatcha,
            R.id.buttonSavisLooseOrganicGreen,
            R.id.buttonSavisLooseOrganicOolong,
            R.id.buttonSavisLooseOrganicRed
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;
    TextView textLabelEdit;

    Button lemon;
    Button moroccan;
    Button pandanus;
    Button royal;
    Button sekar;
    Button bunaken;
    Button chamomile;
    Button rose;
    Button earl;
    Button java;
    Button jewel;
    Button silver;
    Button sumatra;
    Button senggigi;
    Button chocolate;
    Button exotic;
    Button javaGinger;
    Button peppermint;
    Button matcha;
    Button green;
    Button oolong;
    Button red;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savis_loose_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarSavisLooseAll);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (ScrollView) findViewById(R.id.savisLooseAllContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set button
        lemon = (Button)findViewById(R.id.buttonSavisLooseAromaticLemon);
        moroccan = (Button)findViewById(R.id.buttonSavisLooseAromaticMoroccan);
        pandanus = (Button)findViewById(R.id.buttonSavisLooseAromaticPandanus);
        royal = (Button)findViewById(R.id.buttonSavisLooseAromaticRoyal);
        sekar = (Button)findViewById(R.id.buttonSavisLooseAromaticSekar);
        bunaken = (Button)findViewById(R.id.buttonSavisLooseFlowerBunaken);
        chamomile = (Button)findViewById(R.id.buttonSavisLooseFlowerChamomile);
        rose = (Button)findViewById(R.id.buttonSavisLooseFlowerRose);
        earl = (Button)findViewById(R.id.buttonSavisLooseClassicEarl);
        java = (Button)findViewById(R.id.buttonSavisLooseClassicJava);
        jewel = (Button)findViewById(R.id.buttonSavisLooseClassicJewel);
        silver = (Button)findViewById(R.id.buttonSavisLooseClassicSilver);
        sumatra = (Button)findViewById(R.id.buttonSavisLooseClassicSumatra);
        senggigi = (Button)findViewById(R.id.buttonSavisLooseFruitSenggigi);
        chocolate = (Button)findViewById(R.id.buttonSavisLooseHerbChocolate);
        exotic = (Button)findViewById(R.id.buttonSavisLooseHerbExotic);
        javaGinger = (Button)findViewById(R.id.buttonSavisLooseHerbJava);
        peppermint = (Button)findViewById(R.id.buttonSavisLooseHerbPeppermint);
        matcha = (Button)findViewById(R.id.buttonSavisLooseJapaneseMatcha);
        green = (Button)findViewById(R.id.buttonSavisLooseOrganicGreen);
        oolong = (Button)findViewById(R.id.buttonSavisLooseOrganicOolong);
        red = (Button)findViewById(R.id.buttonSavisLooseOrganicRed);

        lemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(lemon);
            }
        });

        moroccan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(moroccan);
            }
        });

        pandanus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(pandanus);
            }
        });

        royal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(royal);
            }
        });

        sekar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(sekar);
            }
        });

        bunaken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(bunaken);
            }
        });

        chamomile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(chamomile);
            }
        });

        rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(rose);
            }
        });

        earl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(earl);
            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(java);
            }
        });

        jewel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jewel);
            }
        });

        silver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(silver);
            }
        });

        sumatra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(sumatra);
            }
        });

        senggigi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(senggigi);
            }
        });

        chocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(chocolate);
            }
        });

        exotic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(exotic);
            }
        });

        javaGinger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(javaGinger);
            }
        });

        peppermint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(peppermint);
            }
        });

        matcha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(matcha);
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

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(red);
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
            LayoutInflater inflater = (LayoutInflater)SavisLooseAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);

            switch (b.getId()){
                case R.id.buttonSavisLooseAromaticLemon:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_aromatic_lemongrass_label);
                    textWeightEdit.setText(R.string.Savis_loose_aromatic_lemongrass_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_aromatic_lemongrass_price);
                    break;
                case R.id.buttonSavisLooseAromaticMoroccan:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_aromatic_moroccan_label);
                    textWeightEdit.setText(R.string.Savis_loose_aromatic_moroccan_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_aromatic_moroccan_price);
                    break;
                case R.id.buttonSavisLooseAromaticPandanus:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_aromatic_pandanus_label);
                    textWeightEdit.setText(R.string.Savis_loose_aromatic_pandanus_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_aromatic_pandanus_price);
                    break;
                case R.id.buttonSavisLooseAromaticRoyal:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_aromatic_royal_label);
                    textWeightEdit.setText(R.string.Savis_loose_aromatic_royal_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_aromatic_royal_price);
                    break;
                case R.id.buttonSavisLooseAromaticSekar:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_aromatic_sekar_label);
                    textWeightEdit.setText(R.string.Savis_loose_aromatic_sekar_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_aromatic_sekar_price);
                    break;
                case R.id.buttonSavisLooseFlowerBunaken:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_flower_bunaken_label);
                    textWeightEdit.setText(R.string.Savis_loose_flower_bunaken_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_flower_bunaken_price);
                    break;
                case R.id.buttonSavisLooseFlowerChamomile:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_flower_chamomile_label);
                    textWeightEdit.setText(R.string.Savis_loose_flower_chamomile_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_flower_chamomile_price);
                    break;
                case R.id.buttonSavisLooseFlowerRose:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_flower_rose_label);
                    textWeightEdit.setText(R.string.Savis_loose_flower_rose_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_flower_rose_price);
                    break;
                case R.id.buttonSavisLooseClassicEarl:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_classic_earl_label);
                    textWeightEdit.setText(R.string.Savis_loose_classic_earl_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_classic_earl_price);
                    break;
                case R.id.buttonSavisLooseClassicJava:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_classic_java_label);
                    textWeightEdit.setText(R.string.Savis_loose_classic_java_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_classic_java_price);
                    break;
                case R.id.buttonSavisLooseClassicJewel:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_classic_jewel_label);
                    textWeightEdit.setText(R.string.Savis_loose_classic_jewel_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_classic_jewel_price);
                    break;
                case R.id.buttonSavisLooseClassicSilver:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_classic_silver_label);
                    textWeightEdit.setText(R.string.Savis_loose_classic_silver_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_classic_silver_price);
                    break;
                case R.id.buttonSavisLooseClassicSumatra:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_classic_sumatra_label);
                    textWeightEdit.setText(R.string.Savis_loose_classic_sumatra_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_classic_sumatra_price);
                    break;
                case R.id.buttonSavisLooseFruitSenggigi:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_fruit_senggigi_label);
                    textWeightEdit.setText(R.string.Savis_loose_fruit_senggigi_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_fruit_senggigi_price);
                    break;
                case R.id.buttonSavisLooseHerbChocolate:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_herb_chocolate_label);
                    textWeightEdit.setText(R.string.Savis_loose_herb_chocolate_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_herb_chocolate_price);
                    break;
                case R.id.buttonSavisLooseHerbExotic:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_herb_exotic_label);
                    textWeightEdit.setText(R.string.Savis_loose_herb_exotic_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_herb_exotic_price);
                    break;
                case R.id.buttonSavisLooseHerbJava:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_herb_java_label);
                    textWeightEdit.setText(R.string.Savis_loose_herb_java_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_herb_java_price);
                    break;
                case R.id.buttonSavisLooseHerbPeppermint:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_herb_peppermint_label);
                    textWeightEdit.setText(R.string.Savis_loose_herb_peppermint_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_herb_peppermint_price);
                    break;
                case R.id.buttonSavisLooseJapaneseMatcha:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_japanese_matcha_label);
                    textWeightEdit.setText(R.string.Savis_loose_japanese_matcha_weight);;
                    textPerCrtEdit.setText(R.string.Savis_loose_japanese_matcha_price);
                    break;
                case R.id.buttonSavisLooseOrganicGreen:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_organic_green_label);
                    textWeightEdit.setText(R.string.Savis_loose_organic_green_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_organic_green_price);
                    break;
                case R.id.buttonSavisLooseOrganicOolong:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_organic_oolong_label);
                    textWeightEdit.setText(R.string.Savis_loose_organic_oolong_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_organic_oolong_price);
                    break;
                case R.id.buttonSavisLooseOrganicRed:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Savis_loose_organic_red_label);
                    textWeightEdit.setText(R.string.Savis_loose_organic_red_weight);
                    textPerCrtEdit.setText(R.string.Savis_loose_organic_red_price);
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
