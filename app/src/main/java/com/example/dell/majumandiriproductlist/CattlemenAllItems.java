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
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class CattlemenAllItems extends AppCompatActivity {

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
    int[] buttonList = {R.id.buttonCattlemenCarolina,
            R.id.buttonCattlemenKansas,
            R.id.buttonCattlemenMemphis,
            R.id.buttonCattlemenMississippi,
            R.id.buttonCattlemenSmoke
    };
    ImageView imageView;
    TextView textNameEdit;
    TextView textWeightEdit;
    TextView textPerCrtEdit;

    Button carolina;
    Button kansas;
    Button memphis;
    Button mississippi;
    Button smoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cattlemen_all_items);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarCattlemenAllItems);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Set background
        contentLayout = (LinearLayout)findViewById(R.id.cattlemenContentLayout);
        contentLayout.setBackgroundColor(Color.parseColor(WHITE));

        carolina = (Button)findViewById(R.id.buttonCattlemenCarolina);
        kansas = (Button)findViewById(R.id.buttonCattlemenKansas);
        memphis = (Button)findViewById(R.id.buttonCattlemenMemphis);
        mississippi = (Button)findViewById(R.id.buttonCattlemenMississippi);
        smoke = (Button)findViewById(R.id.buttonCattlemenSmoke);

        carolina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(carolina);
            }
        });

        kansas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(kansas);
            }
        });

        memphis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(memphis);
            }
        });

        mississippi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(mississippi);
            }
        });

        smoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick(smoke);
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
            LayoutInflater inflater = (LayoutInflater)CattlemenAllItems.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup, (ViewGroup)findViewById(R.id.popup_element));
            popUpWindow = new PopupWindow(layout, helpers.dpToPx(600), helpers.dpToPx(750)); //(context, width, height)
            popUpWindow.showAtLocation(layout, Gravity.CENTER, 0, 0); //(layout, gravity, x, y)

            //Set up pictures
            imageView = (ImageView)layout.findViewById(R.id.popupImageLayout);
            textNameEdit = (TextView)layout.findViewById(R.id.textNameEdit);
            textWeightEdit = (TextView)layout.findViewById(R.id.textWeightEdit);
            textPerCrtEdit = (TextView)layout.findViewById(R.id.textPerCrtEdit);
            switch (b.getId()){
                case R.id.buttonCattlemenCarolina:
                    imageView.setImageResource(R.drawable.cattlemen_carolina_l);
                    textNameEdit.setText(R.string.Cattlemen_carolina_label);
                    textWeightEdit.setText(R.string.Cattlemen_carolina_weight);
                    textPerCrtEdit.setText(R.string.Cattlemen_carolina_price);
                    break;
                case R.id.buttonCattlemenKansas:
                    imageView.setImageResource(R.drawable.cattlemen_kansas_l);
                    textNameEdit.setText(R.string.Cattlemen_kansas_label);
                    textWeightEdit.setText(R.string.Cattlemen_kansas_weight);
                    textPerCrtEdit.setText(R.string.Cattlemen_kansas_price);
                    break;
                case R.id.buttonCattlemenMemphis:
                    imageView.setImageResource(R.drawable.cattlemen_memphis_l);
                    textNameEdit.setText(R.string.Cattlemen_memphis_label);
                    textWeightEdit.setText(R.string.Cattlemen_memphis_weight);
                    textPerCrtEdit.setText(R.string.Cattlemen_memphis_price);
                    break;
                case R.id.buttonCattlemenMississippi:
                    imageView.setImageResource(R.drawable.cattlemen_mississippi_l);
                    textNameEdit.setText(R.string.Cattlemen_mississippi_label);
                    textWeightEdit.setText(R.string.Cattlemen_mississippi_weight);
                    textPerCrtEdit.setText(R.string.Cattlemen_mississippi_price);
                    break;
                case R.id.buttonCattlemenSmoke:
                    imageView.setImageResource(R.drawable.cattlemen_smoky_l);
                    textNameEdit.setText(R.string.Cattlemen_smoke_label);
                    textWeightEdit.setText(R.string.Cattlemen_smoke_weight);
                    textPerCrtEdit.setText(R.string.Cattlemen_smoke_price);
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
