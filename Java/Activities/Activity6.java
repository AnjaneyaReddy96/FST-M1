import java.time.LocalDateTime;

class Plane {
    // Private fields for encapsulation
    private int passengers;
    private LocalDateTime takeOffTime;
    private LocalDateTime landingTime;

    // Constructor to initialize fields
    public Plane() {
        this.passengers = 0;
        this.takeOffTime = null;
        this.landingTime = null;
    }

    // Getter for passengers
    public int getPassengers() {
        return passengers;
    }

    // Setter for passengers with validation
    public void setPassengers(int passengers) {
        if (passengers >= 0) {
            this.passengers = passengers;
        } else {
            System.out.println("Number of passengers cannot be negative.");
        }
    }

    // Method to simulate plane take-off
    public void takeOff() {
        this.takeOffTime = LocalDateTime.now();
        System.out.println("Plane has taken off at: " + this.takeOffTime);
    }

    // Method to simulate plane landing
    public void land() {
        this.landingTime = LocalDateTime.now();
        System.out.println("Plane has landed at: " + this.landingTime);
    }

    // Getter for take-off time
    public LocalDateTime getTakeOffTime() {
        return takeOffTime;
    }

    // Getter for landing time
    public LocalDateTime getLandingTime() {
        return landingTime;
    }
}

public class Activity6 {

	public static void main(String[] args) {
        // Create a plane object
        Plane plane = new Plane();

        // Onboard passengers
        plane.setPassengers(150);
        System.out.println("Passengers onboard: " + plane.getPassengers());

        // Take off
        plane.takeOff();

        // Land
        plane.land();

        // Display take-off and landing times
        System.out.println("Take-off time: " + plane.getTakeOffTime());
        System.out.println("Landing time: " + plane.getLandingTime());
    }
	


}


