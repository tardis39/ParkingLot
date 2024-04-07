package model;

import java.util.List;

import enums.ParkingType;

import java.util.ArrayList;
public class ParkingFloor {
    int id;
    List<ParkingSpot> parkingSpots;
    int numberOfParkingSpots;

    public ParkingFloor(int id) {
        System.out.println("Parking Floor created with id: "+id);
        this.id = id;
        numberOfParkingSpots = 0;
        parkingSpots = new ArrayList<>();
    }

    public void addParkingSpot(int num, int cost, ParkingType parkingType) {
        System.out.println("Parking Spots are being added in Parking Floor: "+id);
        for(int i=0;i<num;i++) {
            ParkingSpot parkingSpot = new ParkingSpot(numberOfParkingSpots, cost, parkingType);
            parkingSpots.add(parkingSpot);
            numberOfParkingSpots++;
        }
        System.out.println("Parking Spots have been added in Parking Floor: "+id);
    }

    public ParkingSpot getAvailableSpot() {
        for(ParkingSpot parkingSpot: parkingSpots) {
            if(parkingSpot.getIsVacant()) {
                return parkingSpot;     // check is directly variable is called then what happens
            }
        }
        return null;
    }

    public void displayAvailableSpots() {
        int count=0;
        for(ParkingSpot parkingSpot: parkingSpots) {
            if(parkingSpot.getIsVacant())count++;
        }
        System.out.println("Total number of vacant spots in Parking Floor "+ id + " is " + count);
    }

    public boolean isFloorFull() {
        int count=0;
        for(ParkingSpot parkingSpot: parkingSpots) {
            if(parkingSpot.getIsVacant())count++;
        }
        return count==0;
    }
}
