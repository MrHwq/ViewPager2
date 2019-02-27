package com.gamejust.viewpager2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CheeseViewHolder extends RecyclerView.ViewHolder {
    private TextView nameView;

    public CheeseViewHolder(@NonNull View itemView) {
        super(itemView);
        nameView = itemView.findViewById(R.id.item);
    }

    void bindTo(String item) {
        nameView.setText(item);
    }
}
