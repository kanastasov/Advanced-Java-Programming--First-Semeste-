package uk.ac.tees.L1087591.gold;

/**Pillows is responsible for Pillows items
 *
 * @author Anastasov
 */
public class Pillows extends Gear {
    
    Info pillows;
    
    
    /**
     * PILLOWS_WEIGHT represent the weight of the Pillows.
     */
    final int PILLOWS_WEIGHT = 3;
    
    /**
     * PILLOWS_CODE represent the code for the Pillows.
     */
    final char PILLOWS_CODE = 'b';
    
    
    /**getWeight return s the weight of the Pillows.
     * 
     * @return PILLOWS_WEIGHT
     */
    @Override
    public int getWeight() {
        return PILLOWS_WEIGHT;
    }

    
    /**getCode returns the code of the Pillows.
     * 
     * @return PILLOWS_CODE
     */
    @Override
    public char getCode() {
        return PILLOWS_CODE;
    }

}
