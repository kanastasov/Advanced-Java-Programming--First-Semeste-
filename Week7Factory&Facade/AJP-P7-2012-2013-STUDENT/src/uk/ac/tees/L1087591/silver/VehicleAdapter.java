
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
        return getDestination();
                
    }

    
    /**
     * count is a used as a counter.
     */
     static int count = 2;
     
     /**
      * THREE is used to represent the number 3.
      */
     final static int THREE = 3;
     
     /**
      * flightPlan is responsible for the plan of the flihgt.
      */
    String flightPlan = "";
   
    @Override
    public String getDestination() {
        String temp = "";
        flightPlan = vehicle.gerFlightPlan().toLowerCase();
        final String[] splits = flightPlan.split("-");
            for (String asset : splits) {
                  flightPlan = asset;
                temp = asset;
                  if (count % 2 == 0) {
                       System.out.println("ASSeett inside  " + asset  + count);
                          System.out.println("FlightPlam inside  " + flightPlan + count);
                          count++;
                          break;
                  } else if (count % THREE == 0) {      
                      return flightPlan;
                      
                  }
            }
      return flightPlan.toLowerCase();
    }
    
    
   /**gerFlightPlan gets the plan of the flight origin-destination.
    * 
    * @return flightPlan
    */
      public String gerFlightPlan() {
         return flightPlan.toLowerCase();
    }
}