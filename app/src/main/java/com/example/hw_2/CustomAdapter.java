package com.example.hw_2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    Context context;
    List<Country> countryList;
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, List<Country> countryList) {
        this.context = context;
        this.countryList = countryList;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @SuppressLint("ResourceType")
        View view = inflater.inflate(R.layout.listview_item, parent, false);
        return new MyViewHolder((view));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Country country = countryList.get(position);

        holder.imageView.setImageResource(country.getFlagId());
        holder.textView.setText(country.getName());

    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }

//
//    @Override
//    public int getCount() {
//        return countryList.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View view = inflater.inflate(R.layout.listview_item, null);
//        TextView textView = (TextView) view.findViewById(R.id.textView);
//        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
//        textView.setText(countryList.get(position).name);
//        imageView.setImageResource(countryList.get(position).flagId);
//        return view;
//    }
}
