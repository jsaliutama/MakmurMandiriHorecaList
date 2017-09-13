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
import android.widget.TextView;

public class JaysBottleOne extends AppCompatActivity {

    //Constants
    final String WHITE = "#ffffff";
    final String BLACK = "#000000";
    final String GREY = "#a6a6a6";
    final float BACKGROUND_NORMAL = 1.0f;
    final float BACKGROUND_DIM = 0.7f;
    final float BACKGROUND_GONE = 0.0f;

    ConstraintLayout contentLayout;
    PopupWindow popUpWindow;
    Button btnClose;
    int[] buttonList = {R.id.buttonJaysAllPurpose,
            R.id.buttonJaysBasil,
            R.id.buttonJaysBay,
            R.id.buttonJaysBeef,
            R.id.buttonJaysCardamon,
            R.id.buttonJaysChicken,
            R.id.buttonJaysChiliFlakes,
            R.id.buttonJaysChiliPowder,
            R.id.buttonJaysChinese,
            R.id.buttonJaysCinnamon,
            R.id.buttonJaysCloves,
            R.id.buttonJaysCorianderGround,
            R.id.buttonJaysCrushedBp,
            R.id.buttonJaysCumin
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;
    Button jaysAll;
    Button jaysBasil;
    Button jaysBay;
    Button jaysBeef;
    Button jaysCardamon;
    Button jaysChicken;
    Button jaysChiliFlakes;
    Button jaysChiliPowder;
    Button jaysChinese;
    Button jaysCinnamon;
    Button jaysCloves;
    Button jaysCoriander;
    Button jaysCrushedBp;
    Button jaysCumin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jays_bottle_one);

