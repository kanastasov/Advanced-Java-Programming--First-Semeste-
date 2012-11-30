package uk.ac.tees.bronze.L1087591;

import java.text.DecimalFormat;

/**Customer has a relationship with the interface InvoicingAlgorithms.
 * @author Anastasov
 */
public class Customer 
{
    
    /**
     * @param name represent the name of the Customer
     */
    private String name;

    /**
     * @param amount represent the amount of money
     */
    private double amount;
    
    /**
     * @param i represents object of InvoicingAlgorithm
     */
    private InvoicingAlgorithm i;
    
    /**Customer() is a cunstructor that initializes the name and amount variables.
     * @param name initializes the name of the company
     * @param amount initializes the money in the company
     */
    Customer(String name, double amount)
    {
        this.name = name;
        this.amount = amount;
        
    }

    /**InoicingAlgorithm is a getter method.
     * @return i which is a InvoicingAlgorithm object 
     */
    public InvoicingAlgorithm getI() {
        return i;
    }

     /**InoicingAlgorithm is a mutator method.
     * @param i sets the sInvoicingAlgorithm object 
     */
    public void setInvoicingAlgorithm(InvoicingAlgorithm i)
    {
        this.i = i;
    }
    
    /**getInvoice() procces the general data 
     * and call the object of the interface with the passing values.
     * @return name, amount
     */
    public String getInvoice()
    {
        final DecimalFormat df = new DecimalFormat("#.00");
        final String total = "--------------------------------------TO:   "
              + name + "FROM: Easyflap (UK) AMOUNT"  + ":$" 
                + df.format(amount) 
              + "--------------------------------------";
        System.out.println(total);
        i.getInvoice(name, amount);
        return i.getInvoice(name, amount);
    }
}
