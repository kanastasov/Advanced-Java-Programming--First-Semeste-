package uk.ac.tees.gold.L1087591;

/**AeriealBot is a subclass of Bot 
 *and is responsible for Flying through the thin Martian atmosphere.
 * @author Anastasov
 */
public class AerialBot extends Bot
{
    
    /**
     * @param identifier initialize the identifier field
     */
    AerialBot(String identifier)
    {
        super(identifier);
        this.identifier = identifier;
    }
  
    @Override
    void doTask()
    {
       FileUtility.writeFile(f, identifier + ": Flying through the thin Martian atmosphere."); 
    }
    
   @Override
   boolean checkEnvironment()
    {
        if (Environment.dustStorm == true)
        {
            return false;
        }
        return true;
    }
}
