package uk.ac.tees.silver.u0022190;

import java.util.ArrayList;

/** <p>This class represents a share in company X. The state of this object 
 * (i.e. it's price) is watched by other objects who implement the ShareWatcher 
 * interface. When the unit price of this share changes, these watchers are 
 * informed.</p>
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
public class Share {
    
    /**
     * A list of the registered watchers. 
     */ 
    private ArrayList<ShareWatcher> watchers = new ArrayList<ShareWatcher>();
    
    /**
     * The current price of one share in company X. 
     */ 
    private double price;
    
    /** A constructor for the Share class which initialises the unit price of a
     * single share in company X.
     */
    public Share() {
        this.price = 1.00;
    }
    
    /**This method adds a share watcher to the list of registered watchers.
     * 
     * @param shareWatcher The share watcher to add
     * @return true if the share watcher is added successfully
     */
    public boolean addShareWatcher(ShareWatcher shareWatcher) {
        return watchers.add(shareWatcher);
    }
    
    /** This method removes a share watcher from the list of registered watchers.
     * 
     * @param shareWatcher The share watcher to remove
     * @return true if the share watcher is remove successfully
     */
    public boolean removeShareWatcher(ShareWatcher shareWatcher) {
        return watchers.remove(shareWatcher);
    }
    
    /** This method changes the price of a share in company X. Note that all 
     * watchers are updated with new price immediately after.
     * 
     * @param price The new price of one share in company X
     */ 
    public void setPrice(double price) {
        this.price = price;
        updateBrokers();
    }
    
    /** This method updates all registered share watchers with the new share price.
     * 
     */
    private void updateBrokers() {
        for (ShareWatcher shareWatcher : watchers) {
            shareWatcher.updatePrice(price);
        }
    }

    /** This method returns the current price of one share in company X. 
     * 
     * @return the current price of one share in company X
     */
    public double getPrice() {
        return price;
    }
}