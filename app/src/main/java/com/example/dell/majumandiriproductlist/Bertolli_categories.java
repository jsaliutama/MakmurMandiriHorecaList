package com.example.dell.majumandiriproductlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Bertolli_categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bertolli_categories);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarBertolliCat);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Button bertolliOlive = (Button)findViewById(R.id.buttonBertolliOlive);
        Button bertolliVinegar = (Button)findViewById(R.id.buttonBertolliVinegar);

        bertolliOlive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BertolliOlive.class);
                startActivity(intent);
            }
        });

        bertolliVinegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BertolliVinegar.class);
                startActivity(intent);
            }
        });
    }
}
