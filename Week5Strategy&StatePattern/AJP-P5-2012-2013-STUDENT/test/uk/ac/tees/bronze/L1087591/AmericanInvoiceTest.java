package uk.ac.tees.bronze.L1087591;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/** A unit test to check the American invoicing algorithm. Spaces are irrelevant.
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class AmericanInvoiceTest {
    
    /**
     * Test of getInvoice method, of class AmericanInvoice.
     */
    @Test
    public void testGetInvoice() {
        System.out.println("Producing American invoice");
        final int invoiceAmount = 500;
        final Customer c = new Customer("Oracle", invoiceAmount);
        c.setInvoicingAlgorithm(new AmericanInvoice());
        String actualOutput = c.getInvoice();
        final File f = new File("actual-american.txt");
        FileUtility.resetFile(f);
        FileUtility.writeFile(f, actualOutput);
        String expectedOutput = FileUtility.readFile(new File("expected-american.txt"));
        //System.out.println(actualOutput);
        //System.out.println(expectedOutput);
        actualOutput = actualOutput.replaceAll("\\s", "");
        expectedOutput = expectedOutput.replaceAll("\\s", "");
        //System.out.println(actualOutput);
        //System.out.println(expectedOutput);
        assertEquals(actualOutput, expectedOutput);
    }
}
