package com.company;

public class Person {

    private String firstname;
    private String lastname;
    private int age;
    private double cash;
    int milesDriven;
    private static Person[] person;
    private static int numbersOfPerson;


    public Person(String firstname, String lastname, int age, double cash) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.cash = cash;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public static Person[] getPerson() {
        return person;
    }

    public static void setPerson(Person[] person) {
        Person.person = person;
    }

    public static int getNumbersOfPerson() {
        return numbersOfPerson;
    }

    public static void setNumbersOfPerson(int numbersOfPerson) {
        Person.numbersOfPerson = numbersOfPerson;
    }


}
