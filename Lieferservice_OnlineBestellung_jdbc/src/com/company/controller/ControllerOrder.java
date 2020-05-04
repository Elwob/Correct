package com.company.controller;

import com.company.database.models.Order;
import com.company.database.repository.RepositoryOrder;

import java.util.List;


public class ControllerOrder {
    Order order=new Order();
    RepositoryOrder repositoryOrder = new RepositoryOrder();
    public Order create(Order order) {
    order=    repositoryOrder.create(order);
        return order;
    }


    public List<Order> read() {
        return null;
    }


    public void update() {

    }


    public void delete(int id) {

    }
}
