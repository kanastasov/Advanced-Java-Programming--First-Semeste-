package uk.ac.tees.bronze.L1087591;

import org.junit.Test;
import static org.junit.Assert.*;

/** A set of unit tests that check the solution to the BRONZE task.
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class ShareTest {
    
    /**
     * No-args constructor.
     */
    public ShareTest() {
    }

    /**
     * Testing getInstance method, of class Share. Using invalid share names.
     * These should all produce a null.
     */
    @Test
    public void testGetInstanceInvalidStrings() {
        assertNull(Share.getInstance("aaa"));
        assertNull(Share.getInstance("aAa"));
        assertNull(Share.getInstance("187873"));
        assertNull(Share.getInstance("*6%"));
        assertNull(Share.getInstance("()(()()"));
        assertNull(Share.getInstance(""));
        assertNull(Share.getInstance(null));
    }
    
    /**
     * Testing getInstance method, of class Share. Using valid share names. These
     * should all produce a Share object.
     */
    @Test
    public void testGetInstanceValidString() {
        assertNotNull(Share.getInstance("AAA"));
        assertNotNull(Share.getInstance("JPR"));
        assertNotNull(Share.getInstance("AJP"));
        assertNotNull(Share.getInstance("PMD"));
        assertNotNull(Share.getInstance("STI"));
        assertNotNull(Share.getInstance("MNM"));
    }
    
    /**
     * Testing multiton function of class Share. Check we only have one instance
     * of Share class per named key.
     */
    @Test
    public void testMultiton() {
        final Share s1 = Share.getInstance("AAA");
        final Share s2 = Share.getInstance("AAA");
        final Share s3 = Share.getInstance("BBB");
        assertSame(s1, s2);
        assertNotSame(s1, s3);
    }
    
    /**
     * Testing default value of new Share object. The value should be be 1.00.
     */
    @Test
    public void testDefaultValue() {
        final Share s = Share.getInstance("FFF");
        final double defaultValue = 1.00;
        assertEquals(defaultValue, s.getPoundsAndPences(), 0);
    }
    
    /**
     * Testing the setValue method of the Share class. 
     */
    @Test
    public void testValidChangeValue() {
        final Share s1 = Share.getInstance("GGG");
        final double newValue = 1.50;
        s1.setPoundsAndPences(newValue);
        final Share s2 = Share.getInstance("GGG");
        assertEquals(s2.getPoundsAndPences(), newValue, 0);
        assertSame(s1, s2);
    }
}


