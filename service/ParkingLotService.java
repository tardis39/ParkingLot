package service;

import model.ParkingFloor;
import model.ParkingSpot;
import model.Ticket;
import model.Vehicle;

import java.util.List;

import enums.ParkingType;

import java.util.ArrayList;
public class ParkingLotService {
    int id;
    List<ParkingFloor> parkingFloors;
    int numberOfFloors;

    public ParkingLotService(int id) {
        this.id = id;
        parkingFloors = new ArrayList<>();
        numberOfFloors = 0;
    }

    public void addParkingFloors(int num) {
        for(int i=0;i<num;i++) {
            ParkingFloor parkingFloor = new ParkingFloor(numberOfFloors);
            parkingFloor.addParkingSpot(2, 5, ParkingType.BIKE_PARKING);
            parkingFloor.addParkingSpot(2, 10, ParkingType.CAR_PARKING);
            parkingFloor.addParkingSpot(2, 15, ParkingType.TRUCK_PARKING);
            parkingFloors.add(parkingFloor);
        }
    }

    public void displayAvailableSpots() {
        for(ParkingFloor parkingFloor: parkingFloors) {
            parkingFloor.displayAvailableSpots();
        }
    }

    public Ticket giveTicket(Vehicle vehicle) {
        for(ParkingFloor parkingFloor: parkingFloors) {
            if(parkingFloor.isFloorFull()==false) {
                ParkingSpot parkingSpot = parkingFloor.getAvailableSpot();
                System.out.println("here");
                Ticket ticket = new Ticket(1, vehicle, parkingSpot);
                return ticket;
            }
        }
        return null;
    }

    public void calculateMoney(Ticket ticket) {
        int cost = ticket.getParkingSpot().getCost()*10;
        System.out.println("Cost to be payed: "+ cost);
    }
    
}
