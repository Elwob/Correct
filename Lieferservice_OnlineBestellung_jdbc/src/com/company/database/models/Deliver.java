package com.company.database.models;

public class Deliver {
    int id;
    String village;
    double price;

    public Deliver(String village, double price) {
        this.village = village;
        this.price = price;
    }

    public Deliver(int id, String village, double price) {
        this.id = id;
        this.village = village;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Deliver {" +
                "id=" + id +
                ", name='" + village + '\'' +
                ", price=" + price +
                '}';
    }
}
