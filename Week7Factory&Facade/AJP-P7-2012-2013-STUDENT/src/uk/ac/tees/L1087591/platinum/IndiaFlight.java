/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.L1087591.platinum;


/**IndiaFlight represent a flight to India.
 *
 * @author Anastasov
 */
public class IndiaFlight extends Flight {
    
    /**
     * @param cost store the current price for the flight.
     */
    final double cost = 212;
    
    /**IndiaFlight() empty Constructor.
     * 
     */
    public IndiaFlight() {
        
    }

    @Override
    public double getCost() {
        return cost;
    }
    
}
