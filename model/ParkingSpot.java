package model;

import enums.ParkingType;

public class ParkingSpot {
    int id;
    Vehicle vehicle;
    private boolean isVacant;
    ParkingType parkingType;
    int cost;

    public ParkingSpot(int id, int cost, ParkingType parkingType) {
        System.out.println("Parking Spot created with id: "+id);
        this.id = id;
        this.cost = cost;
        this.parkingType = parkingType;
        isVacant = true;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean getIsVacant() {
        return isVacant;
    }

    public ParkingType getParkingType() {
        return parkingType;
    }

    public int getCost() {
        return cost;
    }
}
