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

public class GryphonRooibos extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonGryphonAztecaRooibos,
            R.id.buttonGryphonCobaRooibos,
            R.id.buttonGryphonMogamboRooibos,
            R.id.buttonGryphonTomatinoRooibos
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightLabelEdit;
    TextView textWeightEdit;
    TextView textIngredients;
    TextView textLabelEdit;

    Button azteca;
    Button coba;
    Button mogambo;
    Button tomatino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gryphon_rooibos);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarGryphonRooibos);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (LinearLayout) findViewById(R.id.gryphonRooibosContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Setup buttons
        azteca = (Button)findViewById(R.id.buttonGryphonAztecaRooibos);
        coba = (Button)findViewById(R.id.buttonGryphonCobaRooibos);
        mogambo = (Button)findViewById(R.id.buttonGryphonMogamboRooibos);
        tomatino = (Button)findViewById(R.id.buttonGryphonTomatinoRooibos);

        azteca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(azteca);
            }
        });

        coba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(coba);
            }
        });

        mogambo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(mogambo);
            }
        });

        tomatino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(tomatino);
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
            LayoutInflater inflater = (LayoutInflater)GryphonRooibos.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

            switch (b.getId()){
                case R.id.buttonGryphonAztecaRooibos:
                    imageView.setImageResource(R.drawable.gryphon_azteca_l);
                    textNameEdit.setText("Gryphon Azteca D\'oro");
                    textIngredients.setText(R.string.Gryphon_rooibos_azteca_ingredients);
                    break;
                case R.id.buttonGryphonCobaRooibos:
                    imageView.setImageResource(R.drawable.gryphon_coba_l);
                    textNameEdit.setText("Gryphon Coba Cabana");
                    textIngredients.setText(R.string.Gryphon_rooibos_coba_ingredients);
                    break;
                case R.id.buttonGryphonMogamboRooibos:
                    imageView.setImageResource(R.drawable.gryphon_mogambo_l);
                    textNameEdit.setText("Gryphon Mogambo");
                    textIngredients.setText(R.string.Gryphon_rooibos_mogambo_ingredients);
                    break;
                case R.id.buttonGryphonTomatinoRooibos:
                    imageView.setImageResource(R.drawable.gryphon_tomatino_l);
                    textNameEdit.setText("Gryphon Tomatino");
                    textIngredients.setText(R.string.Gryphon_rooibos_tomatino_ingredients);
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
