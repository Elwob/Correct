package com.company;

import com.company.controller.Controller;

public class Main {

    public static void main(String[] args) {
        //Aufgaben Osterferien
        //Eure Aufgabe in den Ferien besteht aus zwei Programmen.
        //Über beide Programme verwenden wir eine Datenbank.
        //Programm 1
        //Wir benötigen ein Programm für die Gastronomie.
        // Die Gastwirte des Landes wünschen ein Konsolen Programm mit dem Sie folgende Dinge anlegen können:
        //Ihre Menüs
        //Zutaten
        //Da unsere Gastwirte es auch ermöglichen möchten zu liefern benötigen wir noch zwei weitere Tabellen.
        //Stadt/Ortschaft
        //Lieferpreis: Hier sollte definiert werden wie hoch der Preis je Ortschaft ist

        //Überlegt euch, wie ihr die o.g. vier Tabellen abbilden würdet und welche Beziehungen die zueinander haben.
        //Erstellt hierzu
        //ein ER Model
        //die Tabellen in der Datenbank
        //ein Programm, welches es dem Gastwirt ermöglicht diese Dinge einzutragen

        //     //Auswertungen (Programm 1)
        //        //Der Gastwirt sollte die Möglichkeit haben über Konsole auszuwerten:
        //        //Wie viele Bestellungen gab es schon?
        //        //Wie viele Bestellungen gab es je Kunde?
        //        //Wie viele Bestellungen gab es je Ortschaft?
        //        //Was sind all meine Umsätze nach den Kriterien 1 - 3 (Gesamt, je Kunde, je Ortschaft)
        //        //Was wurde am häufigsten bestellt und wie oft?
        //        //In absteigender Reihenfolge, wie oft bestellt wurde.
        //        //Ihr bietet ihm einfach o.g. Menüpunkte an und der Gastwirt wählt zwischen
        //        // 1 und 6. Je nach Auswahl lest ihr entsprechende Werte aus der Datenbank und gebt sie auf der Konsole aus.
        //        //
        //        //Exporte (Programm 1)
        //        //Um nun alle Bestellungen ins Buchhaltungssystem zu bringen,
        //        // benötigt der Gastwirt auch einen Export der Bestellungen zu einem csv File.
        //        //BestellId;KundeNr;Gesamtpreis
        //        //Ein weiterer Export wird benötigt um die verbrauchten Zutaten festzustellen:
        //        //Gestaltet hierzu ein SQL Statement welches ein Ergebnis wie folgt liefert:
        //        //Zutat 		Anzahl
        //        //Tomaten	117
        //        //Pilze		43
        //        //Dann exportiert das Ergebnis in ein csv File.

        Person owner = new Person("Georg", "Hirscher");
        Restaurant zumHirschen = new Restaurant("Hirschen", owner, 1200.33);

        Controller newController = new Controller();
        newController.start();

    }
}

