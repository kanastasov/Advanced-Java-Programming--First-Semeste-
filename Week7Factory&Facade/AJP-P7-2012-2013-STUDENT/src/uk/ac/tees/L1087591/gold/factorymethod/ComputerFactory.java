package uk.ac.tees.L1087591.gold.factorymethod;

import javax.swing.ImageIcon;

/**ComputerFactory is a simple factory that creates COmputer objects.
 *
 * @author Anastasov
 */
public class ComputerFactory extends AbstractComputerFactory {
    
    /**
     * @param comp has a relationship with Computer composition better than inheritance.
     */
    private Computer comp;
    
    /**
     * @param MAX_SPEND_TBXX6 REPRESENT THE COST OF THE TBXX6
     */
    private final int MAX_SPEND_TBXX6 = 598;
    
     /**
     * @param MAX_SPEND_TBOFF31 REPRESENT THE COST OF THE TBOFF31
     */
    private final int MAX_SPEND_TBOFF31 = 498;
    
    
     /**
     * @param MAX_SPEND_TB17b REPRESENT THE COST OF THE TB17b
     */
    private final int MAX_SPEND_TB17b = 298;
    
     /**
     * @param gl is an object of type GUI which access the images from the GUI.
     */
    GUI gl = new GUI();
    
    /**getComputer() gets the Computer object.
     * @param maxSpend represent maximum amount of money the customer can spend.
     * @return c type of computer.
     */
    public Computer getComputer(int maxSpend) {
        
        //If the maximum spend is lower than the
        //  lowest price machine,  it returns null
        //else return the closest machine prise to the maxSpend withouth exceeding it.
            if (maxSpend > MAX_SPEND_TBXX6) {
                System.out.println("TBXX6");
                
//                    comp.setImg(image);
                return    comp = new TBXX6(8,
                        1024,3.60,gl.image,599);
            } else if (maxSpend > MAX_SPEND_TBOFF31)  {
                System.out.println("TBOFF31");
                return    comp = new TBOFF31(4,
                        750,3.40,gl.image,499);
            } else if (maxSpend > MAX_SPEND_TB17b) {
                 System.out.println("TB17b");
                  return   comp = new TB17b(2,
                        500,3.00,gl.image,299);
               
            } else {
                return comp = null;
            }
    }
}
