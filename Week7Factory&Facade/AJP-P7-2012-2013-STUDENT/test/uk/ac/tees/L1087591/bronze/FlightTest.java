package uk.ac.tees.L1087591.bronze;

import org.junit.Test;
import static org.junit.Assert.*;

/** A set of tests to check the solution to the BRONZE task.
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class FlightTest {
    
    /**
     * Check that concrete flights are sub-classes of Flight.
     */
    @Test
    public void testFlightSubClasses() {
        assertTrue(new BotswanaFlight() instanceof Flight);
        assertTrue(new IndiaFlight() instanceof Flight);
        assertTrue(new SriLankaFlight() instanceof Flight);
        System.out.println("Concrete flight classes extend Flight");
    } 
    
    /**
     * Check that concrete upgrades are sub-classes of Flight and FlightUpgrade.
     */
    @Test
    public void testUpgradeSubClasses() {
        Flight f = new BotswanaFlight();
        f = new FirstClassUpgrade(f);
        assertTrue(f instanceof Flight);
        assertTrue(f instanceof FlightUpgrade);
        f = new RefreshmentUpgrade(f);
        assertTrue(f instanceof Flight);
        assertTrue(f instanceof FlightUpgrade);
        f = new PriorityUpgrade(f);
        assertTrue(f instanceof Flight);
        assertTrue(f instanceof FlightUpgrade);
        f = new WebCheckInUpgrade(f);
        assertTrue(f instanceof Flight);
        assertTrue(f instanceof FlightUpgrade);
        f = new EntertainmentUpgrade(f);
        assertTrue(f instanceof Flight);
        assertTrue(f instanceof FlightUpgrade);
        System.out.println("Concrete upgrade classes extend Flight and FlightUpgrade");
    } 
    
    /**
     * Test basic flights to Botswana, India and SriLanka.
     */
    @Test
    public void testBasicFlights() {
        Flight f = new BotswanaFlight();
        final double expectedCost1 = 154.0;
        assertEquals(f.getCost(), expectedCost1, 0.0);
        
        f = new IndiaFlight();
        final double expectedCost2 = 212.0;
        assertEquals(f.getCost(), expectedCost2, 0.0);
        
        f = new SriLankaFlight();
        final double expectedCost3 = 254.0;
        assertEquals(f.getCost(), expectedCost3, 0.0);
        
        System.out.println("Basic flight costs OK");
    }
    
    /**
     * Test web check in upgrade.
     */
    @Test
    public void testWebCheckInUpgrade() {
        Flight f = new BotswanaFlight();
        f = new WebCheckInUpgrade(f);
        final double expectedCost = 181.0;
        assertEquals(f.getCost(), expectedCost, 0.0);
        System.out.println("Web check in upgrade OK");
    }
    
    /**
     * Test entertainment upgrade.
     */
    @Test
    public void testEntertainmentUpgrade() {
        Flight f = new BotswanaFlight();
        f = new EntertainmentUpgrade(f);
        final double expectedCost = 163.50;
        assertEquals(f.getCost(), expectedCost, 0.0);
        System.out.println("Entertainment upgrade OK");
    }
    
    /**
     * Test first class upgrade.
     */
    @Test
    public void testFirstClassUpgrade() {
        Flight f = new BotswanaFlight();
        f = new FirstClassUpgrade(f);
        final double expectedCost = 371.0;
        assertEquals(f.getCost(), expectedCost, 0.0);
        System.out.println("First class upgrade OK");
    }
    
    /**
     * Test priority upgrade.
     */
    @Test
    public void testPriorityUpgrade() {
        Flight f = new BotswanaFlight();
        f = new PriorityUpgrade(f);
        final double expectedCost = 173.0;
        assertEquals(f.getCost(), expectedCost, 0.0);
        System.out.println("Priority upgrade OK");
    }
    
    /**
     * Test priority upgrade.
     */
    @Test
    public void testRefreshmentUpgrade() {
        Flight f = new BotswanaFlight();
        f = new RefreshmentUpgrade(f);
        final double expectedCost = 166.0;
        assertEquals(f.getCost(), expectedCost, 0.0);
        System.out.println("Refreshment upgrade OK");
    }
    
    /**
     * Test multiple upgrades.
     */
    @Test
    public void testMulitpleUpgradeIndia() {
        Flight f = new IndiaFlight();
        f = new RefreshmentUpgrade(f);
        f = new PriorityUpgrade(f);
        f = new WebCheckInUpgrade(f);
        final double expectedCost = 270.0;
        assertEquals(f.getCost(), expectedCost, 0.0);
        System.out.println("Multiple upgrade INDIA OK");
    }
    
    /**
     * Test multiple upgrades.
     */
    @Test
    public void testMulitpleUpgradeSriLanka() {
        Flight f = new SriLankaFlight();
        f = new FirstClassUpgrade(f);
        f = new EntertainmentUpgrade(f);
        final double expectedCost = 480.50;
        assertEquals(f.getCost(), expectedCost, 0.0);
        System.out.println("Multiple upgrade SRI LANKA OK");
    }
    
    /**
     * Test multiple upgrades.
     */
    @Test
    public void testMulitpleUpgradeBotswana() {
        Flight f = new BotswanaFlight();
        f = new FirstClassUpgrade(f);
        f = new RefreshmentUpgrade(f);
        f = new PriorityUpgrade(f);
        f = new WebCheckInUpgrade(f);
        f = new EntertainmentUpgrade(f);
        final double expectedCost = 438.50;
        assertEquals(f.getCost(), expectedCost, 0.0);
        System.out.println("Multiple upgrade BOTSWANA OK");
    } 
   
}
