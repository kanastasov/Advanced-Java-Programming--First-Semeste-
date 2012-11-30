package uk.ac.tees.silver.L1087591;


/**Malfunction is responsible for the severity and the description of the problem.
 * @author Anastasov
 */
public class Malfunction 
{
    
    /**
     * severity is a type of Severity. 
     */
    Severity severity;
    
    /**
     * @param description describes the severity of the problem.
     */
    String description;
    
    /**Malfunction is a constructor responsible
     * for initialization of the severity and the description.
     * @param severity initialize the severity of the problem.
     * @param description  describes the problem.
     */
    Malfunction(Severity severity, String description)
    {
        this.description = description;
        this.severity = severity;
    }

    /**getSeverity is a getter method for the severity.
     * @return severity  
     */
    public Severity getSeverity() 
    {
        return severity;
    }
    
    /**getDescription is a getter method for the description.
     * @return description 
     */
    public String getDescription()
    {
        return description;
    }
}
