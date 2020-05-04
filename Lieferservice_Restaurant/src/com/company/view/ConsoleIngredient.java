package com.company.view;

import com.company.controller.ControllerIngredient;
import com.company.database.models.Ingredient;

import java.util.Scanner;

public class ConsoleIngredient {
    private ControllerIngredient controllerIngredient = new ControllerIngredient();


    Scanner myNumbertScanner = new Scanner(System.in);
    Scanner myTextScanner = new Scanner(System.in);


    public ConsoleIngredient() {
        this.controllerIngredient = controllerIngredient;
    }

    public void ConsoleAdd() {

        System.out.println("Wie heisst Ihr neue Zutat ?");
        String eingabeText = myTextScanner.nextLine();
        System.out.println("Wieviel kostet die neue Zutat ?");
        double price = myNumbertScanner.nextDouble();
        Ingredient ingredient = new Ingredient(eingabeText, price);

        controllerIngredient.create(ingredient);


    }

    public void consoleDelete() {
        controllerIngredient.read();
        System.out.println("Bitte geben Sie die ID Nummer des zu löschenden Menüs ein");
        int id = myNumbertScanner.nextInt();
        controllerIngredient.delete(id);
    }

    public void read() {
        controllerIngredient.read();
    }
}
