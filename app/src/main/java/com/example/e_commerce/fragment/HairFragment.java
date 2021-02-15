package com.example.e_commerce.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e_commerce.R;
import com.example.e_commerce.adapter.ProductAdapter;
import com.example.e_commerce.adapter.ProductCategoryAdapter;
import com.example.e_commerce.modle.ProductCategory;
import com.example.e_commerce.modle.Products;


import java.util.ArrayList;
import java.util.List;


public class HairFragment extends Fragment {
    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productCatRecycler,proItemRecycler;
    ProductAdapter productAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_hair, container, false);
        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1,"Popular"));
        productCategoryList.add(new ProductCategory(2,"All Body Products"));
        productCategoryList.add(new ProductCategory(3,"Skin Care"));
        productCategoryList.add(new ProductCategory(4,"Hair"));

        setProductCategoryAdapter(productCategoryList,view);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1,"abc","250ml","$250",R.drawable.prod));
        productsList.add(new Products(2,"dssssssef","520ml","$521",R.drawable.prod));
        productsList.add(new Products(1,"abddc","250ml","$250",R.drawable.prod));
        productsList.add(new Products(2,"dfffef","520ml","$521",R.drawable.prod));
        productsList.add(new Products(1,"abc","250ml","$250",R.drawable.prod));
        productsList.add(new Products(2,"dssssssef","520ml","$521",R.drawable.prod));
        productsList.add(new Products(1,"abddc","250ml","$250",R.drawable.prod));
        productsList.add(new Products(2,"dfffef","520ml","$521",R.drawable.prod));
        productsList.add(new Products(1,"abc","250ml","$250",R.drawable.prod));
        productsList.add(new Products(2,"dssssssef","520ml","$521",R.drawable.prod));
        productsList.add(new Products(1,"abddc","250ml","$250",R.drawable.prod));
        productsList.add(new Products(2,"dfffef","520ml","$521",R.drawable.prod));

        setProItemAdapter(productsList,view);

        return  view;
    }
    public void setProductCategoryAdapter(List<ProductCategory> productCategoryList ,View view){
        productCatRecycler = view.findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(getContext(),productCategoryList);
        productCatRecycler.setAdapter(productCategoryAdapter);
    }

    private void setProItemAdapter(List<Products> productsList,View view){
        proItemRecycler = view.findViewById(R.id.product_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        proItemRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(getContext(),productsList);
        proItemRecycler.setAdapter(productAdapter);
    }
}