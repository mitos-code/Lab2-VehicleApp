/**
 * Vehicle interface - defines the contract for all vehicles.
 * Contains the static variable to track total number of vehicles.
 */
public interface Vehicle {

    // Static variable to count total vehicles instantiated
    static int numberOfVehicles = 0;

    // Start the vehicle engine
    void start();

    // Stop the vehicle engine
    void stop();

    // Increase vehicle speed by the given amount
    void accelerate(double speed);

    // Decrease vehicle speed by the given amount
    void decelerate(double speed);
}
