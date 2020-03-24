package com.company;

import java.util.Scanner;

public class Car extends Vehicle implements IVehicle {
    Scanner myNewScanner = new Scanner(System.in);

    public Car(String brand, int ps, int fuel, int mileAge, Person carOwner, double tireprofile) {
        super(brand, ps, fuel, mileAge, carOwner, tireprofile);
    }


    @Override
    public void drive(Person person) {
        double kilometerFahren = 1;
        double mileageBefore = getMileAge();

        while (fuelFull && kilometerFahren != 0) {
            System.out.println("Bitte geben Sie an Wie Weit Sie Fahren wollen :");
            kilometerFahren = myNewScanner.nextInt();


            if ((getFuel() - (kilometerFahren * getFuelConsum())) <= 100) {
                fuelFull = false;
                System.out.println("Geht leider nicht mehr Sprit leer");
                break;
            }
            setMileAge(getMileAge() + kilometerFahren);
            setFuel(getFuel() - getFuelConsum() * (kilometerFahren));
            setServiceAt(getServiceAt() - kilometerFahren);
        }
        System.out.println("Fahrt beendet");
        System.out.println("Sie haben einen Kilometerstand von: " + getMileAge() + " Km");
        System.out.println("Sie haben noch soviel liter :" + getFuel() + " Benzin");
        setTireprofile(getTireprofile() - (getMileAge() - mileageBefore) * 0.001);
        System.out.println("Sie haben noch ein Reifenprofil von: " + getTireprofile());
        System.out.println(person.getFirstname() + " Sie sollten in " + getServiceAt() +
                " Kilometern einen Service machen");
    }


}
