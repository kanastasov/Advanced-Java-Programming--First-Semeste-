package uk.ac.tees.L1087591;

/**Vehicle is a superclass for LightTank.java and HeavyTank.java. 
 * and provide a global static variables for the totalPoints and totalisimo
 * @author Anastasov
 */
public abstract class Vehicle  implements Killable      
{
    /**
     * @param totalPoints is a global variable for the Points of the Vehicles.
     * @param totalisimo is a global variable for all  the Points of the Vehicles
     */
    public static int totalPoints = 0;
    public static int totalisimo = 0;
    
    /**getPoints() return totalPoints.
     * @return the toalPoints of Vehicle 
     */
    public int getPoints()
    {
        return totalPoints;   
    }
    
    
    /** Vehicle(Faction obj) takes an object of Faction. 
     * from the interface Killable
     * @param obj 
     */
    public Vehicle(Faction obj)
    {
        
    }
    
}