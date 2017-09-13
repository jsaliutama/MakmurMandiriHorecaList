package com.example.dell.majumandiriproductlist;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.RippleDrawable;
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
import android.widget.TextView;

public class JaysGrillMaster extends AppCompatActivity {

    //Constants
    final String WHITE = "#ffffff";
    final String BLACK = "#000000";
    final String GREY = "#a6a6a6";
    final float BACKGROUND_NORMAL = 1.0f;
    final float BACKGROUND_DIM = 0.7f;
    final float BACKGROUND_GONE = 0.0f;

    ConstraintLayout contentLayout;
    PopupWindow popUpWindow;
    Button btnClose;
    int[] buttonList = {R.id.buttonJaysGmHotSpicy,
            R.id.buttonJaysGmClassic,
            R.id.buttonJaysGmSteakhouse,
            R.id.buttonJaysGmRotisserie,
            R.id.buttonJaysGmItalian
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button gmHotSpicy;
    Button gmClassic;
    Button gmSteakhouse;
    Button gmRotisserie;
    Button gmItalian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jays_grill_master);

        Toolbar toolJaysGrill = (Toolbar)findViewById(R.id.toolbarJaysGrillMaster);
        setSupportActionBar(toolJaysGrill);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (ConstraintLayout) findViewById(R.id.jaysGmContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Setup buttons
        gmHotSpicy = (Button)findViewById(R.id.buttonJaysGmHotSpicy);
        gmClassic = (Button)findViewById(R.id.buttonJaysGmClassic);
        gmSteakhouse = (Button)findViewById(R.id.buttonJaysGmSteakhouse);
        gmRotisserie = (Button)findViewById(R.id.buttonJaysGmRotisserie);
        gmItalian = (Button)findViewById(R.id.buttonJaysGmItalian);

        gmHotSpicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(gmHotSpicy);
            }
        });

        gmClassic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(gmClassic);
            }
        });

        gmSteakhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(gmSteakhouse);
            }
        });

        gmRotisserie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(gmRotisserie);
            }
        });

        gmItalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(gmItalian);
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
            LayoutInflater inflater = (LayoutInflater)JaysGrillMaster.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonJaysGmItalian:
                    imageView.setImageResource(R.drawable.jays_gm_italian_l);
                    textNameEdit.setText(R.string.Jays_gm_italian_label);
                    textWeightEdit.setText(R.string.Jays_gm_weight_30);
                    textPerCrtEdit.setText(R.string.Jays_gm_price);
                    break;
                case R.id.buttonJaysGmClassic:
                    imageView.setImageResource(R.drawable.jays_gm_classic_bbq_l);
                    textNameEdit.setText(R.string.Jays_gm_classic_label);
                    textWeightEdit.setText(R.string.Jays_gm_weight_30);
                    textPerCrtEdit.setText(R.string.Jays_gm_price);
                    break;
                case R.id.buttonJaysGmSteakhouse:
                    imageView.setImageResource(R.drawable.jays_gm_steakhouse_l);
                    textNameEdit.setText(R.string.Jays_gm_steakhouse_label);
                    textWeightEdit.setText(R.string.Jays_gm_weight_20);
                    textPerCrtEdit.setText(R.string.Jays_gm_price);
                    break;
                case R.id.buttonJaysGmRotisserie:
                    imageView.setImageResource(R.drawable.jays_gm_rotisserie_l);
                    textNameEdit.setText(R.string.Jays_gm_rotisserie_label);
                    textWeightEdit.setText(R.string.Jays_gm_weight_30);
                    textPerCrtEdit.setText(R.string.Jays_gm_price);
                    break;
                case R.id.buttonJaysGmHotSpicy:
                    imageView.setImageResource(R.drawable.jays_gm_hot_and_spicy_l);
                    textNameEdit.setText(R.string.Jays_gm_hot_spicy_label);
                    textWeightEdit.setText(R.string.Jays_gm_weight_30);
                    textPerCrtEdit.setText(R.string.Jays_gm_price);
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
