
package uk.ac.tees.L1087591.silver;

/**HL777b is responsible for Vehicle.
 *
 * @author Anastasov
 */
public class HL777b implements Vehicle {
    
    /**
     * @param flightPlan converts the plan of the flight
     */
   String flightPlan;
   
   /**
    * @param capacity stores the capacity of the passengers on a flight.
    */
   int capacity;
   
   /**
    * @param emptySeats stores the empty seats on a flight.
    */
   int emptySeats;
   
   /**
    * @param count when count is 0 is responsible for
    * the origin when is 1 is responsible for the destination.
    */
    static int count = 2;
   

    /**HL777b() initialized the default values.
     * 
     * @param flightPlan represent the plan of the flight.
     * @param capacity represent the capacity of seats.
     * @param emptySeats represent the emptySeats in flight.
     */
    public HL777b(String flightPlan, int capacity, int emptySeats) {
        this.flightPlan = flightPlan;
        this.capacity = capacity;
        this.emptySeats = emptySeats;
    }

   
    @Override
    public String gerFlightPlan() {
        System.out.println("*****" + count);
        final String[] splits = flightPlan.split("-");
            for (String asset : splits) {
                  flightPlan = asset;
                  if (count % 2 == 0) {
                          break;
                  }
            }
            count++;
      return flightPlan.toLowerCase();
    }

    @Override
    public String getCapacity() {
       return flightPlan;
    }

    @Override
    public int getEmptySeat() {
        return capacity - emptySeats;
    }
}
