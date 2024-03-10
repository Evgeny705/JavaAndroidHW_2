package com.example.hw_2;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CountriesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CountriesFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    List<Country> countryList = new ArrayList<>();

    public CountriesFragment() {
        // Required empty public constructor
    }

    public static CountriesFragment newInstance(String param1, String param2) {
        CountriesFragment fragment = new CountriesFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        countryList.add(new Country("Австрия", R.drawable.flag_austria, "Вена", 1000));
        countryList.add(new Country("Франция", R.drawable.flag_france, "Париж", 200));
        countryList.add(new Country("Германия", R.drawable.flag_germany, "Берлин", 500));
        countryList.add(new Country("Венгрия", R.drawable.flag_hungary, "Будапешт", 600));
        countryList.add(new Country("Италия", R.drawable.flag_italy, "Рим", 100));
        countryList.add(new Country("Португалия", R.drawable.flag_portugal, "Лиссабон", 400));
        countryList.add(new Country("Румыния", R.drawable.flag_romania, "Бухарест", 700));
        countryList.add(new Country("Испания", R.drawable.flag_spain, "Мадрид", 800));
        countryList.add(new Country("Швеция", R.drawable.flag_sweden, "Стокгольм", 200));
        countryList.add(new Country("Турция", R.drawable.flag_turkey, "Анкара", 300));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_countries, container, false);

        ListView listOfCountries = (ListView) view.findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter(getActivity(), countryList);

        listOfCountries.setAdapter(customAdapter);

        listOfCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Country selectedCountry = countryList.get(position);
                Bundle bundle = new Bundle();
                bundle.putSerializable("selectedCountry", selectedCountry);
                DetailsFragment detailsFragment = new DetailsFragment();
                detailsFragment.setArguments(bundle);
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, detailsFragment);
                transaction.addToBackStack(null);
                transaction.commit();
//                Intent intent = new Intent(getActivity(), DetailsActivity.class);
//                intent.putExtra("selectedCountry", selectedCountry);
//                startActivity(intent);
            }
        });

        return view;
    }

}