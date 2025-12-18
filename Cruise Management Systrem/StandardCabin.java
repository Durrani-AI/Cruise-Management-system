// StandardCabin class extends Cabin
// Standard cabins can hold up to 6 passengers and may have a sea view
public class StandardCabin extends Cabin {

    private boolean hasSeaView;

    // Constructor
    public StandardCabin(int cabinNumber, boolean hasSeaView) {
        super(cabinNumber, 6);
        this.hasSeaView = hasSeaView;
    }

    // Return of sea view
    public boolean hasSeaView() {
        return hasSeaView;
    }

    // Override getCabinType from parent class
    public String getCabinType() {
        if (hasSeaView) {
            return "Standard Cabin with sea view";
        } else {
            return "Standard Cabin without sea view";
        }
    }
}
