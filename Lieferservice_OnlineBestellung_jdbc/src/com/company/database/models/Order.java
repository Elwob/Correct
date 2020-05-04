package com.company.database.models;

public class Order {
    private int id;
    private int village_id;
    private int customer_id;

    public Order(int id, int village_id, int customer_id) {
        this.id = id;
        this.village_id = village_id;
        this.customer_id = customer_id;
    }

    public int getId() {
        return id;
    }


    public int getVillage_id() {
        return village_id;
    }

    public void setVillage_id(int village_id) {
        this.village_id = village_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Order() {
        this.id = id;
        this.village_id = village_id;
        this.customer_id = customer_id;


    }

    @Override
    public String toString() {

        return "Order{" +
                "id=" + id +
                ", village_id='" + village_id + '\'' +
                ", customer_id=" + customer_id +
                '}';
    }

}

