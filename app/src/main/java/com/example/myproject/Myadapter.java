package com.example.myproject;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Myadapter extends RecyclerView.Adapter<MyViewholder> {

    private List<Svamp> svamps = new ArrayList();

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewholder((LayoutInflater.from(parent.getContext()).inflate(R.layout.itemholder, parent, false)));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        Svamp svamp = svamps.get(position);

        holder.name.setText(svamp.getName());
        holder.location.setText(svamp.getLocation());
        holder.category.setText(svamp.getCategory());
        holder.auxdata.setText(svamp.getAuxdata());
    }


    @Override
    public int getItemCount() {
        return svamps.size();
    }

    public void setSvamps(List<Svamp> svamps) {
        this.svamps = svamps;
    }
}
