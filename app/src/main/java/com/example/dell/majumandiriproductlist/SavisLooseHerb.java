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
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class SavisLooseHerb extends AppCompatActivity {

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
    int[] buttonList = {
            R.id.buttonSavisLooseHerbChocolate,
            R.id.buttonSavisLooseHerbExotic,
            R.id.buttonSavisLooseHerbJava,
            R.id.buttonSavisLooseHerbPeppermint
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;
    TextView textLabelEdit;

    Button chocolate;
    Button exotic;
    Button javaGinger;
    Button peppermint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savis_loose_herb);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarSavisLooseHerb);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (LinearLayout) findViewById(R.id.savisLooseHerbContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set button
        chocolate = (Button)findViewById(R.id.buttonSavisLooseHerbChocolate);
        exotic = (Button)findViewById(R.id.buttonSavisLooseHerbExotic);
        javaGinger = (Button)findViewById(R.id.buttonSavisLooseHerbJava);
        peppermint = (Button)findViewById(R.id.buttonSavisLooseHerbPeppermint);

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
            LayoutInflater inflater = (LayoutInflater)SavisLooseHerb.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            textLabelEdit = (TextView)layout.findViewById(R.id.textPricing);
            switch (b.getId()){
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
