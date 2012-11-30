
package uk.ac.tees.L1087591.silver;

/**Vehicle Adapter is an adapter class that colides the plane and the vehicle.
 *
 * @author Anastasov
 */

public class VehicleAdapter implements Plane {
    /**
     *@param vehicle represent a vehicle obj. 
     */
    Vehicle vehicle;
    
    /**VehicleAdapter initialize an empty obj.
     * @param vehicle 
     */
    VehicleAdapter(Vehicle vehicle)  {
        this.vehicle = vehicle;
    }

    @Override
    public int getPassengerCount() {
         return  vehicle.getEmptySeat();
    }

    @Override
    public String getOrigin() {
        return vehicle.gerFlightPlan();
    }

    @Override
    public String getDestination() {
          return vehicle.gerFlightPlan();
    }
}