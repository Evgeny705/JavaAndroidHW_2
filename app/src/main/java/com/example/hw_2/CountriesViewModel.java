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

        list.add(new Country("AT", "Австрия", "https://flagsapi.com/AT/flat/64.png", "Вена", 1000));
        list.add(new Country("FR","Франция", "https://flagsapi.com/FR/flat/64.png", "Париж", 200));
        list.add(new Country("DE","Германия", "https://flagsapi.com/DE/flat/64.png", "Берлин", 500));
        list.add(new Country("HU","Венгрия", "https://flagsapi.com/HU/flat/64.png", "Будапешт", 600));
        list.add(new Country("IT","Италия", "https://flagsapi.com/IT/flat/64.png", "Рим", 100));
        list.add(new Country("PT","Португалия", "https://flagsapi.com/PT/flat/64.png", "Лиссабон", 400));
        list.add(new Country("RO","Румыния", "https://flagsapi.com/RO/flat/64.png", "Бухарест", 700));
        list.add(new Country("ES","Испания", "https://flagsapi.com/ES/flat/64.png", "Мадрид", 800));
        list.add(new Country("SE","Швеция", "https://flagsapi.com/SE/flat/64.png", "Стокгольм", 200));
        list.add(new Country("TR","Турция", "https://flagsapi.com/TR/flat/64.png", "Анкара", 300));

        countryList.setValue(list);

    }

}
