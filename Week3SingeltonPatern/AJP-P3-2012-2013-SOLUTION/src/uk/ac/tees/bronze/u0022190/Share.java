package uk.ac.tees.bronze.u0022190;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>This class represents one share in a company. The class is an implementation 
 * of the multiton pattern. This means that there is one unique Share instance 
 * stored in a map per named key. The key to the map is the unique three letter 
 * designation of the company e.g. BBC</p>
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
 * with this program. If not, see http://www.gnu.org/licenses/.</p>
 *
 * <p>Copyright Mark Truran m.a.truran@tees.ac.uk 17-Oct-2012 </p>
 */
public class Share {

    /**
     * A map of all Share objects. The key to the map is the unique three letter 
     * designation of the company e.g. BBC
     */
    private static HashMap<String, Share> shares = new HashMap<String, Share>();
    
    /**
     * The current price of one share in the named company, in pounds and pence.
     */
    private double price;

    /**
     * No-args constructor. Initialises a new share object with a unit price of 1.00. 
     */
    private Share() {
        price = 1.00;
    }

    /** This method returns a unique instance of the Share class (multiton).
     * 
     * @param companyName A unique three letter designation of the company
     * @return A unique Share object that represents the share in that company
     */
    public static Share getInstance(String companyName) {

        //Check for null string and empty string, return null if found
        if (companyName == null || companyName.isEmpty()) {
            return null;
        }
       
        // Check for legal company name, return null if illegal
        final Pattern legal = Pattern.compile("[A-Z]{3}");
        final Matcher matcher = legal.matcher(companyName);
        if (!matcher.matches()) {
            return null;
        } 

        // If the share has never been registered before, create new instance of
        // Share class and put it in map using share name as key
        if (shares.get(companyName) == null) {
            shares.put(companyName, new Share());
        }
        return shares.get(companyName);
    }

    /** This method sets the price of a single share in the named company.
     * 
     * @param value The new price of the share, in pounds and pence
     */
    public void setValue(double value) {
        this.price = value;
    }

    /** This method gets the price of a single share in the named company.
     * 
     * @return The current price of the share, in pounds and pence
     */
    public double getValue() {
        return price;
    }
}