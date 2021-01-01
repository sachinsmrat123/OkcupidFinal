package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.text.DateFormatSymbols;

public class Live_location extends AppCompatActivity {
    private Button mbtnNixt5;
    Spinner myCountry, myCity;
    String[] country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_location);
        myCountry = findViewById(R.id.spCountry);
        myCity = findViewById(R.id.spCity);
        populateSpinnerCountry();
        populateSpinnerCity();
        mbtnNixt5 = findViewById(R.id.btnNext5);
        mbtnNixt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Live_location.this, Looking.class);
                startActivity(intent);
            }
        });

    }
    public  void previous(View view){
        startActivity(new Intent(Live_location.this, Location.class));
    }


    private void populateSpinnerCountry() {
        ArrayAdapter<String> cityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinner_Country));
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myCountry.setAdapter(cityAdapter);
    }


    private void populateSpinnerCity() {
        ArrayAdapter<String> cityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinner_city));
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myCity.setAdapter(cityAdapter);
    }
}