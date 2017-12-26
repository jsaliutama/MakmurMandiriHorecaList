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

public class VlasicAllItems extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonVlasicDill,
            R.id.buttonVlasicDillBaby,
            R.id.buttonVlasicGherkins,
            R.id.buttonVlasicMidgets,
            R.id.buttonVlasicRelish
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button dill;
    Button baby;
    Button gherkins;
    Button midgets;
    Button relish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlasic_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarVlasicAllItems);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Set background
        contentLayout = (ScrollView)findViewById(R.id.vlasicContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set buttons
        dill = (Button)findViewById(R.id.buttonVlasicDill);
        baby = (Button)findViewById(R.id.buttonVlasicDillBaby);
        gherkins = (Button)findViewById(R.id.buttonVlasicGherkins);
        midgets = (Button)findViewById(R.id.buttonVlasicMidgets);
        relish = (Button)findViewById(R.id.buttonVlasicRelish);

        dill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(dill);
            }
        });

        baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(baby);
            }
        });

        gherkins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(gherkins);
            }
        });

        midgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(midgets);
            }
        });

        relish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(relish);
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
            LayoutInflater inflater = (LayoutInflater)VlasicAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonVlasicDill:
                    imageView.setImageResource(R.drawable.vlasic_dill_l);
                    textNameEdit.setText(R.string.Vlasic_dill_label);
                    textWeightEdit.setText(R.string.Vlasic_dill_weight);
                    textPerCrtEdit.setText(R.string.Vlasic_dill_price);
                    break;
                case R.id.buttonVlasicDillBaby:
                    imageView.setImageResource(R.drawable.vlasic_baby_dill_l);
                    textNameEdit.setText(R.string.Vlasic_dill_baby_label);
                    textWeightEdit.setText(R.string.Vlasic_dill_baby_weight);
                    textPerCrtEdit.setText(R.string.Vlasic_dill_baby_price);
                    break;
                case R.id.buttonVlasicGherkins:
                    imageView.setImageResource(R.drawable.vlasic_gherkins_l);
                    textNameEdit.setText(R.string.Vlasic_gherkins_label);
                    textWeightEdit.setText(R.string.Vlasic_gherkins_weight);
                    textPerCrtEdit.setText(R.string.Vlasic_gherkins_price);
                    break;
                case R.id.buttonVlasicMidgets:
                    imageView.setImageResource(R.drawable.vlasic_midgets_l);
                    textNameEdit.setText(R.string.Vlasic_midgets_label);
                    textWeightEdit.setText(R.string.Vlasic_midgets_weight);
                    textPerCrtEdit.setText(R.string.Vlasic_midgets_price);
                    break;
                case R.id.buttonVlasicRelish:
                    imageView.setImageResource(R.drawable.vlasic_relish_l);
                    textNameEdit.setText(R.string.Vlasic_relish_label);
                    textWeightEdit.setText(R.string.Vlasic_relish_weight);
                    textPerCrtEdit.setText(R.string.Vlasic_relish_price);
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
