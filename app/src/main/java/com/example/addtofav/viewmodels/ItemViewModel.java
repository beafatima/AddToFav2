package com.example.addtofav.viewmodels;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.addtofav.models.FavItem;
import com.example.addtofav.models.Product;
import com.example.addtofav.repositories.FavRepo;
import com.example.addtofav.repositories.ItemRepo;

import java.util.List;

public class ItemViewModel extends ViewModel {

    ItemRepo itemRepo = new ItemRepo();
    FavRepo favRepo = new FavRepo();

    MutableLiveData<Product> mutableProduct = new MutableLiveData<>();

    public LiveData<List<Product>> getProducts(){
        return itemRepo.getProducts();

    }
    public void setProduct(Product product){
        mutableProduct.setValue(product);
    }
    public LiveData<Product> getProduct(){
        return mutableProduct;
    }
    public LiveData<List<FavItem>> getFav(){
        return favRepo.getFav();
    }

    public boolean addItemToFav(Product product){
        return favRepo.addItemToFav(product);
    }
}
