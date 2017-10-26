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

public class CirioAllItems extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonCirioBlanchi,
            R.id.buttonCirioCannelini,
            R.id.buttonCirioCeci,
            R.id.buttonCirioFagioli,
            R.id.buttonCirioKidney,
            R.id.buttonCirioPassata,
            R.id.buttonCirioPiselli,
            R.id.buttonCirioPuree,
            R.id.buttonCirioTomatoesChopped,
            R.id.buttonCirioTomatoesWhole
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button blanchi;
    Button cannelini;
    Button ceci;
    Button fagioli;
    Button kidney;
    Button passata;
    Button piselli;
    Button puree;
    Button tomatoesChopped;
    Button tomatoesWhole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cirio_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarCirioAllItems);
        setSupportActionBar(toolbar);

        //Set background
        contentLayout = (ScrollView)findViewById(R.id.cirioContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set button
        blanchi = (Button)findViewById(R.id.buttonCirioBlanchi);
        cannelini = (Button)findViewById(R.id.buttonCirioCannelini);
        ceci = (Button)findViewById(R.id.buttonCirioCeci);
        fagioli = (Button)findViewById(R.id.buttonCirioFagioli);
        kidney = (Button)findViewById(R.id.buttonCirioKidney);
        passata = (Button)findViewById(R.id.buttonCirioPassata);
        piselli = (Button)findViewById(R.id.buttonCirioPiselli);
        puree = (Button)findViewById(R.id.buttonCirioPuree);
        tomatoesChopped = (Button)findViewById(R.id.buttonCirioTomatoesChopped);
        tomatoesWhole = (Button)findViewById(R.id.buttonCirioTomatoesWhole);

        blanchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(blanchi);
            }
        });

        cannelini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(cannelini);
            }
        });

        ceci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(ceci);
            }
        });

        fagioli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(fagioli);
            }
        });

        kidney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(kidney);
            }
        });

        passata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(passata);
            }
        });

        piselli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(piselli);
            }
        });

        puree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(puree);
            }
        });

        tomatoesChopped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(tomatoesChopped);
            }
        });

        tomatoesWhole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(tomatoesWhole);
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
            LayoutInflater inflater = (LayoutInflater)CirioAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonCirioBlanchi:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Cirio_blanchi_label);
                    textWeightEdit.setText(R.string.Cirio_blanchi_weight);
                    textPerCrtEdit.setText(R.string.Cirio_blanchi_price);
                    break;
                case R.id.buttonCirioCannelini:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Cirio_cannelini_label);
                    textWeightEdit.setText(R.string.Cirio_cannelini_weight);
                    textPerCrtEdit.setText(R.string.Cirio_cannelini_price);
                    break;
                case R.id.buttonCirioCeci:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Cirio_ceci_label);
                    textWeightEdit.setText(R.string.Cirio_ceci_weight);
                    textPerCrtEdit.setText(R.string.Cirio_ceci_price);
                    break;
                case R.id.buttonCirioFagioli:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Cirio_fagioli_label);
                    textWeightEdit.setText(R.string.Cirio_fagioli_weight);
                    textPerCrtEdit.setText(R.string.Cirio_fagioli_price);
                    break;
                case R.id.buttonCirioKidney:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Cirio_kidney_label);
                    textWeightEdit.setText(R.string.Cirio_kidney_weight);
                    textPerCrtEdit.setText(R.string.Cirio_kidney_price);
                    break;
                case R.id.buttonCirioPassata:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Cirio_passata_label);
                    textWeightEdit.setText(R.string.Cirio_passata_weight);
                    textPerCrtEdit.setText(R.string.Cirio_passata_price);
                    break;
                case R.id.buttonCirioPiselli:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Cirio_piselli_label);
                    textWeightEdit.setText(R.string.Cirio_piselli_weight);
                    textPerCrtEdit.setText(R.string.Cirio_piselli_price);
                    break;
                case R.id.buttonCirioPuree:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Cirio_puree_label);
                    textWeightEdit.setText(R.string.Cirio_puree_weight);
                    textPerCrtEdit.setText(R.string.Cirio_puree_price);
                    break;
                case R.id.buttonCirioTomatoesChopped:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Cirio_tomatoes_chopped_label);
                    textWeightEdit.setText(R.string.Cirio_tomatoes_chopped_weight);
                    textPerCrtEdit.setText(R.string.Cirio_tomatoes_chopped_price);
                    break;
                case R.id.buttonCirioTomatoesWhole:
                    imageView.setImageResource(R.drawable.ic_unknown);
                    textNameEdit.setText(R.string.Cirio_tomatoes_whole_label);
                    textWeightEdit.setText(R.string.Cirio_tomatoes_whole_weight);
                    textPerCrtEdit.setText(R.string.Cirio_tomatoes_whole_price);
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
