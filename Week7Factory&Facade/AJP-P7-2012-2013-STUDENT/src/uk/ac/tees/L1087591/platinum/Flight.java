
package uk.ac.tees.L1087591.platinum;


/**Flight is a abstract class.
 * that all the flight state classes extends 
 *
 * @author Anastasov
 */
public abstract class Flight {
    /**
     * @param cost store the cost for the fligth.
     */
    protected double cost;

    /**getCost() bastract method to. 
     * 
     * @return the cost of the base flights without the extras
     */
    public abstract double getCost(); 
}
