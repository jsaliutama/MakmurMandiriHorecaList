package com.example.dell.majumandiriproductlist;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
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
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;

public class GryphonAllItems extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonGryphonAzteca,
            R.id.buttonGryphonBritish,
            R.id.buttonGryphonChamomile,
            R.id.buttonGryphonCoba,
            R.id.buttonGryphonContessa,
            R.id.buttonGryphonEarl,
            R.id.buttonGryphonHanami,
            R.id.buttonGryphonLemon,
            R.id.buttonGryphonMarakesh,
            R.id.buttonGryphonMogambo,
            R.id.buttonGryphonNymph,
            R.id.buttonGryphonLily,
            R.id.buttonGryphonTemple,
            R.id.buttonGryphonOsmanthus,
            R.id.buttonGryphonPearl,
            R.id.buttonGryphonChai,
            R.id.buttonGryphonTomatino,
            R.id.buttonGryphonGingerlily
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textIngredients;
    TextView textLabelEdit;
    TextView textWeightLabelEdit;

    Button azteca;
    Button british;
    Button chamomile;
    Button coba;
    Button contessa;
    Button earl;
    Button hanami;
    Button lemon;
    Button marakesh;
    Button mogambo;
    Button nymph;
    Button lily;
    Button temple;
    Button osmanthus;
    Button pearl;
    Button chai;
    Button tomatino;
    Button gingerLily;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gryphon_all_items_list);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarGryphonAllItems);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (ScrollView) findViewById(R.id.gryphonAllItemsContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Setup button
        azteca = (Button)findViewById(R.id.buttonGryphonAzteca);
        british = (Button)findViewById(R.id.buttonGryphonBritish);
        chamomile = (Button)findViewById(R.id.buttonGryphonChamomile);
        coba = (Button)findViewById(R.id.buttonGryphonCoba);
        contessa = (Button)findViewById(R.id.buttonGryphonContessa);
        earl = (Button)findViewById(R.id.buttonGryphonEarl);
        hanami = (Button)findViewById(R.id.buttonGryphonHanami);
        lemon = (Button)findViewById(R.id.buttonGryphonLemon);
        marakesh = (Button)findViewById(R.id.buttonGryphonMarakesh);
        mogambo = (Button)findViewById(R.id.buttonGryphonMogambo);
        nymph = (Button)findViewById(R.id.buttonGryphonNymph);
        lily = (Button)findViewById(R.id.buttonGryphonLily);
        temple = (Button)findViewById(R.id.buttonGryphonTemple);
        osmanthus = (Button)findViewById(R.id.buttonGryphonOsmanthus);
        pearl = (Button)findViewById(R.id.buttonGryphonPearl);
        chai = (Button)findViewById(R.id.buttonGryphonChai);
        tomatino = (Button)findViewById(R.id.buttonGryphonTomatino);
        gingerLily = (Button)findViewById(R.id.buttonGryphonGingerlily);

        azteca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(azteca);
            }
        });

        british.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(british);
            }
        });

        chamomile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(chamomile);
            }
        });

        coba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(coba);
            }
        });

        contessa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(contessa);
            }
        });

        earl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(earl);
            }
        });

        hanami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(hanami);
            }
        });

        lemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(lemon);
            }
        });

        marakesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(marakesh);
            }
        });

        mogambo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(mogambo);
            }
        });

        nymph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(nymph);
            }
        });

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

        osmanthus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(osmanthus);
            }
        });

        pearl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(pearl);
            }
        });

        chai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(chai);
            }
        });

        tomatino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(tomatino);
            }
        });

        gingerLily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(gingerLily);
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
            LayoutInflater inflater = (LayoutInflater)GryphonAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightLabelEdit = (TextView)layout.findViewById(R.id.textWeightLabel);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textIngredients = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            textLabelEdit = (TextView)layout.findViewById(R.id.textPricing);

            textWeightLabelEdit.setText("Berat dan Harga");
            textWeightEdit.setText(R.string.Gryphon_weight_price);
            textLabelEdit.setText("Ingredients");
            textIngredients.setTextSize(TypedValue.COMPLEX_UNIT_SP, 26);

            switch (b.getId()){
                case R.id.buttonGryphonAzteca:
                    imageView.setImageResource(R.drawable.gryphon_azteca_l);
                    textNameEdit.setText("Gryphon Azteca D\'oro");
                    textIngredients.setText(R.string.Gryphon_rooibos_azteca_ingredients);
                    break;
                case R.id.buttonGryphonBritish:
                    imageView.setImageResource(R.drawable.gryphon_british_l);
                    textNameEdit.setText("Gryphon British Breakfast Tea");
                    textIngredients.setText(R.string.Gryphon_black_british_ingredients);
                    break;
                case R.id.buttonGryphonChamomile:
                    imageView.setImageResource(R.drawable.gryphon_chamomile_l);
                    textNameEdit.setText("Gryphon Chamomile Dream");
                    textIngredients.setText(R.string.Gryphon_herb_chamomile_ingredients);
                    break;
                case R.id.buttonGryphonCoba:
                    imageView.setImageResource(R.drawable.gryphon_coba_l);
                    textNameEdit.setText("Gryphon Coba Cabana");
                    textIngredients.setText(R.string.Gryphon_rooibos_coba_ingredients);
                    break;
                case R.id.buttonGryphonContessa:
                    imageView.setImageResource(R.drawable.gryphon_contessa_l);
                    textNameEdit.setText("Gryphon Contessa Grey");
                    textIngredients.setText(R.string.Gryphon_black_contessa_ingredients);
                    break;
                case R.id.buttonGryphonEarl:
                    imageView.setImageResource(R.drawable.gryphon_earl_l);
                    textNameEdit.setText("Gryphon Earl Grey Lavender");
                    textIngredients.setText(R.string.Gryphon_black_earl_ingredients);
                    break;
                case R.id.buttonGryphonHanami:
                    imageView.setImageResource(R.drawable.gryphon_hanami_l);
                    textNameEdit.setText("Gryphon Hanami");
                    textIngredients.setText(R.string.Gryphon_green_hanami_ingredients);
                    break;
                case R.id.buttonGryphonLemon:
                    imageView.setImageResource(R.drawable.gryphon_lemon_l);
                    textNameEdit.setText("Gryphon Lemon Ginger Mint");
                    textIngredients.setText(R.string.Gryphon_herb_lemon_ingredients);
                    break;
                case R.id.buttonGryphonMarakesh:
                    imageView.setImageResource(R.drawable.gryphon_marrakesh_l);
                    textNameEdit.setText("Gryphon Marrakesh Mint");
                    textIngredients.setText(R.string.Gryphon_green_marrakesh_ingredients);
                    break;
                case R.id.buttonGryphonMogambo:
                    imageView.setImageResource(R.drawable.gryphon_mogambo_l);
                    textNameEdit.setText("Gryphon Mogambo");
                    textIngredients.setText(R.string.Gryphon_rooibos_mogambo_ingredients);
                    break;
                case R.id.buttonGryphonNymph:
                    imageView.setImageResource(R.drawable.gryphon_nymph_l);
                    textNameEdit.setText("Gryphon Nymph of the Nile");
                    textIngredients.setText(R.string.Gryphon_rooibos_mogambo_ingredients);
                    break;
                case R.id.buttonGryphonLily:
                    imageView.setImageResource(R.drawable.gryphon_lily_l);
                    textNameEdit.setText("Gryphon LilyAllItems of the Field");
                    textIngredients.setText(R.string.Gryphon_oolong_lily_ingredients);
                    break;
                case R.id.buttonGryphonTemple:
                    imageView.setImageResource(R.drawable.gryphon_temple_l);
                    textNameEdit.setText("Gryphon Templetree Lotus");
                    textIngredients.setText(R.string.Gryphon_oolong_temple_ingredients);
                    break;
                case R.id.buttonGryphonOsmanthus:
                    imageView.setImageResource(R.drawable.gryphon_osmanthus_l);
                    textNameEdit.setText("Gryphon Osmanthus Sencha");
                    textIngredients.setText(R.string.Gryphon_green_osmantus_ingredients);
                    break;
                case R.id.buttonGryphonPearl:
                    imageView.setImageResource(R.drawable.gryphon_pearl_l);
                    textNameEdit.setText("Gryphon Pearl of the Orient");
                    textIngredients.setText(R.string.Gryphon_green_pearl_ingredients);
                    break;
                case R.id.buttonGryphonChai:
                    imageView.setImageResource(R.drawable.gryphon_chai_l);
                    textNameEdit.setText("Gryphon Straits Chai");
                    textIngredients.setText(R.string.Gryphon_black_chai_ingredients);
                    break;
                case R.id.buttonGryphonTomatino:
                    imageView.setImageResource(R.drawable.gryphon_tomatino_l);
                    textNameEdit.setText("Gryphon Tomatino");
                    textIngredients.setText(R.string.Gryphon_rooibos_tomatino_ingredients);
                    break;
                case R.id.buttonGryphonGingerlily:
                    imageView.setImageResource(R.drawable.gryphon_gingerlily_l);
                    textNameEdit.setText("Grypon White Gingerlily");
                    textIngredients.setText(R.string.Gryphon_white_gingerlily_ingredients);
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
