package com.company;

public class GasStation extends Station {

    Fuel fuel;
    private double priceBenzine = 1.25;

    public GasStation(String serviceStationName, double serviceStationCash) {
        super(serviceStationName, serviceStationCash);
    }

    @Override
    public void service(Person person, Vehicle vehicle) {
        double fuelToFill = 0;
        System.out.println("Tanken:");
        System.out.println("Sie haben noch " + vehicle.getFuel() + " liter Benzin");
        fuelToFill = vehicle.getMaxFuelSpace() - vehicle.getFuel();
        System.out.println("Ihr Auto wird vollgetankt............mit " + fuelToFill + "liter");
        person.setCash(person.getCash() - fuelToFill * priceBenzine);
        setServiceStationCash(getServiceStationCash() + (fuelToFill * priceBenzine));
        System.out.println(person.getFirstname() + " Sie haben noch " + person.getCash() + " euro");
        vehicle.setFuel(vehicle.getMaxFuelSpace());

    }


}


