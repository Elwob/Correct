package com.company.view;


import com.company.controller.ControllerDelivery;
import com.company.database.models.Deliver;

import java.util.Scanner;

public class ConsoleDeliver {
    private ControllerDelivery controllerDelivery = new ControllerDelivery();


    Scanner myNumbertScanner = new Scanner(System.in);
    Scanner myTextScanner = new Scanner(System.in);


    public ConsoleDeliver() {
        this.controllerDelivery = controllerDelivery;
    }

    public void ConsoleAdd() {

        System.out.println("Wie heisst Ihr neuer Lieferort ?");
        String eingabeText = myTextScanner.nextLine();
        System.out.println("Wieviel kostet die Zustellung beim neuen Lieferort ?");
        double price = myNumbertScanner.nextDouble();
        Deliver deliver = new Deliver(eingabeText, price);

        controllerDelivery.create(deliver);


    }

    public void consoleDelete() {
        controllerDelivery.read();
        System.out.println("Bitte geben Sie die ID Nummer des zu löschenden Ortes ein :2");
        int id = myNumbertScanner.nextInt();
        controllerDelivery.delete(id);
    }

    public void read() {
        controllerDelivery.read();
    }
}
