package com.company.database.repository;

import com.company.database.DatabaseConnector;
import com.company.database.models.Consist;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositoryConsist implements Repository<Consist> {
    private DatabaseConnector connector;


    public RepositoryConsist() {
        this.connector = DatabaseConnector.getInstance();
    }


    @Override
    public Consist create(Consist entity) {
        String sql = "INSERT INTO `consist` (`name`, `price`) VALUES ('" + entity.getMenue_id() + "'," + entity.getOrder_id() + ")";
        connector.insert(sql);
return entity;
    }

    @Override
    public List read() {
        ArrayList<Consist> consistList = new ArrayList();
        ResultSet result = connector.fetchData("SELECT * FROM menue");

        if (result == null) {
            System.out.println("could not fetch menue");
            return null;
        }

        try {
            while (result.next()) {
                int id = result.getInt("id");
              int order_id = result.getInt("order_id");
           int menue_id = result.getInt("menue_id");


                consistList.add(new Consist(id,order_id,menue_id));
            }
        } catch (SQLException e) {
            System.out.println("error while parsing cars");
            System.out.println(e.getMessage());
        } finally {
            // Unfortunately I have to close the connection here. Preferred would have been in the
            // dbConnector.fetchData() function. But I have to use the ResultSet here to create the
            // car objects. I couldn't use the ResultSet when the connections were closed already.
            connector.closeConnection();
            return consistList;
        }


    }
    @Override
    public void update() {

    }

    @Override
    public void delete(int id) {

    }


}
