package uk.ac.tees.gold.L1087591;

/**DiggerBot is a subclass of Bot responsible for
 * Burrowing through the Martian regolith.
 * @author Anastasov
 */
public class DiggerBot extends Bot {

    /**
     * @param identifier initialize the identifier field
     */
    DiggerBot(String identifier)
    {
        super(identifier);
        this.identifier = identifier;
    }
     
    @Override
    void doTask()
    {
       FileUtility.writeFile(f, identifier + ": Burrowing through the Martian regolith."); 
    }
}
