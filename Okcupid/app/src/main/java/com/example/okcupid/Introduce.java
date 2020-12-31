package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Introduce extends AppCompatActivity {
  private Button mbtnNixt7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce);
        mbtnNixt7 = findViewById(R.id.btnNext7);
        mbtnNixt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Introduce.this, Answer.class);
                startActivity(intent);
            }
        });
    }
}