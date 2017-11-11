package com.example.dell.majumandiriproductlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AllItemsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_items_list);

        Toolbar allItemsToolbar = (Toolbar)findViewById(R.id.toolbarAllItems);
        setSupportActionBar(allItemsToolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        createButtons();
    }

    private void createButtons() {
        //Generate Ayam Brand button
        Button abButton = (Button)findViewById(R.id.buttonAB);
        abButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ABAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Jay's button
        Button jaysButton = (Button)findViewById(R.id.buttonJays);
        jaysButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JaysAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Gryphon button
        Button gryphonButton = (Button)findViewById(R.id.buttonGryphon);
        gryphonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Gryphon_categories.class);
                startActivity(intent);
            }
        });

        //Generate Barilla button
        Button barillaButton = (Button)findViewById(R.id.buttonBarilla);
        barillaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BarillaAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Bertolli button
        Button bertolliButton = (Button)findViewById(R.id.buttonBertolli);
        bertolliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Bertolli_categories.class);
                startActivity(intent);
            }
        });

        //Generate Savis button
        Button savisButton = (Button)findViewById(R.id.buttonSavis);
        savisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Savis_categories.class);
                startActivity(intent);
            }
        });

        //Generate Spigadoro button
        Button spigadoroButton = (Button)findViewById(R.id.buttonSpigadoro);
        spigadoroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SpigadoroAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Golden Bridge button
        final Button gbButton = (Button)findViewById(R.id.buttonGoldenBridge);
        gbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GoldenBrigeAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Lily button
        Button lilyButton = (Button)findViewById(R.id.buttonLily);
        lilyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LilyAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Corniche button
        Button cornicheButton = (Button)findViewById(R.id.buttonCorniche);
        cornicheButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CornicheAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Diamond button
        Button diamondButton = (Button)findViewById(R.id.buttonDiamond);
        diamondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DiamondAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Heinz button
        Button heinzButton = (Button)findViewById(R.id.buttonHeinz);
        heinzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HeinzAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Franks button
        Button franksButton = (Button)findViewById(R.id.buttonFranks);
        franksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FranksAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Reynolds button
        Button reynoldsButton = (Button)findViewById(R.id.buttonReynolds);
        reynoldsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ReynoldsAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Chateau button
        Button chateauButton = (Button)findViewById(R.id.buttonChateau);
        chateauButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChateauAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Log Cabin button
        Button logButton = (Button)findViewById(R.id.buttonLogCabin);
        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LogCabinAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Maple Joe button
        Button joeButton = (Button)findViewById(R.id.buttonJoe);
        joeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapleJoeAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Cattlemen button
        Button cattlemenButton = (Button)findViewById(R.id.buttonCattlemen);
        cattlemenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CattlemenAllItems.class);
                startActivity(intent);
            }
        });

        //Generate De Rica button
        Button deRicaButton = (Button)findViewById(R.id.buttonDerica);
        deRicaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DericaAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Cirio button
        Button cirioButton = (Button)findViewById(R.id.buttonCirio);
        cirioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CirioAllItems.class);
                startActivity(intent);
            }
        });

        //Generate French button
        Button frenchButton = (Button)findViewById(R.id.buttonFrench);
        frenchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FrenchsAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Lindsay button
        Button lindsayButton = (Button)findViewById(R.id.buttonLindsay);
        lindsayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LindsayAllItems.class);
                startActivity(intent);
            }
        });

        //Generate JW button
        Button jwButton = (Button)findViewById(R.id.buttonJW);
        jwButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JwAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Mae Ploy button
        Button maePloyButton = (Button)findViewById(R.id.buttonMaePloy);
        maePloyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MaePloyAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Sunny Perfect button
        Button sunnyButton = (Button)findViewById(R.id.buttonSunny);
        sunnyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SunnyAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Vlasic button
        Button vlasicButton = (Button)findViewById(R.id.buttonVlasic);
        vlasicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), VlasicAllItems.class);
                startActivity(intent);
            }
        });

        //Generate Costa d'Oro button
        Button costadoroButton = (Button)findViewById(R.id.buttonCostadoro);
        costadoroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CostadoroAllItems.class);
                startActivity(intent);
            }
        });
    }
}
