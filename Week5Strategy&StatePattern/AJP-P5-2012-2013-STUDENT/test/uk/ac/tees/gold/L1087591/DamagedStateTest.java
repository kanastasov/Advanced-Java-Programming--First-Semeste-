package uk.ac.tees.gold.L1087591;

import java.awt.Point;
import static org.junit.Assert.*;
import org.junit.Test;

/** A set of unit tests to exercise the NeedAmmo class.
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class DamagedStateTest {
    
    /**
     * Test of fire method, of class DamagedState. Gun should fire at 50%
     * rate until exhausted. When exhausted, it should change to noammo state.
     */
    @Test
    public void testFire() {
        final Railgun railgun = new Railgun();
        railgun.setState(new DamagedState());
        final int numRounds = 10;
        final int x = 199;
        final int y = 993;
        String actualResult = railgun.fire(new Point(x, y), numRounds);
        String expectedResult = "Fire order: Partial success 5/10";
        //System.out.println(actualResult);
        assertEquals(expectedResult, actualResult);
        actualResult = railgun.fire(new Point(x, y), numRounds);
        //System.out.println(actualResult);
        expectedResult = "Fire order: Partial success 5/10";
        assertEquals(expectedResult, actualResult);
        actualResult = railgun.fire(new Point(x, y), numRounds);
        //System.out.println(actualResult);
        expectedResult = "Fire order: Failure 0/10";
        assertEquals(expectedResult, actualResult);
        // Check the state transition to NeedAmmo state
        assertEquals(railgun.getState().getClass(), NeedAmmoState.class); 
    }

    /**
     * Move order should always result in failure.
     */
    @Test
    public void testMove() {
        final Railgun railgun = new Railgun();
        final int x1 = 227;
        final int y1 = 767;
        railgun.setPosition(new Point(x1, y1));
        railgun.setState(new DamagedState());
        final int x2 = 227;
        final int y2 = 767;
        final String actualResult = railgun.move(new Point(x2, y2));
        final String expectedResult = "Move order: Failure";
        //System.out.println(actualResult);
        assertEquals(expectedResult, actualResult);
        assertEquals(new Point(x1, y1), railgun.getPosition());
        
//        int counter = 0;
//           for ( ; ; )
//        {
//    System.out.println("counter " + ++counter);
//    // your code goes here
//        }
    }
}
