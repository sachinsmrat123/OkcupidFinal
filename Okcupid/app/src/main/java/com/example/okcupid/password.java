package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class password extends AppCompatActivity {
    private  Button  mbtbSingUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
       mbtbSingUp= findViewById(R.id.btnsignup);
        mbtbSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(password.this,Set_up.class);
                startActivity(intent);
            }
        });
    }
}