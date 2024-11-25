package com.example.huynhngochuan_btcanhanck;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private final List<Product> listProduct;

    // Constructor to initialize the product list
    public MyAdapter(List<Product> list) {
        this.listProduct = list;
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
        return position; // Use position as the item ID
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        // Inflate a new view if convertView is null; otherwise, reuse the existing one
        if (convertView == null) {
            view = View.inflate(parent.getContext(), R.layout.item_list, null);
        } else {
            view = convertView;
        }

        // Get the current Product item
        Product product = (Product) getItem(position);

        // Populate the TextViews with the product data
        TextView titleView = view.findViewById(R.id.title);
        TextView descriptionView = view.findViewById(R.id.title2);

        // Assuming product.getName() returns a string, adjust placeholders accordingly
        titleView.setText(String.format("ID: %s", product.getName()));
        descriptionView.setText(String.format("Tên SP: %s", product.getMota()));

        return view;
    }
}
