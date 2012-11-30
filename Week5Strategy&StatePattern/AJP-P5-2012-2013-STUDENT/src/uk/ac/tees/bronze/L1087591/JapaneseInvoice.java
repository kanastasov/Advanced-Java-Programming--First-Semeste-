package uk.ac.tees.bronze.L1087591;

import java.text.DecimalFormat;

/**JapaneseInvoice is responsible for the Imperial side of the deal.
 * @author Anastasov
 */
public class JapaneseInvoice implements InvoicingAlgorithm
{

    /**
     * @param magicSamurai represents the difference between the pound and the yenni
     */
     final double magicSamurai = 121;
     
    /**JapaneseInvoice() is a default constructor.
     */
    public JapaneseInvoice()
    {
        
    }
    //Uk: japan 1 : 121
    @Override
    public String getInvoice(String name, double amount) 
    {
        
         final char iena = '\u00A5';
        amount *= magicSamurai;
        System.out.println(iena);
        final DecimalFormat df = new DecimalFormat("#.00");
        final String total = "--------------------------------------TO:   "
              + name + "FROM: Easyflap (UK) AMOUNT"  + ":ВҐ" 
                + df.format(amount) 
              + "--------------------------------------";
        System.out.println(total);
         return total;
    }
    
    
}
