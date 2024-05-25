package com.example.addtofav.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.addtofav.models.Product;

import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ItemRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null){
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }
    private void loadProducts(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "item 1", true, "https://www.google.com/url?" +
                        "sa=i&url=https%3A%2F%2Fkappa.ph%2Fproducts%2Fsports-logo-womens-crop-top-black-2&psig=AOvVaw23YfuOL8DFnNV9I1NOW9ae&ust=1716621113851000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCLCcmpbepYYDFQAAAAAdAAAAABAE" ));
        productList.add(new Product(UUID.randomUUID().toString(), "item 2", true, "https://www.google.com/url?" +
                        "sa=i&url=https%3A%2F%2Fkappa.ph%2Fproducts%2Fsports-logo-womens-crop-top-black-2&psig=AOvVaw23YfuOL8DFnNV9I1NOW9ae&ust=1716621113851000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCLCcmpbepYYDFQAAAAAdAAAAABAE" ));


                mutableProductList.setValue(productList);
    }
}
