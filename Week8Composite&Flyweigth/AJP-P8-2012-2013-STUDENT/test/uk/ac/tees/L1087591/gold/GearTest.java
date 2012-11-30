package uk.ac.tees.L1087591.gold;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/** A set of unit tests to check the solution to the GOLD task.
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class GearTest {
    
     /**
     * Do this before any tests have run.
     */
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing class library");
    }
    
   /**
     * Test that the class library is complete.
     */
    @Test
    public void testLibrary() {
        System.out.print("\tBlankets");
        final Blankets b = new Blankets();
        assertTrue(b.getClass().getSuperclass().getName().equals(Gear.class.getName()));
        System.out.println("\t\t\t\tOK");
        
        System.out.print("\tFood");
        final Food f = new Food();
        assertTrue(f.getClass().getSuperclass().getName().equals(Gear.class.getName()));
        System.out.println("\t\t\t\t\tOK");
        
        System.out.print("\tMedkit");
        final Medkit m = new Medkit();
        assertTrue(m.getClass().getSuperclass().getName().equals(Gear.class.getName()));
        System.out.println("\t\t\t\t\tOK");
        
        System.out.print("\tNapkins");
        final Napkins n = new Napkins();
        assertTrue(n.getClass().getSuperclass().getName().equals(Gear.class.getName()));
        System.out.println("\t\t\t\t\tOK");
        
        System.out.print("\tOxygen");
        final Oxygen o = new Oxygen();
        assertTrue(o.getClass().getSuperclass().getName().equals(Gear.class.getName()));
        System.out.println("\t\t\t\t\tOK");
        
        System.out.print("\tPillows");
        final Pillows p = new Pillows();
        assertTrue(p.getClass().getSuperclass().getName().equals(Gear.class.getName()));
        System.out.println("\t\t\t\t\tOK");
        
        System.out.print("\tSicknessBags");
        final SicknessBags s = new SicknessBags();
        assertTrue(s.getClass().getSuperclass().getName().equals(Gear.class.getName()));
        System.out.println("\t\t\t\tOK");
    }
    
    /**
     * Do this after all tests have run.
     */
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finished testing class library");
    }

}
