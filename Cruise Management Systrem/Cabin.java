import java.util.ArrayList;

// Abstract Cabin class. Parent class for Suite and StandardCabin
// only Suite or StandardCabin
public abstract class Cabin {

    private int number;
    private int capacity;
    private ArrayList<Passenger> passengers;

    // Constructor
    public Cabin(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    // Return of cabin number
    public int getCabinNumber() {
        return number;
    }

    // Return of capacity
    public int getCapacity() {
        return capacity;
    }

    // Return of passengers list
    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    // Adding a passenger to this cabin
    public void addPassenger(Passenger passenger) {
        if (passengers.size() < capacity) {
            passengers.add(passenger);
        }
    }

    // Removing a passenger from this cabin
    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }

    // Removing all passengers from this cabin
    public void removeAllPassengers() {
        passengers.clear();
    }

    // Check if cabin is vacant (empty)
    public boolean isVacant() {
        return passengers.size() == 0;
    }

    // Check if cabin is full
    public boolean isFull() {
        return passengers.size() >= capacity;
    }

    // Return cabin type as string.it will then be overridden by child classes
    public abstract String getCabinType();
}