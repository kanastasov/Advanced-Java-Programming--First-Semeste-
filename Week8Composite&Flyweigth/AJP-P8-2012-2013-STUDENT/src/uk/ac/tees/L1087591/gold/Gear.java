package uk.ac.tees.L1087591.gold;

/**Gear is responsible for the Gears.
 *
 * @author Anastasov
 */
public abstract class Gear {
    /**
     * weight stores the weight of the item in kg
     */
    protected int weight;

    /**
     * code store the code for the item (bedding, food, medical or sanitary, but it is better to use array.
     */
    protected char code;

    /**getWeight gets the weight of the item.
     * 
     * @return weight
     */        
    public abstract int getWeight();
//        return weight;
//    }

    /**setWeight sets the weight for the item
     * 
     * @param weight 
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**getCode() gets the code of the item.
     * 
     * @return code
     */
    public abstract char getCode();
//        return code;
//    }
    
    /**setCode sets the code of the item.
     * 
     * @param code 
     */
    public void setCode(char code) {
        this.code = code;
    }
}


