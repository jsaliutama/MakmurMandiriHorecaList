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

public class AbTuna extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonAbTunaChunkInOil,
            R.id.buttonAbTunaFlakesInOil,
            R.id.buttonAbTunaChunkInBrine,
            R.id.buttonAbTunaSandwich,
            R.id.buttonAbTunaFlakesInWaterLight,
            R.id.buttonAbTunaChunkInOliveOil,
            R.id.buttonAbTunaCabe,
            R.id.buttonAbTunaCurry,
            R.id.buttonAbTunaSpicyTomato,
            R.id.buttonAbTunaMayoNatural,
            R.id.buttonAbTunaMayoMild,
            R.id.buttonAbTunaMayoHot,
            R.id.buttonAbTunaSpread
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button abChunkInOil;
    Button abFlakesInOil;
    Button abChunkInBrine;
    Button abTunaSandwich;
    Button abChunkInOliveOil;
    Button abFlakesinWater;
    Button abCabe;
    Button abCurry;
    Button abSpicyTomato;
    Button abMayoNatural;
    Button abMayoHot;
    Button abMayoMild;
    Button abSpread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab_tuna);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarAbTuna);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Set background
        contentLayout = (ScrollView) findViewById(R.id.abTunaContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set buttons
        abChunkInOil = (Button)findViewById(R.id.buttonAbTunaChunkInOil);
        abFlakesInOil = (Button)findViewById(R.id.buttonAbTunaFlakesInOil);
        abTunaSandwich = (Button)findViewById(R.id.buttonAbTunaSandwich);
        abChunkInBrine = (Button)findViewById(R.id.buttonAbTunaChunkInBrine);
        abChunkInOliveOil = (Button)findViewById(R.id.buttonAbTunaChunkInOliveOil);
        abCabe = (Button)findViewById(R.id.buttonAbTunaCabe);
        abCurry = (Button)findViewById(R.id.buttonAbTunaCurry);
        abSpicyTomato = (Button)findViewById(R.id.buttonAbTunaSpicyTomato);
        abMayoNatural = (Button)findViewById(R.id.buttonAbTunaMayoNatural);
        abMayoHot = (Button)findViewById(R.id.buttonAbTunaMayoHot);
        abMayoMild = (Button)findViewById(R.id.buttonAbTunaMayoMild);
        abSpread = (Button)findViewById(R.id.buttonAbTunaSpread);
        abFlakesinWater = (Button)findViewById(R.id.buttonAbTunaFlakesInWaterLight);

        abChunkInOil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abChunkInOil);
            }
        });

        abFlakesInOil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abFlakesInOil);
            }
        });

        abChunkInBrine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abChunkInBrine);
            }
        });

        abTunaSandwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abTunaSandwich);
            }
        });

        abChunkInOliveOil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abChunkInOliveOil);
            }
        });

        abFlakesinWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abFlakesinWater);
            }
        });

        abCabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abCabe);
            }
        });

        abCurry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abCurry);
            }
        });

        abSpicyTomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abSpicyTomato);
            }
        });

        abMayoNatural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abMayoNatural);
            }
        });

        abMayoHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abMayoHot);
            }
        });

        abMayoMild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abMayoMild);
            }
        });

        abSpread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(abSpread);
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
            LayoutInflater inflater = (LayoutInflater)AbTuna.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonAbTunaChunkInOil:
                    imageView.setImageResource(R.drawable.ab_tuna_chunk_in_oil_l);
                    textNameEdit.setText(R.string.AB_tuna_chunk_in_oil_label);
                    textWeightEdit.setText(R.string.AB_tuna_weight);
                    textPerCrtEdit.setText(R.string.AB_tuna_price);
                    break;
                case R.id.buttonAbTunaFlakesInOil:
                    imageView.setImageResource(R.drawable.ab_tuna_flakes_in_oil_l);
                    textNameEdit.setText(R.string.AB_tuna_flakes_in_oil_label);
                    textWeightEdit.setText(R.string.AB_tuna_weight);
                    textPerCrtEdit.setText(R.string.AB_tuna_price);
                    break;
                case R.id.buttonAbTunaChunkInBrine:
                    imageView.setImageResource(R.drawable.ab_tuna_chunk_in_brine_l);
                    textNameEdit.setText(R.string.AB_tuna_chunk_in_brine_label);
                    textWeightEdit.setText(R.string.AB_tuna_weight);
                    textPerCrtEdit.setText(R.string.AB_tuna_price);
                    break;
                case R.id.buttonAbTunaSandwich:
                    imageView.setImageResource(R.drawable.ab_sandwich_tuna_l);
                    textNameEdit.setText(R.string.AB_tuna_sandwich_label);
                    textWeightEdit.setText(R.string.AB_tuna_weight);
                    textPerCrtEdit.setText(R.string.AB_tuna_price);
                    break;
                case R.id.buttonAbTunaChunkInOliveOil:
                    imageView.setImageResource(R.drawable.ab_tuna_chunk_in_olive_oil_l);
                    textNameEdit.setText(R.string.AB_tuna_chunk_in_olive_oil_label);
                    textWeightEdit.setText(R.string.AB_tuna_weight);
                    textPerCrtEdit.setText(R.string.AB_tuna_price);
                    break;
                case R.id.buttonAbTunaFlakesInWaterLight:
                    imageView.setImageResource(R.drawable.ab_tuna_flakes_in_water_light_l);
                    textNameEdit.setText(R.string.AB_tuna_flakes_light_label);
                    textWeightEdit.setText(R.string.AB_tuna_weight);
                    textPerCrtEdit.setText(R.string.AB_tuna_price);
                    break;
                case R.id.buttonAbTunaCabe:
                    imageView.setImageResource(R.drawable.ab_chili_tuna_l);
                    textNameEdit.setText(R.string.AB_tuna_cabe_label);
                    textWeightEdit.setText(R.string.AB_tuna_weight);
                    textPerCrtEdit.setText(R.string.AB_tuna_price);
                    break;
                case R.id.buttonAbTunaCurry:
                    imageView.setImageResource(R.drawable.ab_tuna_curry_l);
                    textNameEdit.setText(R.string.AB_tuna_curry_label);
                    textWeightEdit.setText(R.string.AB_tuna_weight);
                    textPerCrtEdit.setText(R.string.AB_tuna_price);
                    break;
                case R.id.buttonAbTunaSpicyTomato:
                    imageView.setImageResource(R.drawable.ab_tuna_tomato_chili_l);
                    textNameEdit.setText(R.string.AB_tuna_spicy_tomato_label);
                    textWeightEdit.setText(R.string.AB_tuna_weight);
                    textPerCrtEdit.setText(R.string.AB_tuna_price);
                    break;
                case R.id.buttonAbTunaMayoNatural:
                    imageView.setImageResource(R.drawable.ab_tuna_mayo_natural_l);
                    textNameEdit.setText(R.string.AB_tuna_mayo_natural_label);
                    textWeightEdit.setText(R.string.AB_tuna_weight);
                    textPerCrtEdit.setText(R.string.AB_tuna_price);
                    break;
                case R.id.buttonAbTunaMayoMild:
                    imageView.setImageResource(R.drawable.ab_tuna_mayo_mild_l);
                    textNameEdit.setText(R.string.AB_tuna_mayo_mild_label);
                    textWeightEdit.setText(R.string.AB_tuna_weight);
                    textPerCrtEdit.setText(R.string.AB_tuna_price);
                    break;
                case R.id.buttonAbTunaMayoHot:
                    imageView.setImageResource(R.drawable.ab_tuna_mayo_hot_l);
                    textNameEdit.setText(R.string.AB_tuna_mayo_hot_label);
                    textWeightEdit.setText(R.string.AB_tuna_weight);
                    textPerCrtEdit.setText(R.string.AB_tuna_price);
                    break;
                case R.id.buttonAbTunaSpread:
                    imageView.setImageResource(R.drawable.ab_tuna_spread_l);
                    textNameEdit.setText(R.string.AB_tuna_spread_label);
                    textWeightEdit.setText(R.string.AB_tuna_weight);
                    textPerCrtEdit.setText(R.string.AB_tuna_price);
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
