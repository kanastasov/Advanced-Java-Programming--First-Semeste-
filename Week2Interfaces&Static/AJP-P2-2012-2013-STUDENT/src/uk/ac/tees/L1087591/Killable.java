/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.L1087591;

/** Killable is an interface that all the subclasses of Vehicle and Soldier.
 * need to implement with the kill method
 * @author l1087591
 */
public interface Killable 
{
    /**kill() all the concrete classes that.
     * implement the Killable must implement the method kill()
     * @return points 
     */
    public String kill();
}
