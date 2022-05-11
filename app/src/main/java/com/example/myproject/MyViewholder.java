package com.example.myproject;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewholder extends RecyclerView.ViewHolder{

    public TextView name;
    public TextView location;
    public TextView category;
    public TextView auxdata;

    public MyViewholder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        location = itemView.findViewById(R.id.location);
        category = itemView.findViewById(R.id.category);
        auxdata = itemView.findViewById(R.id.auxdata);
    }

}
