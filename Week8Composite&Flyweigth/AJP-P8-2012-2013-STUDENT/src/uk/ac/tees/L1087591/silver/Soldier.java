
package uk.ac.tees.L1087591.silver;


/**Soldier is a concrete class that implements the interface Deployable.
 *
 * @author Anastasov
 */
public class Soldier extends Deployable {

    @Override
    public int getStrength() {
        return 1;
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
