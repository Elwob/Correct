package com.company.database.repositories;

import com.company.database.DatabaseConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OverviewRepository {
    private DatabaseConnector connector;


    public OverviewRepository() {
        this.connector = DatabaseConnector.getInstance();
    }

    public int orderNumber() {
        int orders = 0;
        ResultSet result = connector.fetchData("SELECT COUNT('id')  FROM orders");

        if (result == null) {
            System.out.println("could not fetch orders");
        }

        try {
            while (result.next()) {
                orders = result.getInt("COUNT('id')");


            }
        } catch (SQLException e) {
            System.out.println("error while parsing cars");
            System.out.println(e.getMessage());
        } finally {
            // Unfortunately I have to close the connection here. Preferred would have been in the
            // dbConnector.fetchData() function. But I have to use the ResultSet here to create the
            // car objects. I couldn't use the ResultSet when the connections were closed already.
            connector.closeConnection();
            return orders;
        }

    }

    public void orderCountPerCustomer(){
 //    ArrayList<>
        ResultSet result = connector.fetchData("SELECT COUNT('id')  FROM orders");

        if (result == null) {
            System.out.println("could not fetch orders");
        }

        try {
            while (result.next()) {
              //  orders = result.getInt("COUNT('id')");


            }
        } catch (SQLException e) {
            System.out.println("error while parsing cars");
            System.out.println(e.getMessage());
        } finally {
            // Unfortunately I have to close the connection here. Preferred would have been in the
            // dbConnector.fetchData() function. But I have to use the ResultSet here to create the
            // car objects. I couldn't use the ResultSet when the connections were closed already.
            connector.closeConnection();
   //         return orders;
        }


    }

}
