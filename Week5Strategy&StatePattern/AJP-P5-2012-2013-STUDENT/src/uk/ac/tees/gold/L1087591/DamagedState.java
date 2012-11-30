/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.gold.L1087591;

import java.awt.Point;

/**DamagedState represent a damages state.
 *
 * @author Anastasov
 */
public class DamagedState implements RailgunState
{

    /**
     * railgun object of type Railgun.
     */
    Railgun railgun  ; 
    
    /**
     * MAX_AMMO max ammonitions.
     */
    static int MAX_AMMO = 11;
    
    /**
     * result what the result is.
     */
    int result = 6;
    
    /**
     * state object of type Railgun.
     */
    RailgunState state ;
    
    
    /**DamagedState default constructor.
     * 
     */
    DamagedState()
    {
    }
    
    @Override
    public String fire(Point p, int rounds) 
    {
        MAX_AMMO -= 5;
        if(MAX_AMMO > 0) 
         {
              System.out.println("Partial: " + MAX_AMMO);
              System.out.println("Partial: " + MAX_AMMO);
              state = new NeedAmmoState();
              return "Fire order: Partial success "  + "5/" + rounds;
        }
        else 
        {
             System.out.println("Fail: " + MAX_AMMO);
             return "Fire order: Failure 0/10";
        }
    }
    
    @Override
    public String move(Point p)
    {
        return "Move order: Failure" ;
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
