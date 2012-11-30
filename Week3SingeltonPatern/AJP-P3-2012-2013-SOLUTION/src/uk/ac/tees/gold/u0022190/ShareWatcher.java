package uk.ac.tees.gold.u0022190;

/**
 * <p>This abstract class is extended by all classes that want to be informed
 * when the price of a share in company X changes.</p>
 *
 * <p>This program is part of AJP-P3-2012-2013-SOLUTION.</p>
 *
 * <p>AJP-P3-2012-2013-SOLUTION is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.</p>
 *
 * <p>This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.</p>
 *
 * <p>You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.</p>
 *
 * <p>Copyright Mark Truran m.a.truran@tees.ac.uk 17-Oct-2012 </p>
 */
public abstract class ShareWatcher {

    /**
     * The share watcher will buy shares below this price. 
     */  
    protected double buy;
    
    /**
     * The share watcher will sell shares above this price. 
     */  
    protected double sell;
    
    /**
     * The share watcher will buy this many share when the price is right.
     */  
    protected int increment;
    
    /**
     * The share watcher has this many shares in his/her portfolio.
     */
    protected int portfolio; 
    
    /**
     * The current balance of the share watcher (total expenditure - total income).
     */
    protected double balance;

    /** Builds a new ShareWatcher object, initialising all fields.
     * 
     * @param buy The share watcher will buy shares below this price.
     * @param sell The share watcher will sell shares above this price. 
     * @param increment The share watcher will buy this many share when the 
     * price is right.
     */
    public ShareWatcher(double buy, double sell, int increment) {
        this.buy = buy;
        this.sell = sell;
        this.increment = increment;
        this.portfolio = 0;
        this.balance = 0;
    }
    
    /** This method returns the number of shares in the stock watcher's portfolio.
     * 
     * @return the number of shares in the stock watcher's portfolio.
     */
    public int getPortfolio() {
        return portfolio;
    }
    
    /** This method returns the stock watcher's current balance.
     * 
     * @return the stock watcher's current balance.
     */
    public double getBalance() {
        return balance;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "portfolio=" + portfolio + ", balance=" + balance + '}';
    }
    
    /**
     * This method is called when the price of a share in company X changes. 
     * When it is called, all registered watchers are updated with the new price 
     * of the share. At that time they can make buy/sell decisions.
     *
     * @param price The new price of the share, in pounds and pence.
     */
    public abstract void updatePrice(double price);
   
}
