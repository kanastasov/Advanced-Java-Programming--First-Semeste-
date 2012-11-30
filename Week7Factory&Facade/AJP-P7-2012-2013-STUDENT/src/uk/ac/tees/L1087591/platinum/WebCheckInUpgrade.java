
package uk.ac.tees.L1087591.platinum;


/**WebCheckInUpgrade is responsible for the web check in and adding the cost.
 *
 * @author Anastasov
 */
public class WebCheckInUpgrade extends FlightUpgrade {
    
     /**
     * @param cost represent the cost for web check in.
     */
    final double cost = 27;
    
    /**WebCheckInUpgrade calls the superclass constructor to pass the object.
     * 
     * @param flight 
     */
    public WebCheckInUpgrade(Flight flight) {
        super(flight); 
    }
    
    @Override
    public double getCost() {
        return cost + flight.getCost();
    }
}
