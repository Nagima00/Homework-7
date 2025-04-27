
package mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteControlTower implements ControlTowerMediator {
    private Runway runway;
    private List<Aircraft> registeredAircrafts = new ArrayList<>();

    public ConcreteControlTower(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void registerAircraft(Aircraft aircraft) {
        registeredAircrafts.add(aircraft);
    }

    @Override
    public void requestLanding(Aircraft aircraft) {
        if (runway.isAvailable()) {
            System.out.println(aircraft.getName() + " is cleared to land.");
            runway.occupy();
        } else {
            System.out.println(aircraft.getName() + " must wait, runway is occupied.");
        }
    }

    @Override
    public void requestTakeoff(Aircraft aircraft) {
        if (runway.isAvailable()) {
            System.out.println(aircraft.getName() + " is cleared for takeoff.");
            runway.occupy();
        } else {
            System.out.println(aircraft.getName() + " must wait, runway is occupied.");
        }
    }

    @Override
    public void emergencyLanding(Aircraft aircraft) {
        System.out.println("!!! EMERGENCY PROTOCOL INITIATED !!!");
        runway.vacate();
        for (Aircraft ac : registeredAircrafts) {
            if (!ac.equals(aircraft)) {
                ac.receiveMessage("Emergency! Clear the airspace immediately!");
            }
        }
        System.out.println(aircraft.getName() + " is given immediate clearance for emergency landing.");
        runway.occupy();
    }
}
