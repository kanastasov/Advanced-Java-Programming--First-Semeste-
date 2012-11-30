package uk.ac.tees.L1087591.gold;

import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class LockerTest {
    
    /**
     * Do this before any tests have run.
     */
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing class Locker");
    }

    /**
     * Try to mix food with bedding.
     */
    @Test
    public void testAdd1() {
        System.out.print("\tTesting add method #1");
        final Locker<Gear> locker = new Locker<Gear>();;
        assertTrue(locker.add(new Food()));
        assertFalse(locker.add(new Pillows()));
        assertFalse(locker.add(new Blankets()));
        System.out.println("\t\t\tOK");
    }
    
    /**
     * Try to mix bedding with food.
     */
    @Test
    public void testAdd2() {
        System.out.print("\tTesting add method #2");
        final Locker<Gear> locker = new Locker<Gear>();;
        assertTrue(locker.add(new Pillows()));
        assertTrue(locker.add(new Blankets()));
        assertFalse(locker.add(new Food()));
        System.out.println("\t\t\tOK");
    }
    
    /**
     * Try to mix medicine with food.
     */
    @Test
    public void testAdd3() {
        System.out.print("\tTesting add method #3");
        final Locker<Gear> locker = new Locker<Gear>();;
        assertTrue(locker.add(new Food()));
        assertFalse(locker.add(new Medkit()));
        assertFalse(locker.add(new Oxygen()));
        System.out.println("\t\t\tOK");
        
    }
    
    /**
     * Try to mix food with medicine.
     */
    @Test
    public void testAdd4() {
        System.out.print("\tTesting add method #4");
        final Locker<Gear> locker = new Locker<Gear>();;
        assertTrue(locker.add(new Medkit()));
        assertTrue(locker.add(new Oxygen()));
        assertFalse(locker.add(new Food()));
        System.out.println("\t\t\tOK");
        
    }
    
    /**
     * Try to mix bedding with medicine.
     */
    @Test
    public void testAdd5() {
        System.out.print("\tTesting add method #5");
        final Locker<Gear> locker = new Locker<Gear>();;
        assertTrue(locker.add(new Pillows()));
        assertTrue(locker.add(new Blankets()));
        assertTrue(locker.add(new Pillows()));
        assertTrue(locker.add(new Blankets()));
        assertFalse(locker.add(new Oxygen()));
        assertFalse(locker.add(new Food()));
        System.out.println("\t\t\tOK");
    }
    
    /**
     * Try to mix medicine with bedding.
     */
    @Test
    public void testAdd6() {
        System.out.print("\tTesting add method #6");
        final Locker<Gear> locker = new Locker<Gear>();;
        assertTrue(locker.add(new Oxygen()));
        assertFalse(locker.add(new Pillows()));
        assertFalse(locker.add(new Blankets()));
        System.out.println("\t\t\tOK");
    }
    
    /**
     * Try to over fill locker.
     */
    @Test
    public void testAdd7() {
        System.out.print("\tTesting add method #7");
        final Locker<Gear> locker = new Locker<Gear>();;
        assertTrue(locker.add(new Oxygen()));
        assertTrue(locker.add(new Medkit()));
        assertFalse(locker.add(new Oxygen()));
        System.out.println("\t\t\tOK");
    }
    
    /**
     * Try to mix bedding with sanitary products.
     */
    @Test
    public void testAdd8() {
        System.out.print("\tTesting add method #8");
        final Locker<Gear> locker = new Locker<Gear>();;
        assertTrue(locker.add(new Pillows()));
        assertTrue(locker.add(new Blankets()));
        assertTrue(locker.add(new Pillows()));
        assertTrue(locker.add(new Blankets()));
        assertTrue(locker.add(new Napkins()));
        assertTrue(locker.add(new SicknessBags()));
        System.out.println("\t\t\tOK");
    }
    
    /**
     * Try to mix sanitary products with bedding.
     */
    @Test
    public void testAdd9() {
        System.out.print("\tTesting add method #9");
        final Locker<Gear> locker = new Locker<Gear>();
        assertTrue(locker.add(new Napkins()));
        assertTrue(locker.add(new SicknessBags()));
        assertTrue(locker.add(new Pillows()));
        assertTrue(locker.add(new Blankets()));
        assertTrue(locker.add(new Pillows()));
        assertTrue(locker.add(new Blankets()));
        System.out.println("\t\t\tOK");
    }
    
    /**
     * Try to mix food with sanitary products.
     */
    @Test
    public void testAdd10() {
        System.out.print("\tTesting add method #10");
        final Locker<Gear> locker = new Locker<Gear>();;
        assertTrue(locker.add(new Food()));
        assertTrue(locker.add(new Napkins()));
        assertTrue(locker.add(new SicknessBags()));
        System.out.println("\t\t\tOK");
    }
    
    /**
     * Try to mix sanitary products with food.
     */
    @Test
    public void testAdd11() {
        System.out.print("\tTesting add method #11");
        final Locker<Gear> locker = new Locker<Gear>();
        assertTrue(locker.add(new Napkins()));
        assertTrue(locker.add(new SicknessBags()));
        assertTrue(locker.add(new Food()));
        System.out.println("\t\t\tOK");
    }
    
    /**
     * Try to mix medical supplies with sanitary products.
     */
    @Test
    public void testAdd12() {
        System.out.print("\tTesting add method #12");
        final Locker<Gear> locker = new Locker<Gear>();;
        assertTrue(locker.add(new Medkit()));
        assertTrue(locker.add(new Medkit()));
        assertTrue(locker.add(new Napkins()));
        assertTrue(locker.add(new SicknessBags()));
        System.out.println("\t\t\tOK");
    }
    
    /**
     * Try to mix sanitary products with food.
     */
    @Test
    public void testAdd13() {
        System.out.print("\tTesting add method #13");
        final Locker<Gear> locker = new Locker<Gear>();
        assertTrue(locker.add(new SicknessBags()));
        assertTrue(locker.add(new Food()));
        assertTrue(locker.add(new Napkins()));
        assertFalse(locker.add(new Medkit()));
        System.out.println("\t\t\tOK");
    }
    
    /**
     * Test generics.
     */
    @Test
    public void testGenerics() {
        System.out.print("\tTesting add method #13");
        final Locker<Medkit> locker1 = new Locker<Medkit>();
        assertTrue(locker1.add(new Medkit()));
        final Locker<Pillows> locker2 = new Locker<Pillows>();
        assertTrue(locker2.add(new Pillows()));
        System.out.println("\t\t\tOK");
    }
    
    /**
     * Do this after all tests have run.
     */
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finished testing class Locker");
    }
}