package uk.ac.tees.L1087591;

import org.junit.Test;
import static org.junit.Assert.*;

/**HeavyTanlTest.java is a test class for HeavyTank.java
 * @author Anastasov
 */
public class HeavyTankTest {
 
    /** A no-args constructor.
     * 
     */
    public HeavyTankTest() {
    }

    /**
     * Testing the getPoints() method, of class HeavyTank.
     */
    @Test
    public void testGdiPoints() {
        
        System.out.println("Testing correct points for GDI heavy tank");
        final Vehicle v = new HeavyTank(Faction.GDI);
        final int expectedValue = 225;
        assertEquals(v.getPoints(), expectedValue);
        
    }
    
    /**
     * Testing the getPoints() method, of class HeavyTank.
     */
    @Test
    public void testNodPoints() {
        
        System.out.println("Testing correct points for NOD heavy tank");
        final Vehicle v = new HeavyTank(Faction.NOD);
        final int expectedValue = 310;
        assertEquals(v.getPoints(), expectedValue);
    }
     
    /**
     * Testing the getPoints() method, of class HeavyTank.
     */
    @Test
    public void testScrinPoints() {
        
        System.out.println("Testing correct points for SCRIN heavy tank");
        final Vehicle v = new HeavyTank(Faction.SCRIN);
        final int expectedValue = 270;
        assertEquals(v.getPoints(), expectedValue);
    }
     
    /**
     * Test of kill method, of class HeavyTank.
     */
    @Test
    public void testGdiKill() {
        System.out.println("Testing correct message for GDI heavy tank");
        final Vehicle v = new HeavyTank(Faction.GDI);
        final String expectedMessage = "A GDI heavy tank is demolished: +225pts.\n";
        final String actualMessage = v.kill();
        //System.out.println(expectedMessage);
        //System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
    
    /**
     * Test of kill method, of class HeavyTank.
     */
    @Test
    public void testNodKill() {
        System.out.println("Testing correct message for NOD heavy tank");
        final Vehicle v = new HeavyTank(Faction.NOD);
        final String expectedMessage = "A NOD heavy tank is demolished: +310pts.\n";
        final String actualMessage = v.kill();
        //System.out.println(expectedMessage);
        //System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
    
    /**
     * Test of kill method, of class HeavyTank.
     */
    @Test
    public void testScrinKill() {
        System.out.println("Testing correct message for SCRIN heavy tank");
        final Vehicle v = new HeavyTank(Faction.SCRIN);
        final String expectedMessage = "A SCRIN heavy tank is demolished: +270pts.\n";
        final String actualMessage = v.kill();
        //System.out.println(expectedMessage);
        //System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
   
}