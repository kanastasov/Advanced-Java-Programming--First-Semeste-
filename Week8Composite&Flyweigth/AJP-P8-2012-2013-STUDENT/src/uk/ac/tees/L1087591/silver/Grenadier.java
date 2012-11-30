/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.L1087591.silver;

/**Grenadier is conrete class implementing the Deployable.
 *
 * @author Anastasov
 */
public class Grenadier extends Deployable {

    /**
     * grenadierStrength represents the strength of the grenadier.
     */
    private final int grenadierStrength = 3;
    
    @Override
    public int getStrength() {
        return grenadierStrength;
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
