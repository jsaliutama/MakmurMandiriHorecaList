package com.example.dell.majumandiriproductlist;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class GryphonOolong extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonGryphonLilyOolong,
            R.id.buttonGryphonTempleOolong
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightLabelEdit;
    TextView textWeightEdit;
    TextView textIngredients;
    TextView textLabelEdit;

    Button lily;
    Button temple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gryphon_oolong);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarGryphonOolong);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (LinearLayout) findViewById(R.id.gryphonOolongContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Setup buttons
        lily = (Button)findViewById(R.id.buttonGryphonLilyOolong);
        temple = (Button)findViewById(R.id.buttonGryphonTempleOolong);

        lily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(lily);
            }
        });

        temple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(temple);
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
            LayoutInflater inflater = (LayoutInflater)GryphonOolong.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textIngredients = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            textLabelEdit = (TextView)layout.findViewById(R.id.textPricing);
            textWeightLabelEdit = (TextView)layout.findViewById(R.id.textWeightLabel);

            textWeightLabelEdit.setText("Berat dan Harga");
            textWeightEdit.setText(R.string.Gryphon_weight_price);
            textLabelEdit.setText("Ingredients");
            textIngredients.setTextSize(TypedValue.COMPLEX_UNIT_SP, 26);

            switch (b.getId()) {
                case R.id.buttonGryphonLilyOolong:
                    imageView.setImageResource(R.drawable.gryphon_lily_l);
                    textNameEdit.setText("Gryphon LilyAllItems of the Field");;
                    textIngredients.setText(R.string.Gryphon_oolong_lily_ingredients);
                    break;
                case R.id.buttonGryphonTempleOolong:
                    imageView.setImageResource(R.drawable.gryphon_temple_l);
                    textNameEdit.setText("Gryphon Templetree Lotus");
                    textIngredients.setText(R.string.Gryphon_oolong_temple_ingredients);
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
