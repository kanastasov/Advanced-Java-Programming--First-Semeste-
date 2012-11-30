/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.L1087591.gold.factorymethod;

/**AbstractComputerFactory is the superclass for the BulkComputerFactory and ComputerFactory.
 *
 * @author Anastasov
 */
public abstract class AbstractComputerFactory {
   
    /**
     * @param c represent object of type Computer.
     */
    private Computer c;
    
    
    /**getComputer gets the maximum money the customer can spend on computer.
     * 
     * @param maxSpend maxim money the customer can spend on PC.
     * @return comp
     */
    public abstract Computer getComputer(int maxSpend);
            
    
}
