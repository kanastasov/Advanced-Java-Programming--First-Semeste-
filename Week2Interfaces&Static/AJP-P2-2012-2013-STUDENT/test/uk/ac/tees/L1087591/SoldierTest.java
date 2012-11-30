package uk.ac.tees.L1087591;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**SoldierTest.java is a test class for Soldier.java
 * @author Anastasov
 */
public class SoldierTest {

    /**
     * Testing global points counter in Soldier.
     */
    @Test
    public void testCounter() {

        System.out.println("Testing global counter in Soldier");
        final ArrayList<Killable> al = new ArrayList<Killable>();
        al.add(new Cadet(Faction.NOD));
        al.add(new Major(Faction.SCRIN));
        al.add(new Colonel(Faction.GDI));
        al.add(new Cadet(Faction.GDI));
        al.add(new Major(Faction.NOD));
        al.add(new Colonel(Faction.SCRIN));
        
        for (Killable k : al) 
        {
            k.kill();
        }
        final int expectedTotalSoldierPoints = 365;
        assertEquals(Soldier.totalisimo, expectedTotalSoldierPoints);
    }
}
