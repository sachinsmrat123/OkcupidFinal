package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class addPhotoOfYou extends AppCompatActivity {
 private Button mbtnnext256;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_photo_of_you);
        mbtnnext256 = findViewById(R.id.btnnext256);
        mbtnnext256.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(addPhotoOfYou.this,Introduce.class);
                startActivity(intent);
            }
        });
    }
}