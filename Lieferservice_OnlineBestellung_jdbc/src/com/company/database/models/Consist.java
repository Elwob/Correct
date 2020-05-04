package com.company.database.models;

public class Consist {
    int id;
    int order_id;
    int menue_id;

    public Consist(int id,int order_id, int menue_id) {
        this.id = id;
        this.order_id = order_id;
        this.menue_id = menue_id;
    }

    public Consist() {
        this.id = id;
        this.order_id = order_id;
        this.menue_id = menue_id;
    }

    public int getId() {
        return id;
    }


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getMenue_id() {
        return menue_id;
    }

    public void setMenue_id(int menue_id) {
        this.menue_id = menue_id;
    }
}
