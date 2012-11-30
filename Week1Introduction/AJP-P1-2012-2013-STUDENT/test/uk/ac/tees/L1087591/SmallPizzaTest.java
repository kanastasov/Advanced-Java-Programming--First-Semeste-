package uk.ac.tees.L1087591;

import static org.junit.Assert.*;
import org.junit.Test;

/**SmallPizzaTest.java test the SmallPizza for working correct with testing examples
 * 
 * @author Anastasov
 */
public class SmallPizzaTest {
    
    /**
     * Testing the toString method.
     */
    @Test
    public void testToString() 
    {
        System.out.println("Check toString output in SmallPizza");
        String expectedResult, actualResult;
        final SmallPizza sp = new SmallPizza(9, "cheese", "tomato");
        expectedResult = "A pizza (9 inches) with cheese and tomato";
        actualResult = sp.toString();
        System.out.println(expectedResult);
        System.out.println(actualResult);
        assertEquals(expectedResult, actualResult);
        
        
        
       
    }
}
