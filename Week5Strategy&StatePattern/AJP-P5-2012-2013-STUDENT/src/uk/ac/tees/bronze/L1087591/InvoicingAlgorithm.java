package uk.ac.tees.bronze.L1087591;


/** InvoicingAlgorith responsible for the strategy pattern.
 * @author Anastasov
 */
public interface InvoicingAlgorithm 
{
    /**getInvoice() must be implemented.
     * by all the concrete classes that
     * implement InvoicingAlgorithm
     * @param name records the name of the company
     * @param amount records the amount of money
     * @return a representation of the company
     */
    public String getInvoice(String name, double amount);
}
