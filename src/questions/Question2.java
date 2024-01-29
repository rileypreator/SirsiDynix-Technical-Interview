package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Example class that accepts an object, and converts it to a list
// Also contains a sort function with lambda expression
class VehicleLot {
    public List<String> vehicleDirectory;

    // Constructor
    public VehicleLot(String[] incomingVehicles) {
        vehicleDirectory = new ArrayList<>(Arrays.asList(incomingVehicles));
    }

    // Sorting Function
    public void sortDirectory() {
        vehicleDirectory.sort((string1, string2) -> string1.compareTo(string2));
        // This could also be written as the following
        // vehicleDirectory.sort(String::compareTo);
    }

    // Show current directory
    public void printDirectory() {
        System.out.println(vehicleDirectory);
    }
}


public class Question2 {
    public static void answer() {
        // Vehicles to be added to lot and then sorted
        String[] incomingVehicles = {"Truck", "Van", "Suburban", "Convertible", "Sedan", "Hybrid", "Sports"};

        VehicleLot mainLot = new VehicleLot(incomingVehicles);
        mainLot.sortDirectory();
        mainLot.printDirectory();
    }
}
