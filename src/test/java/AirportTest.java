import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    private Airport airport;
    private Hangar hangar;
    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING707,AirlineType.BRITISHAIRWAYS);
        hangar = new Hangar(1, plane);
        airport = new Airport(AirportCodeType.PSV);
        airport.addHangar(hangar);
    }

    @Test
    public void hasHangars(){
        assertEquals(1, airport.getNumberOfHangars());
    }

    @Test
    public void canAddHangar(){
        assertEquals(1, airport.getNumberOfHangars());
    }

    @Test
    public void hasAirportCode(){
        assertEquals(AirportCodeType.PSV, airport.getAirportCode());
    }

    @Test
    public void hasFlights(){
        assertEquals(0, airport.getNumberOfFlights());
    }

    @Test
    public void cannotCreateFlightIfThereAreNoAvailablePlanes(){
        airport.addFlight("27A", DestinationType.JAPAN);
        assertEquals(false, airport.addFlight("27A", DestinationType.JAPAN));
        assertEquals(1, airport.getNumberOfFlights());
    }
}
