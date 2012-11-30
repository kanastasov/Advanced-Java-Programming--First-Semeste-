package uk.ac.tees.L1087591;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**VehicleTest.java is a test class for Vehicle.java
 * @author Anastasov
 */
public class VehicleTest {

    /**
     * Testing global points counter in Vehicle.
     */
    @Test
    public void testCounter() {

        System.out.println("Testing global counter in Vehicle");
        final ArrayList<Killable> al = new ArrayList<Killable>();
        al.add(new LightTank(Faction.NOD));
        al.add(new HeavyTank(Faction.SCRIN));
        al.add(new LightTank(Faction.GDI));
        al.add(new HeavyTank(Faction.GDI));
        al.add(new LightTank(Faction.SCRIN));

        for (Killable k : al) {
            k.kill();
        }
        final int expectedTotalVehiclePoints = 970;
        assertEquals(Vehicle.totalisimo, expectedTotalVehiclePoints);
    }
}