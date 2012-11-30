package uk.ac.tees.L1087591.platinum;


/**FlightUpgrade is responsible for all the upgrades to the flights for
 * web/refreshments/entertainment/first class/priority.
 *
 * @author Anastasov
 */
public abstract class FlightUpgrade extends Flight {
    /**
     * @param flight objct to wrap the extra cost to the base cost.
     */
    protected Flight flight;
    
    /**
     * @param cost store the extra cost and pass it to the object flight.
     */
    double cost;

   
    /**FlightUpgrade() wrap the object to initialize the field in the constructor.
     * 
     * @param flight 
     */
    public FlightUpgrade(Flight flight) {
        this.flight = flight;
    }
    
    /**getCost(). 
     * 
     * @return the cost to the extra service + the base cost of the flight.
     */
    @Override
     public double getCost() {
        return flight.getCost() + cost;
     }
}
