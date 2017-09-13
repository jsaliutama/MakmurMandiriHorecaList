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

public class AbMackarel extends AppCompatActivity {

    //Constants
    final String WHITE = "#ffffff";
    final String BLACK = "#000000";
    final String GREY = "#a6a6a6";
    final float BACKGROUND_NORMAL = 1.0f;
    final float BACKGROUND_DIM = 0.7f;
    final float BACKGROUND_GONE = 0.0f;

    ScrollView contentLayout;
    PopupWindow popUpWindow;

    int[] buttonList = {R.id.buttonAbMackarelOriginal,
            R.id.buttonAbFriedMackarel,
            R.id.buttonAbSpicyMackarel,
            R.id.buttonAbMackarelPadang
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;
    Button btnClose;
    Button ori;
    Button fried;
    Button spicy;
    Button padang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab_mackarel);

        Toolbar abToolbarMackarel = (Toolbar)findViewById(R.id.toolbarAbMackarel);
        setSupportActionBar(abToolbarMackarel);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Set background
        contentLayout = (ScrollView)findViewById(R.id.abMackarelContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set buttons
        ori = (Button)findViewById(R.id.buttonAbMackarelOriginal);
        fried = (Button)findViewById(R.id.buttonAbFriedMackarel);
        spicy = (Button)findViewById(R.id.buttonAbSpicyMackarel);
        padang = (Button)findViewById(R.id.buttonAbMackarelPadang);

        ori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(ori);
            }
        });

        fried.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(fried);
            }
        });

        spicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(spicy);
            }
        });

        padang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(padang);
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
            LayoutInflater inflater = (LayoutInflater)AbMackarel.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonAbMackarelOriginal:
                    imageView.setImageResource(R.drawable.ab_mackerel_tomato_l);
                    textNameEdit.setText(R.string.AB_mackerel_ori_label);
                    textWeightEdit.setText(R.string.AB_mackerel_ori_weight);
                    textPerCrtEdit.setText(R.string.AB_mackerel_ori_price);
                    break;
                case R.id.buttonAbFriedMackarel:
                    imageView.setImageResource(R.drawable.ab_fried_mackerel_l);
                    textNameEdit.setText(R.string.AB_mackerel_fried_label);
                    textWeightEdit.setText(R.string.AB_mackerel_fried_weight);
                    textPerCrtEdit.setText(R.string.AB_mackerel_fried_price);
                    break;
                case R.id.buttonAbSpicyMackarel:
                    imageView.setImageResource(R.drawable.ab_spicy_mackerel_l);
                    textNameEdit.setText(R.string.AB_mackerel_spicy_label);
                    textWeightEdit.setText(R.string.AB_mackerel_spicy_weight);
                    textPerCrtEdit.setText(R.string.AB_mackerel_spicy_price);
                    break;
                case R.id.buttonAbMackarelPadang:
                    imageView.setImageResource(R.drawable.ab_mackerel_padang_l);
                    textNameEdit.setText(R.string.AB_mackerel_padang_label);
                    textWeightEdit.setText(R.string.AB_mackerel_padang_weight);
                    textPerCrtEdit.setText(R.string.AB_mackerel_padang_price);
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
