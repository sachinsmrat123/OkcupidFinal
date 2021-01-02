package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class doubletake extends AppCompatActivity {
private ImageButton mingbtndoubletake;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doubletake);
        mingbtndoubletake=findViewById(R.id.imgbtndoubletake);
        mingbtndoubletake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(doubletake.this,HomePage.class);
                startActivity(intent);
            }
        });
    }
}