package uk.ac.tees.silver.L1087591;

/**Engineer is the third possible state of the chain of responsibility.
 * @author Anastasov
 */
public class Engineer extends MalfunctionHandler
{
    
    /**Engineer constructor to call the super class constructor.
     * @param severity 
     */
    Engineer(Severity severity)
    {
        super(severity);
    }

    void handleProblem(Malfunction malfunction) 
    {
          FileUtility.writeFile(f, malfunction.getDescription());
           FileUtility.writeFile(f, "---> Engineer assigned to problem.");
    }
}
