package com.example.dell.majumandiriproductlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SavisBagCategories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savis_bag_categories);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarSavisBagCategories);
        setSupportActionBar(toolbar);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Create buttons
        Button all = (Button)findViewById(R.id.buttonSavisBagAll);
        Button classic = (Button)findViewById(R.id.buttonSavisBagClassic);
        Button fruit = (Button)findViewById(R.id.buttonSavisBagFruit);
        Button herb = (Button)findViewById(R.id.buttonSavisBagHerb);
        Button aromatic = (Button)findViewById(R.id.buttonSavisBagAromatic);
        Button japanese = (Button)findViewById(R.id.buttonSavisBagJapanese);

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisBagAllItems.class);
                startActivity(intent);
            }
        });

        classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisBagClassic.class);
                startActivity(intent);
            }
        });

        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisBagFruit.class);
                startActivity(intent);
            }
        });

        herb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisBagHerb.class);
                startActivity(intent);
            }
        });

        aromatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisBagAromatic.class);
                startActivity(intent);
            }
        });

        japanese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisBagJapanese.class);
                startActivity(intent);
            }
        });
    }
}
