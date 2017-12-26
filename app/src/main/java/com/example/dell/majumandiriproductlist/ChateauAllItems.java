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
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class ChateauAllItems extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonChateauRed,
            R.id.buttonChateauWhite
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;
    TextView textWeightLabel;

    Button red;
    Button white;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chateau_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarChateauAllItems);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Set background
        contentLayout = (LinearLayout)findViewById(R.id.chateauContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set Buttons
        red = (Button)findViewById(R.id.buttonChateauRed);
        white = (Button)findViewById(R.id.buttonChateauWhite);

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
            LayoutInflater inflater = (LayoutInflater)ChateauAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            textWeightLabel = (TextView)layout.findViewById(R.id.textWeightLabel);
            textWeightLabel.setText("Kemasan");

            switch (b.getId()){
                case R.id.buttonChateauRed:
                    imageView.setImageResource(R.drawable.chateau_red_l);
                    textNameEdit.setText(R.string.Chateau_red_label);
                    textWeightEdit.setText(R.string.Chateau_weight);
                    textPerCrtEdit.setText(R.string.Chateau_red_price);
                    break;
                case R.id.buttonChateauWhite:
                    imageView.setImageResource(R.drawable.chateau_white_l);
                    textNameEdit.setText(R.string.Chateau_white_label);
                    textWeightEdit.setText(R.string.Chateau_weight);
                    textPerCrtEdit.setText(R.string.Chateau_white_price);
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
