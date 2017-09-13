package com.example.dell.majumandiriproductlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Savis_categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savis_categories);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbarSavisCategories);
        setSupportActionBar(toolbar);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Setup buttons
        Button btnBag = (Button)findViewById(R.id.buttonSavisCatBag);
        Button btnLoose = (Button)findViewById(R.id.buttonSavisCatLoose);

        btnBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisBagCategories.class);
                startActivity(intent);
            }
        });

        btnLoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SavisLooseCategories.class);
                startActivity(intent);
            }
        });
    }
}
