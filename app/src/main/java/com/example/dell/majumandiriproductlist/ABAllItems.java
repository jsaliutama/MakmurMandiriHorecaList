package com.example.dell.majumandiriproductlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ABAllItems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aball_items);

        //The following is to set the toolbar
        Toolbar abAllItemsToolbar = (Toolbar)findViewById(R.id.toolbarABAllItems);
        setSupportActionBar(abAllItemsToolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        CreateButtons();
    }

    private void CreateButtons(){
        Button btnTuna = (Button)findViewById(R.id.buttonAbCatTuna);
        Button btnSalmon = (Button)findViewById(R.id.buttonAbCatSalmon);
        Button btnMackarel = (Button)findViewById(R.id.buttonAbCatMackarel);
        Button btnSardines = (Button)findViewById(R.id.buttonAbCatSardine);
        Button btnSantan = (Button)findViewById(R.id.buttonAbCatSantan);
        Button btnVeggies = (Button)findViewById(R.id.buttonAbCatVeggie);
        Button btnFruits = (Button)findViewById(R.id.buttonAbCatFruits);
        Button btnCrab = (Button)findViewById(R.id.buttonAbCatCrabMeat);

        btnTuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AbTuna.class);
                startActivity(intent);
            }
        });

        btnSalmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AbSalmon.class);
                startActivity(intent);
            }
        });

        btnMackarel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AbMackarel.class);
                startActivity(intent);
            }
        });

        btnSardines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AbSardines.class);
                startActivity(intent);
            }
        });

        btnVeggies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AbVeggies.class);
                startActivity(intent);
            }
        });

        btnSantan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AbSantan.class);
                startActivity(intent);
            }
        });

        btnFruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AbFruit.class);
                startActivity(intent);
            }
        });

        btnCrab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AbCrabMeat.class);
                startActivity(intent);
            }
        });
    }
}
