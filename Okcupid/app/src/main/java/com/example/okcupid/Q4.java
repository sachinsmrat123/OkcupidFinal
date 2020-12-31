package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q4 extends AppCompatActivity {
    private Button mbtnSubmit3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);
        mbtnSubmit3 = findViewById(R.id.btnSubmit3);
        mbtnSubmit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Q4.this, Q5.class);
                startActivity(intent);
            }
        });
    }
}