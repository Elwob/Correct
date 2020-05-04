package com.company.database.repository;

import com.company.database.DatabaseConnector;
import com.company.database.models.Ingredient;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IngredientRepository implements Repository<Ingredient> {
    private DatabaseConnector connector;
    Ingredient ingredient=new Ingredient();

    public IngredientRepository() {
        this.connector = DatabaseConnector.getInstance();
    }


    @Override
    public Ingredient create(Ingredient entity) {
        String sql = "INSERT INTO `ingredient` (`name`, `price`) VALUES ('" + entity.getName() + "'," + entity.getPrice() + ")";

        connector.insert(sql);


        return ingredient;
    }

    @Override
    public List<Ingredient> read() {
        ArrayList<Ingredient> ingredientList = new ArrayList();
        ResultSet result = connector.fetchData("SELECT * FROM ingredient");

        if (result == null) {
            System.out.println("could not fetch Ingredient");
            return null;
        }

        try {
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                double price = result.getDouble("price");

                ingredientList.add(new Ingredient(id, name, price));
            }
        } catch (SQLException e) {
            System.out.println("error while parsing cars");
            System.out.println(e.getMessage());
        } finally {
            // Unfortunately I have to close the connection here. Preferred would have been in the
            // dbConnector.fetchData() function. But I have to use the ResultSet here to create the
            // car objects. I couldn't use the ResultSet when the connections were closed already.
            connector.closeConnection();
            return ingredientList;
        }


    }

    @Override
    public void update() {

    }

    @Override
    public void delete(int id) {
        String sql = "DELETE from Ingredient where id=" + id + "";
        connector.insert(sql);
    }
}
