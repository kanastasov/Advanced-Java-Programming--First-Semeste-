/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.gold.L1087591;

import java.awt.Point;

/**NormalState is a concrete state.
 * @author Anastasov
 */
public class NormalState implements RailgunState {

   /**
     * railgun object of type Railgun.
     */
    Railgun railgun  ;  
    
    /**
     * MAX_AMMO is the maximum ammonitions.
     */
    static int MAX_AMMO = 10;
    
    /**
     * result is the expected result.
     */
    int result = 6;
    
    /**
     * state is the railgunState object.
     */
    RailgunState state ;
    
    /**
     * position represent the possition of the Soldiers.
     */
    Point position;
    
    /**NormalState is a default constructor.
     * 
     */
    NormalState()
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
              return "Fire order: Partial success 4/6";
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
        return "Move order: Success" ;
    }
    
   /**setState sets the current state to the railgunState.
    * 
    * @param state 
    */
    void setState(RailgunState state)
    {
         this.state = state;
    }
    /**setState sets the current state to the needAmmoState.
     * 
     * @param needAmmoState 
     */
    void setState(NeedAmmoState needAmmoState)
    {
        this.state = needAmmoState;
    }
    
    /**setState sets the current state to the normal state.
     * 
     * @param normal 
     */
    void setState(NormalState normal)
    {
        this.state = normal;
    }
    /**setState sets the current state to damaged state.
     * 
     * @param damagedState 
     */
    void setState(DamagedState damagedState)
    {
        this.state = damagedState;
    }
        
     /**getState gets the state.
      * 
      * @return state
      */   
    public RailgunState getState()
    {
        return state;
    }
    /**getPosition().
     * @return the position of the point 
     */
    public Point getPosition()
    {             
        return position ;
    }
    
    /**setPosition sets the position of the soldiers.
     * 
     * @param position 
     */
    void setPosition(Point position)
    {
        this.position = position;
    }
   
}
