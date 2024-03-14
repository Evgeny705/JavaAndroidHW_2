package com.example.hw_2;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DetailsViewModel extends ViewModel {

    public MutableLiveData<Country> selectedCountry = new MutableLiveData<>();

}
