package uk.ac.tees.gold.L1087591;

import java.awt.Point;
import static org.junit.Assert.*;
import org.junit.Test;

/** A set of unit tests to exercise the NormalState class.
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class NormalStateTest {
    
    /**
     * Test of fire method, of class NormalState.
     */
    @Test
    public void testFire() {
        final Railgun railgun = new Railgun();
        final int numRounds = 6;
        final int x = 100;
        final int y = 340;
        
        // This fire mission should be completely successful
        String actualResult = railgun.fire(new Point(x, y), numRounds);
        String expectedResult = "Fire order: Success 6/6";
        System.out.println(actualResult);
        assertEquals(expectedResult, actualResult);
        
        // This fire mission should be partially successful
        actualResult = railgun.fire(new Point(x, y), numRounds);
        System.out.println(actualResult);
        expectedResult = "Fire order: Partial success 4/6";
        assertEquals(expectedResult, actualResult);
        
        // This fire mission should fail
        actualResult = railgun.fire(new Point(x, y), numRounds);
        System.out.println(actualResult);
        expectedResult = "Fire order: Failure 0/6";
        assertEquals(expectedResult, actualResult);
        
        // Check state change to NeedAmmo state
        assertEquals(railgun.getState().getClass(), NeedAmmoState.class); 
    }

    /**
     * Test of move method, of class NormalState. Should always succeed.
     */
    @Test
    public void testMove() {
        final Railgun railgun = new Railgun();
        final int x = 129;
        final int y = 444;
        final String actualResult = railgun.move(new Point(x, y));
        final String expectedResult = "Move order: Success";
//        System.out.println(actualResult);
        assertEquals(new Point(x, y), railgun.getPosition());
        assertEquals(expectedResult, actualResult);
    }
}
