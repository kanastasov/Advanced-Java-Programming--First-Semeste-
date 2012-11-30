package uk.ac.tees.silver.u0022190;

/** <p>This class represents a bank manager who invests in company X. </p>
 *
 * <p>This program is part of AJP-P3-2012-2013-SOLUTION.</p>
 *
 * <p>AJP-P3-2012-2013-SOLUTION is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.</p>
 *
 * <p>This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.</p>
 *
 * <p>You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.</p>
 *
 * <p>Copyright Mark Truran m.a.truran@tees.ac.uk 17-Oct-2012 </p>
 */
public class BankManager implements ShareWatcher {
    
     /**
     * The bank manager will buy shares below this price. 
     */  
    private double buy;
    
    /**
     * The bank manager will sell all shares above this price. 
     */  
    private double sell;
    
    /**
     * The bank manager will buy this many share when the price is right.
     */  
    private int increment;
    
    /**
     * The bank manager has this many shares in his/her portfolio.
     */
    private int portfolio; 
    
    /** Builds a new BankManager object, initialising all fields.
     * 
     * @param buy The bank manager will buy shares below this price.
     * @param sell The bank manager will sell shares above this price. 
     * @param increment The bank manager will buy this many shares when the 
     * price is right.
     */
    public BankManager(double buy, double sell, int increment) {
        this.buy = buy;
        this.sell = sell;
        this.increment = increment;
        portfolio = 0;
    }
   
    @Override
    public void updatePrice(double price) {
        if (price < buy) {
            portfolio += increment;
        }
        
        if (price > sell) {
            portfolio = 0;
        }        
    }

    /** This method gets the number of shares in the bank manager's portfolio.
     * 
     * @return the number of shares in the bank manager's portfolio.
     */
    public int getPortfolio() {
        return portfolio;
    }
    
    @Override
    public String toString() {
        return "BankManager{" + "portfolio=" + portfolio + '}';
    }
}