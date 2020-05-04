package com.company.controller;

import com.company.database.repositories.OverviewRepository;

public class ControllerOverview {                     //is "Auswertung"
private OverviewRepository overviewRepository=new OverviewRepository();

    public ControllerOverview() {
        this.overviewRepository = overviewRepository;
    }
    public int orderNumber(){
       int orders=overviewRepository.orderNumber();
        return orders;
    }
}
