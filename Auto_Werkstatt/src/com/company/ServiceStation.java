package com.company;

public class ServiceStation extends Station {

    private double minTireProfile;
    private double priceTire = 400;
    private double repair = 0.6;

    public ServiceStation(String serviceStationName, double serviceStationCash) {
        super(serviceStationName, serviceStationCash);
    }


    public void service(Person person, Vehicle vehicle) {
        double repCosts = 0;
        System.out.println("Ihr Auto wird repariert.....");
        System.out.println(vehicle.getServiceAt());
        repCosts = (1000 - vehicle.getServiceAt()) * repair;
        person.setCash(person.getCash() - repCosts);

        System.out.println("Ihr Auto wurde für " + repCosts + "euro Repariert");
        System.out.println("Wir danken für ihren Auftrag");
        setServiceStationCash(getServiceStationCash() + repCosts);
        vehicle.setServiceAt(1000);
    }

    public void changeTires() {

    }
}
