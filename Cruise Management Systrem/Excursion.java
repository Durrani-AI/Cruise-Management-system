import java.util.ArrayList;

// Excursion class represents a shore excursion to a port
public class Excursion {

    private Port port;
    private String dayOfWeek;
    private int capacity;
    private ArrayList<Passenger> bookedPassengers;

    // Constructor
    public Excursion(Port port, String dayOfWeek, int capacity) {
        this.port = port;
        this.dayOfWeek = dayOfWeek;
        this.capacity = capacity;
        this.bookedPassengers = new ArrayList<>();
    }

    // Return of port
    public Port getPort() {
        return port;
    }

    // Return of port name
    public String getPortName() {
        return port.getName();
    }

    // Return of day
    public String getDay() {
        return dayOfWeek;
    }

    // Return of capacity
    public int getCapacity() {
        return capacity;
    }

    // Return of booked passengers
    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    // number of available spaces
    public int getAvailableSpaces() {
        return capacity - bookedPassengers.size();
    }

    // Check if excursion is full
    public boolean isFull() {
        return bookedPassengers.size() >= capacity;
    }

    // Book a passenger on this excursion
    public boolean bookPassenger(Passenger passenger) {
        if (!isFull() && !bookedPassengers.contains(passenger)) {
            bookedPassengers.add(passenger);
            return true;
        }
        return false;
    }

    // Removing a passenger from this excursion
    public void removePassenger(Passenger passenger) {
        bookedPassengers.remove(passenger);
    }
}