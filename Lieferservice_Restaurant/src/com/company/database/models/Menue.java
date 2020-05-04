package com.company.database.models;

public class Menue {
    private int id;
    private String name;
    private double price;

    public Menue(String menue_name, double price) {
        this.name = menue_name;
        this.price = price;
    }

    public Menue(int id, String menue_name, double price) {
        this.id = id;
        this.name = menue_name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenue_name() {
        return name;
    }

    public void setMenue_name(String menue_name) {
        this.name = menue_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
