package com.example.perpus_lagi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private EditText edtEmail, edtPassword;
    private Button loginBtn;
    private TextView forgetP,signU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        initView();
    }

    private void initView() {
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        loginBtn = findViewById(R.id.loginBtn);


        loginBtn.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtEmail.getText().toString().equals("anca") && edtPassword.getText().toString().equals("123")){
                    Toast.makeText(login.this, "Username and Password is correct", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,home.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(login.this, "Username or Password is incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    }
