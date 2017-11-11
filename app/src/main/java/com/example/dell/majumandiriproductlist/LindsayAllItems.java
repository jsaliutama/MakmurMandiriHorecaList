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

public class LindsayAllItems extends AppCompatActivity {
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
    int[] buttonList = {R.id.buttonLindsayAlmond,
            R.id.buttonLindsayCapers,
            R.id.buttonLindsayCocktail,
            R.id.buttonLindsayGarlic,
            R.id.buttonLindsayGreek,
            R.id.buttonLindsayJalapeno,
            R.id.buttonLindsayPittedOlive,
            R.id.buttonLindsayQueenPimiento,
            R.id.buttonLindsayQueenPits,
            R.id.buttonLindsaySpanish
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button almond;
    Button capers;
    Button cocktail;
    Button garlic;
    Button greek;
    Button jalapeno;
    Button pittedOlive;
    Button queenPimiento;
    Button queenPits;
    Button spanish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lindsay_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarLindsayAllItems);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Set background
        contentLayout = (ScrollView)findViewById(R.id.lindsayContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set buttons
        almond = (Button)findViewById(R.id.buttonLindsayAlmond);
        capers = (Button)findViewById(R.id.buttonLindsayCapers);
        cocktail = (Button)findViewById(R.id.buttonLindsayCocktail);
        garlic = (Button)findViewById(R.id.buttonLindsayGarlic);
        greek = (Button)findViewById(R.id.buttonLindsayGreek);
        jalapeno = (Button)findViewById(R.id.buttonLindsayJalapeno);
        pittedOlive = (Button)findViewById(R.id.buttonLindsayPittedOlive);
        queenPimiento = (Button)findViewById(R.id.buttonLindsayQueenPimiento);
        queenPits = (Button)findViewById(R.id.buttonLindsayQueenPits);
        spanish = (Button)findViewById(R.id.buttonLindsaySpanish);

        almond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(almond);
            }
        });

        capers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(capers);
            }
        });

        cocktail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(cocktail);
            }
        });

        garlic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(garlic);
            }
        });

        greek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(greek);
            }
        });

        jalapeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(jalapeno);
            }
        });

        pittedOlive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(pittedOlive);
            }
        });

        queenPits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(queenPits);
            }
        });

        queenPimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(queenPimiento);
            }
        });

        spanish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(spanish);
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
            LayoutInflater inflater = (LayoutInflater)LindsayAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonLindsayAlmond:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Lindsay_almond_label);
                    textWeightEdit.setText(R.string.Lindsay_almond_weight);
                    textPerCrtEdit.setText(R.string.Lindsay_almond_price);
                    break;
                case R.id.buttonLindsayCapers:
                    imageView.setImageResource(R.drawable.diamond_cling_l);
                    textNameEdit.setText(R.string.Lindsay_capers_label);
                    textWeightEdit.setText(R.string.Lindsay_capers_weight);
                    textPerCrtEdit.setText(R.string.Lindsay_capers_price);
                    break;
                case R.id.buttonLindsayCocktail:
                    imageView.setImageResource(R.drawable.diamond_freezer_l);
                    textNameEdit.setText(R.string.Lindsay_cocktail_label);
                    textWeightEdit.setText(R.string.Lindsay_cocktail_weight);
                    textPerCrtEdit.setText(R.string.Lindsay_cocktail_price);
                    break;
                case R.id.buttonLindsayGarlic:
                    imageView.setImageResource(R.drawable.diamond_heavy_duty_l);
                    textNameEdit.setText(R.string.Lindsay_garlic_label);
                    textWeightEdit.setText(R.string.Lindsay_garlic_weight);
                    textPerCrtEdit.setText(R.string.Lindsay_garlic_price);
                    break;
                case R.id.buttonLindsayGreek:
                    imageView.setImageResource(R.drawable.diamond_storage_l);
                    textNameEdit.setText(R.string.Lindsay_greek_label);
                    textWeightEdit.setText(R.string.Lindsay_greek_weight);
                    textPerCrtEdit.setText(R.string.Lindsay_greek_price);
                    break;
                case R.id.buttonLindsayJalapeno:
                    imageView.setImageResource(R.drawable.diamond_storage_l);
                    textNameEdit.setText(R.string.Lindsay_jalapeno_label);
                    textWeightEdit.setText(R.string.Lindsay_jalapeno_weight);
                    textPerCrtEdit.setText(R.string.Lindsay_jalapeno_price);
                    break;
                case R.id.buttonLindsayPittedOlive:
                    imageView.setImageResource(R.drawable.diamond_storage_l);
                    textNameEdit.setText(R.string.Lindsay_pitted_olive_label);
                    textWeightEdit.setText(R.string.Lindsay_pitted_olive_weight);
                    textPerCrtEdit.setText(R.string.Lindsay_pitted_olive_price);
                    break;
                case R.id.buttonLindsayQueenPimiento:
                    imageView.setImageResource(R.drawable.diamond_storage_l);
                    textNameEdit.setText(R.string.Lindsay_queen_pimiento_label);
                    textWeightEdit.setText(R.string.Lindsay_queen_pimiento_weight);
                    textPerCrtEdit.setText(R.string.Lindsay_queen_pimiento_price);
                    break;
                case R.id.buttonLindsayQueenPits:
                    imageView.setImageResource(R.drawable.diamond_storage_l);
                    textNameEdit.setText(R.string.Lindsay_queen_pits_label);
                    textWeightEdit.setText(R.string.Lindsay_queen_pits_weight);
                    textPerCrtEdit.setText(R.string.Lindsay_queen_pits_price);
                    break;
                case R.id.buttonLindsaySpanish:
                    imageView.setImageResource(R.drawable.diamond_storage_l);
                    textNameEdit.setText(R.string.Lindsay_spanish_label);
                    textWeightEdit.setText(R.string.Lindsay_spanish_weight);
                    textPerCrtEdit.setText(R.string.Lindsay_spanish_price);
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
