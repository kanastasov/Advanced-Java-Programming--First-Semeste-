package uk.ac.tees.L1087591.gold;

/**Medkit is responsible for Medkit items
 *
 * @author Anastasov
 */
public class Medkit extends Gear{

    Info medKit;
    
    
    /**
     * MEDKIT_WEIGHT represent the weight of the Medkit.
     */
    final int MEDKIT_WEIGHT = 5;
    
    /**
     * MEDKIT_CODE represent the code for the Medkit.
     */
    final char MEDKIT_CODE = 'm';
    
    
    /**getWeight return s the weight of the Medkit.
     * 
     * @return MEDKIT_WEIGHT
     */
    @Override
    public int getWeight() {
        return MEDKIT_WEIGHT;
    }

    
    /**getCode returns the code of the Medkit.
     * 
     * @return MEDKIT_CODE
     */
    @Override
    public char getCode() {
        return MEDKIT_CODE;
    }
}
