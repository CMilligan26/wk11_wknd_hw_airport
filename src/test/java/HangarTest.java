import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {
    private Hangar hangar;
    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING707,AirlineType.BRITISHAIRWAYS);
        hangar = new Hangar(1, plane);
    }

    @Test
    public void hasHangarNumber(){
        assertEquals(1, hangar.getHangarNumber());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, hangar.getPlane());
    }
}
