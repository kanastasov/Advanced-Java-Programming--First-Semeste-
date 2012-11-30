/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.L1087591.platinum;


/**RefreshmentUpgrade is responsible for the refreshments and adding the cost.
 *
 * @author Anastasov
 */
public class RefreshmentUpgrade extends FlightUpgrade {
    
    /**
     * @param cost represent the cost for priority boarding.
     */
    final double cost = 12;
    
    /**RefreshmentUpgrade calls the superclass constructor to pass the object.
     * 
     * @param flight 
     */
    public RefreshmentUpgrade(Flight flight) {
        super(flight); 
    }
    
    @Override
     public double getCost() {
        return cost + flight.getCost();
    }
}
