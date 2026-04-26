/**
 * Car - concrete class extending LandVehicle.
 * Adds car-specific properties: number of doors and air conditioner status.
 */
public class Car extends LandVehicle {

    int numberOfDoors;
    boolean hasAirConditioner;

    public Car(String make, String model, int year,
               int numberOfDoors, boolean hasAirConditioner) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        this.hasAirConditioner = hasAirConditioner;
    }

    public void setAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
        System.out.println(make + " " + model + " air conditioner set to: " + hasAirConditioner);
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Car Info ---");
        System.out.println("Make         : " + make);
        System.out.println("Model        : " + model);
        System.out.println("Year         : " + year);
        System.out.println("Doors        : " + numberOfDoors);
        System.out.println("A/C          : " + (hasAirConditioner ? "Yes" : "No"));
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Moving       : " + isMoving);
        System.out.println("----------------");
    }
}

//Prepared by Amirhaziq
