package com.example.addtofav.adapters;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.addtofav.databinding.ItemRowBinding;
import com.example.addtofav.models.Product;

public class ItemListAdapter extends ListAdapter<Product, ItemListAdapter.ItemViewHolder> {

    public ItemListAdapter() {
        super(Product.itemCallback);
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemRowBinding itemRowBinding = ItemRowBinding.inflate(layoutInflater, parent, false);
        return new ItemViewHolder(itemRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Product product = getItem(position);
        holder.itemRowBinding.setProduct(product);

    }

    class ItemViewHolder extends RecyclerView.ViewHolder {

        ItemRowBinding itemRowBinding;
        public ItemViewHolder(ItemRowBinding binding) {
            super(binding.getRoot());
            this.itemRowBinding = binding;
        }

        }
    public interface ItemInterface {
        void addItem(Product product);
        void onItemClick(Product product);
    }

}
