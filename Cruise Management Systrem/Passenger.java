import java.util.ArrayList;

// Passenger class represents a passenger on a cruise
public class Passenger {

    private String passengerName;
    private Cabin cabin;
    private ArrayList<Excursion> bookedExcursions;

    // Constructor
    public Passenger(String passengerName) {
        this.passengerName = passengerName;
        this.cabin = null;
        this.bookedExcursions = new ArrayList<>();
    }

    // Return for passenger name
    public String getPassengerName() {
        return passengerName;
    }

    // Return of cabin
    public Cabin getCabin() {
        return cabin;
    }

    // Setter for cabin
    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }

    // Return of booked excursions
    public ArrayList<Excursion> getBookedExcursions() {
        return bookedExcursions;
    }

    // Book an excursion
    public void bookExcursion(Excursion excursion) {
        if (!bookedExcursions.contains(excursion)) {
            bookedExcursions.add(excursion);
        }
    }

    // Remove an excursion booking
    public void removeExcursion(Excursion excursion) {
        bookedExcursions.remove(excursion);
    }

    // Check if passenger has booked a specific excursion
    public boolean hasBookedExcursion(Excursion excursion) {
        return bookedExcursions.contains(excursion);
    }
}
