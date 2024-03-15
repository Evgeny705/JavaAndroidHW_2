package com.example.hw_2;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

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

    public CountriesFragment() {
        // Required empty public constructor
    }

    public static CountriesFragment newInstance(String param1, String param2) {
        CountriesFragment fragment = new CountriesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        CountriesViewModel viewModel = new ViewModelProvider(this).get(CountriesViewModel.class);

        View view = inflater.inflate(R.layout.fragment_countries, container, false);

//        ListView listOfCountries = (ListView) view.findViewById(R.id.listView);

        RecyclerView listOfCountries = (RecyclerView) view.findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter(getActivity(), viewModel.getCountryList().getValue());

        listOfCountries.setAdapter(customAdapter);

//        listOfCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Country selectedCountry = viewModel.getCountryList().getValue().get(position);
//                Bundle bundle = new Bundle();
//                bundle.putSerializable("selectedCountry", selectedCountry);
//                DetailsFragment detailsFragment = new DetailsFragment();
//                detailsFragment.setArguments(bundle);
//                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
//                transaction.replace(R.id.fragment_container, detailsFragment);
//                transaction.addToBackStack(null);
//                transaction.commit();
////                Intent intent = new Intent(getActivity(), DetailsActivity.class);
////                intent.putExtra("selectedCountry", selectedCountry);
////                startActivity(intent);
//            }
//        });

        return view;
    }

}