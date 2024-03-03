package com.example.hw_2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();

        Country selectedCountry = (Country) intent.getSerializableExtra("selectedCountry");

        ImageView imageFlag = findViewById(R.id.imageFlag);
        imageFlag.setImageResource(selectedCountry.flagId);

        TextView textViewName = findViewById(R.id.textViewName);
        textViewName.setText(selectedCountry.name);
        TextView textViewCapital = findViewById(R.id.textViewCapital);
        textViewCapital.setText(selectedCountry.capital);
        TextView textViewArea = findViewById(R.id.textViewArea);
        textViewArea.setText("Площать: " + selectedCountry.area);

    }
}