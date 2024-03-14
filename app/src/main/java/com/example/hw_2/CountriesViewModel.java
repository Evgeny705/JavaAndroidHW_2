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

        list.add(new Country("Австрия", R.drawable.flag_austria, "Вена", 1000));
        list.add(new Country("Франция", R.drawable.flag_france, "Париж", 200));
        list.add(new Country("Германия", R.drawable.flag_germany, "Берлин", 500));
        list.add(new Country("Венгрия", R.drawable.flag_hungary, "Будапешт", 600));
        list.add(new Country("Италия", R.drawable.flag_italy, "Рим", 100));
        list.add(new Country("Португалия", R.drawable.flag_portugal, "Лиссабон", 400));
        list.add(new Country("Румыния", R.drawable.flag_romania, "Бухарест", 700));
        list.add(new Country("Испания", R.drawable.flag_spain, "Мадрид", 800));
        list.add(new Country("Швеция", R.drawable.flag_sweden, "Стокгольм", 200));
        list.add(new Country("Турция", R.drawable.flag_turkey, "Анкара", 300));

        countryList.setValue(list);

    }

}
