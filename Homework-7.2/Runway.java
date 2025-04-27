
package mediator;

public class Runway {
    private boolean isOccupied = false;

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void occupy() {
        isOccupied = true;
    }

    public void vacate() {
        isOccupied = false;
    }
}
