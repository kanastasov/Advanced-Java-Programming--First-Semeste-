package uk.ac.tees.gold.u0022190;

import org.junit.Test;
import static org.junit.Assert.*;

/** A set of unit tests classes that check the GOLD solution.
 *
 * @author Mark Truran m.a.truran@tees.ac.uk
 */
public class ShareTest {
    
    /**
     * Arbitrary stock price value for testing. 
     */
    final static double PRICE1 = 0.99;
    
    /**
     * Arbitrary stock price value for testing. 
     */
    final static double PRICE2 = 14.12;
    
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
     * Testing the balance cap in the BankManager class.
     */
    @Test
    public void testBalanceCapBankManager() {
        final Share share = new Share();
        final BankManager bankManager = new BankManager(BM_BUY, BM_SELL, BM_INCREMENT);
        assertTrue(share.addShareWatcher(bankManager));
        share.changePrice(PRICE1);
        share.changePrice(PRICE1);
        share.changePrice(PRICE1);
        share.changePrice(PRICE1);
        share.changePrice(PRICE1);
        share.changePrice(PRICE1);
        share.changePrice(PRICE1);
        final double expectedValue = -495.0;
        assertEquals(bankManager.getBalance(), expectedValue, 0);
    }
    
    /**
     * Sanity check for the BankManager class - you cannot sell shares if you 
     * do not own them!.
     */
    @Test
    public void testNoSharesBankManager() {
        final Share share = new Share();
        final BankManager bankManager = new BankManager(BM_BUY, BM_SELL, BM_INCREMENT);
        assertTrue(share.addShareWatcher(bankManager));
        share.changePrice(PRICE2);
        share.changePrice(PRICE2);
        share.changePrice(PRICE1);
        share.changePrice(PRICE2);
        final double expectedValue = 1313.0;
        assertEquals(bankManager.getBalance(), expectedValue, 0);
    }
    
    /**
     * Testing the share cap in the StockBroker class.
     */
    @Test
    public void testShareCapStockBroker() {
        final Share share = new Share();
        final StockBroker stockBroker = new StockBroker(SB_BUY, SB_SELL, SB_INCREMENT);
        assertTrue(share.addShareWatcher(stockBroker));
        share.changePrice(PRICE1);
        share.changePrice(PRICE1);
        share.changePrice(PRICE1);
        share.changePrice(PRICE1);
        share.changePrice(PRICE1);
        share.changePrice(PRICE1);
        share.changePrice(PRICE1);
        share.changePrice(PRICE1);
        final int expectedValue = 3000;
        assertEquals(expectedValue, stockBroker.getPortfolio());
    }
    
    /**
     * Sanity check for the StockBroker class - you cannot sell shares if you 
     * do not own them!.
     */
    @Test
    public void testNoSharesStockBroker() {
        final Share share = new Share();
        final StockBroker stockBroker = new StockBroker(SB_BUY, SB_SELL, SB_INCREMENT);
        assertTrue(share.addShareWatcher(stockBroker));
        share.changePrice(PRICE2);
        share.changePrice(PRICE2);
        share.changePrice(PRICE1);
        share.changePrice(PRICE2);
        final double expectedValue = 6565.0;
        assertEquals(expectedValue, stockBroker.getBalance(), 0);
    }
}
