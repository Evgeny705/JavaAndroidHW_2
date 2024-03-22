package com.example.hw_2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsFragment extends Fragment {

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

        DetailsViewModel viewModel = new ViewModelProvider(this).get(DetailsViewModel.class);

        Bundle bundle = getArguments();
        viewModel.selectedCountry.setValue((Country) bundle.getSerializable("selectedCountry"));

        if (bundle != null) {
            ImageView imageFlag = view.findViewById(R.id.imageFlag);
            Glide.with(this).load(viewModel.selectedCountry.getValue().getFlagURL()).into(imageFlag);

            TextView textViewName = view.findViewById(R.id.textViewName);
            textViewName.setText(viewModel.selectedCountry.getValue().name);
            TextView textViewCapital = view.findViewById(R.id.textViewCapital);
            textViewCapital.setText(viewModel.selectedCountry.getValue().capital);
            TextView textViewArea = view.findViewById(R.id.textViewArea);
            textViewArea.setText("Площать: " + viewModel.selectedCountry.getValue().area);

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