/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.gold.L1087591;

import java.awt.Point;


/**Railgun is a concrete class that should
 * have an object of all the classes that 
 * implement the interface RailgunState.
 *
 * @author Anastasov
 */
public class Railgun 
{
    /**
     * @param ammo represent the current ammos.
     */
     int ammo = 0;
     /**
     * @param MAX_AMMO represent the maximum ammos.
     */
      public static int MAX_AMMO = 10;
    int test = 10;
    /**
     *@param position represent the possition of the state 
     */
    Point position;
    
    /**
     * point represent the point of the coordinations.
     */
    Point point;
    
    /**
     * result represent the expected result.
     */
    int result = 6;
    
    /**
     * @param damagedState represent an object of RailgunState
     */
    RailgunState damagedState ;
    
    /**
     * needAmmoState represent an RailgunState
     */
    RailgunState needAmmoState ;
    
    /**
     * normalState represent an object of normal State.
     */
    RailgunState normalState = new NormalState() ;
    
     /**
     * @param state represent the state of the RailGun
     */
    RailgunState state = normalState; 
    
    /**Railgun default constructor.
     * 
     */
    Railgun()
    {
        damagedState = new DamagedState();
        needAmmoState = new NeedAmmoState();
        normalState = new NormalState();
    }
    
    /** fire().
     * @param p is the coordinates of the target
     * @param rounds number of rounds HQ has requested
     * @return success/ partial success/ failure
     */
    public String fire(Point p, int rounds)
    {
         return state.fire(p, rounds);
    }
    
    /**  move(). success or failure only the string
     * @param p is the destination
     * @return success or failure when a railgun can move to the destination
     */
    public String move(Point p)
    {
        position = p;
        return state.move(p);
    }
    
    /**getPosition().
     * @return the position of the point 
     */
    public Point getPosition()
    {            
        return position ;
    }
    
    /**setPosition sets the position of the point.
     * 
     * @param position 
     */
    void setPosition(Point position)
    {
        this.position = position;
    }

    /**getState gets the state.
     * 
     * @return 
     */
     public RailgunState getState()
    {
        return state.getState();
    }

     /**setAmmo sets the ammonitions.
      * 
      * @param ammo 
      */
    void setAmmo(int ammo) 
    {
        this.ammo = ammo;
    }

    /**getPoint gets the point.
     * 
     * @return point
     */
    public Point getPoint() {
        return point;
    }

    /**getDamagedState gets the damagedState.
     * 
     * @return damagedState
     */
    public RailgunState getDamagedState() {
        return damagedState;
    }

    /**getNeedAmmoState gets the needAmmoState
     * 
     * @return needAmmoState
     */
    public RailgunState getNeedAmmoState() {
        return needAmmoState;
    }

    /**getNormalState gets the normalState.
     * 
     * @return normalState
     */
    public RailgunState getNormalState() {
        return normalState;
    }
    
    /**getAmmo gets the ammo.
     * 
     * @return MAX_AMMO
     */
    int getAmmo()
    {
        return MAX_AMMO;
    }
    
    /**setState sets the railgunState.
     * 
     * @param state 
     */
    void setState(RailgunState state)
    {
         this.state = state;
    }
    
    /**setState sets the needAmmoState.
     * 
     * @param needAmmoState 
     */
    void setState(NeedAmmoState needAmmoState)
    {
        this.state = needAmmoState;
    }
    
    /**setState sets the normal state
     * 
     * @param normal 
     */
    void setState(NormalState normal)
    {
        this.state = normal;
    }
    
    /**setState sets the damaged state.
     * 
     * @param damagedState 
     */
    void setState(DamagedState damagedState)
    {
        this.state = damagedState;
    }
}
