package com.company.view;

import com.company.controller.ControllerCustomer;
import com.company.database.models.Customer;

import static com.company.view.Console.myTextScanner;

public class ConsoleCustomer {
    private Customer customer = new Customer();
    ControllerCustomer controllerCustomer = new ControllerCustomer();
    int id = 0;

    public ConsoleCustomer() {
        this.controllerCustomer = controllerCustomer;

    }

    public Customer addCustomer() {
        System.out.println("Bitte geben Sie Ihren Namen ein :");
        String name = myTextScanner.nextLine();
        System.out.println("Bitte geben Sie Ihre Adresse ein :");
        String address = myTextScanner.nextLine();
        customer.setName(name);
        customer.setAddress(address);
        customer = controllerCustomer.create(customer);
        System.out.println(customer);
        return customer;
    }

    public void getCustomer() {

       customer= controllerCustomer.read(id);
        System.out.println("Guten Tag "+customer.getName() +" aus "+customer+" mit der id :"+customer.getId());
    }
}
