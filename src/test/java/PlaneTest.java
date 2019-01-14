import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    private Plane plane;
    private Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING707,AirlineType.BRITISHAIRWAYS);
    }

    @Test
    public void hasType(){
        assertEquals(PlaneType.BOEING707, plane.getType());
    }

    @Test
    public void hasAirline(){
        assertEquals(AirlineType.BRITISHAIRWAYS, plane.getAirline());
    }

    @Test
    public void hasPassengers(){
        assertEquals(0, plane.getNumberOfPassengers());
    }

    @Test
    public void canAddPassenger(){
        assertEquals(true,plane.addPassenger(passenger));
        assertEquals(1, plane.getNumberOfPassengers());
    }

    @Test
    public void canCheckRemainingCapacity(){
        assertEquals(200, plane.checkRemainingCapacity());
    }

    @Test
    public void cannotAddPassengerIfAtCapacity(){
        for (int i = 0; i < 200; i++) {
            plane.addPassenger(passenger);
        }
        assertEquals(false,plane.addPassenger(passenger));
        assertEquals(200, plane.getNumberOfPassengers());
    }
}
