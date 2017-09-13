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

public class SavisLooseClassic extends AppCompatActivity {

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
            R.id.buttonSavisLooseClassicEarl,
            R.id.buttonSavisLooseClassicJava,
            R.id.buttonSavisLooseClassicJewel,
            R.id.buttonSavisLooseClassicSilver,
            R.id.buttonSavisLooseClassicSumatra
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;
    TextView textLabelEdit;

    Button earl;
    Button java;
    Button jewel;
    Button silver;
    Button sumatra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savis_loose_classic);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarSavisLooseClassic);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (LinearLayout) findViewById(R.id.savisLooseClassicContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set button
        earl = (Button)findViewById(R.id.buttonSavisLooseClassicEarl);
        java = (Button)findViewById(R.id.buttonSavisLooseClassicJava);
        jewel = (Button)findViewById(R.id.buttonSavisLooseClassicJewel);
        silver = (Button)findViewById(R.id.buttonSavisLooseClassicSilver);
        sumatra = (Button)findViewById(R.id.buttonSavisLooseClassicSumatra);

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
            LayoutInflater inflater = (LayoutInflater)SavisLooseClassic.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
