package com.example.hw_2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsFragment extends Fragment {

    private Country selectedCountry;

    public DetailsFragment() {
    }

    public static DetailsFragment newInstance(String param1, String param2) {
        DetailsFragment fragment = new DetailsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        Bundle bundle = getArguments();
        selectedCountry = (Country) bundle.getSerializable("selectedCountry");

        if (bundle != null) {
            ImageView imageFlag = view.findViewById(R.id.imageFlag);
            imageFlag.setImageResource(selectedCountry.flagId);

            TextView textViewName = view.findViewById(R.id.textViewName);
            textViewName.setText(selectedCountry.name);
            TextView textViewCapital = view.findViewById(R.id.textViewCapital);
            textViewCapital.setText(selectedCountry.capital);
            TextView textViewArea = view.findViewById(R.id.textViewArea);
            textViewArea.setText("Площать: " + selectedCountry.area);

            Button btnClose = view.findViewById(R.id.buttonClose);

            btnClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getParentFragmentManager().popBackStack();
                }
            });
        }
        return view;
    }
}