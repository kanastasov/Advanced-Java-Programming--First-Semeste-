
package uk.ac.tees.L1087591.silver;

/**Plane have the getOrigin(), getDestination(), getPassengerCount().
 *
 * @author Anastasov
 */
public interface Plane {
 
    /**getOrigin() represent the origin of the flight.
     * @return origin.
     */
    public abstract String getOrigin();
    
    /**getDestination represent the destination of the flight.
     * @return destination.
     */
    public abstract String getDestination();
    
    /**getPassengerCount represent the passenger count.
     * @return passenger.
     */
    public abstract int getPassengerCount();
    
}

