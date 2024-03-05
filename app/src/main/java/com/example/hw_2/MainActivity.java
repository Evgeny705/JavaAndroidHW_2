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

//        ListView listOfCountries = findViewById(R.id.listView);
//
//        List<Country> countryList = new ArrayList<>();
//
//        countryList.add(new Country("Австрия", R.drawable.flag_austria, "Вена", 1000));
//        countryList.add(new Country("Франция", R.drawable.flag_france, "Париж", 200));
//        countryList.add(new Country("Германия", R.drawable.flag_germany, "Берлин", 500));
//        countryList.add(new Country("Венгрия", R.drawable.flag_hungary, "Будапешт", 600));
//        countryList.add(new Country("Италия", R.drawable.flag_italy, "Рим", 100));
//        countryList.add(new Country("Португалия", R.drawable.flag_portugal, "Лиссабон", 400));
//        countryList.add(new Country("Румыния", R.drawable.flag_romania, "Бухарест", 700));
//        countryList.add(new Country("Испания", R.drawable.flag_spain, "Мадрид", 800));
//        countryList.add(new Country("Швеция", R.drawable.flag_sweden, "Стокгольм", 200));
//        countryList.add(new Country("Турция", R.drawable.flag_turkey, "Анкара", 300));
//
//        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList);
//
//        listOfCountries.setAdapter(customAdapter);
//
//        listOfCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Country selectedCountry = countryList.get(position);
//                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
//                intent.putExtra("selectedCountry", selectedCountry);
//                startActivity(intent);
//            }
//        });

    }
}