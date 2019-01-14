import java.util.ArrayList;

public class Airport {
    private ArrayList<Hangar> hangars;
    private AirportCodeType airportCode;
    private ArrayList<Flight> flights;
    private ArrayList<Plane> assignedPlanes;

    public Airport(AirportCodeType airportCode){
        this.hangars = new ArrayList<Hangar>();
        this.airportCode = airportCode;
        this.flights = new ArrayList<Flight>();
        this.assignedPlanes = new ArrayList<Plane>();
    }

    public int getNumberOfHangars() {
        return this.hangars.size();
    }

    public void addHangar(Hangar hangar) {
        this.hangars.add(hangar);
    }

    public AirportCodeType getAirportCode() {
        return this.airportCode;
    }

    public int getNumberOfFlights() {
        return this.flights.size();
    }

    public boolean addFlight(String flightNumber, DestinationType destination) {
       int availablePlaneIndex = this.getHangarIndexOfAvailablePlane();
        if (availablePlaneIndex != -1) {
            Plane planeToAssign = this.hangars.get(availablePlaneIndex).getPlane();
            this.flights.add(this.createFlight(planeToAssign,flightNumber,destination));
            this.assignedPlanes.add(planeToAssign);
            return true;
        }
        return false;
    }

    private int getHangarIndexOfAvailablePlane() {
        int hangarIndexOfAvailablePlane = -1;
        for (int i = 0; i < this.hangars.size(); i++) {
            if (!this.assignedPlanes.contains(this.hangars.get(i).getPlane())) {
                hangarIndexOfAvailablePlane = i;
                break;
            }
        }
        return hangarIndexOfAvailablePlane;
    }

    private Flight createFlight(Plane assignedPlane, String flightNumber, DestinationType destination) {
        Flight newFlight = new Flight(assignedPlane,flightNumber,destination);
        return newFlight;
    }
}
