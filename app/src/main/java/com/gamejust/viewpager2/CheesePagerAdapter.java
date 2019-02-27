package com.gamejust.viewpager2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CheesePagerAdapter extends RecyclerView.Adapter<CheeseViewHolder> {
    public List<String> cheeseStrings;

    public CheesePagerAdapter(List<String> strings) {
        this.cheeseStrings = strings;
    }

    @NonNull
    @Override
    public CheeseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CheeseViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CheeseViewHolder holder, int position) {
        holder.bindTo(cheeseStrings.get(position));
    }

    @Override
    public int getItemCount() {
        return cheeseStrings.size();
    }
}
