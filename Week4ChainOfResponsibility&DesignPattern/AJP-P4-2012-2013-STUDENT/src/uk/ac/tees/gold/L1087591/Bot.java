package uk.ac.tees.gold.L1087591;

import java.io.File;

/**Bot is a parent class for AerielBot DiggerBot and ScannerBot.
 * the template method executeTask() is declared here
 * @author Anastasov
 */
public abstract class Bot {
    
    /**
     * @param identifier hold the unique id number of the bot
     */
    String identifier;
    
    /**
     * @param f where the bot will write entries
     */
    File f = new File("log-gold.txt");
    
    /**Bot(String identifier). 
     * @param identifier initialize the identifier field
     */
    public Bot(String identifier)
    {
        this.identifier = identifier;
    }
    
    /**
     * @return true for every environment if not specified else 
     */
    boolean checkEnvironment()
    {
        return true;
    }
    
    
    /**
     * writes into file when the bot is powering up.
     */
    void powerUp()
    {
        FileUtility.writeFile(f, identifier + ": Powering up.");
    }
    
    /**
     * writes into file when the bot is powering down.
     */
    void powerDown()
    {
        FileUtility.writeFile(f, identifier + ": Powering down.");
    }
    
    /**
     * doTask() needs to be implemented by each concrete
     * subclass of Bot.java and modify it for it's own requirements.
     */
    abstract void doTask();
    
    /**
     * The templete method that don't need to be Overriden
     * in the subclasses but is only called from there with
     * the super() in the constructor.
     */
    public final void executeTask()
    {
        if (checkEnvironment())
        {
            powerUp();
            doTask();
            powerDown();
        }
    }
}
