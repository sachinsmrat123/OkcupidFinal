package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q5 extends AppCompatActivity {
private Button mBtnQ5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);
        mBtnQ5=findViewById(R.id.btnquestion5);
        mBtnQ5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Q5.this,HomePage.class);
                startActivity(intent);
            }
        });
    }
}