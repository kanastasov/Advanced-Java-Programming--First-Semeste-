package uk.ac.tees.bronze.L1087591;

import java.text.DecimalFormat;

/**AmericanInvoice is responsible for the American side of the deal.
 * @author Anastasov
 */
public class AmericanInvoice implements InvoicingAlgorithm
{

    /**
     * @param magicAmerican represent the difference between dollar and pound
     */
    final double magicAmerican = 1.57;
    
    /** AmericanInvoice()is a 
     *  default constructor.
     */
    AmericanInvoice()
    {
        
    }
  
    @Override
    public String getInvoice(String name, double amount) 
    {
        amount *= magicAmerican;
        final DecimalFormat df = new DecimalFormat("#.00");
        final String total = "--------------------------------------TO:   "
              + name + "FROM: Easyflap (UK) AMOUNT"  + ":$" 
                + df.format(amount) 
              + "--------------------------------------";
        System.out.println(total);
         return total;
    }
}
