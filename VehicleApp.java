/**
 * VehicleApp - main class demonstrating the full Vehicle hierarchy.
 */
public class VehicleApp {

    // Counter tracked here because interface fields are implicitly final in Java
    static int numberOfVehicles = 0;

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("       VEHICLE APPLICATION DEMO         ");
        System.out.println("========================================\n");

        // Instantiate two Car objects
        Car car1 = new Car("Toyota", "Camry", 2022, 4, true);
        numberOfVehicles++;

        Car car2 = new Car("Honda", "Civic", 2023, 4, false);
        numberOfVehicles++;

        // Instantiate two Motorcycle objects
        Motorcycle moto1 = new Motorcycle("Yamaha", "R15", 2021, true);
        numberOfVehicles++;

        Motorcycle moto2 = new Motorcycle("Honda", "CBR500R", 2022, false);
        numberOfVehicles++;

        // Display initial info
        System.out.println(">>> Initial vehicle details:\n");
        car1.displayInfo();
        car2.displayInfo();
        moto1.displayInfo();
        moto2.displayInfo();

        // Update specific properties
        System.out.println(">>> Updating properties...\n");
        car2.setAirConditioner(true);
        moto2.setHelmet(true);
        System.out.println();

        // Start and accelerate all vehicles
        System.out.println(">>> Starting and accelerating all vehicles...\n");
        car1.start();
        car1.accelerate(60);
        car2.start();
        car2.accelerate(80);
        moto1.start();
        moto1.accelerate(100);
        moto2.start();
        moto2.accelerate(120);
        System.out.println();

        // Decelerate and stop all vehicles
        System.out.println(">>> Decelerating and stopping all vehicles...\n");
        car1.decelerate(30);
        car1.stop();
        car2.decelerate(40);
        car2.stop();
        moto1.decelerate(50);
        moto1.stop();
        moto2.decelerate(60);
        moto2.stop();
        System.out.println();

        // Display total number of vehicles
        System.out.println("========================================");
        System.out.println("Total number of vehicles instantiated: " + numberOfVehicles);
        System.out.println("========================================");
    }
}
//Prepared by Amirhaziq
