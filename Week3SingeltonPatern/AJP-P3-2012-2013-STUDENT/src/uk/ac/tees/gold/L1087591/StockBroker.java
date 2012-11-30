/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.gold.L1087591;

/**BankManager.java represents a stock broker who invests in company X.
 * @author Anastasov
 */
public class StockBroker extends ShareWatcher {

     /** Builds a new StockBroker object, initializing all fields.
     * 
     * @param buy The stock broker will buy shares below this price.
     * @param sell The stock broker will sell shares above this price. 
     * @param increment The stock broker will buy this many share when the 
     * price is right.
     */
    public StockBroker(double buy, double sell, int increment) {
        super(buy, sell, increment);
    }
    
    @Override
    public void updatePrice(double price) {
        
        // The stock broker cannot have a portfolio exceeding 3000 shares
        final int maxShares = 3000;
        
        if (price < buy & portfolio != maxShares) {
            portfolio += increment;
            balance -= (increment * price);
        }
        
        if (price > sell & portfolio > 0) {
            balance += portfolio * price;
            portfolio = 0;
        }        
    }
}