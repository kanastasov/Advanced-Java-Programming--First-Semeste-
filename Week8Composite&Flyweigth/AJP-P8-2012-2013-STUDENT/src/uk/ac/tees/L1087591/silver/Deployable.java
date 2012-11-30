
package uk.ac.tees.L1087591.silver;


/**Deployable is implemented by Soldier and Squad.
 *
 * @author Anastasov
 */
public abstract class Deployable {
    
    /**getStrength gets the Strength of the Soldier.
     * 
     * @return the strength
     */
    public abstract int getStrength();
    
    /**attack represent the attack of Soldier, Granadier, machineGunner.
     * 
     * @param deployable takes an deployable as argument
     * @return true if successful attack.
     */
    abstract boolean  attack(Deployable deployable);
    
}
