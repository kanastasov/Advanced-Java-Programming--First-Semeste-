package uk.ac.tees.silver.L1087591;

import java.io.File;


/**MalfucntionHandler is an abstract class that all subclasses
 * need to implement the abstract method handle problem and can
 * use the protected methods.
 * @author Anastasov
 */
public abstract class MalfunctionHandler 
{
    
    /**
     * @param next represent the link between
     * the current and the next MalfunctionHandler.
     */
    MalfunctionHandler next;
    
    /**
     * severity is a type of Severity. 
     */
    Severity severity;
    
    /**
     * @param description describes the severity of the problem.
     */
    String description;
    
    
    /**
     * @param f file object  that refers to the log-silver.txt
     */
    File f = new File("log-silver.txt");

    /**MalfucntionHandler constructor initializes the severity of the problem.
     * @param severity 
     */
    MalfunctionHandler(Severity severity)
    {
            this.severity = severity;
    }
    /**processMalfucntion is a final protected method that
     * can't be override by the subclasses, but can be used by them
     * when specifying the handleProblem method in the subclasses.
     * @param malfunction 
     */
    final protected void processMalfunction(Malfunction malfunction)
    {
        if (this.severity == malfunction.getSeverity())
        {
           handleProblem(malfunction);
        }
        else
        {
            next.processMalfunction(malfunction);
        }
    }
    /**addHandler is a final protected method that
     * is responsible for the proccessing the handlers.
     * @param next 
     */
    final protected void addHandler(MalfunctionHandler next)
    {
        // if the next is null pass it to the next MalfunctionHandler
        if (this.next == null)
        {
            this.next = next;
        }
        else
        {
            //call the method again addHanlder( and  start again)
            //if the next is null give to the next else call the addHandler
            this.next.addHandler(next);
        }
    }
    
    /**handleProble() is an abstract method
     * for handling the problem inside the
     * processMalfucntion method.
     * @param malfunction 
     */
    abstract void handleProblem(Malfunction malfunction);

    /**getSeverity is a getter method for the severity.
     * @return severity 
     */
    public Severity getSeverity() 
    {
        return severity;
    }
}
