package uk.ac.tees.silver.u0022190;

/**
 * <p>This interface is implemented by all objects that want to be informed
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
public interface ShareWatcher {

    /**
     * This method is called when the price of a share in company X changes. 
     * When this method is called, all registered share watchers are updated with 
     * the new price of the share. At that time they can make buy/sell decisions.
     *
     * @param price The new price of the share, in pounds and pence.
     */
    void updatePrice(double price);
}
