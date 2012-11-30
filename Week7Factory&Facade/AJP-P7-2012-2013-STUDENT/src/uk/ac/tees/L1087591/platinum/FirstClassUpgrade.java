
package uk.ac.tees.L1087591.platinum;


/**FirstClassUpgrade is responsible for the Upgrading to first class and adding the price.
 *
 * @author Anastasov
 */
public class FirstClassUpgrade extends FlightUpgrade {
    
   /**
     * @param cost represent the cost for first class upgrade.
     */
    final double cost = 217;
    
    /**FirstClassUpgrade calls the superclass constructor to pass the object.
     * 
     * @param flight 
     */
    public FirstClassUpgrade(Flight flight) {
        super(flight);
    }
    
    @Override
    public double getCost() {
        return cost + flight.getCost();
    }
}
