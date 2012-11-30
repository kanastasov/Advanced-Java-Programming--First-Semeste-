package uk.ac.tees.L1087591.bronze;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/** A set of unit tests to check the solution to the BRONZE task.
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class SoldierTest {
    
    /**
     * Do this before any tests have run.
     */
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing Soldier class");
    }
    
    
    /**
     * Using the add() method to build a simple Composite (Squad) object made 
     * from 3 Leaf (Soldier) objects.
     */
    @Test
    public void buildSimpleUnit() {
        System.out.print("\tBuilding simple composite");
        final Soldier so1 = new Soldier();
        final Soldier so2 = new Soldier();
        final Soldier so3 = new Soldier(); 
        final Squad sq1 = new Squad();
        sq1.add(so1);
        sq1.add(so2);
        sq1.add(so3);
        System.out.println("\t\tOK");
    }
    
    /**
     * Using the add() method to build a complex Composite object made 
     * from 2 Composite objects.
     */
    @Test
    public void buildComplexUnit() {
        System.out.print("\tBuilding complex composite");
        final Soldier so1 = new Soldier();
        final Soldier so2 = new Soldier();
        final Squad sq1 = new Squad();
        sq1.add(so1);
        sq1.add(so2);
        final Soldier so3 = new Soldier();
        final Soldier so4 = new Soldier();
        final Squad sq2 = new Squad();
        sq2.add(so3);
        sq2.add(so4);
        final Squad sq3 = new Squad();
        sq3.add(sq1);
        sq3.add(sq2);
        System.out.println("\t\tOK");
    }
    
    /**
     * Using the remove() method of the Composite class to remove a Leaf object.
     */
    @Test
    public void testRemoveSoldier() {
        System.out.print("\tRemove soldier from squad");
        final Soldier so1 = new Soldier();
        final Soldier so2 = new Soldier();
        final Squad sq1 = new Squad();
        sq1.add(so1);
        sq1.add(so2);
        sq1.remove(so1);
        sq1.remove(so2);
        System.out.println("\t\tOK");
    }
    
    /**
     * Using the remove() method of the Composite class to remove a Composite 
     * object.
     */
    @Test
    public void testRemoveSquad() {
        System.out.print("\tRemove squad from squad");
        final Soldier so1 = new Soldier();
        final Soldier so2 = new Soldier();
        final Squad sq1 = new Squad();
        sq1.add(so1);
        sq1.add(so2);
        final Squad sq2 = new Squad();
        sq2.add(sq1);
        sq2.remove(sq1);
        System.out.println("\t\t\tOK");
    }
    
    /**
     * Invoking the getStrength() method on a Leaf object.
     */
    @Test
    public void testStrengthSoldier() {
        System.out.print("\tGet strength of soldier");
        final Soldier so1 = new Soldier();
        final int expectedValue = 1;
        assertEquals(expectedValue, so1.getStrength());
        System.out.println("\t\t\tOK");
    }
    
     /**
     * Invoking the getStrength() method on a simple Composite object.
     */
    @Test
    public void testStrengthUnit1() {
        System.out.print("\tGet strength of squad (simple)");
        final Soldier so1 = new Soldier();
        final Soldier so2 = new Soldier();
        final Soldier so3 = new Soldier(); 
        final Squad sq1 = new Squad();
        sq1.add(so1);
        sq1.add(so2);
        sq1.add(so3);
        final int expectedValue = 3;
        assertEquals(expectedValue, sq1.getStrength());
        System.out.println("\t\tOK");
    } 
    
     /**
     * Invoking the getStrength() method on a complex Composite object.
     */
    @Test
    public void testStrengthUnit2() {
        System.out.print("\tGet strength of squad (complex)");
        final Soldier so1 = new Soldier();
        final Soldier so2 = new Soldier();
        final Squad sq1 = new Squad();
        sq1.add(so1);
        sq1.add(so2);
        final Soldier so3 = new Soldier();
        final Soldier so4 = new Soldier();
        final Squad sq2 = new Squad();
        sq2.add(so3);
        sq2.add(so4);
        final Squad sq3 = new Squad();
        sq3.add(sq1);
        sq3.add(sq2);
        final int expectedValue = 4;
        assertEquals(expectedValue, sq3.getStrength());
        System.out.println("\t\tOK");
    }   
    
    /**
     * Do this after all tests have run.
     */
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finished testing Soldier class");
    }
}
