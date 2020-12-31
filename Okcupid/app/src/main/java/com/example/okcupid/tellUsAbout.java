package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tellUsAbout extends AppCompatActivity {
    private Button Btnnext208;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tell_us_about);
        Btnnext208 = findViewById(R.id.btnnext208);
        Btnnext208.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tellUsAbout.this, addPhotoOfYou.class);
                startActivity(intent);

            }
        });


    }
}