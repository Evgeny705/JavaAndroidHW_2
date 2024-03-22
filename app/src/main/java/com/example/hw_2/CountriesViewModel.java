package com.example.hw_2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class CountriesViewModel extends ViewModel {

    private MutableLiveData<List<Country>> countryList;

    public LiveData<List<Country>> getCountryList() {
        if (countryList == null) {
            countryList = new MutableLiveData<>();
            loadCountryList();
        }
        return countryList;
    }

    private void loadCountryList() {

        List<Country> list = new ArrayList<>();

//        list.add(new Country("Австрия", R.drawable.flag_austria, "Вена", 1000));
//        list.add(new Country("Франция", R.drawable.flag_france, "Париж", 200));
//        list.add(new Country("Германия", R.drawable.flag_germany, "Берлин", 500));
//        list.add(new Country("Венгрия", R.drawable.flag_hungary, "Будапешт", 600));
//        list.add(new Country("Италия", R.drawable.flag_italy, "Рим", 100));
//        list.add(new Country("Португалия", R.drawable.flag_portugal, "Лиссабон", 400));
//        list.add(new Country("Румыния", R.drawable.flag_romania, "Бухарест", 700));
//        list.add(new Country("Испания", R.drawable.flag_spain, "Мадрид", 800));
//        list.add(new Country("Швеция", R.drawable.flag_sweden, "Стокгольм", 200));
//        list.add(new Country("Турция", R.drawable.flag_turkey, "Анкара", 300));

        list.add(new Country("Австрия", "https://flagsapi.com/AT/flat/64.png", "Вена", 1000));
        list.add(new Country("Франция", "https://flagsapi.com/FR/flat/64.png", "Париж", 200));
        list.add(new Country("Германия", "https://flagsapi.com/DE/flat/64.png", "Берлин", 500));
        list.add(new Country("Венгрия", "https://flagsapi.com/HU/flat/64.png", "Будапешт", 600));
        list.add(new Country("Италия", "https://flagsapi.com/IT/flat/64.png", "Рим", 100));
        list.add(new Country("Португалия", "https://flagsapi.com/PT/flat/64.png", "Лиссабон", 400));
        list.add(new Country("Румыния", "https://flagsapi.com/RO/flat/64.png", "Бухарест", 700));
        list.add(new Country("Испания", "https://flagsapi.com/ES/flat/64.png", "Мадрид", 800));
        list.add(new Country("Швеция", "https://flagsapi.com/SE/flat/64.png", "Стокгольм", 200));
        list.add(new Country("Турция", "https://flagsapi.com/TR/flat/64.png", "Анкара", 300));

        countryList.setValue(list);

    }

}
