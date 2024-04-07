package model;

import enums.VehicleType;

public class Vehicle {
    String licenseNumber;
    VehicleType vehicleType;

    public Vehicle(String licenseNumber, VehicleType vehicleType) {
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
    }

}
