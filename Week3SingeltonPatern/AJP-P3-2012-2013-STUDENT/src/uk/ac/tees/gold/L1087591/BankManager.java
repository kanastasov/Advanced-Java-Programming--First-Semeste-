/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.gold.L1087591;

/**BankManager.java represents a stock broker who invests in company X.
 * @author Anastasov
 */
public class BankManager extends ShareWatcher {
    
    /** Builds a new BankManager object, initializing all fields.
     * 
     * @param buy The bank manager will buy shares below this price.
     * @param sell The bank manager will sell shares above this price. 
     * @param increment The bank manager will buy this many share when the 
     * price is right.
     */
    public BankManager(double buy, double sell, int increment) {
        super(buy, sell, increment);
    }
   
    @Override
    public void updatePrice(double price) {
        
        // The bank manager cannot exceed a negative balance of £500
        final double limit = -500.00;
        
        // The cost of this transaction, if it goes ahead
        final double transactionCost = (price * increment);
        
        if (price < buy & (balance - transactionCost) > limit) {
            portfolio += increment;
            balance -= (increment * price);
        }
        
        if (price > sell & portfolio > 0) {
            balance += (portfolio * price);
            portfolio = 0;
        }        
    }
}