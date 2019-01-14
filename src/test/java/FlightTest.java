import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight;
    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING707,AirlineType.BRITISHAIRWAYS);
        flight = new Flight(plane, "27A", DestinationType.JAPAN);
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("27A", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals(DestinationType.JAPAN, flight.getDestination());
    }
}
