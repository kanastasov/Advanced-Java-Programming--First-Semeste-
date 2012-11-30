package uk.ac.tees.L1087591.gold;

/**Blankets is responsible for the Blankets of the Gear.
 *
 * @author Anastasov
 */
public class Blankets extends Gear {

    /**
     * blankets represent the blankets.
     */
    Info blankets = Info.BLANKETS;

    /**
     * BLANKETS_WEIGHT represent the weight of the blankets.
     */
    final int BLANKETS_WEIGHT = 2;
    
    /**
     * BLANKETS_CODE represent the code for the blankets.
     */
    final char BLANKETS_CODE = 'b';
    
    
    /**getWeight return s the weight of the Blankets.
     * 
     * @return BLANKETS_WEIGHT
     */
    @Override
    public int getWeight() {
        return BLANKETS_WEIGHT;
//        return super.getWeight();
        
    }

    
    /**getCode returns the code of the Blankets.
     * 
     * @return BLANKETS_CODE
     */
    @Override
    public char getCode() {
        return BLANKETS_CODE;
    }
    
}
