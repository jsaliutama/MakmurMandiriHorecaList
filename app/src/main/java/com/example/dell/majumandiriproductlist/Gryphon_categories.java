package com.example.dell.majumandiriproductlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Gryphon_categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gryphon_categories);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarGryphonCat);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Button allItems = (Button)findViewById(R.id.buttonGryphonAllItems);
        Button black = (Button)findViewById(R.id.buttonGryphonBlack);
        Button green = (Button)findViewById(R.id.buttonGryphonGreen);
        Button oolong = (Button)findViewById(R.id.buttonGryphonOolong);
        Button herb = (Button)findViewById(R.id.buttonGryphonHerb);
        Button rooibos = (Button)findViewById(R.id.buttonGryphonRooibos);
        Button white = (Button)findViewById(R.id.buttonGryphonWhite);

        allItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GryphonAllItems.class);
                startActivity(intent);
            }
        });

        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GryphonBlack.class);
                startActivity(intent);
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GryphonGreen.class);
                startActivity(intent);
            }
        });

        oolong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GryphonOolong.class);
                startActivity(intent);
            }
        });

        herb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GryphonHerb.class);
                startActivity(intent);
            }
        });

        rooibos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GryphonRooibos.class);
                startActivity(intent);
            }
        });

        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GryphonWhite.class);
                startActivity(intent);
            }
        });
    }
}
