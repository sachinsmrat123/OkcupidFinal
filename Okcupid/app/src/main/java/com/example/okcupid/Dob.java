package com.example.okcupid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.text.DateFormatSymbols;

public class Dob extends AppCompatActivity {
 private Button mbtnDob;
    Spinner spMonth, spDay, spYear;
     String[] months;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dob);
        spMonth = findViewById(R.id.spMonth);
        spDay = findViewById(R.id.spDay);
        spYear =findViewById(R.id.spYear);
        populateSpinnerMonth();
        populateSpinnerDay();
        populateSpinnerYear();
        mbtnDob = findViewById(R.id.btnDob);

        mbtnDob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dob.this,Location.class);
                startActivity(intent);
            }
        });
    }

    private void populateSpinnerMonth(){
        months = new DateFormatSymbols().getMonths();
        ArrayAdapter<String>monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, months);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spMonth.setAdapter(monthAdapter);
    }
    private void populateSpinnerDay() {
        ArrayAdapter<String> dayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinner_day));
        dayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spDay.setAdapter(dayAdapter);
    }

    private void populateSpinnerYear(){
        ArrayAdapter<String> dayAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinner_year));
        dayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spYear.setAdapter(dayAdapter);

    }
}