package com.example.felix_its.recyclerview;

public class Employee {
    private int img1;
    private String name;
    private String address;
    private String phone;

    public Employee(int img1, String name, String address, String phone) {
        this.img1 = img1;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
