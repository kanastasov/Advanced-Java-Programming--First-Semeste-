
package uk.ac.tees.L1087591.platinum;


/**BotswanaFlight is responsible for a flight to Botswana.
 *
 * @author Anastasov
 */
public class BotswanaFlight extends Flight {
    /**
     * @param cost store the current price for the flight.
     */
   final double cost = 154.0;
    
    /**BotswanaFlight() empty constructor.
     */
    public BotswanaFlight() {
        
    }
    
    
     @Override
    public double getCost() {
        return cost;
    }
    
    
}
