package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class I_am_a extends AppCompatActivity {
  private Button btnNixt2;
    Dialog mGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_am_a);
        mGender = new Dialog(this);
        btnNixt2 =findViewById(R.id.btnNext2);
        btnNixt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(I_am_a.this,Dob.class);
                startActivity(intent);
            }
        });

    }


    public  void previous(View view){
        startActivity(new Intent(I_am_a.this, About_you.class));
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
    }
}