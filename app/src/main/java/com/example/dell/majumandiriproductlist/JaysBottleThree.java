package com.example.dell.majumandiriproductlist;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.RippleDrawable;
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

public class JaysBottleThree extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonJaysPaprika,
            R.id.buttonJaysParsley,
            R.id.buttonJaysRoastCumin,
            R.id.buttonJaysRoastFennel,
            R.id.buttonJaysRosemary,
            R.id.buttonJaysSesame,
            R.id.buttonJaysTarragon,
            R.id.buttonJaysThyme,
            R.id.buttonjaysTumeric,
            R.id.buttonJaysMustard,
            R.id.buttonJaysWholeWp,
            R.id.buttonJaysWholeBp,
            R.id.buttonJaysWp
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button paprika;
    Button parsley;
    Button roastCumin;
    Button roastFennel;
    Button rosemary;
    Button sesame;
    Button tarragon;
    Button thyme;
    Button tumeric;
    Button wholeWp;
    Button wholeBp;
    Button whitePepper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jays_bottle_three);

        Toolbar jaysBottleThreeToolbar = (Toolbar)findViewById(R.id.toolbarJaysBottleThree);
        setSupportActionBar(jaysBottleThreeToolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (ConstraintLayout) findViewById(R.id.jaysBottleThreeContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Setup buttons
        paprika = (Button)findViewById(R.id.buttonJaysPaprika);
        parsley = (Button)findViewById(R.id.buttonJaysParsley);
        roastCumin = (Button)findViewById(R.id.buttonJaysRoastCumin);
        roastFennel = (Button)findViewById(R.id.buttonJaysRoastFennel);
        rosemary = (Button)findViewById(R.id.buttonJaysRosemary);
        sesame = (Button)findViewById(R.id.buttonJaysSesame);
        tarragon = (Button)findViewById(R.id.buttonJaysTarragon);
        thyme = (Button)findViewById(R.id.buttonJaysThyme);
        tumeric = (Button)findViewById(R.id.buttonjaysTumeric);
        wholeBp = (Button)findViewById(R.id.buttonJaysWholeBp);
        wholeWp = (Button)findViewById(R.id.buttonJaysWholeWp);
        whitePepper = (Button)findViewById(R.id.buttonJaysWp);

        paprika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(paprika);
            }
        });

        parsley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(parsley);
            }
        });

        roastCumin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(roastCumin);
            }
        });

        roastFennel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(roastFennel);
            }
        });

        rosemary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(rosemary);
            }
        });

        sesame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(sesame);
            }
        });

        tarragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(tarragon);
            }
        });

        thyme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(thyme);
            }
        });

        tumeric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(tumeric);
            }
        });

        wholeWp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(wholeWp);
            }
        });

        wholeBp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(wholeBp);
            }
        });

        whitePepper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(whitePepper);
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
            LayoutInflater inflater = (LayoutInflater)JaysBottleThree.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonJaysPaprika:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Jays_paprika);
                    textWeightEdit.setText(R.string.Jays_paprika_weight);
                    textPerCrtEdit.setText(R.string.Jays_paprika_price);
                    break;
                case R.id.buttonJaysParsley:
                    imageView.setImageResource(R.drawable.jays_parsley_l);
                    textNameEdit.setText(R.string.Jays_parsley);
                    textWeightEdit.setText(R.string.Jays_parsley_weight);
                    textPerCrtEdit.setText(R.string.Jays_parsley_price);
                    break;
                case R.id.buttonJaysRoastCumin:
                    imageView.setImageResource(R.drawable.jays_cumin_l);
                    textNameEdit.setText(R.string.Jays_roast_cumin);
                    textWeightEdit.setText(R.string.Jays_roast_cumin_weight);
                    textPerCrtEdit.setText(R.string.Jays_roast_cumin_price);
                    break;
                case R.id.buttonJaysRoastFennel:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Jays_roast_fennel);
                    textWeightEdit.setText(R.string.Jays_roast_fennel_weight);
                    textPerCrtEdit.setText(R.string.Jays_roast_fennel_price);
                    break;
                case R.id.buttonJaysRosemary:
                    imageView.setImageResource(R.drawable.jays_rosemary_l);
                    textNameEdit.setText(R.string.Jays_rosemary);
                    textWeightEdit.setText(R.string.Jays_rosemary_weight);
                    textPerCrtEdit.setText(R.string.Jays_rosemary_price);
                    break;
                case R.id.buttonJaysSesame:
                    imageView.setImageResource(R.drawable.jays_sesame_seed_l);
                    textNameEdit.setText(R.string.Jays_sesame);
                    textWeightEdit.setText(R.string.Jays_sesame_weight);
                    textPerCrtEdit.setText(R.string.Jays_sesame_price);
                    break;
                case R.id.buttonJaysTarragon:
                    imageView.setImageResource(R.drawable.jays_tarragon_l);
                    textNameEdit.setText(R.string.Jays_tarragon);
                    textWeightEdit.setText(R.string.Jays_tarragon_weight);
                    textPerCrtEdit.setText(R.string.Jays_tarragon_price);
                    break;
                case R.id.buttonJaysThyme:
                    imageView.setImageResource(R.drawable.jays_thyme_l);
                    textNameEdit.setText(R.string.Jays_thyme);
                    textWeightEdit.setText(R.string.Jays_thyme_weight);
                    textPerCrtEdit.setText(R.string.Jays_thyme_price);
                    break;
                case R.id.buttonjaysTumeric:
                    imageView.setImageResource(R.drawable.jays_turmeric_l);
                    textNameEdit.setText(R.string.Jays_tumeric);
                    textWeightEdit.setText(R.string.Jays_tumeric_weight);
                    textPerCrtEdit.setText(R.string.Jays_tumeric_price);
                    break;
                case R.id.buttonJaysWholeWp:
                    imageView.setImageResource(R.drawable.jays_whole_wp_l);
                    textNameEdit.setText(R.string.Jays_whole_wp);
                    textWeightEdit.setText(R.string.Jays_whole_wp_weight);
                    textPerCrtEdit.setText(R.string.Jays_whole_wp_price);
                    break;
                case R.id.buttonJaysWholeBp:
                    imageView.setImageResource(R.drawable.jays_whole_bp_l);
                    textNameEdit.setText(R.string.Jays_whole_bp);
                    textWeightEdit.setText(R.string.Jays_whole_bp_weight);
                    textPerCrtEdit.setText(R.string.Jays_whole_bp_price);
                    break;
                case R.id.buttonJaysWp:
                    imageView.setImageResource(R.drawable.jays_wp_l);
                    textNameEdit.setText(R.string.Jays_wp);
                    textWeightEdit.setText(R.string.Jays_wp_weight);
                    textPerCrtEdit.setText(R.string.Jays_wp_price);
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
