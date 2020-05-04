package com.company.view;

import com.company.controller.ControllerMenue;
import com.company.database.models.Menue;

import java.util.Scanner;

public class ConsoleMenue {
    private ControllerMenue controllerMenue = new ControllerMenue();


    Scanner myNumbertScanner = new Scanner(System.in);
    Scanner myTextScanner = new Scanner(System.in);


    public ConsoleMenue() {
        this.controllerMenue = controllerMenue;
    }

    public void ConsoleAddMenue() {

        System.out.println("Wie heisst Ihr neues Menü ?");
        String eingabeText = myTextScanner.nextLine();
        System.out.println("Wieviel kostet das neue Menü ?");
        double price = myNumbertScanner.nextDouble();
        Menue newMenue = new Menue(eingabeText, price);

        controllerMenue.create(newMenue);


    }

    public void consoleDeleteMenue() {
        controllerMenue.read();
        System.out.println("Bitte geben Sie die ID Nummer des zu löschenden Menüs ein");
        int id = myNumbertScanner.nextInt();
        controllerMenue.delete(id);
    }

    public void read() {
        controllerMenue.read();
    }
}
