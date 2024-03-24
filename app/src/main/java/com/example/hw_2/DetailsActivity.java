package com.example.hw_2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();

        Country selectedCountry = (Country) intent.getSerializableExtra("selectedCountry");

        ImageView imageFlag = findViewById(R.id.imageFlag);
        Glide.with(this).load(selectedCountry.getFlagURL()).into(imageFlag);

        TextView textViewName = findViewById(R.id.textViewName);
        textViewName.setText(selectedCountry.name);
        TextView textViewCapital = findViewById(R.id.textViewCapital);
        textViewCapital.setText(selectedCountry.capital);
        TextView textViewArea = findViewById(R.id.textViewArea);
        textViewArea.setText("Площать: " + selectedCountry.area);

        Button btnClose = findViewById(R.id.buttonClose);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}