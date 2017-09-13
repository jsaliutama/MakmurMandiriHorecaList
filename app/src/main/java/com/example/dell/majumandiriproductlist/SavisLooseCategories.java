package com.example.dell.majumandiriproductlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SavisLooseCategories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savis_loose_categories);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarSavisLooseCategories);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup buttons
        Button all = (Button)findViewById(R.id.buttonSavisLooseAll);
        Button aromatic = (Button)findViewById(R.id.buttonSavisLooseAromatic);
        Button classic = (Button)findViewById(R.id.buttonSavisLooseClassic);
        Button flower = (Button)findViewById(R.id.buttonSavisLooseFlower);
        Button fruit = (Button)findViewById(R.id.buttonSavisLooseFruit);
        Button organic = (Button)findViewById(R.id.buttonSavisLooseOrganic);
        Button japanese = (Button)findViewById(R.id.buttonSavisLooseJapanese);
        Button herb = (Button)findViewById(R.id.buttonSavisLooseHerb);

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisLooseAllItems.class);
                startActivity(intent);
            }
        });

        aromatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisLooseAromatic.class);
                startActivity(intent);
            }
        });

        classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisLooseClassic.class);
                startActivity(intent);
            }
        });

        flower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisLooseFlower.class);
                startActivity(intent);
            }
        });

        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisLooseFruit.class);
                startActivity(intent);
            }
        });

        herb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisLooseHerb.class);
                startActivity(intent);
            }
        });

        japanese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisLooseJapanese.class);
                startActivity(intent);
            }
        });

        organic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisLooseOrganic.class);
                startActivity(intent);
            }
        });
    }
}
