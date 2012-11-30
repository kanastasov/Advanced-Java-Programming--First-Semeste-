package uk.ac.tees.L1087591.silver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/** A set of unit tests to check the solution to the SILVER task.
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class DeployableTest {
    
    /**
     * Do this before any tests have run.
     */
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing Deployable implementations");
    }
    
    /**
     * Test of attack method, of class Deployable.
     */
    @Test
    public void testAttack1() {
       System.out.print("\tTesting attack method #1");
       final Soldier s1 = new Soldier();
       final Soldier s2 = new Soldier();
       assertTrue(s1.attack(s2));
       System.out.println("\t\tOK");
    }
    
    /**
     * Test of attack method, of class Deployable.
     */
    @Test
    public void testAttack2() {
       System.out.print("\tTesting attack method #2");
       final Soldier s1 = new Soldier();
       final Soldier s2 = new Soldier();
       final Squad sq1 = new Squad();
       sq1.add(s1);
       sq1.add(s2);
       final Soldier s3 = new Soldier();
       assertFalse(s3.attack(sq1));
       System.out.println("\t\tOK");
    }
    
    /**
     * Test of attack method, of class Deployable.
     */
    @Test
    public void testAttack3() {
       System.out.print("\tTesting attack method #3");
       final Soldier s1 = new Soldier();
       final Soldier s2 = new Soldier();
       final Squad sq1 = new Squad();
       sq1.add(s1);
       sq1.add(s2);
       final Soldier s3 = new Soldier();
       assertTrue(sq1.attack(s3));
       System.out.println("\t\tOK");
    }

    /**
     * Test of attack method, of class Deployable.
     */
    @Test
    public void testAttack4() {
       System.out.print("\tTesting attack method #4");
       final Soldier s1 = new Soldier();
       final Grenadier g1 = new Grenadier();
       final Squad sq1 = new Squad();
       sq1.add(s1);
       sq1.add(g1);
       final Soldier s2 = new Soldier();
       final MachineGunner m1 = new MachineGunner();
       final Squad sq2 = new Squad();
       sq2.add(s2);
       sq2.add(m1);
       assertFalse(sq1.attack(sq2));
       System.out.println("\t\tOK");
    }
    
     /**
     * Test of attack method, of class Deployable.
     */
    @Test
    public void testAttack5() {
       System.out.print("\tTesting attack method #5");
       final Grenadier g1 = new Grenadier();
       final Grenadier g2 = new Grenadier();
       final Soldier s1 = new Soldier();
       final Squad sq1 = new Squad();
       sq1.add(s1);
       sq1.add(g1);
       sq1.add(g2);
       final MachineGunner m1 = new MachineGunner();
       final Squad sq2 = new Squad();
       sq2.add(m1);
       assertTrue(sq1.attack(sq2));
       System.out.println("\t\tOK");
    }

    /**
     * Do this after all tests have run.
     */
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finished testing Deployable implementations");
    }
}
