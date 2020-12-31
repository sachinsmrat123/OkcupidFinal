package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q3 extends AppCompatActivity {
    private Button mbtnSubmit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
        mbtnSubmit2 =findViewById(R.id.btnSubmi2);
        mbtnSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Q3.this, Q4.class);
                startActivity(intent);
            }
        });
    }
}