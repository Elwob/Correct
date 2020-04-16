package com.company;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Wir sind ein Kinobetreiber der 5 Säle am Standort Meiningen betreibt.
        //Aktuell sind 10 verschieden Filme bei uns im Angebot.
        // Jeder dieser Filme hat einen oder mehrere Vorführungen am Tag.
        // Film A läuft nicht immer im Saal 1, sondern die Filme können in verschiedenen Sälen abgespielt werden.
        //Jeder Saal hat eine Kapazität von 40 Besuchern.
        //Wir benötigen nun ein Programm das es dem Kunden erlaubt Tickets zu bestellen (mit Angabe der Anzahl).
        // Das heißt je Vorführung müssen dann auch die freien Plätze vermindert werden.
        // Der Saal darf nicht überbucht werden. Die Tickets sollte man an Hand einer Bestellnummer -
        // die man beim Kauf erhält - wieder stornieren können.

        int reservirungShowNr = 0;
        int seats = 0;
        int reserved = 0;
        int[] bookingShowSeats = new int[50];
        Connection connection = null;
        Statement statement = null;
        int idcustomer = 0;
        int idcustomerDelete = 0;
        String url = "jdbc:mysql://localhost:3306/sql_jdbc_kinoticket?user=root";
        //String url=   "jdbc:mysql://localhost:3306/dcv_demo?user=root&allowMultiQueries=true" Florians url

        Scanner myNewScanner = new Scanner(System.in);
        Scanner mySecoundNewScanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihren Namen ein : ");
        String name = myNewScanner.nextLine();

        System.out.println("Wollen Sie Karten Reservieren oder Stornieren ? Drücke 1 oder 2 für Stornieren :");
        int auswahl = mySecoundNewScanner.nextInt();
        if (auswahl == 1) {
            String sqlNewEntry = " INSERT INTO customer VALUES  (" + null + " ,'" + name + "');";

            try {
                connection = DriverManager.getConnection(url);
                statement = connection.createStatement();
                statement.execute(sqlNewEntry);    //new entry in DB Customer
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("ERROR Martin");
            }

            try {
                connection = DriverManager.getConnection(url);
                statement = connection.createStatement();
                String sql = "SELECT MAX(`id`)  FROM `customer`"; //Wähle den größten Wert der Spalte id aus der Tabelle Customer
                //SELECT MAX(`id`) as id FROM `customer` in diesem fall geht getInt mit id
                ResultSet rt = statement.executeQuery(sql);  // DB Anfrage
                rt.next(); //! Achtung bei einer DB Abfrage muss selbst bei einem ergebniss das Resultset .next Aufgerufen werden!!
                idcustomer = rt.getInt("MAX(`id`)"); //entweder So oder nur "id" aber dann muss der sql String anders lauten !!
                System.out.println("Ihre Id lautet : " + idcustomer);

                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            try {
                connection = DriverManager.getConnection(url);
                statement = connection.createStatement();

                statement = connection.createStatement();
                ResultSet st = null;
                String sqlshow = "SELECT * FROM `show`";
                st = statement.executeQuery(sqlshow);  // Abfrage sql von Datenbank

                while (st.next()) {
                    String id_show = st.getString("id_show");       //groß und kleischreibung wird Ignoriert
                    int id_hall_number = st.getInt("id_hall_number");
                    int id_film = st.getInt("id_film");
                    String date = st.getString("date");
                    String time = st.getString("time");
                    System.out.println(id_show + " vorführung |" + id_hall_number + " Saal | " + id_film + "  Film Nr " + " am : " + date + " um: " + time);


                }
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            System.out.println("Für welche vorführung möchten Sie Reservieren ? Nr. vorführung eingeben :");
            reservirungShowNr = mySecoundNewScanner.nextInt();
            try {
                connection = DriverManager.getConnection(url);
                statement = connection.createStatement();
                ResultSet st = null;
                String sqlbooking = "SELECT SUM(`seats_reserved`) as seats_reserved FROM `booking` WHERE `id_show` = " + reservirungShowNr + "";
                st = statement.executeQuery(sqlbooking);  // Abfrage sql von Datenbank
                st.next();
                reserved = st.getInt("seats_reserved");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            if (reserved == 40) {
                System.out.println("Diese Vorstellung ist leider ausgebucht! Sie können nur noch 0 Tickets Buchen");
            }


            System.out.println("Wieviele Tickets möchten Sie reservieren ?");
            seats = mySecoundNewScanner.nextInt();
            if (seats + reserved > 40) {
                System.out.println("Leider nur noch " + (40 - reserved) + " Tickets übrig ");
                System.out.println("Wieviele Tickets möchten Sie reservieren ?");
                seats = mySecoundNewScanner.nextInt();
            }

            bookingShowSeats[reservirungShowNr] = seats;

            String sqlNewEntryBooking = " INSERT INTO booking VALUES  (" + idcustomer + " ," + reservirungShowNr + ", " + bookingShowSeats[reservirungShowNr] + ")";
            try {
                connection = DriverManager.getConnection(url);
                statement = connection.createStatement();
                statement.execute(sqlNewEntryBooking);    //neuer eintrag in die Datenbank
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();


            }
        } else if (auswahl == 2) {
            System.out.println("Bitte geben Sie Ihre Id ein:");
            idcustomerDelete = mySecoundNewScanner.nextInt();
            try {
                connection = DriverManager.getConnection(url);
                statement = connection.createStatement();
                ResultSet st = null;
                String sqlshow = "SELECT * FROM `booking` WHERE id_customer = " + idcustomerDelete + "";
                st = statement.executeQuery(sqlshow);  // Abfrage sql von Datenbank

                while (st.next()) {
                    String id_show = st.getString("id_show");       //groß und kleischreibung wird Ignoriert
                    int seatsReserved = st.getInt("seats_reserved");

                    System.out.println(id_show + " vorführung | " + seatsReserved + "  Reservierte Tickets " + " " + idcustomerDelete);


                }


                String sqlNewEntryBooking = " DELETE from booking Where id_customer=" + idcustomerDelete + "";   //booking eintrag
                try {
                    connection = DriverManager.getConnection(url);
                    statement = connection.createStatement();
                    statement.execute(sqlNewEntryBooking);    //neuer eintrag in die Datenbank
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();

                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("");
            }


        }


    }
}