        Toolbar toolbarJaysBottleOne = (Toolbar)findViewById(R.id.toolbarJaysBottleOne);
        setSupportActionBar(toolbarJaysBottleOne);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (ConstraintLayout) findViewById(R.id.jaysBottleOneContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Setup buttons
        jaysAll = (Button)findViewById(R.id.buttonJaysAllPurpose);
        jaysBasil = (Button)findViewById(R.id.buttonJaysBasil);
        jaysBay = (Button)findViewById(R.id.buttonJaysBay);
        jaysBeef = (Button)findViewById(R.id.buttonJaysBeef);
        jaysCardamon = (Button)findViewById(R.id.buttonJaysCardamon);
        jaysChicken = (Button)findViewById(R.id.buttonJaysChicken);
        jaysChiliFlakes = (Button)findViewById(R.id.buttonJaysChiliFlakes);
        jaysChiliPowder = (Button)findViewById(R.id.buttonJaysChiliPowder);
        jaysChinese = (Button)findViewById(R.id.buttonJaysChinese);
        jaysCinnamon = (Button)findViewById(R.id.buttonJaysCinnamon);
        jaysCloves = (Button)findViewById(R.id.buttonJaysCloves);
        jaysCoriander = (Button)findViewById(R.id.buttonJaysCorianderGround);
        jaysCrushedBp = (Button)findViewById(R.id.buttonJaysCrushedBp);
        jaysCumin = (Button)findViewById(R.id.buttonJaysCumin);

        jaysAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jaysAll);
            }
        });

        jaysBasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jaysBasil);
            }
        });

        jaysBay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jaysBay);
            }
        });

        jaysBeef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jaysBeef);
            }
        });

        jaysCardamon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jaysCardamon);
            }
        });

        jaysChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jaysChicken);
            }
        });

        jaysChiliFlakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jaysChiliFlakes);
            }
        });

        jaysChiliPowder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jaysChiliPowder);
            }
        });

        jaysChinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jaysChinese);
            }
        });

        jaysCinnamon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jaysCinnamon);
            }
        });

        jaysCloves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jaysCloves);
            }
        });

        jaysCoriander.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jaysCoriander);
            }
        });

        jaysCrushedBp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jaysCrushedBp);
            }
        });

        jaysCumin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jaysCumin);
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
            LayoutInflater inflater = (LayoutInflater)JaysBottleOne.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonJaysAllPurpose:
                    imageView.setImageResource(R.drawable.jays_all_purpose_l);
                    textNameEdit.setText(R.string.Jays_allpurpose);
                    textWeightEdit.setText(R.string.Jays_allpurpose_weight);
                    textPerCrtEdit.setText(R.string.Jays_allpurpose_price);
                    break;
                case R.id.buttonJaysBasil:
                    imageView.setImageResource(R.drawable.jays_basil_l);
                    textNameEdit.setText(R.string.Jays_basil);
                    textWeightEdit.setText(R.string.Jays_basil_weight);
                    textPerCrtEdit.setText(R.string.Jays_basil_price);
                    break;
                case R.id.buttonJaysBay:
                    imageView.setImageResource(R.drawable.jays_bay_l);
                    textNameEdit.setText(R.string.Jays_bay);
                    textWeightEdit.setText(R.string.Jays_bay_weight);
                    textPerCrtEdit.setText(R.string.Jays_bay_price);
                    break;
                case R.id.buttonJaysBeef:
                    imageView.setImageResource(R.drawable.jays_beef_l);
                    textNameEdit.setText(R.string.Jays_beef);
                    textWeightEdit.setText(R.string.Jays_beef_weight);
                    textPerCrtEdit.setText(R.string.Jays_beef_price);
                    break;
                case R.id.buttonJaysCardamon:
                    imageView.setImageResource(R.drawable.jays_cardamom_l);
                    textNameEdit.setText(R.string.Jays_cardamom);
                    textWeightEdit.setText(R.string.Jays_cardamom_weight);
                    textPerCrtEdit.setText(R.string.Jays_cardamom_price);
                    break;
                case R.id.buttonJaysChicken:
                    imageView.setImageResource(R.drawable.jays_chicken_l);
                    textNameEdit.setText(R.string.Jays_chicken);
                    textWeightEdit.setText(R.string.Jays_chicken_weight);
                    textPerCrtEdit.setText(R.string.Jays_chicken_price);
                    break;
                case R.id.buttonJaysChiliFlakes:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Jays_chili_flakes);
                    textWeightEdit.setText(R.string.Jays_chili_flakes_weight);
                    textPerCrtEdit.setText(R.string.Jays_chili_flakes_price);
                    break;
                case R.id.buttonJaysChiliPowder:
                    imageView.setImageResource(R.drawable.jays_chili_powder_l);
                    textNameEdit.setText(R.string.Jays_chili_powder);
                    textWeightEdit.setText(R.string.Jays_chili_powder_weight);
                    textPerCrtEdit.setText(R.string.Jays_chili_powder_price);
                    break;
                case R.id.buttonJaysChinese:
                    imageView.setImageResource(R.drawable.jays_chinese_five_spice_l);
                    textNameEdit.setText(R.string.Jays_chinese);
                    textWeightEdit.setText(R.string.Jays_chinese_weight);
                    textPerCrtEdit.setText(R.string.Jays_chinese_price);
                    break;
                case R.id.buttonJaysCinnamon:
                    imageView.setImageResource(R.drawable.jays_cinnamon_ground_l);
                    textNameEdit.setText(R.string.Jays_cinnamon);
                    textWeightEdit.setText(R.string.Jays_cinnamon_weight);
                    textPerCrtEdit.setText(R.string.Jays_cinnamon_price);
                    break;
                case R.id.buttonJaysCloves:
                    imageView.setImageResource(R.drawable.jays_cloves_l);
                    textNameEdit.setText(R.string.Jays_cloves);
                    textWeightEdit.setText(R.string.Jays_cloves_weight);
                    textPerCrtEdit.setText(R.string.Jays_cloves_price);
                    break;
                case R.id.buttonJaysCorianderGround:
                    imageView.setImageResource(R.drawable.jays_coriander_ground_l);
                    textNameEdit.setText(R.string.Jays_coriander);
                    textWeightEdit.setText(R.string.Jays_coriander_weight);
                    textPerCrtEdit.setText(R.string.Jays_coriander_price);
                    break;
                case R.id.buttonJaysCrushedBp:
                    imageView.setImageResource(R.drawable.jays_crushed_bp_l);
                    textNameEdit.setText(R.string.Jays_crushed_bp);
                    textWeightEdit.setText(R.string.Jays_crushed_bp_weight);
                    textPerCrtEdit.setText(R.string.Jays_crushed_bp_price);
                    break;
                case R.id.buttonJaysCumin:
                    imageView.setImageResource(R.drawable.jays_cumin_l);
                    textNameEdit.setText(R.string.Jays_cumin);
                    textWeightEdit.setText(R.string.Jays_cumin_weight);
                    textPerCrtEdit.setText(R.string.Jays_cumin_price);
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
