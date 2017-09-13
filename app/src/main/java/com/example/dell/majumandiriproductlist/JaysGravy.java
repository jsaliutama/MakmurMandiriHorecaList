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

public class JaysGravy extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonJaysGravyBlackpepper,
            R.id.buttonJaysGravyBrown,
            R.id.buttonJaysGravyDemiglance,
            R.id.buttonJaysGravyMushroom,
            R.id.buttonJaysGravyRosemary
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button blackpepper;
    Button brown;
    Button demiglance;
    Button mushroom;
    Button rosemary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jays_gravy);

        Toolbar toolJaysGravy = (Toolbar) findViewById(R.id.toolbarJaysGravy);
        setSupportActionBar(toolJaysGravy);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (ScrollView) findViewById(R.id.jaysGravyContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set buttons
        blackpepper = (Button)findViewById(R.id.buttonJaysGravyBlackpepper);
        brown = (Button)findViewById(R.id.buttonJaysGravyBrown);
        demiglance = (Button)findViewById(R.id.buttonJaysGravyDemiglance);
        mushroom = (Button)findViewById(R.id.buttonJaysGravyMushroom);
        rosemary = (Button)findViewById(R.id.buttonJaysGravyRosemary);

        blackpepper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(blackpepper);
            }
        });

        brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(brown);
            }
        });

        demiglance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(demiglance);
            }
        });

        mushroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(mushroom);
            }
        });

        rosemary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(rosemary);
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
            LayoutInflater inflater = (LayoutInflater)JaysGravy.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonJaysGravyBlackpepper:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Jays_gravy_blackpepper);
                    textWeightEdit.setText(R.string.Jays_gravy_weight);
                    textPerCrtEdit.setText(R.string.Jays_gravy_blackpepper_price);
                    break;
                case R.id.buttonJaysGravyBrown:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Jays_gravy_brown);
                    textWeightEdit.setText(R.string.Jays_gravy_weight);
                    textPerCrtEdit.setText(R.string.Jays_gravy_brown_price);
                    break;
                case R.id.buttonJaysGravyDemiglance:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Jays_gravy_demiglance);
                    textWeightEdit.setText(R.string.Jays_gravy_weight);
                    textPerCrtEdit.setText(R.string.Jays_gravy_demigalnce_price);
                    break;
                case R.id.buttonJaysGravyMushroom:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Jays_gravy_mushroom);
                    textWeightEdit.setText(R.string.Jays_gravy_weight);
                    textPerCrtEdit.setText(R.string.Jays_gravy_mushroom_price);
                    break;
                case R.id.buttonJaysGravyRosemary:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Jays_gravy_rosemary);
                    textWeightEdit.setText(R.string.Jays_gravy_weight);
                    textPerCrtEdit.setText(R.string.Jays_gravy_rosemary_price);
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
