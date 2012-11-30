package uk.ac.tees.silver.L1087591;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/** A set of unit tests that check the solution to the SILVER task.
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class ShareTest {
    
    /**
     * Arbitrary stock price value for testing. 
     */
    final static double PRICE1 = 4.01;
    /**
     * Arbitrary stock price value for testing. 
     */
    final static double PRICE2 = 0.99;
    /**
     * Arbitrary stock price value for testing. 
     */
    final static double PRICE3 = 2.12;
    /**
     * Arbitrary stock price value for testing. 
     */
    final static double PRICE4 = 1.89;
    /**
     * Arbitrary stock price value for testing. 
     */
    final static double PRICE5 = 1.83;
    /**
     * Arbitrary stock price value for testing. 
     */
    final static double PRICE6 = 2.78;
    /**
     * Arbitrary stock price value for testing. 
     */
    final static double PRICE7 = 14.12;
    /**
     * Arbitrary stock price value for testing. 
     */
    final static double PRICE8 = 6.99;
    
    /**
     * Buy value for bank manager.
     */
    final static double BM_BUY = 1.00;
    
    /**
     * Sell value for bank manager.
     */
    final static double BM_SELL = 4.00;
    
    /**
     * Increment value for bank manager.
     */
    final static int BM_INCREMENT = 100;
    
    /**
     * Buy value for stock broker.
     */
    final static double SB_BUY = 2.00;
    
    /**
     * Sell value for stock broker.
     */
    final static double SB_SELL = 3.00;
    
    /**
     * Increment value for stock broker.
     */
    final static int SB_INCREMENT = 500;
    
    /**
     * No-args constructor.
     */
    public ShareTest() {
    }

    /**
     * Test of addShareWatcher method, of class Share.
     */
    @Test
    public void testAddShareWatcher() {
        final Share s = new Share();
        assertTrue(s.addShareWatcher(new BankManager(BM_BUY, BM_SELL, BM_INCREMENT)));
        assertTrue(s.addShareWatcher(new StockBroker(SB_BUY, SB_SELL, SB_INCREMENT)));
    }

    /**
     * Test of removeShareWatcher method, of class Share. Watcher was added, 
     * then removed.
     */
    @Test
    public void testRemoveShareWatcherValid() {
        final Share s = new Share();
        final BankManager bankManager = new BankManager(BM_BUY, BM_SELL, BM_INCREMENT);
        assertTrue(s.addShareWatcher(bankManager));
        assertTrue(s.removeShareWatcher(bankManager));
    }
    
    /**
     * Test of removeShareWatcher method, of class Share. Watcher was not added, so
     * remove operation should fail.
     */
    @Test
    public void testRemoveShareWatcherInvalid() {
        final Share s = new Share();
        final BankManager bankManager = new BankManager(BM_BUY, BM_SELL, BM_INCREMENT);
        assertFalse(s.removeShareWatcher(bankManager));
    }

    /**
     * Test of changePrice method, of class Share. StockBroker should
     * buy 500 shares at PRICE5. BankManager should buy 0 shares.
     */
    @Test
    public void testChangePrice1() {
        final Share share = new Share();
        final BankManager bankManager = new BankManager(BM_BUY, BM_SELL, BM_INCREMENT);
        final StockBroker stockBroker = new StockBroker(SB_BUY, SB_SELL, SB_INCREMENT);
        assertTrue(share.addShareWatcher(bankManager));
        assertTrue(share.addShareWatcher(stockBroker));
        share.setPrice(PRICE5);
        final int expectedValue1 = 100;
//        System.out.println("*****BankManager " + bankManager.getPortfolio());
        assertEquals(expectedValue1, bankManager.getPortfolio());
        final int expectedValue2 = 500;
        System.out.println("*****StockBroker " + stockBroker.getPortfolio());
        assertEquals(expectedValue2, stockBroker.getPortfolio() );
    }
    
    /**
     * Test of changePrice method, of class Share. A similar test to above. More 
     * changes this time.
     */
//    @Ignore
    @Test
    public void testChangePrice2() {
        final Share share = new Share();
        final BankManager bankManager = new BankManager(BM_BUY, BM_SELL, BM_INCREMENT);
        final StockBroker stockBroker = new StockBroker(SB_BUY, SB_SELL, SB_INCREMENT);
        assertTrue(share.addShareWatcher(bankManager));
        assertTrue(share.addShareWatcher(stockBroker));
        share.setPrice(PRICE3);
        share.setPrice(PRICE6);
        share.setPrice(PRICE8);
        final int expectedValue1 = 0;
        assertEquals(expectedValue1, bankManager.getPortfolio());
        final int expectedValue2 = 0;
        assertEquals(expectedValue2, stockBroker.getPortfolio());
    }
    
    
    /**
     * Test of changePrice method, of class Share. A similar test to above. More
     * changes this time.
     */
//    @Ignore
    @Test
    public void testChangePrice3() {
        final Share share = new Share();
        final BankManager bankManager = new BankManager(BM_BUY, BM_SELL, BM_INCREMENT);
        final StockBroker stockBroker = new StockBroker(SB_BUY, SB_SELL, SB_INCREMENT);
        assertTrue(share.addShareWatcher(bankManager));
        assertTrue(share.addShareWatcher(stockBroker));
        share.setPrice(PRICE1);
        share.setPrice(PRICE4);
        share.setPrice(PRICE7);
        share.setPrice(PRICE2);
        final int expectedValue1 = 100;
        assertEquals(expectedValue1, bankManager.getPortfolio());
        final int expectedValue2 = 500;
        assertEquals(expectedValue2, stockBroker.getPortfolio());
    }

    /**
     * Test of getPrice method, in class Share.
     */
    @Test
    public void testGetPrice() {
        final Share share = new Share();
        final double expectedValue = 1.00;
        assertEquals(expectedValue, share.getPrice(), 0);
    }
}
