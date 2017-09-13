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
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class BertolliVinegar extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonBertolliBalsamic,
            R.id.buttonBertolliRedwine,
            R.id.buttonBertolliWhitewine
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textWeightLabel;
    TextView textPerCrtEdit;

    Button balsamic;
    Button red;
    Button white;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bertolli_vinegar);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarBertolliVinegar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (LinearLayout) findViewById(R.id.bertolliVinegarContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Setup buttons
        balsamic = (Button)findViewById(R.id.buttonBertolliBalsamic);
        red = (Button)findViewById(R.id.buttonBertolliRedwine);
        white = (Button)findViewById(R.id.buttonBertolliWhitewine);

        balsamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(balsamic);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(red);
            }
        });

        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(white);
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
            LayoutInflater inflater = (LayoutInflater)BertolliVinegar.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            textWeightLabel = (TextView)layout.findViewById(R.id.textWeightLabel);
            switch (b.getId()){
                case R.id.buttonBertolliBalsamic:
                    imageView.setImageResource(R.drawable.bertolli_balsamic_l);
                    textNameEdit.setText(R.string.Bertolli_vinegar_balsamic_label);
                    textWeightLabel.setText("Kemasan");
                    textWeightEdit.setText(R.string.Bertolli_packing_12_500);
                    textPerCrtEdit.setText(R.string.Bertolli_vinegar_balsamic_price);
                    break;
                case R.id.buttonBertolliRedwine:
                    imageView.setImageResource(R.drawable.bertolli_redwine_l);
                    textNameEdit.setText(R.string.Bertolli_vinegar_red_label);
                    textWeightLabel.setText("Kemasan");
                    textWeightEdit.setText(R.string.Bertolli_packing_12_500);
                    textPerCrtEdit.setText(R.string.Bertolli_vinegar_red_price);
                    break;
                case R.id.buttonBertolliWhitewine:
                    imageView.setImageResource(R.drawable.bertolli_whitewine_l);
                    textNameEdit.setText(R.string.Bertolli_vinegar_white_label);
                    textWeightLabel.setText("Kemasan");
                    textWeightEdit.setText(R.string.Bertolli_packing_12_500);
                    textPerCrtEdit.setText(R.string.Bertolli_vinegar_white_price);
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
