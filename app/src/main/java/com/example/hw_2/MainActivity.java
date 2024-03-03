package com.example.hw_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listOfCountries = findViewById(R.id.listView);

        List<Country> countryList = new ArrayList<>();

        countryList.add(new Country("Австрия", R.drawable.flag_austria));
        countryList.add(new Country("Франция", R.drawable.flag_france));
        countryList.add(new Country("Германия", R.drawable.flag_germany));
        countryList.add(new Country("Венгрия", R.drawable.flag_hungary));
        countryList.add(new Country("Италия", R.drawable.flag_italy, "Рим", 100));
        countryList.add(new Country("Португалия", R.drawable.flag_portugal));
        countryList.add(new Country("Румыния", R.drawable.flag_romania));
        countryList.add(new Country("Испания", R.drawable.flag_spain));
        countryList.add(new Country("Швеция", R.drawable.flag_sweden));
        countryList.add(new Country("Турция", R.drawable.flag_turkey));

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList);

        listOfCountries.setAdapter(customAdapter);

        listOfCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Country selectedCountry = countryList.get(position);
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("selectedCountry", selectedCountry);
                startActivity(intent);
            }
        });

    }
}