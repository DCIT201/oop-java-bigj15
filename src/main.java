

public class main {
public static void main(String[] args) {
            RentalAgency agency = new RentalAgency();
            agency.addVehicle(new Car("C001", "Toyota Corolla", 50));
            agency.addVehicle(new Motorcycle("M001", "Yamaha R1", 30));
            agency.addVehicle(new Truck("T001", "Ford F-150", 100));

    
            Customer customer = new Customer( "John Doe");
    
            Vehicle vehicle = agency.findAvailableVehicle(null) ;
            agency.rentVehicle(vehicle, customer, 3);
    
            agency.returnVehicle(vehicle);
        }
    }
