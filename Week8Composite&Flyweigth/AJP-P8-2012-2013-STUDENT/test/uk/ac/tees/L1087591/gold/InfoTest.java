package uk.ac.tees.L1087591.gold;

/** <p>Describe the purpose of the class/interface/enum here.</p>
 *
 * <p>This program is part of AJP-P8-2012-2013-SOLUTION.</p>
 *
 * <p>AJP-P8-2012-2013-SOLUTION is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.</p>
 *
 * <p>This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.</p>
 *
 * <p>You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.</p>
 *
 * <p>Copyright Mark Truran m.a.truran@tees.ac.uk 24-Nov-2012 </p>
 */
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/** A set of unit tests to check the solution to the GOLD task.
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class InfoTest {
    
     /**
     * Do this before any tests have run.
     */
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing class Info");
    }
    
    /**
     * Make sure class Info is an enum.
     */
    @Test
    public void checkSuperclass() {
        System.out.print("\tChecking class Info is enum");
        assertEquals(Info.class.getSuperclass().getName(), "java.lang.Enum");
        System.out.println("\t\tOK");
    }
    
    /**
     * Make sure Info enumeration has correct number of values (3).
     */
    @Test
    public void checkNumberOfInfo() {
        System.out.print("\tChecking number of values in Info");
        final int numInfo = 7;
        assertEquals(numInfo, Info.values().length);
        System.out.println("\tOK");
    }
    
    /**
     * Make sure Info enumeration has right values.
     */
    @Test
    public void checkEnumInfo() {
        System.out.print("\tChecking values in Info");
        final Info[] list = Info.values();
        assertEquals("BLANKETS", list[0].name());
        assertEquals("PILLOWS", list[1].name());
        assertEquals("FOOD", list[2].name());
        assertEquals("MEDKIT", list[3].name());
        assertEquals("OXYGEN", list[4].name());
        assertEquals("NAPKINS", list[5].name());
        assertEquals("SICKNESSBAG", list[6].name());
        System.out.println("\t\t\tOK");
    }
    
     /**
     * Test of getWeight() method, of class Info. 
     */
    @Test
    public void testGetWeight() {
      System.out.print("\tChecking weights in Info");
      
//      Gear g;
      
      Info g = Info.BLANKETS;
      final int expectedValue1 = 2;
      assertEquals(expectedValue1, g.getWeight());
      
      g = Info.PILLOWS;
      final int expectedValue2 = 3;
      assertEquals(expectedValue2, g.getWeight());
      
   
      
      g = Info.FOOD;
      final int expectedValue3 = 10;
      assertEquals(expectedValue3, g.getWeight());
      
      g = Info.MEDKIT;
      final int expectedValue4 = 5;
      assertEquals(expectedValue4, g.getWeight());
      
      g = Info.OXYGEN;
      final int expectedValue5 = 15;
      assertEquals(expectedValue5, g.getWeight());
      
      g = Info.NAPKINS;
      final int expectedValue6 = 1;
      assertEquals(expectedValue6, g.getWeight());
      
      g = Info.SICKNESSBAG;
      final int expectedValue7 = 1;
      assertEquals(expectedValue7, g.getWeight());
      
      System.out.println("\t\tOK");
    }
    
     /**
     * Test of getWeight() method, of class Info. 
     */
    @Test
    public void testGetType() {
      System.out.print("\tChecking types in Info");
      Info g = Info.BLANKETS;
      final char expectedType1 = 'b';
      assertEquals(expectedType1, g.getCode());
      
      g = Info.PILLOWS;
      final int expectedType2 = 'b';
      assertEquals(expectedType2, g.getCode());
      
      g = Info.FOOD;
      final int expectedType3 = 'f';
      assertEquals(expectedType3, g.getCode());
     
      g = Info.MEDKIT;
      final int expectedType4 = 'm';
      assertEquals(expectedType4, g.getCode());
      
      g = Info.OXYGEN;
      final int expectedType5 = 'm';
      assertEquals(expectedType5, g.getCode());
      
      g = Info.NAPKINS;
      final int expectedType6 = 's';
      assertEquals(expectedType6, g.getCode());
      
      g = Info.SICKNESSBAG;
      final int expectedType7 = 's';
      assertEquals(expectedType7, g.getCode());
      
      System.out.println("\t\t\tOK");
    }

    /**
     * Do this after all tests have run.
     */
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finished testing class Info");
    }
}
