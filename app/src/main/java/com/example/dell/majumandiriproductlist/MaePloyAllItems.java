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

public class MaePloyAllItems extends AppCompatActivity {
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
    int[] buttonList = {R.id.buttonMaePloyGreen,
            R.id.buttonMaePloyRed,
            R.id.buttonMaePloySweet,
            R.id.buttonMaePloyThai,
            R.id.buttonMaePloyTomyum
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button green;
    Button red;
    Button sweet;
    Button thai;
    Button tomyum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mae_ploy_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarMaePloyAllItems);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Set background
        contentLayout = (ScrollView)findViewById(R.id.maePloyContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set button
        green = (Button)findViewById(R.id.buttonMaePloyGreen);
        red = (Button)findViewById(R.id.buttonMaePloyRed);
        sweet = (Button)findViewById(R.id.buttonMaePloySweet);
        thai = (Button)findViewById(R.id.buttonMaePloyThai);
        tomyum = (Button)findViewById(R.id.buttonMaePloyTomyum);

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(green);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(red);
            }
        });

        sweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(sweet);
            }
        });

        thai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(thai);
            }
        });

        tomyum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(tomyum);
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
            LayoutInflater inflater = (LayoutInflater)MaePloyAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonMaePloyGreen:
                    imageView.setImageResource(R.drawable.maeploy_green_l);
                    textNameEdit.setText(R.string.MaePloy_green_label);
                    textWeightEdit.setText(R.string.MaePloy_green_weight);
                    textPerCrtEdit.setText(R.string.MaePloy_green_price);
                    break;
                case R.id.buttonMaePloyRed:
                    imageView.setImageResource(R.drawable.maeploy_red_l);
                    textNameEdit.setText(R.string.MaePloy_red_label);
                    textWeightEdit.setText(R.string.MaePloy_red_weight);
                    textPerCrtEdit.setText(R.string.MaePloy_red_price);
                    break;
                case R.id.buttonMaePloySweet:
                    imageView.setImageResource(R.drawable.maeploy_sweet_l);
                    textNameEdit.setText(R.string.MaePloy_sweet_label);
                    textWeightEdit.setText(R.string.MaePloy_sweet_weight);
                    textPerCrtEdit.setText(R.string.MaePloy_sweet_price);
                    break;
                case R.id.buttonMaePloyThai:
                    imageView.setImageResource(R.drawable.maeploy_thai_l);
                    textNameEdit.setText(R.string.MaePloy_thai_label);
                    textWeightEdit.setText(R.string.MaePloy_thai_weight);
                    textPerCrtEdit.setText(R.string.MaePloy_thai_price);
                    break;
                case R.id.buttonMaePloyTomyum:
                    imageView.setImageResource(R.drawable.maeploy_tomyum_l);
                    textNameEdit.setText(R.string.MaePloy_tomyum_label);
                    textWeightEdit.setText(R.string.MaePloy_tomyum_weight);
                    textPerCrtEdit.setText(R.string.MaePloy_tomyum_price);
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
