package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class Iamlookingfor extends AppCompatActivity {
    private Button Btnnext22;
    Dialog mGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iamlookingfor);


        Btnnext22 = findViewById(R.id.btnnext22);
        mGender = new Dialog(this);

        Btnnext22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Iamlookingfor.this, Howold.class);
                startActivity(intent);
            }
        });


    }
    public  void previous(View view){
        startActivity(new Intent(Iamlookingfor.this, whatConnections.class));
    }
       public void MoreOptions(View v) {
           ScrollView txtclose;
           TextView tvMoreOptions;
           mGender.setContentView(R.layout.gender);
           txtclose = (ScrollView) mGender.findViewById(R.id.tvScrollView);
           tvMoreOptions = (TextView) mGender.findViewById(R.id.tvMore);
           txtclose.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   mGender.dismiss();
               }
           });
           mGender.show();

       }}