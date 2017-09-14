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

public class ReynoldsAllItems extends AppCompatActivity {

    //Constants
    final String WHITE = "#ffffff";
    final String BLACK = "#000000";
    final String GREY = "#a6a6a6";
    final float BACKGROUND_NORMAL = 1.0f;
    final float BACKGROUND_DIM = 0.7f;
    final float BACKGROUND_GONE = 0.0f;

    ScrollView contentLayout;
    PopupWindow popUpWindow;

    int[] buttonList = {R.id.buttonReynoldsCling,
            R.id.buttonReynoldsCutRite,
            R.id.buttonReynoldsFoil,
            R.id.buttonReynoldsOvenLarge,
            R.id.buttonReynoldsOvenTurkey,
            R.id.buttonReynoldsParchment,
            R.id.buttonReynoldsPvcFilm,
            R.id.buttonReynoldsSandwichBags,
            R.id.buttonReynoldsStorageBags
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;
    Button btnClose;

    Button foil;
    Button cling;
    Button ovenLarge;
    Button ovenTurkey;
    Button storageBags;
    Button sandwichBags;
    Button cutRite;
    Button parchment;
    Button pvcFilm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reynolds_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarReynoldsAllItems);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Set background
        contentLayout = (ScrollView)findViewById(R.id.reynoldsContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set buttons
        foil = (Button)findViewById(R.id.buttonReynoldsFoil);
        cling = (Button)findViewById(R.id.buttonReynoldsCling);
        ovenLarge = (Button)findViewById(R.id.buttonReynoldsOvenLarge);
        ovenTurkey = (Button)findViewById(R.id.buttonReynoldsOvenTurkey);
        storageBags = (Button)findViewById(R.id.buttonReynoldsStorageBags);
        sandwichBags = (Button)findViewById(R.id.buttonReynoldsSandwichBags);
        cutRite = (Button)findViewById(R.id.buttonReynoldsCutRite);
        parchment = (Button)findViewById(R.id.buttonReynoldsParchment);
        pvcFilm = (Button)findViewById(R.id.buttonReynoldsPvcFilm);

        foil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(foil);
            }
        });

        cling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(cling);
            }
        });

        ovenLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(ovenLarge);
            }
        });

        ovenTurkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(ovenTurkey);
            }
        });

        storageBags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(storageBags);
            }
        });

        sandwichBags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(sandwichBags);
            }
        });

        cutRite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(cutRite);
            }
        });

        parchment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(parchment);
            }
        });

        pvcFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(pvcFilm);
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
            LayoutInflater inflater = (LayoutInflater)ReynoldsAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonReynoldsCling:
                    imageView.setImageResource(R.drawable.reynolds_sure_seal_l);
                    textNameEdit.setText(R.string.Reynolds_cling_label);
                    textWeightEdit.setText(R.string.Reynolds_cling_weight);
                    textPerCrtEdit.setText(R.string.Reynolds_cling_price);
                    break;
                case R.id.buttonReynoldsCutRite:
                    imageView.setImageResource(R.drawable.reynolds_cut_rite_l);
                    textNameEdit.setText(R.string.Reynolds_cut_rite_label);
                    textWeightEdit.setText(R.string.Reynolds_cut_rite_weight);
                    textPerCrtEdit.setText(R.string.Reynolds_cut_rite_price);
                    break;
                case R.id.buttonReynoldsFoil:
                    imageView.setImageResource(R.drawable.reynolds_standard_foil_l);
                    textNameEdit.setText(R.string.Reynolds_foil_label);
                    textWeightEdit.setText(R.string.Reynolds_foil_weight);
                    textPerCrtEdit.setText(R.string.Reynolds_foil_price);
                    break;
                case R.id.buttonReynoldsOvenLarge:
                    imageView.setImageResource(R.drawable.reynolds_oven_large_l);
                    textNameEdit.setText(R.string.Reynolds_oven_large_label);
                    textWeightEdit.setText(R.string.Reynolds_oven_large_weight);
                    textPerCrtEdit.setText(R.string.Reynolds_oven_large_price);
                    break;
                case R.id.buttonReynoldsOvenTurkey:
                    imageView.setImageResource(R.drawable.reynolds_oven_turkey_l);
                    textNameEdit.setText(R.string.Reynolds_oven_turkey_label);
                    textWeightEdit.setText(R.string.Reynolds_oven_turkey_weight);
                    textPerCrtEdit.setText(R.string.Reynolds_oven_turkey_price);
                    break;
                case R.id.buttonReynoldsParchment:
                    imageView.setImageResource(R.drawable.reynolds_parchment_l);
                    textNameEdit.setText(R.string.Reynolds_parchment_label);
                    textWeightEdit.setText(R.string.Reynolds_parchment_weight);
                    textPerCrtEdit.setText(R.string.Reynolds_parchment_price);
                    break;
                case R.id.buttonReynoldsPvcFilm:
                    imageView.setImageResource(R.drawable.reynolds_pvc_film_l);
                    textNameEdit.setText(R.string.Reynolds_pvc_film_label);
                    textWeightEdit.setText(R.string.Reynolds_pvc_film_weight);
                    textPerCrtEdit.setText(R.string.Reynolds_pvc_film_price);
                    break;
                case R.id.buttonReynoldsSandwichBags:
                    imageView.setImageResource(R.drawable.reynolds_sandwich_bags_l);
                    textNameEdit.setText(R.string.Reynolds_sandwich_bags_label);
                    textWeightEdit.setText(R.string.Reynolds_sandwich_bags_weight);
                    textPerCrtEdit.setText(R.string.Reynolds_sandwich_bags_price);
                    break;
                case R.id.buttonReynoldsStorageBags:
                    imageView.setImageResource(R.drawable.reynolds_zipper_bags_l);
                    textNameEdit.setText(R.string.Reynolds_storage_bags_label);
                    textWeightEdit.setText(R.string.Reynolds_storage_bags_weight);
                    textPerCrtEdit.setText(R.string.Reynolds_storage_bags_price);
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
