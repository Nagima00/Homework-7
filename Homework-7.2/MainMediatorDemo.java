
package mediator;

public class MainMediatorDemo {
    public static void main(String[] args) {
        Runway runway = new Runway();
        ConcreteControlTower controlTower = new ConcreteControlTower(runway);

        Aircraft plane1 = new Aircraft("Flight A1", controlTower);
        Aircraft plane2 = new Aircraft("Flight B2", controlTower);
        Aircraft plane3 = new Aircraft("Flight C3", controlTower);

        plane1.requestLanding();
        plane2.requestLanding();
        runway.vacate();
        plane2.requestLanding();
        plane3.requestTakeoff();
        plane2.emergencyLanding();
    }
}
