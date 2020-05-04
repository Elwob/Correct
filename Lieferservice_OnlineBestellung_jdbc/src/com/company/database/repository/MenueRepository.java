package com.company.database.repository;

import com.company.database.DatabaseConnector;
import com.company.database.models.Menue;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MenueRepository implements Repository<Menue> {
    private DatabaseConnector connector;
    private Menue menue=new Menue();


    public MenueRepository() {
        this.connector = DatabaseConnector.getInstance();
    }


    public Menue create(Menue entity) {
        String sql = "INSERT INTO `menue` (`name`, `price`) VALUES ('" + entity.getMenue_name() + "'," + entity.getPrice() + ")";
        connector.insert(sql);
return menue;
    }


    public List read() {
        ArrayList<Menue> menueList = new ArrayList();
        ResultSet result = connector.fetchData("SELECT * FROM menue");

        if (result == null) {
            System.out.println("could not fetch menue");
            return null;
        }
        try {
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                double price = result.getDouble("price");

                menueList.add(new Menue(id, name, price));
            }
        } catch (SQLException e) {
            System.out.println("error while parsing Menue");
            System.out.println(e.getMessage());
        } finally {
            // Unfortunately I have to close the connection here. Preferred would have been in the
            // dbConnector.fetchData() function. But I have to use the ResultSet here to create the
            // car objects. I couldn't use the ResultSet when the connections were closed already.
            connector.closeConnection();
            return menueList;
        }


    }

    public void update() {

    }


    public void delete(int id) {
        String sql = "DELETE from menue where id=" + id + "";
        connector.insert(sql);
    }
}
