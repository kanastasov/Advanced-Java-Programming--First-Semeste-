package uk.ac.tees.silver.L1087591;


/**ServiceRobot is the second possible state of the chain of responsibility.
 * @author Anastasov
 */
public class ServiceRobot extends MalfunctionHandler
{

    /**ServiceRobot constructor to call the super class constructor.
     * @param severity 
     */
    ServiceRobot(Severity severity)
    {
        super(severity);
    }
    
    @Override
    void handleProblem(Malfunction malfunction) 
    {
           FileUtility.writeFile(f, malfunction.getDescription());
           FileUtility.writeFile(f, "---> Service robot assigned to problem.");
    }
}
