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
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**EuropeanInvoice is responsible for the European side of the deal.
 * @author Anastasov
 */
public class EuropeanInvoice implements InvoicingAlgorithm
{

    
    /** Path to the resulting PDF file. */
    public static final String RESULT
        = "src\\uk\\ac\\tees\\silver\\L1087591/EuropeanInvoice.pdf";
    
    /**
     * @param magicEuropean represent the difference between pound and euro
     */
    final double magicEuropean = 1.14;
    
    /**
     * EuropeanInvoice() 
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
       
          final String total = "--------------------------------------\n TO:   "
              + name + " \n FROM: Easyflap (UK) \n AMOUNT"  + ":" + euro 
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
