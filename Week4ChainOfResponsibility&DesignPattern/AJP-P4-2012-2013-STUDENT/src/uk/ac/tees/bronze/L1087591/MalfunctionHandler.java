package uk.ac.tees.bronze.L1087591;

/**MalfucntionHandler is a interface that all
 * concrete classes that implement it needs to
 * implement the abstract methods and demonstrate
 * the chain of responsibility design pattern.
 * @author Anastasov
 */
public interface MalfunctionHandler 
{
    /**processMalfunciton abstract method that handles the malfunction of the problem.
     * @param malfunciton 
     */
    public void processMalfunction(Malfunction malfunciton);
    
    /**setNextHandler sets the problem to the next appropriate handler.
     * @param handler 
     */
    public void setNextHandler(MalfunctionHandler handler);
  
}
