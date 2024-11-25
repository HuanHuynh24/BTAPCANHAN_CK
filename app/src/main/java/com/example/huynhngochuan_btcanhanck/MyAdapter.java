package com.example.huynhngochuan_btcanhanck;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends BaseAdapter {
     List<Product> listProduct;
    public MyAdapter(List<Product> list) {
        listProduct = list;
    }

    @Override
    public int getCount() {
        return listProduct.size();
    }

    @Override
    public Object getItem(int position) {
        return listProduct.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
View view;
if(convertView == null){
view = View.inflate(parent.getContext(), R.layout.item_list, null);
} else   view = convertView;
        Product product = (Product) getItem(position);
        ((TextView) view.findViewById(R.id.title)).setText(String.format("ID = %d", product.getName()));
        ((TextView) view.findViewById(R.id.title2)).setText(String.format("Tên SP : %s", product.getMota()));
return view;
    }
}
