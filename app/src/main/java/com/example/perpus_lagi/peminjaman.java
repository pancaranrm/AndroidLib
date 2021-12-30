package com.example.perpus_lagi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class peminjaman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peminjaman);
        getSupportActionBar().hide();

        Button btnPinjamkak = findViewById(R.id.btnPinjam);

        btnPinjamkak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mulaipinjam = new Intent(peminjaman.this,suksesPinjam.class);
                startActivity(mulaipinjam);
            }
        });
    }
}