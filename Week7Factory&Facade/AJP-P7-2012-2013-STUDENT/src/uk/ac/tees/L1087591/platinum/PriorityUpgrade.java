
package uk.ac.tees.L1087591.platinum;


/**PriorityUpgrade is responsible for the priority boarding.
 *
 * @author Anastasov
 */
public class PriorityUpgrade extends FlightUpgrade {
    
   /**
     * @param cost represent the cost for priority boarding.
     */
    final double cost = 19;
    
    /**PriorityUpgrade calls the superclass constructor to pass the object.
     * 
     * @param flight 
     */
    public PriorityUpgrade(Flight flight) {
        super(flight); 
    }
    
    @Override
    public double getCost() {
        return cost + flight.getCost();
    }
    
}
