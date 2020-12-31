package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q2 extends AppCompatActivity {
    private Button mbtnSubmit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        mbtnSubmit1 = findViewById(R.id.btnSubmit1);
        mbtnSubmit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Q2.this,Q3.class);
                startActivity(intent);
            }
        });
    }
}