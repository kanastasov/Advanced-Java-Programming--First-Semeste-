
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

/**JapaneseInvoice is responsible for the Imperial side of the deal.
 * @author Anastasov
 */
public class JapaneseInvoice implements InvoicingAlgorithm
{

    
    /** Path to the resulting PDF file. */
    public static final String RESULT
        = "src\\uk\\ac\\tees\\silver\\L1087591/JapaneseInvoice.pdf";
    
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
      
        final String total = "--------------------------------------\n TO:   "
              + name + " \n FROM: Easyflap (UK) \n AMOUNT"  + ":" + iena
                + df.format(amount) 
              + " \n --------------------------------------";
        System.out.println(total);
         
         
         
         //step1
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
    
    

