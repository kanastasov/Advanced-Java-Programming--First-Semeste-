package uk.ac.tees.L1087591;

/**LightTank.java is a subclass of the Vehicle.
 * and implements the kill() method
 * @author l1087591
 */

public class LightTank extends Vehicle    
{
    /**
     * Faction is a Enum.java type.
     * and creates and object
     * @param obj creates an object of type Faction
     * @param SCRIN_POINTS creates the points for LightTank SRIN
     * @param NOD_POINTS set the points for LightTank NOD
     * @param GDI_POINTS set the points for LightTank GDI
     */
    Faction obj;
    final int SCRIN_POINTS = 150;
    final int NOD_POINTS = 175;
    final int GDI_POINTS = 150;
    
    /**LightTank Constructor takes an faction obj.
     * @param obj initializes the lighttank with faction value 
     */
    public LightTank(Faction obj)
    {
        super(obj);
        this.obj = obj;
        
        switch(obj)
        {           
            case SCRIN:
                Vehicle.totalPoints = SCRIN_POINTS;
                Vehicle.totalisimo += SCRIN_POINTS;
                break;
                 
            case NOD:
                 Vehicle.totalPoints =  NOD_POINTS;
                 Vehicle.totalisimo += NOD_POINTS;
                break;
                            
            case GDI:
                Vehicle.totalPoints = GDI_POINTS;
                Vehicle.totalisimo += GDI_POINTS;
                break;
            
            default:
                System.out.println("Invalid data:");
                break;
        }
        
    }
    @Override
    public String kill() 
    {
        StringBuilder killObject = null;
        switch(obj)
        {           
            case SCRIN:
                killObject =  new StringBuilder("A SCRIN light tank is destroyed: +" + totalPoints + "pts.\n");
                break;
                 
            case NOD:
                 killObject = new StringBuilder("A NOD light tank is destroyed: +" + totalPoints + "pts.\n");
                 break;
                            
            case GDI:
               
                killObject = new StringBuilder("A GDI light tank is destroyed: +" + totalPoints + "pts.\n");
                break;
                
            default:
                System.out.println("Invalid data:");
                break;
        }
        
        return killObject.toString();
        
        
    }

    
}