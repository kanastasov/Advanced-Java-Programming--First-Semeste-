package uk.ac.tees.L1087591;

import java.util.ArrayList;
import java.util.Random;

/** Cadet is a subclass of Soldier.
 * 
 * @author Anastasov
 */
public class Cadet extends Soldier
{
    /**
     * Faction is a Enum.java type.
     * and creates and object
     * @param obj creates an object of type Faction
     * @param SCRIN_POINTS set the points for Cadet SRIN
     * @param NOD_POINTS set the points for Cadet NOD
     * @param GDI_POINTS set the points for Cadet GDI
     */
    
    Faction obj;
    
    /**
     * 
     */
    final int SCRIN_POINTS = 15;
    final int NOD_POINTS = 20;
    final int GDI_POINTS = 25;
    Random generator = new Random();
      
      
      
    
    /**Cadet(Faction obj) takes on Faction object and initializes it.
     * @param obj initialize
     */
    public Cadet(Faction obj)
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
                System.out.println("Invalid data");
                break;
        }
    }
    
    @Override
    public String kill() 
    {
        StringBuilder msg = null;
        
        switch(obj)
        {           
            case SCRIN:
                msg =  new StringBuilder("A SCRIN cadet bites the dust: +" + totalPoints + "pts.\n");
                break;
                 
            case NOD:
                         msg = new StringBuilder("A NOD cadet bites the dust: +" + totalPoints + "pts.\n");
                break;
                            
            case GDI:
                msg = new StringBuilder("A GDI cadet bites the dust: +" + totalPoints + "pts.\n");
                break;
                
            default: 
                System.out.println("Invalid data");
                break;
        }
        
        return msg.toString();
    }
    
    
    
    
}