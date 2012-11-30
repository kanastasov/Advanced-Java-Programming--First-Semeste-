/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.silver.L1087591;

/**
 *
 * @author Anastasov
 */

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestPDF 
{
    
    /** Path to the resulting PDF file. */
    public static final String RESULT
        = "src\\uk\\ac\\tees\\silver\\L1087591/hello.pdf";
    
    /**
     * Creates a PDF file: hello.pdf
     * @param    args    no arguments needed
     */
    public static void main(String[] args)
    	throws DocumentException, IOException 
    {
        
        System.out.println("Producing American invoice");
        final int invoiceAmount = 500;
        final Customer c = new Customer("Oracle", invoiceAmount);
        c.setInvoicingAlgorithm(new AmericanInvoice());
        String actualOutput = c.getInvoice();
        
        System.out.println("Producing European invoice");
        final int invoiceAmount3 = 17023;
        final Customer c3 = new Customer("Siemens", invoiceAmount);
        c3.setInvoicingAlgorithm(new EuropeanInvoice());
        String actualOutput3 = c3.getInvoice();
        
        System.out.println("Producing Japanese invoice");
        final int invoiceAmount2 = 7200;
        final Customer c2 = new Customer("Honda", invoiceAmount);
        c2.setInvoicingAlgorithm(new JapaneseInvoice());
        String actualOutput2 = c2.getInvoice();
        
        
        
    }
    
}