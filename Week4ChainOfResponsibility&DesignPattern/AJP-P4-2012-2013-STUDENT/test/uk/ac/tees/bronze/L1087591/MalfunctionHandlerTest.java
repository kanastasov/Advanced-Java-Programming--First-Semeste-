package uk.ac.tees.bronze.L1087591;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/** This test unit makes sure the correct malfunction handlers are being selected.
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class MalfunctionHandlerTest {
    
    /**
     * No-args constructor.
     */
    public MalfunctionHandlerTest() {
    }

    /**
     * Test of processMalfunction method.
     */
    @Test
    public void testProcessMalfunction() {
        
        // Instanciate malfunction handlers
        final SpaceMonkey sm = new SpaceMonkey(Severity.TRIVIAL);
        final ServiceRobot sr = new ServiceRobot(Severity.LOW);
        final Engineer e = new Engineer(Severity.MEDIUM);
        final Captain c = new Captain(Severity.HIGH);
        
        // Construct chain of responsbility
        sm.setNextHandler(sr); 
        sr.setNextHandler(e);
        e.setNextHandler(c);
        
        // Create malfunctions
        final Malfunction m1 = new Malfunction(Severity.HIGH, "Life support error. Oxygen "
                 + "Recycling unit damaged, running at half efficiency");      
        final Malfunction m2  = new Malfunction(Severity.LOW, "Communications error. Cannot "
                + "find Jazz FM");
        final Malfunction m3 = new Malfunction(Severity.MEDIUM, "Power supply error. Solar Panel "
                + "2 damaged, running at 31.3333% efficiency");
        final Malfunction m4 = new Malfunction(Severity.MEDIUM, "Thermal regulation error. Sensor "
                + "damaged, manual temperature regulation needed");
        final Malfunction m5 = new Malfunction(Severity.TRIVIAL, "Trash can full on C-Desk.");
        final Malfunction m6 = new Malfunction(Severity.LOW, "Shower plug hole full of monkey hair");
        final Malfunction m7 = new Malfunction(Severity.HIGH, "Proximity alert. Collision imminent");
        
        // Clean log file
        FileUtility.resetFile(new File("log-bronze.txt"));
        
        // Process malfunctions
        sm.processMalfunction(m1);
        sm.processMalfunction(m2);
        sm.processMalfunction(m3);
        sm.processMalfunction(m4);
        sm.processMalfunction(m5);
        sm.processMalfunction(m6);
        sm.processMalfunction(m7);
        
        // Check log file
        final String actualOutput = FileUtility.readFile(new File("log-bronze.txt"));
        final String expectedOutput = FileUtility.readFile(new File("expected-bronze.txt"));
        assertEquals(actualOutput, expectedOutput);
    }
}
