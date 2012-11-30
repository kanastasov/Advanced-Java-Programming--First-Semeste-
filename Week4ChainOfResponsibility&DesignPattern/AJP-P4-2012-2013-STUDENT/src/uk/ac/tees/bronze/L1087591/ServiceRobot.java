package uk.ac.tees.bronze.L1087591;

import java.io.File;

/**ServiceRobot is the second chain of the responsibility.
 * @author Anastasov
 */
public class ServiceRobot implements MalfunctionHandler
{
    
    /**
     * @param severity represent the severity of the problem
     */
    Severity severity;
    
    /**
     * @param next represent object of the interface MalfunctionHandler
     */
    MalfunctionHandler next;
    
    /*
     * @param f is a File object that takes a text file.
     */
    File f = new File("log-bronze.txt");

    /**ServiceRobot is constructor that initiazes the severity.
     * @param severity initialize the severity
     */
    ServiceRobot(Severity severity)
    {
        this.severity = severity;
    }
    
    
    @Override
    public void processMalfunction(Malfunction malfunction) 
    {
        if (this.severity == malfunction.getSeverity())
        {
//            Handle the problem
           FileUtility.writeFile(f, malfunction.getDescription());
           FileUtility.writeFile(f, "---> Service robot assigned to problem.");
        }
        else
        {
             next.processMalfunction(malfunction);
        }
        
    }

    @Override
    public void setNextHandler(MalfunctionHandler next)
    {
        this.next = next;
    }
    
}
