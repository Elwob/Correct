package com.company;

public abstract class Vehicle {

    String brand;
    private double ps;
    private double fuel;
    private double mileAge;
    private double milAgeService;
    private double ServiceAt = 1000;
    private Person carOwner;
    private double tireprofile;
    private double fuelConsum = 8;
    private double maxFuelSpace = 900;
    boolean fuelFull = true;

    public Vehicle(String brand, int ps, int fuel, int mileAge, Person carOwner, double tireprofile) {
        this.brand = brand;
        this.ps = ps;
        this.fuel = fuel;
        this.mileAge = mileAge;
        this.carOwner = carOwner;
        this.tireprofile = tireprofile;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getMileAge() {
        return mileAge;
    }

    public void setMileAge(double mileAge) {
        this.mileAge = mileAge;
    }

    public double getMilAgeService() {
        return milAgeService;
    }

    public void setMilAgeService(double milAgeService) {
        this.milAgeService = milAgeService;
    }


    public double getServiceAt() {
        return ServiceAt;
    }

    public void setServiceAt(double serviceAt) {
        ServiceAt = serviceAt;
    }


    public Person getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(Person carOwner) {
        this.carOwner = carOwner;
    }

    public double getTireprofile() {
        return tireprofile;
    }

    public void setTireprofile(double tireprofile) {
        this.tireprofile = tireprofile;
    }

    public double getFuelConsum() {
        return fuelConsum;
    }

    public void setFuelConsum(int fuelConsum) {
        this.fuelConsum = fuelConsum;
    }

    public double getMaxFuelSpace() {
        return maxFuelSpace;
    }

    public void setMaxFuelSpace(double maxFuelSpace) {
        this.maxFuelSpace = maxFuelSpace;
    }

    public boolean isFuelFull() {
        return fuelFull;
    }

    public void setFuelFull(boolean fuelFull) {
        this.fuelFull = fuelFull;
    }


}
