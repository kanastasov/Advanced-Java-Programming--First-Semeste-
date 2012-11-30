package uk.ac.tees.L1087591;

/** The Colonel.java is a subclass of Soldier
 * and is responsible for all the Colonel objects
 * 
 * @author Anastasov
 */
public class Colonel extends Soldier
{
    
    /**
     * Faction is a Enum.java type.
     * and creates and object
     * @param obj creates an object of type Faction
     * @param SCRIN_POINTS creates the points for Colonel_SRIN
     * @param NOD_POINTS set the points for Colonel NOD
     * @param GDI_POINTS set the points for Colonel GDI
     */
    Faction obj;
    final int SCRIN_POINTS = 90;
    final int NOD_POINTS = 95;
    final int GDI_POINTS = 100;
    
    
     /**Colonel(Faction obj) takes on Faction object and initializes it
     * @param obj initialize
     */
    public Colonel(Faction obj)
    {
        super(obj);
        this.obj = obj;
        
        switch(obj)
        {           
            case SCRIN:
                Soldier.totalPoints = SCRIN_POINTS;
                Soldier.totalisimo += SCRIN_POINTS;
                break;
                 
            case NOD:
                 Soldier.totalPoints = NOD_POINTS;
                 Soldier.totalisimo += NOD_POINTS;
                break;
                            
            case GDI:
                Soldier.totalPoints = GDI_POINTS;
                Soldier.totalisimo += GDI_POINTS;
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
                killObject =  new StringBuilder("A SCRIN colonel retires, permanently: +" + totalPoints + "pts.\n");
                break;
                 
            case NOD:
                 killObject = new StringBuilder("A NOD colonel retires, permanently: +" + totalPoints + "pts.\n");
                 break;
                            
            case GDI:
                killObject = new StringBuilder("A GDI colonel retires, permanently: +" + totalPoints + "pts.\n");
                break;
             
            default:
                System.out.println("Invalid data:");
                break;
        }
        return killObject.toString();
    }
}