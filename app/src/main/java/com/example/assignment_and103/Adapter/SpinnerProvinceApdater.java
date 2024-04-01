package com.example.assignment_and103.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.assignment_and103.Model.Province;
import com.example.assignment_and103.R;

import java.util.ArrayList;

public class SpinnerProvinceApdater extends ArrayAdapter<Province> {
    private Context context;
    private ArrayList<Province> listProvinces;

    private TextView tv_name;
    public SpinnerProvinceApdater(@NonNull Context context, int resource, ArrayList<Province> provinces) {
        super(context, resource, provinces);
        this.context = context;
        this.listProvinces = provinces;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_spinner,parent,false);
        final Province province = listProvinces.get(position);

        if (province != null) {
            tv_name = convertView.findViewById(R.id.tv_name);
            tv_name.setText(province.getProvinceName());
        }
        return convertView;
    }
    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_spinner,parent,false);
        final Province province = listProvinces.get(position);

        if (province != null) {
            tv_name = convertView.findViewById(R.id.tv_name);
            tv_name.setText(province.getProvinceName());
        }

        return convertView;
    }
}
