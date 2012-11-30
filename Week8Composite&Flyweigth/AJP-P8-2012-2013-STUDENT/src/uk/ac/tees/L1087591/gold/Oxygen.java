package uk.ac.tees.L1087591.gold;

/**Oxygen is responsible for Oxygen item
 *
 * @author Anastasov
 */
public class Oxygen extends Gear{
    
    Info oxygen;
    
    
    /**
     * OXYGEN_WEIGHT represent the weight of the Oxygen.
     */
    final int OXYGEN_WEIGHT = 15;
    
    /**
     * OXYGEN_CODE represent the code for the Oxygen.
     */
    final char OXYGEN_CODE = 'm';
    
    
    /**getWeight return s the weight of the Oxygen.
     * 
     * @return OXYGEN_WEIGHT
     */
    @Override
    public int getWeight() {
        return OXYGEN_WEIGHT;
        
    }

    
    /**getCode returns the code of the Oxygen.
     * 
     * @return OXYGEN_CODE
     */
    @Override
    public char getCode() {
        return OXYGEN_CODE;
    }
    

}
