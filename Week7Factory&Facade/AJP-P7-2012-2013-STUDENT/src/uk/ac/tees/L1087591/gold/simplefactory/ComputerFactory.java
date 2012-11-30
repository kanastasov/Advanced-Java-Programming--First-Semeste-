package uk.ac.tees.L1087591.gold.simplefactory;


/**ComputerFactory is a simple factory that creates COmputer objects.
 *
 * @author Anastasov
 */
public class ComputerFactory {
    
    /**
     * @param comp has a relationship with Computer composition better than inheritance.
     */
    private Computer comp;
    
    /**
     * @param maxSpendTBXX6 REPRESENT THE COST OF THE TBXX6
     */
    private final int maxSpendTBXX6 = 598;
    
     /**
     * @param maxSpendTBOFF31 REPRESENT THE COST OF THE TBOFF31
     */
    private final int maxSpendTBOFF31 = 498;
    
    
     /**
     * @param maxSpendTB17b REPRESENT THE COST OF THE TB17b
     */
    private final int maxSpendTB17b = 298;
    
     /**
     * @param gl is an object of type GUI which access the images from the GUI.
     */
    GUI gl = new GUI();
    
    /**
     * @param ramtbxx6 represent the ram of the tbxx6 PC
     */
    private final int ramtbxx6 = 8;
    
     /**
     * @param hardtbxx6 represent the hard of the tbxx6 PC
     */
    private final int hardtbxx6 = 1024;
    
     /**
     * @param processortbxx6 represent the proccesor of the tbxx6 PC
     */
    private final double processortbxx6 = 3.40;
    
     /**
     * @param pricetbxx6 represent the price of the tbxx6 PC
     */
    private final int pricetbxx6 = 599;
    
    
    /**
     * @param ramtbxx6 represent the ram of the tbxx6 PC
     */
    private final int ramtboff31 = 4;
    
     /**
     * @param hardtbxx6 represent the hard of the tbxx6 PC
     */
    private final int hardtboff31 = 750;
    
     /**
     * @param processortbxx6 represent the proccesor of the tbxx6 PC
     */
    private final double processortboff31 = 3.00;
    
     /**
     * @param pricetbxx6 represent the price of the tbxx6 PC
     */
    private final int pricetboff31 = 499;
    
    
    
    /**
     * @param ramtbxx6 represent the ram of the tbxx6 PC
     */
    private final int ramtb17b = 2;
    
     /**
     * @param hardtbxx6 represent the hard of the tbxx6 PC
     */
    private final int hardtb17b = 500;
    
     /**
     * @param processortbxx6 represent the proccesor of the tbxx6 PC
     */
    private final double processortb17b = 2.60;
    
     /**
     * @param pricetbxx6 represent the price of the tbxx6 PC
     */
    private final int pricetb17b = 299;
    
    /**getComputer() gets the Computer object.
     * @param maxSpend represent maximum amount of money the customer can spend.
     * @return c type of computer.
     */
    public Computer getComputer(int maxSpend) {
        
        //If the maximum spend is lower than the
        //  lowest price machine,  it returns null
        //else return the closest machine prise to the maxSpend withouth exceeding it.
            if (maxSpend > maxSpendTBXX6) {
                System.out.println("TBXX6");
                return    comp = new TBXX6(ramtbxx6, 
                        hardtbxx6, processortbxx6, gl.image, pricetbxx6);
            } else if (maxSpend > maxSpendTBOFF31) {
                
                   System.out.println("TBOFF31");
                  return   comp = new TBOFF31(maxSpendTBOFF31,
                        hardtboff31, processortboff31, gl.image, pricetboff31);
            } else if (maxSpend > maxSpendTB17b) {
               System.out.println("TB17b");
                return    comp = new TB17b(ramtb17b, 
                        hardtb17b, processortb17b, gl.image, pricetb17b);
            } else {
                return comp = null;
            }
    }
}
