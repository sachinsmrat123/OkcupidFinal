package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class whatConnections extends AppCompatActivity {
    private Button Btnnext2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_connections);

        Btnnext2 = findViewById(R.id.btnnext2);
        Btnnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(whatConnections.this,Iamlookingfor.class);
                startActivity(intent);
            }
        });

    }
}