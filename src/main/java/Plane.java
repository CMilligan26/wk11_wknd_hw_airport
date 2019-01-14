import java.util.ArrayList;

public class Plane {

    private PlaneType type;
    private AirlineType airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType type,AirlineType airline){
        this.type = type;
        this.airline = airline;
        this.passengers = new ArrayList<Passenger>();
    }

    public PlaneType getType() {
        return this.type;
    }

    public AirlineType getAirline() {
        return this.airline;
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public boolean addPassenger(Passenger passengerToAdd) {
        if(this.checkRemainingCapacity() > 0) {
            this.passengers.add(passengerToAdd);
            return true;
        }
        return false;
    }

    public int checkRemainingCapacity() {
        return this.type.getCapacity() - this.getNumberOfPassengers();
    }
}
