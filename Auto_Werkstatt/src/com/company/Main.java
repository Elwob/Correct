package com.company;

public class Main {

    public static void main(String[] args) {
        //Schreibe eine Autoklasse welche typische Eigenschaften eines Autos besitzt (z.B. Marke,
        //Leistung, KM - Stand, KM bis Service, Tankanzeige usw.). Das Auto hat zusätzlich die
        //Funktion des Fahrens. Wie bekannt ist zehrt jede Fahrt an diversen Parametern (Tank, KM,
        //Bereifung, …) des Autos.
        //Daher benötigen wir auch eine Klasse für eine Tankstelle mit einem Tankservice, welcher je
        //nach Kraftstoffart einen anderen Preis verrechnet, beglichen wird dieser Preis von einer
        //Person (dem Fahrer).
        //Früher oder später sollte man mit jedem Auto in die Werkstatt. Sollte nun ein Service fällig
        //oder die Räder gewechselt werden, benötigen wir eine Werkstatt - Klasse, welche das Auto
        //je nach Anforderung “repariert”. Die Rechnung wiederum wird vom Fahrer beglichen


        //In den letzten Tagen haben wir wieder einige neue Konzepte wie Abstrakte Klassen, Interfaces etc.
        //kennengelernt. Analysiere dein zuvor erstelltes Auto/Werkstatt/Tankstellen Programm. Verwende nun überall
        //wo du es für sinnvoll/notwendig hältst abstrakte Klassen || Interfaces.

        Person ich = new Person("Martin", "Burtscher", 43, 740);
        GasStation myNewGasstation = new GasStation("OMV", 300.00);
        ServiceStation myNewServiceStation = new ServiceStation("ÖAMTC", 455);
        Car suv = new Car("Mazda", 66, 550, 100, ich, 1.4);

        suv.drive(ich);
        myNewServiceStation.service(ich, suv);
        myNewGasstation.service(ich, suv);
    }
}
