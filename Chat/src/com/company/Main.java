package com.company;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        // Erstelle mit der Hilfe von Mysql/Java einen Chat.
        // Es sollen über die Konsole Nachrichten empfangen & versendet werden können.
        //Tipp: Verwende für das Aktualisieren die Klasse Timer

        Timer myNewTimer = new Timer();
        Scanner myFirstScanner = new Scanner(System.in);

        Chat newChat = new Chat();
        String message;

        String url = "jdbc:mysql://localhost:3306/sql_chat?user=root";
        //String url=   "jdbc:mysql://localhost:3306/dcv_demo?user=root&allowMultiQueries=true" Florians url

        myNewTimer.schedule(new TimerTask() {
            @Override
            public void run() {

                newChat.getMessages(url);

            }
        }, 5000, 1000);    //verzögerung in ms,Intervall indem die Timer Methode aufgerufen wird!

        while (true) {                //Endlosschleife Nachrichteneingabe
            System.out.println("Chat new Message:");
            message = myFirstScanner.nextLine();

            newChat.sendMessage(url, message);


        }

    }
}


