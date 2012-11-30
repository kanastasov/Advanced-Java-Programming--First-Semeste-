package uk.ac.tees.L1087591.gold;

/**SicknessBag is responsible for SicknessBags items
 *
 * @author Anastasov
 */
public class SicknessBags extends Gear {
    
    Info sicknessBag;
    
    
    /**
     * SICKNESS_BAG_WEIGHT represent the weight of the SicknessBags.
     */
    final int SICKNESS_BAG_WEIGHT = 1;
    
    /**
     * SICKNESS_BAG_CODE represent the code for the SicknessBags.
     */
    final char SICKNESS_BAG_CODE = 's';
    
    
    /**getWeight return s the weight of the SicknessBags.
     * 
     * @return SICKNESS_BAG_WEIGHT
     */
    @Override
    public int getWeight() {
        return SICKNESS_BAG_WEIGHT;
    }

    
    /**getCode returns the code of the SicknessBags.
     * 
     * @return SICKNESS_BAG_CODE
     */
    @Override
    public char getCode() {
        return SICKNESS_BAG_CODE;
    }


}
