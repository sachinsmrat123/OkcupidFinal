package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class settings extends AppCompatActivity {
private ImageButton mbtnsettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        mbtnsettings=findViewById(R.id.imgbtnsettings);
        mbtnsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(settings.this,HomePage.class);
                startActivity(intent);
            }
        });
    }
}