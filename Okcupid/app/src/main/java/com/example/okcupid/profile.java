package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profile extends AppCompatActivity {
private Button mbtnSettings;
private Button mbtnPrefrences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mbtnSettings=findViewById(R.id.btnSettings);
        mbtnPrefrences =findViewById(R.id.btnPrefrences);
        mbtnPrefrences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this,My_ideal_person.class);
                startActivity(intent);
            }
        });
        mbtnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(profile.this,settings.class);
                startActivity(intent);
            }
        });
    }
}