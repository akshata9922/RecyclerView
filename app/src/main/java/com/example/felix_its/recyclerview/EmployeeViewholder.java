package com.example.felix_its.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class EmployeeViewholder extends RecyclerView.ViewHolder {
    ImageView img1;
    TextView txtName,txtAddress,txtphone;
    public EmployeeViewholder(@NonNull View itemView) {
        super(itemView);
        img1=itemView.findViewById(R.id.img1);
        txtName=itemView.findViewById(R.id.txtName);
        txtAddress=itemView.findViewById(R.id.txtAddress);
        txtphone=itemView.findViewById(R.id.txtphone);


    }
}
