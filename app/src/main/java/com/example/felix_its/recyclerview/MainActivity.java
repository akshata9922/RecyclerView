package com.example.felix_its.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvemployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvemployee=findViewById(R.id.rvemployee);

        rvemployee.setLayoutManager(new LinearLayoutManager(this));
        List<Employee>employeeList=new ArrayList<>();

        employeeList.add(new Employee(R.drawable.chinese,"Akshata","Pune","9922878030"));
        employeeList.add(new Employee(R.drawable.drinks,"Akshata","Pune","9922878030"));
        employeeList.add(new Employee(R.drawable.dessert,"Akshata","Pune","9922878030"));
        employeeList.add(new Employee(R.drawable.app,"Akshata","Pune","9922878030"));
        employeeList.add(new Employee(R.drawable.snack,"Akshata","Pune","9922878030"));
        employeeList.add(new Employee(R.drawable.chinese,"Akshata","Pune","9922878030"));
        employeeList.add(new Employee(R.drawable.chinese,"Akshata","Pune","9922878030"));
        employeeList.add(new Employee(R.drawable.chinese,"Akshata","Pune","9922878030"));
        employeeList.add(new Employee(R.drawable.chinese,"Akshata","Pune","9922878030"));
        employeeList.add(new Employee(R.drawable.chinese,"Akshata","Pune","9922878030"));


        EmployeeAdapter employeeAdapter =new EmployeeAdapter(employeeList);
        rvemployee.setAdapter(employeeAdapter);
    }
}
