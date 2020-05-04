package com.company.controller;

import com.company.database.models.Consist;
import com.company.database.models.Order;
import com.company.database.repository.RepositoryConsist;

import java.util.List;

public class ControllerConsist {
   private RepositoryConsist repositoryConsist;

    public Consist create(Consist entity) {
repositoryConsist.create(entity);
        return entity;
    }


    public List<Order> read() {
        return null;
    }


    public void update() {

    }


    public void delete(int id) {

    }
}
