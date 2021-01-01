package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About_you extends AppCompatActivity {
       private Button mbtnNext1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_you);
        mbtnNext1 = findViewById(R.id.btnNext1);
        mbtnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About_you.this,I_am_a.class);
                startActivity(intent);
            }
        });
    }
    public  void previous(View view){
        startActivity(new Intent(About_you.this, Set_up.class));
    }



}