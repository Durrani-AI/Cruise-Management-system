// Suite class extends Cabin
// Suites can hold up to 4 passengers and may have a balcony
public class Suite extends Cabin {

    private boolean hasBalcony;

    // Constructor
    public Suite(int cabinNumber, boolean hasBalcony) {
        super(cabinNumber, 4);
        this.hasBalcony = hasBalcony;
    }

    // Return of balcony
    public boolean hasBalcony() {
        return hasBalcony;
    }

    // Override getCabinType from parent class
    public String getCabinType() {
        if (hasBalcony) {
            return "Suite with balcony";
        } else {
            return "Suite without balcony";
        }
    }
}