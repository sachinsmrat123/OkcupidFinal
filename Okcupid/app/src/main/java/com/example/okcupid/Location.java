package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Location extends AppCompatActivity {
 private Button mbtNixt4;
 private TextView tvEnable;
 private Button mbtnEnable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        mbtNixt4 = findViewById(R.id.btnNext4);
        tvEnable = findViewById(R.id.tvNothanks);
        mbtnEnable = findViewById(R.id.btnEnable);

        mbtNixt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Location.this, Live_location.class);
                startActivity(intent);
            }
        });
        tvEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Location.this, Live_location.class);
                startActivity(intent);
            }
        });
        mbtnEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Location.this, Live_location.class);
                startActivity(intent);
            }
        });
    }
}