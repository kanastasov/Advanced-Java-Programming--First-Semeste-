package uk.ac.tees.bronze.L1087591;

import java.io.File;

/**Captain represent the last item from the chain of responsibility.
 * @author Anastasov
 */
public class Captain implements MalfunctionHandler
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

    /**Captain is constructor that initiazes the severity.
     * @param severity initialize the severity
     */
    Captain(Severity severity)
    {
        this.severity = severity;
    }
    @Override
    public void processMalfunction(Malfunction malfunction)
    {
        if (this.severity == malfunction.getSeverity())
        {
           // Handle the problem
           FileUtility.writeFile(f, malfunction.getDescription());
           FileUtility.writeFile(f, "---> Captain assigned to problem.");
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
