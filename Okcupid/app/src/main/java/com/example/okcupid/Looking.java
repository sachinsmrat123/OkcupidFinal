package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Looking extends AppCompatActivity {
private Button Nextbtn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looking);
        Nextbtn6 = findViewById(R.id.btnNext6);
        Nextbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Looking.this,whatConnections.class);
                startActivity(intent);
            }
        });
    }




}