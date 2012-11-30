/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.gold.L1087591;

/**ScannerBot represent a bot responsible for scanning objects.
 * @author Anastasov
 */
public class ScannerBot extends Bot{

    /**
     * @param identifier initialize the identifier field
     */    
    ScannerBot(String identifier)
    {
        super(identifier);
        this.identifier = identifier;
    }
    
    @Override
    void doTask()
    {
       FileUtility.writeFile(f, identifier + ": Scanning local terrain for water."); 
    }
   
    
    @Override
     /**
     * Modify the environment so that the radiation level more than medium is not allowed.
     */
    boolean checkEnvironment()
    {
        if ((Environment.radiationLevel == RadiationLevel.HIGH)
                || ((Environment.radiationLevel == RadiationLevel.CRITICAL)))
        {
            return false;
        }
            return true;
    }
    
}
