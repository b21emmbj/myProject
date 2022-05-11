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

    }


    @Override
    public int getItemCount() {
        return 0;
    }
}
