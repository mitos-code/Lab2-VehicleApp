/**
 * Motorcycle - concrete class extending LandVehicle.
 * Adds motorcycle-specific property: helmet availability.
 */
public class Motorcycle extends LandVehicle {

    boolean hasHelmet;

    public Motorcycle(String make, String model, int year, boolean hasHelmet) {
        super(make, model, year);
        this.hasHelmet = hasHelmet;
    }

    public void setHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
        System.out.println(make + " " + model + " helmet set to: " + hasHelmet);
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Motorcycle Info ---");
        System.out.println("Make         : " + make);
        System.out.println("Model        : " + model);
        System.out.println("Year         : " + year);
        System.out.println("Helmet       : " + (hasHelmet ? "Yes" : "No"));
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Moving       : " + isMoving);
        System.out.println("----------------------");
    }
}
//Prepared by Amirhaziq
