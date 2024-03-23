package com.example.listnamajava;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    ImageView viewImage;
    TextView viewName,viewNim;

    public ViewHolder(View itemView) {
        super(itemView);
        viewImage = itemView.findViewById(R.id.item_image);
        viewName = itemView.findViewById(R.id.item_name);
        viewNim = itemView.findViewById(R.id.item_nim);
    }
}