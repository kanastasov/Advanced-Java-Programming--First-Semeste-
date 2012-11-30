package uk.ac.tees.L1087591.gold;

/**Food is responsible for the Food on the flight,
 * .
 *
 * @author Anastasov
 */
public class Food extends Gear {

    /**
     * food is responsible for the food.
     */
    Info food;
    
    
    /**
     * FOOD_WEIGHT represent the weight of the Food.
     */
    final int FOOD_WEIGHT = 10;
    
    /**
     * FOOD_CODE represent the code for the Food.
     */
    final char FOOD_CODE = 'f';
    
    
    /**getWeight return s the weight of the Food.
     * 
     * @return BLANKETS_WEIGHT
     */
    @Override
    public int getWeight() {
        return FOOD_WEIGHT;
    }

    
    /**getCode returns the code of the Food.
     * 
     * @return FOOD_CODE
     */
    @Override
    public char getCode() {
        return FOOD_CODE;
    }
}
