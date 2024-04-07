import enums.VehicleType;
import model.Ticket;
import model.Vehicle;
import service.ParkingLotService;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("123", VehicleType.CAR);
        ParkingLotService parkingLotService = new ParkingLotService(1);
        parkingLotService.addParkingFloors(1);
        Ticket ticket = parkingLotService.giveTicket(vehicle);
        parkingLotService.calculateMoney(ticket);
    }
}