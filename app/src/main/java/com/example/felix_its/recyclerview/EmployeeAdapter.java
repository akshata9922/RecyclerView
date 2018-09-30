package com.example.felix_its.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeViewholder> {


    private List<Employee>employeeList;
//constructor by which we are passing data
    public  EmployeeAdapter(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @NonNull
    @Override

    public EmployeeViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_employee_list,null);
        return new EmployeeViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewholder  holder, int position) {
        Employee employee=employeeList.get(position);
        holder.img1.setImageResource(employee.getImg1());
        holder.txtName.setText(employee.getName());
        holder.txtAddress.setText(employee.getAddress());
        holder.txtphone.setText(employee.getPhone());

    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }
}
