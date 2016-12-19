package com.example.ridhashabrina.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity implements View.OnClickListener{
    Button bSubmit;
    EditText edName, edGF, edDivisi, edUsername, edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edName=(EditText) findViewById(R.id.edName);
        edGF=(EditText) findViewById(R.id.edGF);
        edDivisi=(EditText) findViewById(R.id.edDivisi);
        edUsername=(EditText) findViewById(R.id.edUsername);
        edPassword=(EditText) findViewById(R.id.edPassword);
        bSubmit=(Button) findViewById(R.id.bSubmit);

        bSubmit.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.bSubmit:
                startActivity(new Intent(this, FormLogin.class));

                break;
        }
    }
}

