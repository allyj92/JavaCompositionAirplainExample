//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Airplane myAirplane = new Airplane();

    myAirplane.startAirplane();

    Passenger passenger = new Passenger("Jhon");
    myAirplane.addPassenger(passenger);

    Crew crew1 = new Crew("Pilot", "Captain");
    myAirplane.addCrewMember(crew1);


    myAirplane.stopAirplane();
    }
}