package com.company;

public class Main {

    public static void main(String[] args) {
        // Erzeuge eine Abstrakte Klasse GeometricFigure welche eine Methode public abstract void calculateArea();
        //enthält.
        //Erzeuge eine Klasse Square und Rectangle welche abgeleitet sind von der Klasse GeometricFigure.
        //Versehe die beiden Klassen mit den Attributen die du benötigst (Seitenlängen). Achtung: Für ein Quadrat
        //brauchst du nur eine Seitenlänge, für ein Rechteck 2
        //Überschreibe die Methode calculateArea mit den jeweiligen Rechenoperatoren bzw. Seitenlängen die du
        //brauchst.
        //Erzeuge im Hauptprogramm sowohl ein Rechteck als auch ein Quadrat.
        Rectangle myNewRect = new Rectangle();
        Square myNewSquare = new Square();

        System.out.println(myNewRect.calculateArea(12.2, 3.1));
        System.out.println(Math.round(myNewSquare.calculateArea(2.2)));

    }
}
