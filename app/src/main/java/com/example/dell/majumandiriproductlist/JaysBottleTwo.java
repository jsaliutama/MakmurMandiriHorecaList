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

public class JaysBottleTwo extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonJaysFennel,
            R.id.buttonJaysFenungreek,
            R.id.buttonJaysGaram,
            R.id.buttonJaysGarlicBread,
            R.id.buttonJaysGarlicMinced,
            R.id.buttonJaysGarlicPowder,
            R.id.buttonJaysGinger,
            R.id.buttonJaysGroundBp,
            R.id.buttonJaysIndian,
            R.id.buttonJaysItalian,
            R.id.buttonJaysMustard,
            R.id.buttonJaysNutmeg,
            R.id.buttonJaysOnion,
            R.id.buttonJaysOnionPowder,
            R.id.buttonJaysOregano
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button fennel;
    Button fenungreek;
    Button garam;
    Button garlicBread;
    Button garlicMinced;
    Button garlicPowder;
    Button ginger;
    Button groundBp;
    Button indian;
    Button italian;
    Button mustard;
    Button nutmeg;
    Button onion;
    Button onionPowder;
    Button oregano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jays_bottle_two);

        Toolbar jaysBottleTwoToolbar = (Toolbar)findViewById(R.id.toolbarJaysBottleTwo);
        setSupportActionBar(jaysBottleTwoToolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (ScrollView) findViewById(R.id.jaysBottleTwoContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Setup buttons
        fennel = (Button)findViewById(R.id.buttonJaysFennel);
        fenungreek = (Button)findViewById(R.id.buttonJaysFenungreek);
        garam = (Button)findViewById(R.id.buttonJaysGaram);
        garlicBread = (Button)findViewById(R.id.buttonJaysGarlicBread);
        garlicMinced = (Button)findViewById(R.id.buttonJaysGarlicMinced);
        garlicPowder = (Button)findViewById(R.id.buttonJaysGarlicPowder);
        ginger = (Button)findViewById(R.id.buttonJaysGinger);
        groundBp = (Button)findViewById(R.id.buttonJaysGroundBp);
        indian = (Button)findViewById(R.id.buttonJaysIndian);
        italian = (Button)findViewById(R.id.buttonJaysItalian);
        mustard = (Button)findViewById(R.id.buttonJaysMustard);
        nutmeg = (Button)findViewById(R.id.buttonJaysNutmeg);
        onion = (Button)findViewById(R.id.buttonJaysOnion);
        onionPowder = (Button)findViewById(R.id.buttonJaysOnionPowder);
        oregano = (Button)findViewById(R.id.buttonJaysOregano);

        fennel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(fennel);
            }
        });

        fenungreek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(fenungreek);
            }
        });

        garam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(garam);
            }
        });

        garlicBread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(garlicBread);
            }
        });

        garlicMinced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(garlicMinced);
            }
        });

        garlicPowder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(garlicPowder);
            }
        });

        ginger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(ginger);
            }
        });

        groundBp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(groundBp);
            }
        });

        indian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(indian);
            }
        });

        italian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(italian);
            }
        });

        mustard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(mustard);
            }
        });

        nutmeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(nutmeg);
            }
        });

        onion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(onion);
            }
        });

        onionPowder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(onionPowder);
            }
        });

        oregano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(oregano);
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
            LayoutInflater inflater = (LayoutInflater)JaysBottleTwo.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonJaysFennel:
                    imageView.setImageResource(R.drawable.jays_fennel_ground_l);
                    textNameEdit.setText(R.string.Jays_fennel);
                    textWeightEdit.setText(R.string.Jays_fennel_weight);
                    textPerCrtEdit.setText(R.string.Jays_fennel_price);
                    break;
                case R.id.buttonJaysFenungreek:
                    imageView.setImageResource(R.drawable.jays_fenungreek_l);
                    textNameEdit.setText(R.string.Jays_fenungreek);
                    textWeightEdit.setText(R.string.Jays_fenungreek_weight);
                    textPerCrtEdit.setText(R.string.Jays_fenungreek_price);
                    break;
                case R.id.buttonJaysGaram:
                    imageView.setImageResource(R.drawable.jays_garam_masala_l);
                    textNameEdit.setText(R.string.Jays_garam);
                    textWeightEdit.setText(R.string.Jays_garam_weight);
                    textPerCrtEdit.setText(R.string.Jays_garam_price);
                    break;
                case R.id.buttonJaysGarlicBread:
                    imageView.setImageResource(R.drawable.jays_garlic_bread_l);
                    textNameEdit.setText(R.string.Jays_garlic_bread);
                    textWeightEdit.setText(R.string.Jays_garlic_bread_weight);
                    textPerCrtEdit.setText(R.string.Jays_garlic_bread_price);
                    break;
                case R.id.buttonJaysGarlicMinced:
                    imageView.setImageResource(R.drawable.jays_garlic_minced_l);
                    textNameEdit.setText(R.string.Jays_garlic_minced);
                    textWeightEdit.setText(R.string.Jays_garlic_minced_weight);
                    textPerCrtEdit.setText(R.string.Jays_garlic_minced_price);
                    break;
                case R.id.buttonJaysGarlicPowder:
                    imageView.setImageResource(R.drawable.jays_garlic_powder_l);
                    textNameEdit.setText(R.string.Jays_garlic_powder);
                    textWeightEdit.setText(R.string.Jays_garlic_powder_weight);
                    textPerCrtEdit.setText(R.string.Jays_garlic_powder_price);
                    break;
                case R.id.buttonJaysGinger:
                    imageView.setImageResource(R.drawable.jays_ginger_l);
                    textNameEdit.setText(R.string.Jays_ginger);
                    textWeightEdit.setText(R.string.Jays_ginger_weight);
                    textPerCrtEdit.setText(R.string.Jays_ginger_price);
                    break;
                case R.id.buttonJaysGroundBp:
                    imageView.setImageResource(R.drawable.jays_ground_bp_l);
                    textNameEdit.setText(R.string.Jays_ground_bp);
                    textWeightEdit.setText(R.string.Jays_ground_bp_weight);
                    textPerCrtEdit.setText(R.string.Jays_ground_bp_price);
                    break;
                case R.id.buttonJaysIndian:
                    imageView.setImageResource(R.drawable.jays_indian_curry_l);
                    textNameEdit.setText(R.string.Jays_indian);
                    textWeightEdit.setText(R.string.Jays_indian_weight);
                    textPerCrtEdit.setText(R.string.Jays_indian_price);
                    break;
                case R.id.buttonJaysItalian:
                    imageView.setImageResource(R.drawable.jays_italian_l);
                    textNameEdit.setText(R.string.Jays_italian);
                    textWeightEdit.setText(R.string.Jays_italian_weight);
                    textPerCrtEdit.setText(R.string.Jays_italian_price);
                    break;
                case R.id.buttonJaysMustard:
                    imageView.setImageResource(R.drawable.jays_mustard_ground_l);
                    textNameEdit.setText(R.string.Jays_mustard);
                    textWeightEdit.setText(R.string.Jays_mustard_weight);
                    textPerCrtEdit.setText(R.string.Jays_mustard_price);
                    break;
                case R.id.buttonJaysNutmeg:
                    imageView.setImageResource(R.drawable.jays_nutmeg_l);
                    textNameEdit.setText(R.string.Jays_nutmeg);
                    textWeightEdit.setText(R.string.Jays_nutmeg_weight);
                    textPerCrtEdit.setText(R.string.Jays_mustard_price);
                    break;
                case R.id.buttonJaysOnion:
                    imageView.setImageResource(R.drawable.jays_onion_minced_l);
                    textNameEdit.setText(R.string.Jays_onion);
                    textWeightEdit.setText(R.string.Jays_onion_weight);
                    textPerCrtEdit.setText(R.string.Jays_onion_price);
                    break;
                case R.id.buttonJaysOnionPowder:
                    imageView.setImageResource(R.drawable.jays_onion_powder_l);
                    textNameEdit.setText(R.string.Jays_onion_powder);
                    textWeightEdit.setText(R.string.Jays_onion_powder_weight);
                    textPerCrtEdit.setText(R.string.Jays_onion_powder_price);
                    break;
                case R.id.buttonJaysOregano:
                    imageView.setImageResource(R.drawable.jays_oregano_l);
                    textNameEdit.setText(R.string.Jays_oregano);
                    textWeightEdit.setText(R.string.Jays_oregano_weight);
                    textPerCrtEdit.setText(R.string.Jays_oregano_price);
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
