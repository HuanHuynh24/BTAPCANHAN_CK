package com.example.huynhngochuan_btcanhanck;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class BtapFragment extends Fragment {

ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_btap, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = view.findViewById(R.id.listproduct);
        List<Product> listProduct;
        listProduct = new ArrayList<>();
        listProduct.add(new Product("1", "Iphone 6"));
        listProduct.add(new Product("2", "Iphone 7"));
        listProduct.add(new Product("3", "Sony Abc"));
        listProduct.add(new Product("4", "Samsung XYZ"));
        listProduct.add(new Product("5", "SP 5"));
        listProduct.add(new Product("6", "SP 6"));
        listProduct.add(new Product("7", "SP 7"));
        listProduct.add(new Product("8", "SP 8"));
        MyAdapter myAdapter = new MyAdapter(listProduct);
        listView.setAdapter(myAdapter);
    }
}