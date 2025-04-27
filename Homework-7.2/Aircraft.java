
package mediator;

public class Aircraft {
    private String name;
    private ControlTowerMediator mediator;

    public Aircraft(String name, ControlTowerMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerAircraft(this);
    }

    public String getName() {
        return name;
    }

    public void requestLanding() {
        System.out.println(name + " requests landing.");
        mediator.requestLanding(this);
    }

    public void requestTakeoff() {
        System.out.println(name + " requests takeoff.");
        mediator.requestTakeoff(this);
    }

    public void emergencyLanding() {
        System.out.println("!!! " + name + " declares EMERGENCY !!!");
        mediator.emergencyLanding(this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}
