package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Versucht folgendes Diagramm mit Objekten abzubilden:
        //Aufgabe
        //Die “Abteilungen” Vorstand, Vertrieb, … sollten
        //in Abteilungsobjekte abgelegt werde, jeder
        //dieser Abteilung kann ein Leiter zugeordnet
        //werden (Personen Objekt).
        //Am Ende sollte in unserer Konsole ein Output
        //ähnlich dem linken dargestellt werden. (nur
        //schöner ;))
        //Zusatz: Füllt die Abteilung mit Mitarbeitern und
        //lasst die Mitarbeiter Abteilungen switchen
        //z.B. Abteilung.switch(person, Zielabteilung).
        //Die Abteilung soll eine Eigenschaft besitzen,
        //welche die Mitarbeiteranzahl speichert


        //Gerne könnt ihr eure bestehenden Abteilungs- und Personenklassen nehmen.
        //
        //Eure Aufgabe ist es nun folgende Textdatei (im Moodle verfügbar) in die Abteilungen zu importieren.
        //
        //Analyse der Textdatei und erzeugen der Abteilungen im Code
        //⇒ das ist vorerst zu tippen z.B.

        //Es gibt noch keine Hierarchien, es geht vorrangig darum Personen
        // aus einer Textdatei zu erzeugen und der korrekten Abteilung zuzuordnen
        //Lesen der Datei und automatisches erzeugen der Personen,
        // dann jede Person der richtigen Abteilung zuordnen

        Department management = new Department("Management");
        Department purchasing = new Department("Purchasing");
        Department purchasingEurope = new Department("PurchasingEurope");
        Department purchasingItaly = new Department("PurchasingItaly");
        Department purchasingUSA = new Department("PurchasingUSA");
        Department sales = new Department("Sales");
        Department salesEurope = new Department("SalesEurope");


        Person.generatePersonFromText();

        management.printDepTree("");


    }
}
