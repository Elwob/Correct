package com.company;

public abstract class Station {

    String serviceStationName;
    double serviceStationCash;

    public Station(String serviceStationName, double serviceStationCash) {
        this.serviceStationName = serviceStationName;
        this.serviceStationCash = serviceStationCash;
    }

    public abstract void service(Person person, Vehicle vehicle);

    public String getServiceStationName() {
        return serviceStationName;
    }

    public void setServiceStationName(String serviceStationName) {
        this.serviceStationName = serviceStationName;
    }

    public double getServiceStationCash() {
        return serviceStationCash;
    }

    public void setServiceStationCash(double serviceStationCash) {
        this.serviceStationCash = serviceStationCash;
    }


}
