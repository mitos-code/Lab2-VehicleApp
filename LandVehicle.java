/**
 * LandVehicle - abstract class implementing the Vehicle interface.
 * Holds common properties shared by all land vehicles.
 * Concrete subclasses must implement the abstract displayInfo() method.
 */
public abstract class LandVehicle implements Vehicle {

    // Common properties for all land vehicles
    String make;        // Manufacturer name (e.g. Toyota)
    String model;       // Model name (e.g. Camry)
    int year;           // Year of manufacture
    double speed;       // Current speed in km/h
    boolean isMoving;   // Whether the vehicle is currently in motion

    /**
     * Constructor - initialises properties.
     */
    public LandVehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
        this.isMoving = false;
    }

    @Override
    public void start() {
        isMoving = true;
        System.out.println(year + " " + make + " " + model + " has started.");
    }

    @Override
    public void stop() {
        isMoving = false;
        speed = 0;
        System.out.println(year + " " + make + " " + model + " has stopped.");
    }

    @Override
    public void accelerate(double speed) {
        if (isMoving) {
            this.speed += speed;
            System.out.println(year + " " + make + " " + model
                    + " accelerated to " + this.speed + " km/h.");
        } else {
            System.out.println("Cannot accelerate – vehicle is not started.");
        }
    }

    @Override
    public void decelerate(double speed) {
        if (isMoving) {
            this.speed = Math.max(0, this.speed - speed);
            System.out.println(year + " " + make + " " + model
                    + " decelerated to " + this.speed + " km/h.");
        } else {
            System.out.println("Cannot decelerate – vehicle is not started.");
        }
    }

    // Abstract method - each subclass prints its own specific details
    public abstract void displayInfo();
}
