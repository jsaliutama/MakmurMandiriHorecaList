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

public class JaysMashedPotatoes extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonJaysMashedGarlic,
            R.id.buttonJaysMashedTraditional
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button garlic;
    Button traditional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jays_mashed_potatoes);

        Toolbar toolJaysMashed = (Toolbar)findViewById(R.id.toolbarJaysMashedPotatoes);
        setSupportActionBar(toolJaysMashed);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (LinearLayout) findViewById(R.id.jaysMashedContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set buttons
        garlic = (Button)findViewById(R.id.buttonJaysMashedGarlic);
        traditional = (Button)findViewById(R.id.buttonJaysMashedTraditional);

        garlic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(garlic);
            }
        });

        traditional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(traditional);
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
            LayoutInflater inflater = (LayoutInflater)JaysMashedPotatoes.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonJaysMashedGarlic:
                    imageView.setImageResource(R.drawable.jays_mashed_garlic_l);
                    textNameEdit.setText(R.string.Jays_mashed_garlic_label);
                    textWeightEdit.setText(R.string.Jays_mashed_weight);
                    textPerCrtEdit.setText(R.string.Jays_mashed_price);
                    break;
                case R.id.buttonJaysMashedTraditional:
                    imageView.setImageResource(R.drawable.jays_mashed_traditional_l);
                    textNameEdit.setText(R.string.Jays_mashed_traditional_label);
                    textWeightEdit.setText(R.string.Jays_mashed_weight);
                    textPerCrtEdit.setText(R.string.Jays_mashed_price);
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
