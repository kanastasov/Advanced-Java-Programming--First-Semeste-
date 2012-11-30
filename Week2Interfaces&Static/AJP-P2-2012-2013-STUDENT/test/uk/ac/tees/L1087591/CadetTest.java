package uk.ac.tees.L1087591;

import org.junit.Test;
import static org.junit.Assert.*;

/**CadetTest.java is a test class for the Cadet.java
 * @author Anastasov
 */
public class CadetTest {
    
    /** A no-args constructor.
     * 
     */
    public CadetTest() {
    }

    /**
     * Testing the getPoints() method, of class Cadet.
     */
    @Test
    public void testGdiPoints() {
        
        System.out.println("Testing correct points for GDI cadet");
        final Soldier s = new Cadet(Faction.GDI);
        final int expectedValue = 25;
        assertEquals(s.getPoints(), expectedValue);
        
    }
    
    /**
     * Testing the getPoints() method, of class Cadet.
     */
    @Test
    public void testNodPoints() {
        
        System.out.println("Testing correct points for NOD cadet");
        final Soldier s = new Cadet(Faction.NOD);
        final int expectedValue = 20;
        assertEquals(s.getPoints(), expectedValue);
    }
     
    /**
     * Testing the getPoints() method, of class Cadet.
     */
    @Test
    public void testScrinPoints() {
        
        System.out.println("Testing correct points for SCRIN cadet");
        final Soldier s = new Cadet(Faction.SCRIN);
        final int expectedValue = 15;
        assertEquals(s.getPoints(), expectedValue);
    }
     
    /**
     * Test of kill method, of class Cadet.
     */
    @Test
    public void testGdiKill() {
        System.out.println("Testing correct message for GDI cadet");
        final Soldier s = new Cadet(Faction.GDI);
        final String expectedMessage = "A GDI cadet bites the dust: +25pts.\n";
        final String actualMessage = s.kill();
        System.out.println(expectedMessage);
        System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
    
    /**
     * Test of kill method, of class Cadet.
     */
    @Test
    public void testNodKill() {
        System.out.println("Testing correct message for NOD cadet");
        final Soldier s = new Cadet(Faction.NOD);
        final String expectedMessage = "A NOD cadet bites the dust: +20pts.\n";
        final String actualMessage = s.kill();
        //System.out.println(expectedMessage);
        //System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
    
    /**
     * Test of kill method, of class Cadet.
     */
    @Test
    public void testScrinKill() {
        System.out.println("Testing correct message for SCRIN cadet");
        final Soldier s = new Cadet(Faction.SCRIN);
        final String expectedMessage = "A SCRIN cadet bites the dust: +15pts.\n";
        final String actualMessage = s.kill();
        //System.out.println(expectedMessage);
        //System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
   
}
