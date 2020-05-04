package com.company.view;

import com.company.controller.ControllerCustomer;
import com.company.controller.ControllerDelivery;
import com.company.controller.ControllerMenue;
import com.company.database.models.Customer;

import java.util.Scanner;

public class Console {
    public static Scanner myNumberScanner = new Scanner(System.in);
    public static Scanner myTextScanner = new Scanner(System.in);
    private ConsoleCustomer consoleCustomer = new ConsoleCustomer();
    private Customer customer = new Customer();
    private ControllerCustomer controllerCustomer = new ControllerCustomer();
    private ConsoleConsist consoleConsist = new ConsoleConsist();
private ControllerMenue controllerMenue=new ControllerMenue();
private ControllerDelivery controllerDelivery=new ControllerDelivery();

    public void view() {
        System.out.println("Willkommen beim Gasthaus Hirschen ");
        for (int i = 0; i < 90; i++) {
            System.out.print("-");

        }
        System.out.println("");
        System.out.println("Wenn Sie Bereits eine KundenNummer haben geben Sie sie bitte ein ansonsten geben Sie 0 ein");
        int eingabe = myNumberScanner.nextInt();   //false input ignored todo
        if (eingabe == 0) {
            customer = consoleCustomer.addCustomer();

        } else {

            customer = controllerCustomer.read(eingabe);         //Call for Customer Data with Id
            System.out.println(customer);

        }
        System.out.println("Wohin sollen wir liefern?");
       controllerDelivery.read();
        System.out.println("Bitte geben Sie eine Zahl ein :");

/* Das hier Folgende ist aus dem alten Lieferservice kopiert..
        while (eingabe != 0) {
        controllerMenue.read();
            System.out.println();
            System.out.println("Bitte wählen sie Speisen aus unserem Menü (1/2/3 Oder 0 für beenden):");
            eingabe =myNumberScanner.nextInt();
            if (eingabe == 1) {
                meals[mealsCounter] = menue[0];
                mealsCounter++;
            }
            if (eingabe == 2) {
                meals[mealsCounter] = menue[1];
                mealsCounter++;
            }
            if (eingabe == 3) {
                meals[mealsCounter] = menue[2];
                mealsCounter++;

            }
            if (eingabe == 0) {
                break;
            }
            if (eingabe != 0) {
                while (eingabe != 0) {
                    System.out.println(java.util.Arrays.asList(Ingredient.values()));
                    System.out.println("Möchten Sie eine Zutat hinzufügen oder entfernen?(- oder + und n für nein):");
                    String zeichenEingabe =myTextScanner.nextLine();
                    if (zeichenEingabe.equalsIgnoreCase("n")) {
                        break;
                    }

                    if (zeichenEingabe.equalsIgnoreCase("+")) {
                        System.out.println("Zutat hinzufügen:");
                        System.out.println("1 :" + Ingredient.SALAMI.toString() + " | 2 :" + Ingredient.SCHINKEN +
                                " | 3 :" + Ingredient.OLIVEN.toString() + " | 4 :" + Ingredient.KÄSE.toString());
                        eingabe = myFirstScanner.nextInt();
                        if (eingabe != 0) {
                            if (eingabe == 1) {
                                meals[mealsCounter - 1].addExtraIngredi(Ingredient.SALAMI);
                            }
                            if (eingabe == 2) {
                                meals[mealsCounter - 1].addExtraIngredi(Ingredient.SCHINKEN);
                            }
                            if (eingabe == 3) {
                                meals[mealsCounter - 1].addExtraIngredi(Ingredient.OLIVEN);
                            }
                            if (eingabe == 4) {
                                meals[mealsCounter - 1].addExtraIngredi(Ingredient.KÄSE);
                            }
                        }
                    }
                    if (zeichenEingabe.equalsIgnoreCase("-")) {
                        System.out.println("Zutat entfernen:");
                        System.out.println("1 :" + Ingredient.SALAMI.toString() + " | 2 :" + Ingredient.SCHINKEN +
                                " | 3 :" + Ingredient.OLIVEN.toString() + " | 4 :" + Ingredient.KÄSE.toString());
                        eingabe = myFirstScanner.nextInt();
                        if (eingabe != 0) {
                            if (eingabe == 1) {
                                meals[mealsCounter - 1].removIngredient(Ingredient.SALAMI);
                            }
                            if (eingabe == 2) {
                                meals[mealsCounter - 1].removIngredient(Ingredient.SCHINKEN);
                            }
                            if (eingabe == 3) {
                                meals[mealsCounter - 1].removIngredient(Ingredient.OLIVEN);
                            }
                            if (eingabe == 4) {
                                meals[mealsCounter - 1].removIngredient(Ingredient.KÄSE);
                            }
                        }

                    }

                }
            }
        }
        System.out.println("Wohin sollen wir liefern?(Abholen=0/Dornbirn=1/Bregenz=2)");
        lieferOrt = myFirstScanner.nextInt();
        System.out.println("Danke ...");
    }
*/

}
}
