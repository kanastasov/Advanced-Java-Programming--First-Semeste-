
package uk.ac.tees.L1087591.platinum;


/**EntertainmentUpgrade responsible for entertaining and adding the cost of entertaining.
 *
 * @author Anastasov
 */
public class EntertainmentUpgrade extends FlightUpgrade {
    
    /**
     * @param cost represent the cost for entertainment.
     */
    final double cost = 9.50;
    
    /**EntertainmentUpgrade calls the superclass constructor to pass the object.
     * 
     * @param flight 
     */
    public EntertainmentUpgrade(Flight flight) {
        super(flight);
    }
    
    
    @Override
    public double getCost() {
	return cost +   flight.getCost();
    }
}
