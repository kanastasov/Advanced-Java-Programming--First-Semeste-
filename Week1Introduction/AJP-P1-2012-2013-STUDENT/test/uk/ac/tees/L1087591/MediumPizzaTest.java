
package uk.ac.tees.L1087591;

import static org.junit.Assert.*;
import org.junit.Test;

/**MediumPizzaTest.java test the MediumPizza for working correct with testing examples
 *
 * @author Anastasov
 */
public class MediumPizzaTest 
{
    
      /**
     * Testing the toString method.
     */
    @Test
    public void testToString() 
    {
        System.out.println("Check toString output in MediumPizza");
        String expectedResult2, actualResult2;
        final MediumPizza mediumPizza = new MediumPizza(12, "ham", "pineapple", "cheese");
        expectedResult2 = "A pizza (12 inches) with ham and pineapple and a cheese crust";
        actualResult2 = mediumPizza.toString();
        System.out.println(expectedResult2);
        System.out.println(actualResult2);
        assertEquals(expectedResult2, actualResult2);
    }

    
}
