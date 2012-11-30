package uk.ac.tees.silver.L1087591;

/**Captain is the last possible state of the chain of responsibility.
 * @author Anastasov
 */
public class Captain extends MalfunctionHandler
{
   
     
    /**Captain constructor to call the super class constructor.
     * @param severity 
     */
    Captain(Severity severity)
    {
        super(severity);
    }

    @Override
   void handleProblem(Malfunction malfunction) 
    {
           FileUtility.writeFile(f, malfunction.getDescription());
           FileUtility.writeFile(f, "---> Captain assigned to problem.");
    }
}
