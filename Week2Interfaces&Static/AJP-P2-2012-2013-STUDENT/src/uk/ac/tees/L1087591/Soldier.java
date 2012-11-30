package uk.ac.tees.L1087591;

import java.util.Random;

/**Soldier is a superclass for Cadet.java, Colonel.  and HeavyTank.java. 
 * and provide a global static variables for the totalPoints and totalisimo
 * @author Anastasov
 */
public abstract class Soldier  implements Killable      
{
     /**
     * @param totalPoints is a global variable for the Points of the Soldiers.
     * @param totalisimo is a global variable for all  the Points of the Soldiers
     */
    public static int totalPoints = 0;
    public static int totalisimo = 0;
     
    
    /**getPoints() return totalPoints
     * 
     * @return the toalPoints of Soldiers 
     */
    public int getPoints()
    {
        return Soldier.totalPoints;   
    }
    /**sePoints(int totalPoints) set the point of the Vehicles.
     * @param totalPoints  setting the current points to the global ones
     */
    public void setPoints(int totalPoints)
    {
        this.totalPoints = totalPoints;
    }
    
    
    /** Soldier(Faction obj) takes an object of Faction 
     * from the interface Killable
     * @param obj 
     */
    public Soldier(Faction obj)
    {
        
    }
    
}