/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.silver.L1087591;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**AmericanInvoice is responsible for the American side of the deal.
 * @author Anastasov
 */
public class AmericanInvoice implements InvoicingAlgorithm
{

    /** Path to the resulting PDF file. */
    public static final String RESULT
        = "src\\uk\\ac\\tees\\silver\\L1087591/AmericanInvoice.pdf";
    
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
         final String total = "--------------------------------------\n TO:   "
              + name + " \n FROM: Easyflap (UK) \n AMOUNT"  + ":$" 
                + df.format(amount) 
              + " \n --------------------------------------";
        System.out.println(total);
        
        
        // step 1
        final Document document = new Document();
        try {
            try {
                // step 2
                PdfWriter.getInstance(document, new FileOutputStream(RESULT));
            } catch (DocumentException ex) {
                Logger.getLogger(AmericanInvoice.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AmericanInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        // step 3
        document.open();
        try {
            // step 4
            document.add(new Paragraph(total));
        } catch (DocumentException ex) {
            Logger.getLogger(AmericanInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        // step 5
        document.close();
        
        
         return total;
    }
    
}
