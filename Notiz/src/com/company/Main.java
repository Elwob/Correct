package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // Task 1:
        //Es ist sinnvoll neben den gelieferten Unterlagen auch ein persönliches Notizbuch zu führen.
        // Für die Verwaltung dieser Notizen erstellen wir uns ein kleines Programm.
        // Erstelle dafür eine neue Mysql Datenbank mit einer Tabelle welche sinnvolle Felder für eine Notiz besitzt.
        // Versuche über phpmyadmin Einträge hinzuzufügen und dann mit einer Java Anwendung wieder auszugeben.
        //
        //Task 2:
        //Erweitere das Programm, damit auch neue Notizen eingegeben werden können.
        Connection connection = null;
        Statement statement = null;
        String url = "jdbc:mysql://localhost:3306/sql_notiz?user=root";
        //String url=   "jdbc:mysql://localhost:3306/dcv_demo?user=root&allowMultiQueries=true" Florians url
        String sql = "Select * From note";
        String sqlNewEntry = " INSERT INTO note  VALUES ('wierteNotiz', 'ich bin die gierte Notiz', '2020-04-12')";       //String Befehl für Sql eintrag


        try {
            connection = DriverManager.getConnection(url);
            System.out.println("connected to DB");
            statement = connection.createStatement();
            ResultSet rt = statement.executeQuery(sql);  // Abfrage sql von Datenbank ? warum ausgegraut und nicht zweimal möglich
            statement = connection.createStatement();
            statement.execute(sqlNewEntry);    //neuer eintrag in die Datenbank
            statement = connection.createStatement();
            rt = statement.executeQuery(sql);  // Abfrage sql von Datenbank

            while (rt.next()) {
                String note_name = rt.getString("note_name");       //groß und kleischreibung wird Ignoriert
                String note = rt.getNString("note");
                String date = rt.getDate("date").toString();
                System.out.println(note_name + " " + note + " " + date);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (statement != null) {

            }
        }


    }
}
