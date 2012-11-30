package uk.ac.tees.L1087591;

import org.junit.Test;
import static org.junit.Assert.*;

/**LightTankTest.java is a test class for LightTank.java
 * @author Anastasov
 */
public class LightTankTest {
 
    /** A no-args constructor.
     * 
     */
    public LightTankTest() {
    }

    /**
     * Testing the getPoints() method, of class LightTank.
     */
    @Test
    public void testGdiPoints() {
        
        System.out.println("Testing correct points for GDI light tank");
        final Vehicle v = new LightTank(Faction.GDI);
        final int expectedValue = 150;
        assertEquals(v.getPoints(), expectedValue);
        
    }
    
    /**
     * Testing the getPoints() method, of class LightTank.
     */
    @Test
    public void testNodPoints() {
        
        System.out.println("Testing correct points for NOD light tank");
        final Vehicle v = new LightTank(Faction.NOD);
        final int expectedValue = 175;
        assertEquals(v.getPoints(), expectedValue);
    }
     
    /**
     * Testing the getPoints() method, of class LightTank.
     */
    @Test
    public void testScrinPoints() {
        
        System.out.println("Testing correct points for SCRIN light tank");
        final Vehicle v = new LightTank(Faction.SCRIN);
        final int expectedValue = 150;
        assertEquals(v.getPoints(), expectedValue);
    }
     
    /**
     * Test of kill method, of class LightTank.
     */
    @Test
    public void testGdiKill() {
        System.out.println("Testing correct message for GDI light tank");
        final Vehicle v = new LightTank(Faction.GDI);
        final String expectedMessage = "A GDI light tank is destroyed: +150pts.\n";
        final String actualMessage = v.kill();
        //System.out.println(expectedMessage);
        //System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
    
    /**
     * Test of kill method, of class LightTank.
     */
    @Test
    public void testNodKill() {
        System.out.println("Testing correct message for NOD light tank");
        final Vehicle v = new LightTank(Faction.NOD);
        final String expectedMessage = "A NOD light tank is destroyed: +175pts.\n";
        final String actualMessage = v.kill();
        //System.out.println(expectedMessage);
        //System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
    
    /**
     * Test of kill method, of class LightTank.
     */
    @Test
    public void testScrinKill() {
        System.out.println("Testing correct message for SCRIN light tank");
        final Vehicle v = new LightTank(Faction.SCRIN);
        final String expectedMessage = "A SCRIN light tank is destroyed: +150pts.\n";
        final String actualMessage = v.kill();
        //System.out.println(expectedMessage);
        //System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
   
}
