package com.example.huynhngochuan_btcanhanck;

public class Product {
    private String name, mota;

    public Product() {
    }

    public Product(String name, String mota) {
        this.name = name;
        this.mota = mota;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
