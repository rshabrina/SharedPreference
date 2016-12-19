package com.example.ridhashabrina.login;

import android.content.Intent;
import android.net.Uri;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity implements View.OnClickListener{
    Button bLogin,bRegister, bFb, bTwitter, bGmail;
    EditText edUsername, edPassword;
    TextView tStatus;
    String username, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        edUsername=(EditText) findViewById(R.id.edUsername);
        edPassword=(EditText) findViewById(R.id.edPassword);
        bLogin=(Button) findViewById(R.id.bLogin);
        bRegister=(Button) findViewById(R.id.bRegister);
        bFb=(Button) findViewById(R.id.bFb);
        bTwitter=(Button) findViewById(R.id.bTwitter);
        bGmail=(Button) findViewById(R.id.bGmail);

        bLogin.setOnClickListener(this);
        bRegister.setOnClickListener(this);
        bFb.setOnClickListener(this);
        bTwitter.setOnClickListener(this);
        bGmail.setOnClickListener(this);

        tStatus = (TextView) findViewById(R.id.tStatus);
        username = "ridha";
        pass = "12345";
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bLogin){
            if(edUsername.getText().toString().equals(username) && edPassword.getText().toString().equals(pass))
            {
                startActivity(new Intent(this, home.class));
                edUsername.setText("");
                edPassword.setText("");
            }
            else{
                tStatus.setText("Login Gagal !");
                edUsername.setText("");
                edPassword.setText("");
            }
        }

        else if(v.getId()==R.id.bRegister){
            startActivity(new Intent(this, register.class));
        }
        else if(v.getId()==R.id.bFb){
            Uri uri1= Uri.parse("http://www.facebook.com");
            Intent intent1= new Intent(Intent. ACTION_VIEW, uri1);
            startActivity(intent1);
        }
        else if(v.getId()==R.id.bTwitter){
            Uri uri2= Uri.parse("http://www.twitter.com");
            Intent intent2= new Intent(Intent. ACTION_VIEW, uri2);
            startActivity(intent2);
        }
        else if(v.getId()==R.id.bGmail){
            Uri uri3= Uri.parse("http://www.gmail.com");
            Intent intent3= new Intent(Intent. ACTION_VIEW, uri3);
            startActivity(intent3);
        }
    }
}