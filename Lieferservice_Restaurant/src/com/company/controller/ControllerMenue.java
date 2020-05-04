package com.company.controller;

import com.company.database.models.Menue;
import com.company.database.repositories.MenueRepository;

public class ControllerMenue {
    private MenueRepository menueRepository;

    public ControllerMenue() {
        this.menueRepository = new MenueRepository();
    }

    public void create(Menue entity) {

        this.menueRepository.create(entity);
        System.out.println(this.menueRepository.read());

    }

    public void read() {
        this.menueRepository.read();
        System.out.println(this.menueRepository.read());
    }

    public void delete(int id) {

        menueRepository.delete(id);
        System.out.println(this.menueRepository.read());
    }
}
