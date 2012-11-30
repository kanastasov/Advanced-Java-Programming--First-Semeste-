package uk.ac.tees.L1087591;

/** Major.java is subclass of Soldier and is responsible for the Major objects.
 * @author Anastasov
 */
public class Major extends Soldier
{
    
     /**
     * Faction is a Enum.java type.
     * and creates and object
     * @param obj creates an object of type Faction
     * @param SCRIN_POINTS creates the points for Major_SRIN
     * @param NOD_POINTS set the points for Major NOD
     * @param GDI_POINTS set the points for Major GDI
     */
    Faction obj;
    final int SCRIN_POINTS = 70;
    final int NOD_POINTS = 60;
    final int GDI_POINTS = 55;
    
    public Major(Faction obj)
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
                 Soldier.totalPoints =  NOD_POINTS;
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
                killObject =  new StringBuilder("A SCRIN major explodes into pieces: +" + totalPoints + "pts.\n");
                break;
                 
            case NOD:
                 killObject = new StringBuilder("A NOD major explodes into pieces: +" + totalPoints + "pts.\n");
                 break;
                            
            case GDI:
                killObject = new StringBuilder("A GDI major explodes into pieces: +" + totalPoints + "pts.\n");
                break;
                
           default:
                System.out.println("Invalid data:");
                break;
        }
        return killObject.toString();
    }
}