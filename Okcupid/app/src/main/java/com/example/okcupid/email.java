package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class email extends AppCompatActivity {
    private Button mBtnnext;
    private EditText mEditemailid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        mBtnnext = findViewById(R.id.btnnextemail);
        mEditemailid = findViewById(R.id.etemailid);
        mBtnnext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (isCredValid()){

                    Intent intent = new Intent(email.this,password.class);
                    startActivity(intent);


                }


            }
        });
    }

    public  void previous(View view){
        startActivity(new Intent(email.this, MainActivity.class));
    }

    private  boolean isCredValid(){
        boolean isDataValid  = true;
        if(!mEditemailid.getText().toString().contains("@gmail.com")){
            mEditemailid.setError("Invalid email id");
            isDataValid = false;
        }

        return isDataValid;
    }






















}