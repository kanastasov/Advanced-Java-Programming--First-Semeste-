package uk.ac.tees.bronze.L1087591;

/**Malfunction is responsible for the
 * severity and the description of the problem.
 * @author Anastasov
 */
public class Malfunction
{
    /**
     * @param severity is a type of Severity 
     */
    Severity severity;
    
    /**
     * @param description describes the severity of the problem
     */
    String description;
    
    /**Paramaterised Constructor which initialized the severity and description.
     * @param severity handles the severity of the problem
     * @param description handles the description of the problem
     * if none available provide default
     */
    Malfunction(Severity severity, String description)
    {
        if ((description == null) || (description.isEmpty()))
        {
            description = "No description available. Probably serious.";
        }
           
        this.severity = severity;
        this.description = description;
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

    /**setSeverity is a mutator method for the severity.
     * @param severity sets the severity of the problem. 
     */
    public void setSeverity(Severity severity)
    {
        this.severity = severity;
    }
    
    
    /**setDescription is a mutator method for the description.
     * @param description sets the description of the problem.
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
}
