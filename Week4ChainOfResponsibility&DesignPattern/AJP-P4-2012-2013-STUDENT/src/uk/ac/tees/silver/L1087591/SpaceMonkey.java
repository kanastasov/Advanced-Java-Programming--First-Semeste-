
package uk.ac.tees.silver.L1087591;


/**SpaceMonkey is the first possible state of the chain of responsibility.
 * @author Anastasov
 */
public class SpaceMonkey extends MalfunctionHandler
{
    
    /**SpaceMonkey constructor to call the super class constructor.
     * @param severity 
     */
    SpaceMonkey(Severity severity)
    {
       super(severity);
    }
    
    @Override
    void handleProblem(Malfunction malfunction) 
    {
           FileUtility.writeFile(f, malfunction.getDescription()); 
           FileUtility.writeFile(f, "---> Space monkey assigned to problem.");
    }
}
