package com.company;

import com.company.controller.Controller;

import java.awt.image.renderable.ContextualRenderedImageFactory;

public class Main {

    public static void main(String[] args) {
	// Ein Meal hatte mehrere Ingredients.
        //Der Benutzer konnte aus einer Liste von Menüs auswählen und mit Hilfe der Konsole Zutaten hinzufügen oder entfernen.
        //Was wir nun machen, ist in einem ersten Schritt in unserem Lieferservice die Tabellen
        // aus dem Gastro Programm zu verwenden und den Benutzer aus der Datenbank wählen zu lassen.
        //In einem zweiten Schritt werden wir die Datenbank um folgende Tabellen erweitern:
        //Kunde
        //Bei erstmaliger Bedienung sollte der Benutzer ein “Kundenkonto” anlegen,
        // sprich einfach seinen Namen erfassen und einen Wohnort.
        // Nach Anlage dieses Kundenkontos erhält er eine Kundennummer,
        // welche vereinfacht vorerst mal der Kunden ID in der DB entsprechen kann
        //Bei jeder weiteren Bestellung kann er sich durch Eingabe seiner Kundennummer anmelden.
        //Bestellung
        //Wir benötigen eine Tabelle für Bestellungen, hierbei ist es wichtig zu wissen,
        // welcher Kunde hat die Bestellung aufgegeben,
        // was ist der Gesamtpreis der Bestellung und eine Referenz auf die Lieferkosten.
        //Bestellungsdetails
        //Wir benötigen eine Tabelle mit den Bestellungsdetails,
        // hier herin werden die einzelnen Menüs zu einer Bestellung gespeichert.
        // Auch der Einzelpreis je Menü wird hier mit aufgenommen
        //Bestellungsdetails Änderungen
        //Wir benötigen eine Tabelle in der wir je bestelltem Menü die entfernten oder hinzugefügten Zutaten uns merken.
        // So können wir dann auch einen korrekten Endbetrag ausgeben, da ja eine hinzugefügte Zutat zusätzlich Geld kostet.
        //Rabatt
        //Da wir “Stammkunden” haben, benötigen wir auch ein Rabattsystem,
        // z.B. ab der 10. Bestellung gibt es 10 % Rabatt, ab der 20. …
        // Dieser Rabatt muss dann natürlich auch mit der Bestellung in Verbindung gebracht werden, um ihn korrekt abzuziehen.
        //ACHTUNG: Rabatte gibt es nur auf Speisen, nicht auf Lieferkosten.
        //Erstellt hierzu
        //ein ER Model
        //die Tabellen in der Datenbank
        //ein Programm welches es dem Kunden ermöglicht zu bestellen
        //Der Kunde sollte sollte am Ende seiner Bestellung eine detaillierte Rechnung erhalten,
        // diese genügt vorerst auf der Konsole ausgedruckt.
        //
        Controller controller =new Controller();
        controller.start();
    }
}
