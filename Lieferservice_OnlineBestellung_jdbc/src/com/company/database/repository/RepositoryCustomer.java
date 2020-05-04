package com.company.database.repository;

import com.company.database.DatabaseConnector;
import com.company.database.models.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositoryCustomer implements Repository<Customer> {
    private DatabaseConnector connector;
    private Customer customer = new Customer();

    public RepositoryCustomer() {
        this.connector = DatabaseConnector.getInstance();
    }


    @Override
    public Customer create(Customer entity) {
        int id=0;

            ResultSet result = connector.fetchData(" SELECT *FROM customer WHERE name = '"+entity.getName()+"'   AND address ='"+entity.getAddress()+"'");  //Prüfung
        try {
            while (result.next()) {
                id = result.getInt("id");

            }
            } catch (SQLException e) {
                System.out.println("error while parsing Customer");
                System.out.println(e.getMessage());
            }


            if (id == 0) {

                String sql = "INSERT INTO `customer` (`name`, `address`) VALUES ('" + entity.getName() + "','" + entity.getAddress() + "')";
                connector.insert(sql);


                result = connector.fetchData(" SELECT *FROM customer WHERE name = '"+entity.getName()+"'   AND address ='"+entity.getAddress()+"'");

            }

            try {
                while (result.next()) {
                   id = result.getInt(" SELECT * FROM customer WHERE name = " + entity.getName() + " AND address =" + entity.getAddress() + "");
                    String customer_name = result.getString("name");
                    String address = result.getString("address");

                    customer.setId(id);
                    customer.setName(customer_name);
                    customer.setAddress(address);

                }
            } catch (SQLException e) {
                System.out.println("error while parsing Customer");
                System.out.println(e.getMessage());
            } finally {
                // Unfortunately I have to close the connection here. Preferred would have been in the
                // dbConnector.fetchData() function. But I have to use the ResultSet here to create the
                // car objects. I couldn't use the ResultSet when the connections were closed already.
                connector.closeConnection();
                return customer;


            }
        }



    @Override
    public List<Customer> read() {
      ArrayList<Customer> customerList = new ArrayList<>();

        ResultSet result = connector.fetchData(" SELECT * FROM customer ");

        if (result == null) {
            System.out.println("Keine Daten oder Fehler beim auslesen");
        }

        try {
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                String address = result.getString("address");

                customerList.add(new Customer(id, name, address));


            }
        } catch (SQLException e) {
            System.out.println("error while parsing Customer");
            System.out.println(e.getMessage());
        } finally {
            // Unfortunately I have to close the connection here. Preferred would have been in the
            // dbConnector.fetchData() function. But I have to use the ResultSet here to create the
            // car objects. I couldn't use the ResultSet when the connections were closed already.
            connector.closeConnection();
            return customerList;
        }


    }

    @Override
    public void update() {

    }

    @Override
    public void delete(int id) {

    }
}
