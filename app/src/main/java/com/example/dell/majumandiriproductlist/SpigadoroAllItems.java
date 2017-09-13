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
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;

public class SpigadoroAllItems extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonSpigadoro002,
            R.id.buttonSpigadoro003,
            R.id.buttonSpigadoroFarfalle,
            R.id.buttonSpigadoroFettuccine,
            R.id.buttonSpigadoroFusili,
            R.id.buttonSpigadoroLasagna,
            R.id.buttonSpigadoroPenne
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button farfalle;
    Button fettuccine;
    Button fusili;
    Button lasagna;
    Button penne;
    Button spaghettini002;
    Button spaghettini003;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spigadoro_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarSpigadoroAll);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (ScrollView) findViewById(R.id.spigadoroAllContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Setup buttons
        farfalle = (Button)findViewById(R.id.buttonSpigadoroFarfalle);
        fettuccine = (Button)findViewById(R.id.buttonSpigadoroFettuccine);
        fusili = (Button)findViewById(R.id.buttonSpigadoroFusili);
        lasagna = (Button)findViewById(R.id.buttonSpigadoroLasagna);
        penne = (Button)findViewById(R.id.buttonSpigadoroPenne);
        spaghettini002 = (Button)findViewById(R.id.buttonSpigadoro002);
        spaghettini003 = (Button)findViewById(R.id.buttonSpigadoro003);

        farfalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(farfalle);
            }
        });

        fettuccine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(fettuccine);
            }
        });

        fusili.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(fusili);
            }
        });

        lasagna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(lasagna);
            }
        });

        penne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(penne);
            }
        });

        spaghettini002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(spaghettini002);
            }
        });

        spaghettini003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(spaghettini003);
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
            LayoutInflater inflater = (LayoutInflater)SpigadoroAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonSpigadoroFarfalle:
                    imageView.setImageResource(R.drawable.spigadoro_farfalle_l);
                    textNameEdit.setText(R.string.Spigadoro_farfalle_label);
                    textWeightEdit.setText(R.string.Spigadoro_weight_20_500);
                    textPerCrtEdit.setText(R.string.Spigadoro_farfalle_price);
                    break;
                case R.id.buttonSpigadoroFettuccine:
                    imageView.setImageResource(R.drawable.spigadoro_fettuccine_l);
                    textNameEdit.setText(R.string.Spigadoro_fettuccine_label);
                    textWeightEdit.setText(R.string.Spigadoro_weight_10_500);
                    textPerCrtEdit.setText(R.string.Spigadoro_fettuccine_price);
                    break;
                case R.id.buttonSpigadoroFusili:
                    imageView.setImageResource(R.drawable.spigadoro_fusilli_l);
                    textNameEdit.setText(R.string.Spigadoro_fusili_label);
                    textWeightEdit.setText(R.string.Spigadoro_weight_24_500);
                    textPerCrtEdit.setText(R.string.Spigadoro_fusili_price);
                    break;
                case R.id.buttonSpigadoroLasagna:
                    imageView.setImageResource(R.drawable.spigadoro_lasagna_l);
                    textNameEdit.setText(R.string.Spigadoro_lasagna_label);
                    textWeightEdit.setText(R.string.Spigadoro_weight_12_500);
                    textPerCrtEdit.setText(R.string.Spigadoro_lasagna_price);
                    break;
                case R.id.buttonSpigadoroPenne:
                    imageView.setImageResource(R.drawable.spigadoro_penne_rigate_l);
                    textNameEdit.setText(R.string.Spigadoro_penne_label);
                    textWeightEdit.setText(R.string.Spigadoro_weight_24_500);
                    textPerCrtEdit.setText(R.string.Spigadoro_penne_price);
                    break;
                case R.id.buttonSpigadoro002:
                    imageView.setImageResource(R.drawable.spigadoro_spaghettini_002_l);
                    textNameEdit.setText(R.string.Spigadoro_b2_002_label);
                    textWeightEdit.setText(R.string.Spigadoro_weight_24_500);
                    textPerCrtEdit.setText(R.string.Spigadoro_b2_002_price);
                    break;
                case R.id.buttonSpigadoro003:
                    imageView.setImageResource(R.drawable.spigadoro_spaghettini_003_l);
                    textNameEdit.setText(R.string.Barilla_gnocchi_label);
                    textWeightEdit.setText(R.string.Spigadoro_weight_24_500);
                    textPerCrtEdit.setText(R.string.Spigadoro_b2_003_price);
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
