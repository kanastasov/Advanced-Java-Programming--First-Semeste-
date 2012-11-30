
package uk.ac.tees.L1087591;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**LargePizzaTest.java test the LargePizza for working correct with testing examples
 *
 * @author Anastasov
 */
public class LargePizzaTest 
{


    
      /**
     * Testing the toString method.
     */
    @Test
    public void testToString() 
    {
        System.out.println("Check toString output in LargePizza");
        String expectedResult3, actualResult3;
        final LargePizza largePizza = new LargePizza(15, "sausage", "bacon", "cheese", "deep-pan");
        expectedResult3 = "A pizza (15 inches) with sausage and bacon and a cheese crust, deep-pan";
        actualResult3 = largePizza.toString();
        System.out.println(expectedResult3);
        System.out.println(actualResult3);
        assertEquals(expectedResult3, actualResult3);
    }

    

    
}
