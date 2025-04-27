
package mediator;

public interface ControlTowerMediator {
    void requestLanding(Aircraft aircraft);
    void requestTakeoff(Aircraft aircraft);
    void emergencyLanding(Aircraft aircraft);
    void registerAircraft(Aircraft aircraft);
}
