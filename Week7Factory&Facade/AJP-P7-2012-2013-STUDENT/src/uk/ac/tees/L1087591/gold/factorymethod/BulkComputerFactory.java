/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.L1087591.gold.factorymethod;

/**BulkComputerFactory deals with more than 50 units of PC.
 *
 * @author Anastasov
 */ 
public class BulkComputerFactory extends AbstractComputerFactory {

   /**
     * @param comp has a relationship with Computer composition better than inheritance.
     */
    private Computer comp;
    
    /**
     * @param MAX_SPEND_TBXX6 REPRESENT THE COST OF THE TBXX6
     */
    private final int MAX_SPEND_TBXX8 = 500;
    
     /**
     * @param MAX_SPEND_TBOFF31 REPRESENT THE COST OF THE TBOFF31
     */
    private final int MAX_SPEND_TBOFF32EX = 400;
    
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
            if (maxSpend > MAX_SPEND_TBXX8) {
                System.out.println("TBXX8");
                
                return    comp = new TBXX8(8,
                        1024,3.60,gl.image,MAX_SPEND_TBXX8);
            } else if (maxSpend > MAX_SPEND_TBOFF32EX) {
                System.out.println("TBOFF32EX");
                return    comp = new TBOFF32EX(4,
                        750,3.40,gl.image,MAX_SPEND_TBOFF32EX);
            } else {
                return comp = null;
            }
    }
}
