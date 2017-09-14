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

public class FranksAllItems extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonFranksBuffalo,
            R.id.buttonFranksCayenne,
            R.id.buttonFranksHotBuffalo,
            R.id.buttonFranksSweetChili,
            R.id.buttonFranksSweetHeat
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;
    TextView textWeightLabel;

    Button cayenne;
    Button buffalo;
    Button hotBuffalo;
    Button sweetChili;
    Button sweetHeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_franks_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarFranksAllItems);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Set background
        contentLayout = (LinearLayout)findViewById(R.id.franksContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set buttons
        cayenne = (Button)findViewById(R.id.buttonFranksCayenne);
        buffalo = (Button)findViewById(R.id.buttonFranksBuffalo);
        hotBuffalo = (Button)findViewById(R.id.buttonFranksHotBuffalo);
        sweetChili = (Button)findViewById(R.id.buttonFranksSweetChili);
        sweetHeat = (Button)findViewById(R.id.buttonFranksSweetHeat);

        cayenne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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
            LayoutInflater inflater = (LayoutInflater)FranksAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
                case R.id.buttonFranksBuffalo:
                    imageView.setImageResource(R.drawable.franks_buffallo_wings_l);
                    textNameEdit.setText(R.string.Franks_buffalo_label);
                    textWeightEdit.setText(R.string.Franks_buffalo_weight);
                    textPerCrtEdit.setText(R.string.Franks_buffalo_price);
                    break;
                case R.id.buttonFranksCayenne:
                    imageView.setImageResource(R.drawable.franks_original_cayenne_l);
                    textNameEdit.setText(R.string.Franks_cayenne_label);
                    textWeightEdit.setText(R.string.Franks_cayenne_weight);
                    textPerCrtEdit.setText(R.string.Franks_cayenne_price);
                    break;
                case R.id.buttonFranksHotBuffalo:
                    imageView.setImageResource(R.drawable.franks_hot_buffallo_wings_l);
                    textNameEdit.setText(R.string.Franks_hot_buffalo_label);
                    textWeightEdit.setText(R.string.Franks_hot_buffalo_weight);
                    textPerCrtEdit.setText(R.string.Franks_hot_buffalo_price);
                    break;
                case R.id.buttonFranksSweetChili:
                    imageView.setImageResource(R.drawable.franks_sweet_chili_l);
                    textNameEdit.setText(R.string.Franks_sweet_chili_label);
                    textWeightEdit.setText(R.string.Franks_sweet_chili_weight);
                    textPerCrtEdit.setText(R.string.Franks_sweet_chili_price);
                    break;
                case R.id.buttonFranksSweetHeat:
                    imageView.setImageResource(R.drawable.franks_sweet_heat_bbq_wings_l);
                    textNameEdit.setText(R.string.Franks_sweet_heat_label);
                    textWeightEdit.setText(R.string.Franks_sweet_heat_weight);
                    textPerCrtEdit.setText(R.string.Franks_sweet_heat_price);
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
