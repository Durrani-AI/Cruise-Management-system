import java.util.ArrayList;

// Cruise class represents a one-week cruise
public class Cruise {

    private Ship ship;
    private ArrayList<Passenger> passengers;
    private ArrayList<Excursion> excursions;
    private ArrayList<Cabin> cabins;

    // Constructor
    public Cruise(Ship ship) {
        this.ship = ship;
        this.passengers = new ArrayList<>();
        this.excursions = new ArrayList<>();
        this.cabins = new ArrayList<>();
    }

    // Return of ship
    public Ship getShip() {
        return ship;
    }

    // Return of passengers
    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    // Return of excursions
    public ArrayList<Excursion> getExcursions() {
        return excursions;
    }

    // Return of cabins
    public ArrayList<Cabin> getCabins() {
        return cabins;
    }

    // Adding a passenger to the cruise
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    // Adding an excursion to the cruise
    public void addExcursion(Excursion excursion) {
        excursions.add(excursion);
    }

    // Adding a cabin to the cruise
    public void addCabin(Cabin cabin) {
        cabins.add(cabin);
    }

    // the total number of passengers
    public int getTotalPassengers() {
        return passengers.size();
    }

    // returning all vacant cabins
    public ArrayList<Cabin> getVacantCabins() {
        ArrayList<Cabin> vacant = new ArrayList<>();
        for (int i = 0; i < cabins.size(); i++) {
            if (cabins.get(i).isVacant()) {
                vacant.add(cabins.get(i));
            }
        }
        return vacant;
    }
}