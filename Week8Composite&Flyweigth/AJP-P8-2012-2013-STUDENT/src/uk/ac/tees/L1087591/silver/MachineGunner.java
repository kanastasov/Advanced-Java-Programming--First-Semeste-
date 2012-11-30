/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.L1087591.silver;

/**MachineGunner is a concrete class that implement the Deployable interface.
 *
 * @author Anastasov
 */
public class MachineGunner extends Deployable{

    /**
     * machineGunnerStrength represents the strength of the machine gunner.
     */
    private final int machineGunnerStrength = 5;
    
    @Override
    public int getStrength() {
        return machineGunnerStrength;
    }
    
    
    @Override
     boolean attack(Deployable deployable) {
         if (this.getStrength() >= deployable.getStrength()) {
             return true;  
          } else {
            return false;   
          }
    }
    
}
