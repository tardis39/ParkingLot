package model;

import java.time.Instant;

public class Ticket {
    int id;
    Instant startTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    public Ticket(int id, Vehicle vehicle, ParkingSpot parkingSpot) {
        System.out.println("Ticket is created with id: "+ id);
        this.id = id;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        startTime = Instant.now();
    }

    public Instant getStartTime() {
        return startTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
