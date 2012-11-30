package uk.ac.tees.bronze.L1087591;

import org.junit.Test;
import static org.junit.Assert.*;

/** A set of unit tests to check the Malfunction class.
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class MalfunctionTest {
    
    /**
     * No-args constructor.
     */
    public MalfunctionTest() {
    }

    /**
     * Testing constructor, should assign default description if null.
     */
    @Test
    public void testNullDescription() {
        final Malfunction m = new Malfunction(Severity.HIGH, null);
        final String expectedOutcome = "No description available. Probably serious.";
        final String actualOutcome = m.getDescription();
        assertEquals(expectedOutcome, actualOutcome);
    }

    /**
     * Testing constructor, should assign default description if empty string.
     */
    @Test
    public void testEmptyDescription() {
        final Malfunction m = new Malfunction(Severity.HIGH, "");
        final String expectedOutcome = "No description available. Probably serious.";
        final String actualOutcome = m.getDescription();
        assertEquals(expectedOutcome, actualOutcome);
    }
}
