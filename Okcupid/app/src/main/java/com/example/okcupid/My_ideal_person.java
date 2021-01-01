package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class My_ideal_person extends AppCompatActivity {
private ImageButton imbtnMyideal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_ideal_person);
        imbtnMyideal= findViewById(R.id.imgbtnsettings001);
        imbtnMyideal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(My_ideal_person.this,profile.class);
startActivity(intent);
            }
        });
    }
}