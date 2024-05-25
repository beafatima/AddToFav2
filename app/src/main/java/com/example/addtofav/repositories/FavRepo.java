package com.example.addtofav.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.addtofav.models.FavItem;
import com.example.addtofav.models.Product;

import java.util.ArrayList;
import java.util.List;

public class FavRepo {

    private MutableLiveData<List<FavItem>> mutableLiveData = new MutableLiveData<>();

    public LiveData<List<FavItem>> getFav(){
        if (mutableLiveData.getValue() == null){
            initFav();
        }
        return mutableLiveData;
    }
    public void initFav(){
        mutableLiveData.setValue(new ArrayList<FavItem>());
    }
    public boolean addItemToFav(Product product){
        if(mutableLiveData.getValue() == null){
            initFav();
        }
        List<FavItem> favItemList = new ArrayList<>(mutableLiveData.getValue());

        FavItem favItem = new FavItem(product, 1);
        favItemList.add(favItem);
        mutableLiveData.setValue(favItemList);
        return true;
    }

}
