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

        final String[] countries = new String[]{
                "Молдова",
                "Румыния",
                "Венгрия",
                "Хорватия",
                "Словения",
                "Италия",
                "Франция",
                "Австрия",
                "Испания",
                "Германия"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.activity_listview, R.id.textView, countries);

        listOfCountries.setAdapter(adapter);

    }
}