package com.example.dell.majumandiriproductlist;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class LoginScreen extends AppCompatActivity {

    private String[] loginName = new String[] {"master", "sekti", "ida", "reni"};
    private String[] loginPass = new String[] {"mastermakmur", "sektimakmur", "idamakmur", "renimakmur"};
    private EditText user;
    private EditText pass;
    private boolean matchStatus = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        //Setup textViews
        user = (EditText) findViewById(R.id.inputUsername);
        pass = (EditText) findViewById(R.id.inputPassword);
        Button login = (Button) findViewById(R.id.buttonLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < loginName.length; i++) {
                    if (user.getText().toString().equals(loginName[i]) && pass.getText().toString().equals(loginPass[i])) {
                        matchStatus = true;
                        break;
                    }
                }
                if (matchStatus) {
                    startActivity(new Intent(LoginScreen.this, MainActivity.class));
                } else {
                    Context context = getApplicationContext();
                    CharSequence text = "Invalid username/password";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
    }
}
