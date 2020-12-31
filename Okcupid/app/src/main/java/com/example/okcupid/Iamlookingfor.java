package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Iamlookingfor extends AppCompatActivity {
    private Button Btnnext22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iamlookingfor);
        Btnnext22 = findViewById(R.id.btnnext22);
        Btnnext22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Iamlookingfor.this, Howold.class);
                startActivity(intent);
            }
        });


    }
}