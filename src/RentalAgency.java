import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    public List<Vehicle> vehicleFleet;

    public RentalAgency() {
        vehicleFleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleFleet.add(vehicle);
    }

    public void displayAvailableVehicles() {
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.isAvailable()) {
                System.out.println(vehicle);
            }
        }
    }
}

public Vehicle[] vehicleFleet;

public Vehicle findAvailableVehicle(Class<?> vehicleType) {
    for (Vehicle vehicle : vehicleFleet) {
        if (vehicleType.isInstance(vehicle) && vehicle.isAvailableForRental()) {
            return vehicle;
        }
    }
    return null;
}


public void rentVehicle(Vehicle vehicle, Customer customer, int days) {
    if (vehicle != null && vehicle.isAvailableForRental()) {
        vehicle.setAvailable(false);
        System.out.println("Rented " + vehicle.getModel() + " to " + customer.getName() + " for " + days + " days.");
    } else {
        System.out.println("Vehicle is not available.");
    }
}

public void returnVehicle(Vehicle vehicle) {
    vehicle.setAvailable(true);
    System.out.println("Returned " + vehicle.getModel() + ".");
}

