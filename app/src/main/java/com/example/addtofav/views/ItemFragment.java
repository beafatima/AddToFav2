package com.example.addtofav.views;

import static android.content.ContentValues.TAG;

import static com.example.addtofav.BR.itemViewModel;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.addtofav.R;
import com.example.addtofav.adapters.ItemListAdapter;
import com.example.addtofav.databinding.FragmentItemBinding;
import com.example.addtofav.models.Product;
import com.example.addtofav.viewmodels.ItemViewModel;

import java.util.List;

public class ItemFragment extends Fragment implements ItemListAdapter.ItemInterface {

    FragmentItemBinding fragmentItemBinding;
    private ItemListAdapter itemListAdapter;

    public ItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentItemBinding = FragmentItemBinding.inflate(inflater, container, false);
        return fragmentItemBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        itemListAdapter = new ItemListAdapter();
        fragmentItemBinding.itemRecyclerView.setAdapter(itemListAdapter);
        fragmentItemBinding.itemRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL));
        fragmentItemBinding.itemRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), DividerItemDecoration.HORIZONTAL));

        ItemViewModel itemViewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);
        itemViewModel.getProducts().observe(getViewLifecycleOwner(), new Observer<List<Product>>(){
            @Override
            public void onChanged(List<Product> products){
                itemListAdapter.submitList(products);

            }
        });
    }

    @Override
    public void addItem(Product product) {
        Log.d(TAG, "onItemClick: " + product.toString());
        Log.d(TAG, "addItem: " + product.getName() + itemViewModel);

    }

    @Override
    public void onItemClick(Product product) {


    }
}