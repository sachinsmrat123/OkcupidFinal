package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomePage extends AppCompatActivity {
private ImageButton mbtnMessages;
private ImageButton mbtnProfile;
private ImageButton mbtnLikes;
private ImageButton mbtnDoubleTake;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        mbtnMessages=findViewById(R.id.btnmessages);
        mbtnProfile=findViewById(R.id.btnprofile);
        mbtnLikes=findViewById(R.id.btnlikes);
        mbtnDoubleTake=findViewById(R.id.btndoubletake);
        mbtnDoubleTake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomePage.this, doubletake.class);
                startActivity(intent);
            }
        });
        mbtnLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomePage.this,likesLayout.class);
                startActivity(intent);
            }
        });
        mbtnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomePage.this,profile.class);
                startActivity(intent);
            }
        });
        mbtnMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomePage.this,messages.class);
                startActivity(intent);
            }
        });

    }
}