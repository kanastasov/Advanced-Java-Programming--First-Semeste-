
package uk.ac.tees.L1087591.bronze;

/**SriLankaFlight is responsible for flight to SriLanka.
 *
 * @author Anastasov
 */
public class SriLankaFlight extends Flight  {
    
    /**
     * @param cost store the current price for the flight.
     */
    final double cost = 254;
    
    /**SriLankaFlight() empty constructor.
     */
    public SriLankaFlight() {
        
    }
    
    
     @Override
    public double getCost() {
        return cost;
    }
}
