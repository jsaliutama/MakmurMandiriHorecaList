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

public class AbVeggies extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonAbBakedBeans,
            R.id.buttonAbBakedBeansLight,
            R.id.buttonAbBakedBeansCheese,
            R.id.buttonAbProcessedPeas,
            R.id.buttonAbSweetCorn,
            R.id.buttonAbTomatoPuree,
            R.id.buttonAbWholeKernel,
            R.id.buttonAbMushroom
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;
    Button bakedBeans;
    Button bakedLight;
    Button bakedCheese;
    Button peas;
    Button sweetCorn;
    Button tomato;
    Button wholeKernel;
    Button mushroom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab_veggies);

        Toolbar abVeggiesToolbar = (Toolbar)findViewById(R.id.toolbarAbVeggies);
        setSupportActionBar(abVeggiesToolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Set contents
        contentLayout = (ScrollView) findViewById(R.id.abVeggiesContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set button
        bakedBeans = (Button)findViewById(R.id.buttonAbBakedBeans);
        bakedLight = (Button)findViewById(R.id.buttonAbBakedBeansLight);
        bakedCheese = (Button)findViewById(R.id.buttonAbBakedBeansCheese);
        peas = (Button)findViewById(R.id.buttonAbProcessedPeas);
        sweetCorn = (Button)findViewById(R.id.buttonAbSweetCorn);
        tomato = (Button)findViewById(R.id.buttonAbTomatoPuree);
        wholeKernel = (Button)findViewById(R.id.buttonAbWholeKernel);
        mushroom = (Button)findViewById(R.id.buttonAbMushroom);

        bakedBeans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(bakedBeans);
            }
        });

        bakedLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(bakedLight);
            }
        });

        bakedCheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(bakedCheese);
            }
        });

        peas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(peas);
            }
        });

        sweetCorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(sweetCorn);
            }
        });

        tomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(tomato);
            }
        });

        wholeKernel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(wholeKernel);
            }
        });

        mushroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(mushroom);
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
            LayoutInflater inflater = (LayoutInflater)AbVeggies.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonAbBakedBeans:
                    imageView.setImageResource(R.drawable.ab_baked_beans_ori_l);
                    textNameEdit.setText(R.string.AB_baked_beans_label);
                    textWeightEdit.setText(R.string.AB_weight_24_425);
                    textPerCrtEdit.setText(R.string.AB_baked_beans_price);
                    break;
                case R.id.buttonAbBakedBeansLight:
                    imageView.setImageResource(R.drawable.ab_baked_beans_light_l);
                    textNameEdit.setText(R.string.AB_baked_beans_light_label);
                    textWeightEdit.setText(R.string.AB_weight_24_425);
                    textPerCrtEdit.setText(R.string.AB_baked_beans_light_price);
                    break;
                case R.id.buttonAbBakedBeansCheese:
                    imageView.setImageResource(R.drawable.ab_baked_beans_cheese_l);
                    textNameEdit.setText(R.string.AB_baked_beans_cheese_label);
                    textWeightEdit.setText(R.string.AB_weight_24_425);
                    textPerCrtEdit.setText(R.string.AB_baked_beans_cheese_price);
                    break;
                case R.id.buttonAbProcessedPeas:
                    imageView.setImageResource(R.drawable.ab_peas_l);
                    textNameEdit.setText(R.string.AB_processed_peas_label);
                    textWeightEdit.setText(R.string.AB_weight_24_425);
                    textPerCrtEdit.setText(R.string.AB_processed_peas_price);
                    break;
                case R.id.buttonAbSweetCorn:
                    imageView.setImageResource(R.drawable.ab_sweet_corn_l);
                    textNameEdit.setText(R.string.AB_sweet_corn_label);
                    textWeightEdit.setText(R.string.AB_weight_24_425);
                    textPerCrtEdit.setText(R.string.AB_sweet_corn_price);
                    break;
                case R.id.buttonAbTomatoPuree:
                    imageView.setImageResource(R.drawable.ab_tomato_puree_l);
                    textNameEdit.setText(R.string.AB_tomato_puree_label);
                    textWeightEdit.setText(R.string.AB_weight_24_160);
                    textPerCrtEdit.setText(R.string.AB_tomato_puree_price);
                    break;
                case R.id.buttonAbWholeKernel:
                    imageView.setImageResource(R.drawable.ab_whole_kernel_l);
                    textNameEdit.setText(R.string.AB_whole_kernel_label);
                    textWeightEdit.setText(R.string.AB_weight_24_425);
                    textPerCrtEdit.setText(R.string.AB_whole_kernel_price);
                    break;
                case R.id.buttonAbMushroom:
                    imageView.setImageResource(R.drawable.ab_mushroom_l);
                    textNameEdit.setText(R.string.AB_whole_mushroom_label);
                    textWeightEdit.setText(R.string.AB_weight_24_420);
                    textPerCrtEdit.setText(R.string.AB_whole_mushroom_price);
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
