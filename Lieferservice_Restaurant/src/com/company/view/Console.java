package com.company.view;

import com.company.controller.ControllerOverview;

import java.util.Scanner;

public class Console {
    private ConsoleMenue consoleMenue = new ConsoleMenue();
    private ConsoleIngredient consoleIngredient = new ConsoleIngredient();
    private ConsoleDeliver consoleDeliver = new ConsoleDeliver();

    public void ConsoleMenue() {
        this.consoleMenue = new ConsoleMenue();
        this.consoleIngredient = new ConsoleIngredient();
        this.consoleDeliver = new ConsoleDeliver();
    }

    public void view() {
        boolean quit = false;
        Scanner myNumberScanner = new Scanner(System.in);
        Scanner myTextScanner = new Scanner(System.in);
        while (quit == false) {

            System.out.println("Bitte gebeben Sie eine Nummer ein ,wählen Sie Menue oder Ingredients oder Lieferpreis (1 / 2 / 3) oder Auswertung oder Export (4 / 5)");
            int eingabe = myNumberScanner.nextInt();


            if (eingabe == 1) {
                System.out.println("Möchten Sie ein Menü hinzufügen oder Löschen oder anzeigen ? Nr Wählen:(1 / 2 / 3) ");
                eingabe = myNumberScanner.nextInt();
                if (eingabe == 1) {
                    consoleMenue.ConsoleAddMenue();

                } else if (eingabe == 2) {
                    consoleMenue.consoleDeleteMenue();

                } else if (eingabe == 3) {
                    consoleMenue.read();
                }
            } else if (eingabe == 2) {
                System.out.println("Möchten Sie eine Zutat hinzufügen oder löschen oder anzeigen ? Nr Wählen:(1 / 2 / 3) ");
                eingabe = myNumberScanner.nextInt();
                if (eingabe == 1) {
                    consoleIngredient.ConsoleAdd();

                } else if (eingabe == 2) {
                    consoleIngredient.consoleDelete();

                } else if (eingabe == 3) {
                    consoleIngredient.read();
                }
            } else if (eingabe == 3) {
                System.out.println("Möchen Sie einen Neuen Lieferort hinzufügen oder entfernen oder anzeigen ? Nr Wählen:(1 / 2 / 3) ");
                eingabe = myNumberScanner.nextInt();
                if (eingabe == 1) {
                    consoleDeliver.ConsoleAdd();

                } else if (eingabe == 2) {
                    consoleDeliver.consoleDelete();

                } else if (eingabe == 3) {
                    consoleDeliver.read();
                }
            }else if (eingabe==4){
                System.out.println("Auswertung :");
                for (int i = 0; i < 90; i++) {
                    System.out.print("-");
                }
                System.out.println("");
                System.out.println("1  Wie viele Bestellungen gab es schon ? ");
                System.out.println("2  Wie viele Bestellungen gab es je Kunde ?");
                System.out.println("3  Wie viele Bestellungen gab es je Ortschaft?");
                System.out.println("4  Was sind all meine Umsätze nach den Kriterien 1 - 3 (Gesamt, je Kunde, je Ortschaft)");
                System.out.println("5  Was wurde am häufigsten bestellt und wie oft?");
                System.out.println("6  In absteigender Reihenfolge, wie oft bestellt wurde.");
                for (int i = 0; i < 90; i++) {
                    System.out.print("-");
                }
                System.out.println(" ");
                ControllerOverview controllerOverview=new ControllerOverview();
                eingabe =myNumberScanner.nextInt();
                switch (eingabe){
                    case 1 : System.out.println(controllerOverview.orderNumber());
                    case 2 :
                }
            }
            System.out.println("Möchten Sie noch etwas machen ? Bitte Nr.eingeben (1 ja / 2 nein)");
            eingabe = myNumberScanner.nextInt();
            if (eingabe == 1) {
                System.out.println("neue Runde...");

            } else {
                quit = true;
            }
        }

    }
}
