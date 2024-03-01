package com.example.hw_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listOfCountries = findViewById(R.id.listView);

        String[] countries = new String[]{
                "Австрия",
                "Франция",
                "Германия",
                "Венгрия",
                "Италия",
                "Португалия",
                "Румыния",
                "Испания",
                "Швеция",
                "Турция"
        };

        int[] flags = new int[] {
                R.drawable.flag_austria,
                R.drawable.flag_france,
                R.drawable.flag_germany,
                R.drawable.flag_hungary,
                R.drawable.flag_italy,
                R.drawable.flag_portugal,
                R.drawable.flag_romania,
                R.drawable.flag_spain,
                R.drawable.flag_sweden,
                R.drawable.flag_turkey
        };

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countries, flags);

        listOfCountries.setAdapter(customAdapter);

    }
}