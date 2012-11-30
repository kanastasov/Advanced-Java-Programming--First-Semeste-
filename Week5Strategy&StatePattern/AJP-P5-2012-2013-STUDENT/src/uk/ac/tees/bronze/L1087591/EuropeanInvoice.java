package uk.ac.tees.bronze.L1087591;

import java.text.DecimalFormat;

/**EuropeanInvoice is responsible for the European side of the deal.
 * @author Anastasov
 */
public class EuropeanInvoice implements InvoicingAlgorithm
{

    /**
     * @param magicEuropean represent the difference between pound and euro
     */
    final double magicEuropean = 1.14;
    
    /**
     * EuropeanInvoice().
     *  a default constructor
     */
    public EuropeanInvoice()
    {
        
    }
     
    @Override
    public String getInvoice(String name, double amount) 
    {
        final char euro = '\u20AC';
        amount *= magicEuropean;
        System.out.println(euro);
        final DecimalFormat df = new DecimalFormat("#.00");
        final String total = "--------------------------------------TO:   "
              + name + "FROM: Easyflap (UK) AMOUNT"  + ":в‚¬" 
                + df.format(amount) 
              + "--------------------------------------";
        System.out.println(total);
         return total;
    }
}
