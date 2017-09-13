package com.example.dell.majumandiriproductlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class JaysAllItems extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jays_all_items);

        Toolbar jaysToolbar = (Toolbar)findViewById(R.id.toolbarJaysAllItems);
        setSupportActionBar(jaysToolbar);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        CreateButtonsOnClick();
    }

    private void CreateButtonsOnClick() {
        Button btnJaysBottleOne = (Button)findViewById(R.id.buttonJaysBottleOne);
        Button btnJaysBottleTwo = (Button)findViewById(R.id.buttonJaysBottleTwo);
        Button btnJaysBottleThree = (Button)findViewById(R.id.buttonJaysBottleThree);
        Button btnJaysGrillMaster = (Button)findViewById(R.id.buttonJaysGrillMaster);
        Button btnJaysGravy = (Button)findViewById(R.id.buttonJaysGravy);
        Button btnJaysMashPot = (Button)findViewById(R.id.buttonJaysMashedPotatoes);
        Button btnJaysRub = (Button)findViewById(R.id.buttonJaysRub);

        btnJaysBottleOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JaysBottleOne.class);
                startActivity(intent);
            }
        });

        btnJaysBottleTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JaysBottleTwo.class);
                startActivity(intent);
            }
        });

        btnJaysBottleThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JaysBottleThree.class);
                startActivity(intent);
            }
        });

        btnJaysGrillMaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JaysGrillMaster.class);
                startActivity(intent);
            }
        });

        btnJaysGravy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JaysGravy.class);
                startActivity(intent);
            }
        });

        btnJaysMashPot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JaysMashedPotatoes.class);
                startActivity(intent);
            }
        });

        btnJaysRub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JaysRub.class);
                startActivity(intent);
            }
        });
    }
}
