package uk.ac.tees.gold.L1087591;

import java.io.File;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/** This test unit makes sure the bots are functioning correctly.
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class BotTest {
    
    /**
     * No-args constructor.
     */
    public BotTest() {
    }

    /**
     * Testing all concrete Bot subclasses, no adverse environmental conditions.
     */
    @Test
    public void testBotSimple() {
        
        // Purge the log file
        FileUtility.resetFile(new File("log-gold.txt"));
        
        // Create an empty collection
        ArrayList<Bot> bots = new ArrayList<Bot>();
        
        // Create some robots and add them to the collection
        bots.add(new DiggerBot("DB1"));
        bots.add(new ScannerBot("SC1"));
        bots.add(new AerialBot("AR1"));
        bots.add(new ScannerBot("SC2"));
        bots.add(new AerialBot("AR2"));
        bots.add(new DiggerBot("DB2"));
        
        // Iterate through collection, invooking template method
        for (Bot b : bots) {
            b.executeTask();
        }
        
        // Check  log file
        final String actualOutput = FileUtility.readFile(new File("log-gold.txt"));
        final String expectedOutput = FileUtility.readFile(new File("expected-gold.txt"));
        assertEquals(actualOutput, expectedOutput);
    }
    
    /**
     * Testing all concrete Bot subclasses, adverse environmental conditions.
     */
    @Test
    public void testBotComplex() {
        
        // Purge the log file
        FileUtility.resetFile(new File("log-gold.txt"));
        
        // Create an empty collection
        ArrayList<Bot> bots = new ArrayList<Bot>();
        
        // Create some robots and add them to the collection
        bots.add(new DiggerBot("DB1"));
        bots.add(new ScannerBot("SC1"));
        bots.add(new AerialBot("AR1"));
        bots.add(new DiggerBot("DB1"));
        bots.add(new ScannerBot("SC1"));
        bots.add(new AerialBot("AR1"));
        
        // Change the environment
        Environment.setDustStorm(true);
        Environment.setRadiationLevel(RadiationLevel.CRITICAL);
        
        // Iterate through collection, invooking template method
        for (Bot b : bots) {
            b.executeTask();
        }
        
        // Restore environment
        Environment.setDustStorm(false);
        Environment.setRadiationLevel(RadiationLevel.LOW);
        
        // Check  log file
        final String actualOutput = FileUtility.readFile(new File("log-gold.txt"));
        final String expectedOutput = FileUtility.readFile(new File("expected-gold2.txt"));
        assertEquals(actualOutput, expectedOutput);
    }  
}
