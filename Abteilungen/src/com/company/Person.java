package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Person {
    public String firstName;
    public String lastName;
    private String gender;
    private String department;
    private int age;
    static String myPersonLine;
    static String[] splittetValues;
    static Person[] people = new Person[20];
    static int counterPersons = 0;


    // Constructor
    public Person(String firstName, String lastName) {//dieser Constructor nur für den Aufruf ,Methode generatePersonFromText
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Person(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        people[counterPersons] = this;
        counterPersons++;
    }

    public static void generatePersonFromText() throws IOException {
        FileReader myNewFilereader = new FileReader("C:\\Users\\marti\\desktop\\Repo\\Exceptions-IO\\Abteilungen.txt");
        BufferedReader myNewBufferedReader = new BufferedReader(myNewFilereader);
        String[] fullName = null;
        boolean header = true;
        while ((myPersonLine = myNewBufferedReader.readLine()) != null) {
            if (header) {
                header = false;
            } else {
                System.out.println(myPersonLine);
                splittetValues = myPersonLine.split(";");
                fullName = splittetValues[0].split(" ");

                Person newPerson = new Person(fullName[0], fullName[1]);

                newPerson.department = splittetValues[1];

                people[counterPersons] = newPerson;
                counterPersons++;
                System.out.println(splittetValues[1].toString());
                System.out.println(counterPersons);
                System.out.println(people[0].firstName.toString());
                //      System.out.println( splittetValues[0].split(" "));
                //      System.out.println(fullName[0].toString());

            }


        }
        for (int i = 0; i < counterPersons; i++) {
            System.out.println(people[i].firstName.toString() + " " + people[i].lastName.toString() + " " + people[i].department.toString() + " generierte Personen");
        }
    }
}