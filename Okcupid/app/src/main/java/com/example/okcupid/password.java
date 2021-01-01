package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class password extends AppCompatActivity {
    private Button mbtbSingUp;
    private EditText EditPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        mbtbSingUp = findViewById(R.id.btnsignup);
        EditPassword= findViewById(R.id.etemailid);


        mbtbSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(password.this, Set_up.class);
                    startActivity(intent);




            }
        });
    }

    public void previous(View view) {
        startActivity(new Intent(password.this, email.class));
    }

    }