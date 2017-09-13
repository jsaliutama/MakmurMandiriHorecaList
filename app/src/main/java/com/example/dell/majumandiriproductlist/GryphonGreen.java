package com.example.dell.majumandiriproductlist;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class GryphonGreen extends AppCompatActivity {

    //Constants
    final String WHITE = "#ffffff";
    final String BLACK = "#000000";
    final String GREY = "#a6a6a6";
    final float BACKGROUND_NORMAL = 1.0f;
    final float BACKGROUND_DIM = 0.7f;
    final float BACKGROUND_GONE = 0.0f;

    LinearLayout contentLayout;
    PopupWindow popUpWindow;
    Button btnClose;
    int[] buttonList = {R.id.buttonGryphonHanamiGreen,
            R.id.buttonGryphonMarrakeshGreen,
            R.id.buttonGryphonOsmanthusGreen,
            R.id.buttonGryphonPearlGreen
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textWeightLabelEdit;
    TextView textIngredients;
    TextView textLabelEdit;

    Button hanami;
    Button marrakesh;
    Button osmanthus;
    Button pearl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gryphon_green);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarGryphonGreen);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (LinearLayout) findViewById(R.id.gryphonGreenContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Setup buttons
        hanami = (Button)findViewById(R.id.buttonGryphonHanamiGreen);
        marrakesh = (Button)findViewById(R.id.buttonGryphonMarrakeshGreen);
        osmanthus = (Button)findViewById(R.id.buttonGryphonOsmanthusGreen);
        pearl = (Button)findViewById(R.id.buttonGryphonPearlGreen);

        hanami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(hanami);
            }
        });

        marrakesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(marrakesh);
            }
        });

        osmanthus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(osmanthus);
            }
        });

        pearl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(pearl);
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
            LayoutInflater inflater = (LayoutInflater)GryphonGreen.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textIngredients = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            textLabelEdit = (TextView)layout.findViewById(R.id.textPricing);
            textWeightLabelEdit = (TextView)layout.findViewById(R.id.textWeightLabel);

            textWeightLabelEdit.setText("Berat dan Harga");
            textWeightEdit.setText(R.string.Gryphon_weight_price);
            textLabelEdit.setText("Ingredients");
            textIngredients.setTextSize(TypedValue.COMPLEX_UNIT_SP, 26);

            switch (b.getId()){
                case R.id.buttonGryphonHanamiGreen:
                    imageView.setImageResource(R.drawable.gryphon_hanami_l);
                    textNameEdit.setText("Gryphon Hanami");
                    textIngredients.setText(R.string.Gryphon_green_hanami_ingredients);
                    break;
                case R.id.buttonGryphonMarrakeshGreen:
                    imageView.setImageResource(R.drawable.gryphon_marrakesh_l);
                    textNameEdit.setText("Gryphon Marrakesh Mint");
                    textIngredients.setText(R.string.Gryphon_green_marrakesh_ingredients);
                    break;
                case R.id.buttonGryphonOsmanthusGreen:
                    imageView.setImageResource(R.drawable.gryphon_osmanthus_l);
                    textNameEdit.setText("Gryphon Osmanthus Sencha");
                    textIngredients.setText(R.string.Gryphon_green_osmantus_ingredients);
                    break;
                case R.id.buttonGryphonPearlGreen:
                    imageView.setImageResource(R.drawable.gryphon_pearl_l);
                    textNameEdit.setText("Gryphon Pearl of the Orient");
                    textIngredients.setText(R.string.Gryphon_green_pearl_ingredients);
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
