package com.company.controller;


import com.company.database.models.Customer;
import com.company.database.repository.RepositoryCustomer;

import java.util.List;

public class ControllerCustomer {
    private RepositoryCustomer repositoryCustomer=new RepositoryCustomer();
    private  Customer customer=new Customer();
private List<Customer> customerList;

    public ControllerCustomer() {
        this.repositoryCustomer = repositoryCustomer;
    }

    public Customer create(Customer entity) {
        repositoryCustomer.create(entity);
        return entity;
    }


    public Customer read(int id) {
customerList=repositoryCustomer.read();
        customerList   =  repositoryCustomer.read();
      for (Customer customer:customerList){
          if (customer.getId()==id){
           this.customer=customer;
          }


        }

      return customer;
    }


    public void update() {

    }


    public void delete(int id) {

    }
}
