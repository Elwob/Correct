package com.company.database.repository;

import com.company.database.models.Order;

import java.util.List;

public class RepositoryOrder implements Repository<Order>{
    private Order order;

    @Override
    public Order create(Order entity) {

        return order;
    }

    @Override
    public List<Order> read() {
        return null;
    }

    @Override
    public void update() {

    }

    @Override
    public void delete(int id) {

    }
}
