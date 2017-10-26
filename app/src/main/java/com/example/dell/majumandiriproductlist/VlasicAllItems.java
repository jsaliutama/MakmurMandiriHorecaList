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

public class VlasicAllItems extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonVlasicDill,
            R.id.buttonVlasicDillBaby,
            R.id.buttonVlasicGherkins,
            R.id.buttonVlasicMidgets,
            R.id.buttonVlasicRelish
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button dill;
    Button baby;
    Button gherkins;
    Button midgets;
    Button relish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlasic_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarVlasicAllItems);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Set background
        contentLayout = (ScrollView)findViewById(R.id.vlasicContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        //Set buttons
        dill = (Button)findViewById(R.id.buttonVlasicDill);
        baby = (Button)findViewById(R.id.buttonVlasicDillBaby);
        gherkins = (Button)findViewById(R.id.buttonVlasicGherkins);
        midgets = (Button)findViewById(R.id.buttonVlasicMidgets);
        relish = (Button)findViewById(R.id.buttonVlasicRelish);
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
            LayoutInflater inflater = (LayoutInflater)VlasicAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonDiamondAluminum:
                    imageView.setImageResource(R.drawable.diamond_foil_l);
                    textNameEdit.setText(R.string.Diamond_foil_label);
                    textWeightEdit.setText(R.string.Diamond_foil_size);
                    textPerCrtEdit.setText(R.string.Diamond_foil_price);
                    break;
                case R.id.buttonDiamondCling:
                    imageView.setImageResource(R.drawable.diamond_cling_l);
                    textNameEdit.setText(R.string.Diamond_cling_label);
                    textWeightEdit.setText(R.string.Diamond_cling_size);
                    textPerCrtEdit.setText(R.string.Diamond_cling_price);
                    break;
                case R.id.buttonDiamondFreezer:
                    imageView.setImageResource(R.drawable.diamond_freezer_l);
                    textNameEdit.setText(R.string.Diamond_freezer_label);
                    textWeightEdit.setText(R.string.Diamond_freezer_size);
                    textPerCrtEdit.setText(R.string.Diamond_freezer_price);
                    break;
                case R.id.buttonDiamondHeavy:
                    imageView.setImageResource(R.drawable.diamond_heavy_duty_l);
                    textNameEdit.setText(R.string.Diamond_heavy_label);
                    textWeightEdit.setText(R.string.Diamond_heavy_size);
                    textPerCrtEdit.setText(R.string.Diamond_heavy_price);
                    break;
                case R.id.buttonDiamondStorage:
                    imageView.setImageResource(R.drawable.diamond_storage_l);
                    textNameEdit.setText(R.string.Diamond_storage_label);
                    textWeightEdit.setText(R.string.Diamond_storage_size);
                    textPerCrtEdit.setText(R.string.Diamond_storage_price);
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
