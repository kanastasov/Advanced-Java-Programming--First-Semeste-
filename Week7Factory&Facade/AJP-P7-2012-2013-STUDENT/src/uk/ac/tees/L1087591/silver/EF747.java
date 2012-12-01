
package uk.ac.tees.L1087591.silver;

/**EF747 is responsible for the Plane.
 *
 * @author Anastasov
 */
public class EF747 implements Plane {
    
    /**
     * @param origin represent the origin of the flight.
     */
   String origin;
   
   /**
    * @param destination represent the destination of the flight.
    */
   String destination;
   
   /**
    * @param count represent the count of the passengers.
    */
   int count;
    
   /**EF747 initialize the default values.
    * @param origin initialize the origin
    * @param destination initialize the destination
    * @param count initialize the count
    */
    public EF747(String origin, String destination, int count) {
        this.origin = origin;
        this.destination = destination;
        this.count = count;
    }

    @Override
    public int getPassengerCount() {
        return count;
    }

    @Override
    public String getOrigin() {
        
        
        
        return origin;
    }

    @Override
    public String getDestination() {
        return origin;
    }
}