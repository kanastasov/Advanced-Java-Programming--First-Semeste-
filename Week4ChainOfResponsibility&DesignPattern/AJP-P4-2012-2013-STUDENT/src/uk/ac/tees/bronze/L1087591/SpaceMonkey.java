package uk.ac.tees.bronze.L1087591;

import java.io.File;

/**
 *
 * @author Anastasov
 */
public class SpaceMonkey implements MalfunctionHandler 
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

    /**SpaceMonkey is constructor that initiazes the severity.
     * @param severity initialize the severity
     */
    SpaceMonkey(Severity severity)
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
           FileUtility.writeFile(f, "---> Space monkey assigned to problem.");
        }
        else
        {
            next.processMalfunction(malfunction);
        }
        
        /** First tried to resolve it with regular expressions.
         * 
         * if (this.severity == severity.LOW)
            {
            String[] splits = FileUtility.readFile(read).split("problem.");
            for (String asset : splits)
            {
                if(asset.contains(""))
                {                  
                     FileUtility.writeFile(f, asset + "problem."); 
                     System.out.println(asset + "problem.");
                }
            }
            }
         */
    }

    @Override
    public void setNextHandler(MalfunctionHandler next)
    {
        this.next = next;
    }
}
