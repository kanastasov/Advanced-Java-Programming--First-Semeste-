
package uk.ac.tees.L1087591.silver;

/**Vehicle have the gerFligtPlan(), getCapacity(), getEmptySeat().
 *
 * @author Anastasov
 */
public interface Vehicle {
    /**gerFlightPlan().
     * 
     * @return flight plan.
     */
    public abstract String gerFlightPlan();
    
     /**getCapacity().
     * 
     * @return flight capacity.
     */
    public abstract String getCapacity();
    
     /**getEmptySeat().
     * 
     * @return flight empty seats.
     */
    public abstract int getEmptySeat();
}