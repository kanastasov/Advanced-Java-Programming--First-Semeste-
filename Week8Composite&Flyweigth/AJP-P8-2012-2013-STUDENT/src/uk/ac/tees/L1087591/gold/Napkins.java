package uk.ac.tees.L1087591.gold;

/**Napkins is responsible for Napkins items
 *
 * @author Anastasov
 */
public class Napkins extends Gear{
    
    Info napkins;
    

    
    /**
     * NAPKINS_WEIGHT represent the weight of the Napkins.
     */
    final int NAPKINS_WEIGHT = 1;
    
    /**
     * NAPKINS_CODE represent the code for the Napkins.
     */
    final char NAPKINS_CODE = 's';
    
    
    /**getWeight return s the weight of the Napkins.
     * 
     * @return NAPKINS_WEIGHT
     */
    @Override
    public int getWeight() {
        return NAPKINS_WEIGHT;
    }

    
    /**getCode returns the code of the Napkins.
     * 
     * @return NAPKINS_CODE
     */
    @Override
    public char getCode() {
        return NAPKINS_CODE;
    }
}
