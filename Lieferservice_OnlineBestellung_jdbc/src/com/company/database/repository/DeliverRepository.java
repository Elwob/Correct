package com.company.database.repository;

import com.company.database.DatabaseConnector;
import com.company.database.models.Deliver;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeliverRepository implements Repository<Deliver> {
    private DatabaseConnector connector;


    public DeliverRepository() {
        this.connector = DatabaseConnector.getInstance();
    }


    @Override
    public Deliver create(Deliver entity) {
        String sql = "INSERT INTO `Deliver` (`village`, `price`) VALUES ('" + entity.getVillage() + "'," + entity.getPrice() + ")";

        connector.insert(sql);

return entity;
    }

    @Override
    public List<Deliver> read() {
        ArrayList<Deliver> deliverList = new ArrayList<>();
        ResultSet result = connector.fetchData("SELECT * FROM deliver");

        if (result == null) {
            System.out.println("could not fetch Deliver");
            return null;
        }

        try {
            while (result.next()) {
                int id = result.getInt("id");
                String village = result.getString("village");
                double price = result.getDouble("price");

                deliverList.add(new Deliver(id, village, price));
            }
        } catch (SQLException e) {
            System.out.println("error while parsing Deliver");
            System.out.println(e.getMessage());
        } finally {
            // Unfortunately I have to close the connection here. Preferred would have been in the
            // dbConnector.fetchData() function. But I have to use the ResultSet here to create the
            // car objects. I couldn't use the ResultSet when the connections were closed already.
            connector.closeConnection();
            return deliverList;
        }


    }

    @Override
    public void update() {

    }

    @Override
    public void delete(int id) {
        String sql = "DELETE from Deliver where id=" + id + "";
        connector.insert(sql);
    }
}


