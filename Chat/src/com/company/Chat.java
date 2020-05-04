package com.company;

import java.sql.*;

public class Chat {

    int myLastEntry = 0;
    int lastEntry = 0;


    public void sendMessage(String url, String message) {
        String sql = "Select MAX(id) as id From chat";
        String sqlNewEntry = " INSERT INTO chat  VALUES (null,'" + message + "', '2020-04-12')";       //String Befehl für Sql eintrag
        Connection connection = null;
        Statement statement = null;


        try {
            connection = DriverManager.getConnection(url);
            System.out.println("connected to DB");
            statement = connection.createStatement();
            statement.execute(sqlNewEntry);    //neuer eintrag in die Datenbank
            statement = connection.createStatement();
            ResultSet rt = statement.executeQuery(sql);  // Abfrage sql von Datenbank
            rt.next();
            myLastEntry = rt.getInt("id");


        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }

    }

    public void getMessages(String url) {
        String sql = null;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            ResultSet rt = null;  // Abfrage sql von Datenbank
            String timer = "SELECT max(ID) FROM chat";
            rt = statement.executeQuery(timer);  // Abfrage sql von Datenbank
            rt.next();
            lastEntry = rt.getInt("max(id)");
            if (lastEntry > myLastEntry) {
                sql = "Select * From chat where id >" + myLastEntry + "";
                rt = statement.executeQuery(sql);  // Abfrage sql von Datenbank

                while (rt.next()) {

                    String note = rt.getNString("note");
                    String date = rt.getDate("date").toString();
                    System.out.println(" " + note + " " + date);
                }
                myLastEntry = lastEntry;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        } finally {

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }
}