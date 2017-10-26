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

public class FrenchsAllItems extends AppCompatActivity {
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
    int[] buttonList = {R.id.buttonDiamondAluminum,
            R.id.buttonDiamondCling,
            R.id.buttonDiamondFreezer,
            R.id.buttonDiamondHeavy,
            R.id.buttonDiamondStorage
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button classic;
    Button dijon;
    Button honeyDijon;
    Button honey;
    Button spicy;
    Button worcestershire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frenchs_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarFrenchAllItems);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Set background
        contentLayout = (ScrollView)findViewById(R.id.frenchsContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set Buttons
        classic = (Button)findViewById(R.id.buttonFrenchClassic);
        dijon = (Button)findViewById(R.id.buttonFrenchDijon);
        honeyDijon = (Button)findViewById(R.id.buttonFrenchHoneyDijon);
        honey = (Button)findViewById(R.id.buttonFrenchHoney);
        spicy = (Button)findViewById(R.id.buttonFrenchSpicy);
        worcestershire = (Button)findViewById(R.id.buttonFrenchWorcestershire);

        classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(classic);
            }
        });

        dijon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(dijon);
            }
        });

        honeyDijon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(honeyDijon);
            }
        });

        honey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(honey);
            }
        });

        spicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(spicy);
            }
        });

        worcestershire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(worcestershire);
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
            LayoutInflater inflater = (LayoutInflater)FrenchsAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonFrenchClassic:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.French_classic_label);
                    textWeightEdit.setText(R.string.French_classic_weight);
                    textPerCrtEdit.setText(R.string.French_classic_price);
                    break;
                case R.id.buttonFrenchDijon:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.French_dijon_label);
                    textWeightEdit.setText(R.string.French_dijon_weight);
                    textPerCrtEdit.setText(R.string.French_dijon_price);
                    break;
                case R.id.buttonFrenchHoney:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.French_honey_dijon_label);
                    textWeightEdit.setText(R.string.French_honey_dijon_weight);
                    textPerCrtEdit.setText(R.string.French_honey_dijon_price);
                    break;
                case R.id.buttonFrenchHoneyDijon:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.French_honey_dijon_label);
                    textWeightEdit.setText(R.string.French_honey_dijon_weight);
                    textPerCrtEdit.setText(R.string.French_honey_dijon_price);
                    break;
                case R.id.buttonFrenchSpicy:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.French_spicy_label);
                    textWeightEdit.setText(R.string.French_spicy_weight);
                    textPerCrtEdit.setText(R.string.French_spicy_price);
                    break;
                case R.id.buttonFrenchWorcestershire:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.French_worcestershire_label);
                    textWeightEdit.setText(R.string.French_worcestershire_weight);
                    textPerCrtEdit.setText(R.string.French_worcestershire_price);
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
