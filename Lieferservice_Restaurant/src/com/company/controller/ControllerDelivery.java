package com.company.controller;

import com.company.database.models.Deliver;
import com.company.database.repositories.DeliverRepository;

public class ControllerDelivery {
    DeliverRepository deliverRepository = new DeliverRepository();

    public ControllerDelivery() {
        this.deliverRepository = deliverRepository;
    }

    public void create(Deliver entity) {
        this.deliverRepository.create(entity);
        System.out.println(this.deliverRepository.read());
    }

    public void read() {
        this.deliverRepository.read();
    }

    public void delete(int id) {
        this.deliverRepository.delete(id);
        System.out.println(this.deliverRepository.read());
    }
}

