package uk.ac.tees.L1087591.gold;

/**Info is enum type that stores the information about the flight.
 *
 * @author Anastasov
 */
public enum Info  {
    
    /**
     * BLANKETS represent the blankets.
     */
    BLANKETS(2, 'b'),
    
    /**
     * PILLOWS represent the pillows 
     */
    PILLOWS(3, 'b'),
    
    /**
     * FOOD represent the food
     */
    FOOD(10, 'f'),
    
    /**
     * MEDKIT represent the medical kit.
     */
    MEDKIT(5, 'm'),
    
    /**
     * OXYGEN represent the oxygen 
     */
    OXYGEN(15, 'm'),
    
    /**
     * NAPKINS represent the napkins.
     */
    NAPKINS(1, 's'),
    
    /**
     * SICKNESSBAG represent the sickness bags.
     */
    SICKNESSBAG(1, 's');
    
    int weight;
    char code;

    Info(int weight, char code)
    {
        this.weight = weight;
        this.code = code;
        
    }
     public int getWeight() {
         
         
         return weight;
    }
    
//    @Override
//    public int getWeight() {
//        Blankets b = new Blankets();
//        HelperInterfaceForgetWeightAndCode hp = null;
        
//        return getWeight();
//        return super.getWeight();
//    }

//    @Override
    public char getCode() {
        
//        return 'b';
//        char x = '2';
        return code;
    }
    
    
  
}
