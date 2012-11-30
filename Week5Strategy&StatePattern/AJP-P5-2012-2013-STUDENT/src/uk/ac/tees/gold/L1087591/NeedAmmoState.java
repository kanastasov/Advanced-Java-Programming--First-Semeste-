
package uk.ac.tees.gold.L1087591;

import java.awt.Point;

/**NeedAmmoState represent the state of need ammonitions.
 *
 * @author Anastasov
 */
public class NeedAmmoState implements RailgunState
{
    /**
     * railgun object of type Railgun.
     */
    Railgun railgun  ;  
    
    /**
     * MAX_AMMO is the maximum ammonitions.
     */
    static int MAX_AMMO = 0;
    
    /**
     * result is the expected result.
     */
    int result = 6;
    
    /**
     * state is the railgunState object.
     */
    RailgunState state ;
    
    /**NeedAmmoState default constructor.
     * 
     */
    NeedAmmoState()
    {
    }
    
    @Override
    public String fire(Point p, int rounds) 
    {
        MAX_AMMO -= rounds;
        if((MAX_AMMO >= 0) && (rounds == result))
        {
            System.out.println("Seccuees: " + MAX_AMMO);
            return "Fire order: Success 6/6";
        }
        else if((MAX_AMMO < 0) && (MAX_AMMO != -result))
        {
              System.out.println("Partial: " + MAX_AMMO);
              MAX_AMMO = 0;
              System.out.println("Partial: " + MAX_AMMO);
              state = new NeedAmmoState();
              return "Fire order: Failure 0/4";
        }
        else 
        {
             System.out.println("Fail: " + MAX_AMMO);
             state = new NeedAmmoState();
             return "Fire order: Failure 0/6";
        }
    }
    
    @Override
    public String move(Point p)
    {
        return "Move order: Success";
    }
    
    /**getPosition().
     * @return the possstion of the point 
     */
    public Point getPosition()
    {             
        return railgun.getPosition();
    }
    
    /**setState sets the state of the railgun state.
     * 
     * @param state 
     */
    void setState(RailgunState state)
    {
         this.state = state;
    }
    
    /**setState sets the state of the needAmmoState.
     * 
     * @param needAmmoState 
     */
    void setState(NeedAmmoState needAmmoState)
    {
        this.state = needAmmoState;
    }
    
    
    /**setState sets the state of the normal state.
     * 
     * @param normal 
     */
    void setState(NormalState normal)
    {
        this.state = normal;
    }
    
    /**setState sets the state of the damaged state.
     * 
     * @param damagedState 
     */
    void setState(DamagedState damagedState)
    {
        this.state = damagedState;
    }
        
    /**getState gets the state of the needAmmoState.
     * 
     * @return 
     */
    public RailgunState getState()
    {
        state = new NeedAmmoState();
        return state;
    }

}
