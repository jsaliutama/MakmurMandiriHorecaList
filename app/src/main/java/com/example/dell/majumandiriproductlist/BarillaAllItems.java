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

public class BarillaAllItems extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonBarillaBavette,
            R.id.buttonBarillaCapelini,
            R.id.buttonBarillaConchiglie,
            R.id.buttonBarillaFarfalle,
            R.id.buttonBarillaFettuccine,
            R.id.buttonBarillaFusilli,
            R.id.buttonBarillaGnocchi,
            R.id.buttonBarillaLasagna,
            R.id.buttonBarillaMaccheroni,
            R.id.buttonBarillaMezze,
            R.id.buttonBarillaPenne,
            R.id.buttonBarillaPipe,
            R.id.buttonBarillaRigatoni,
            R.id.buttonBarillaSpaghetti,
            R.id.buttonBarillaSpaghettoni,
            R.id.buttonBarillaTagliatelle,
            R.id.buttonBarillaTortiglioni
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button bavette;
    Button capelini;
    Button conchiglie;
    Button farfalle;
    Button fettuccine;
    Button fusilli;
    Button gnocchi;
    Button lasagna;
    Button maccheroni;
    Button mezze;
    Button penne;
    Button pipe;
    Button rigatoni;
    Button spaghetti;
    Button spaghettoni;
    Button tagliatelle;
    Button tortiglioni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barilla_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarBarillaAllItems);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup layout
        contentLayout = (ScrollView) findViewById(R.id.barillaContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set buttons
        bavette = (Button)findViewById(R.id.buttonBarillaBavette);
        capelini = (Button)findViewById(R.id.buttonBarillaCapelini);
        conchiglie = (Button)findViewById(R.id.buttonBarillaConchiglie);
        farfalle = (Button)findViewById(R.id.buttonBarillaFarfalle);
        fettuccine = (Button)findViewById(R.id.buttonBarillaFettuccine);
        fusilli = (Button)findViewById(R.id.buttonBarillaFusilli);
        gnocchi = (Button)findViewById(R.id.buttonBarillaGnocchi);
        lasagna = (Button)findViewById(R.id.buttonBarillaLasagna);
        maccheroni = (Button)findViewById(R.id.buttonBarillaMaccheroni);
        mezze = (Button)findViewById(R.id.buttonBarillaMezze);
        penne = (Button)findViewById(R.id.buttonBarillaPenne);
        pipe = (Button)findViewById(R.id.buttonBarillaPipe);
        rigatoni = (Button)findViewById(R.id.buttonBarillaRigatoni);
        spaghetti = (Button)findViewById(R.id.buttonBarillaSpaghetti);
        spaghettoni = (Button)findViewById(R.id.buttonBarillaSpaghettoni);
        tagliatelle = (Button)findViewById(R.id.buttonBarillaTagliatelle);
        tortiglioni = (Button)findViewById(R.id.buttonBarillaTortiglioni);

        bavette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(bavette);
            }
        });

        capelini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(capelini);
            }
        });

        conchiglie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(conchiglie);
            }
        });

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

        fusilli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(fusilli);
            }
        });

        gnocchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(gnocchi);
            }
        });

        lasagna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(lasagna);
            }
        });

        maccheroni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(maccheroni);
            }
        });

        mezze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(mezze);
            }
        });

        penne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(penne);
            }
        });

        pipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(pipe);
            }
        });

        rigatoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(rigatoni);
            }
        });

        spaghettoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(spaghettoni);
            }
        });

        spaghetti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(spaghetti);
            }
        });

        tagliatelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(tagliatelle);
            }
        });

        tortiglioni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(tortiglioni);
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
            LayoutInflater inflater = (LayoutInflater)BarillaAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonBarillaBavette:
                    imageView.setImageResource(R.drawable.barilla_bavette_l);
                    textNameEdit.setText(R.string.Barilla_bavette_label);
                    textWeightEdit.setText(R.string.Barilla_weight_25_500);
                    textPerCrtEdit.setText(R.string.Barilla_bavette_price);
                    break;
                case R.id.buttonBarillaCapelini:
                    imageView.setImageResource(R.drawable.barilla_capellini_l);
                    textNameEdit.setText(R.string.Barilla_capelini_label);
                    textWeightEdit.setText(R.string.Barilla_weight_25_500);
                    textPerCrtEdit.setText(R.string.Barilla_capelini_price);
                    break;
                case R.id.buttonBarillaConchiglie:
                    imageView.setImageResource(R.drawable.barilla_conchiglie_l);
                    textNameEdit.setText(R.string.Barilla_conchiglie_label);
                    textWeightEdit.setText(R.string.Barilla_weight_15_500);
                    textPerCrtEdit.setText(R.string.Barilla_conchiglie_price);
                    break;
                case R.id.buttonBarillaFarfalle:
                    imageView.setImageResource(R.drawable.barilla_farfalle_l);
                    textNameEdit.setText(R.string.Barilla_farfalle_label);
                    textWeightEdit.setText(R.string.Barilla_weight_15_500);
                    textPerCrtEdit.setText(R.string.Barilla_farfalle_price);
                    break;
                case R.id.buttonBarillaFettuccine:
                    imageView.setImageResource(R.drawable.barilla_fettuccine_l);
                    textNameEdit.setText(R.string.Barilla_fettuccine_label);
                    textWeightEdit.setText(R.string.Barilla_weight_12_500);
                    textPerCrtEdit.setText(R.string.Barilla_fettuccine_price);
                    break;
                case R.id.buttonBarillaFusilli:
                    imageView.setImageResource(R.drawable.barilla_fusilli_l);
                    textNameEdit.setText(R.string.Barilla_fusilli_label);
                    textWeightEdit.setText(R.string.Barilla_weight_15_500);
                    textPerCrtEdit.setText(R.string.Barilla_fusilli_price);
                    break;
                case R.id.buttonBarillaGnocchi:
                    imageView.setImageResource(R.drawable.barilla_gnocchi_l);
                    textNameEdit.setText(R.string.Barilla_gnocchi_label);
                    textWeightEdit.setText(R.string.Barilla_weight_15_500);
                    textPerCrtEdit.setText(R.string.Barilla_gnocchi_price);
                    break;
                case R.id.buttonBarillaLasagna:
                    imageView.setImageResource(R.drawable.barilla_lasagna_l);
                    textNameEdit.setText(R.string.Barilla_lasagna_label);
                    textWeightEdit.setText(R.string.Barilla_weight_15_500);
                    textPerCrtEdit.setText(R.string.Barilla_lasagna_price);
                    break;
                case R.id.buttonBarillaMaccheroni:
                    imageView.setImageResource(R.drawable.barilla_maccheroni_l);
                    textNameEdit.setText(R.string.Barilla_maccheroni_label);
                    textWeightEdit.setText(R.string.Barilla_weight_15_500);
                    textPerCrtEdit.setText(R.string.Barilla_maccheroni_price);
                    break;
                case R.id.buttonBarillaMezze:
                    imageView.setImageResource(R.drawable.barilla_mezze_l);
                    textNameEdit.setText(R.string.Barilla_mezze_label);
                    textWeightEdit.setText(R.string.Barilla_weight_15_500);
                    textPerCrtEdit.setText(R.string.Barilla_mezze_price);
                    break;
                case R.id.buttonBarillaPenne:
                    imageView.setImageResource(R.drawable.barilla_penne_l);
                    textNameEdit.setText(R.string.Barilla_penne_label);
                    textWeightEdit.setText(R.string.Barilla_weight_15_500);
                    textPerCrtEdit.setText(R.string.Barilla_penne_price);
                    break;
                case R.id.buttonBarillaPipe:
                    imageView.setImageResource(R.drawable.barilla_pipe_l);
                    textNameEdit.setText(R.string.Barilla_pipe_label);
                    textWeightEdit.setText(R.string.Barilla_weight_15_500);
                    textPerCrtEdit.setText(R.string.Barilla_pipe_price);
                    break;
                case R.id.buttonBarillaRigatoni:
                    imageView.setImageResource(R.drawable.barilla_rigatoni_l);
                    textNameEdit.setText(R.string.Barilla_rigatoni_label);
                    textWeightEdit.setText(R.string.Barilla_weight_15_500);
                    textPerCrtEdit.setText(R.string.Barilla_rigatoni_price);
                    break;
                case R.id.buttonBarillaSpaghetti:
                    imageView.setImageResource(R.drawable.barilla_spaghetti_l);
                    textNameEdit.setText(R.string.Barilla_spaghetti_label);
                    textWeightEdit.setText(R.string.Barilla_weight_25_500);
                    textPerCrtEdit.setText(R.string.Barilla_spaghetti_price);
                    break;
                case R.id.buttonBarillaSpaghettoni:
                    imageView.setImageResource(R.drawable.barilla_spaghettoni_l);
                    textNameEdit.setText(R.string.Barilla_spaghettoni_label);
                    textWeightEdit.setText(R.string.Barilla_weight_25_500);
                    textPerCrtEdit.setText(R.string.Barilla_spaghettoni_price);
                    break;
                case R.id.buttonBarillaTagliatelle:
                    imageView.setImageResource(R.drawable.barilla_tagliatelle_l);
                    textNameEdit.setText(R.string.Barilla_tagliatelle_label);
                    textWeightEdit.setText(R.string.Barilla_weight_12_500);
                    textPerCrtEdit.setText(R.string.Barilla_tagliatelle_price);
                    break;
                case R.id.buttonBarillaTortiglioni:
                    imageView.setImageResource(R.drawable.barilla_tortiglioni_l);
                    textNameEdit.setText(R.string.Barilla_tortiglioni_label);
                    textWeightEdit.setText(R.string.Barilla_weight_15_500);
                    textPerCrtEdit.setText(R.string.Barilla_tortiglioni_price);
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
