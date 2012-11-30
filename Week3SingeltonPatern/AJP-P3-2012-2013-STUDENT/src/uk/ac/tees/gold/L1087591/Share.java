/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.gold.L1087591;

import java.util.ArrayList;
import java.util.HashMap;

/**Share.java represents one stock market share in the company.
 * the class is an implementation of the multiple design pattern.
 * means (1 private constructor 2 static method and 3 static variable to keep the track)
 * @author Anastasov
 */
public class Share 
{
    /**@param price stores the monetary unit for the share.
    */
    protected static double price = 1.00;
    
    /**
     * @param list stores the sharewachers to the list.
     */
    ArrayList<ShareWatcher> list = new ArrayList<ShareWatcher>();
    
    /**add sharewacher to the list.
     * @param sw store the sharewacher to the list
     * @return true if successfully added sw to the list.
     */
    public boolean addShareWatcher(ShareWatcher sw)
    {
            list.add(sw); 
            if (list.contains(sw))
            {
                return true;
            }
        return false;
    }
    
    /**remove sharewacher from the list.
     * @param sw removes the sharewacher from the list
     * @return true if successfully removed sw from the list.
     */
    public boolean removeShareWatcher(ShareWatcher sw)
    {
        if (list.contains(sw))
        {
             list.remove(sw);
            return true;
        }
        else
        {
          return false;  
        } 
       
        
    }
    
     /** A constructor for the Share class which initializes the unit price of a
     * single share in company X.
     */
     Share()
    {
        this.price = 1.00;
    }

    /**getPoundsAndPences() is a getter method to. 
     * @return the poundsAndPences
     */
    public double getPrice() 
    {
        return price;
    }

    /**setPoundsAndPences(double poundsAndPences) is a mutator method.
     * @param poundsAndPences set the poundsAndPences passed to the
     * methods to the local ones 
     */
    public void changePrice(double poundsAndPences) 
    {
        this.price = poundsAndPences;
        changeState();
        updateShareWatcher();
    }
    /**changeState() change the price with the current price.
     */
    public void changeState()
    {
        price = getPrice();
    }
    
    /**updateShareWatcher() updating all the sharewatchers with the current price.
     */
    public void updateShareWatcher()
    {
        for (ShareWatcher sw: list)
        {
            sw.updatePrice(price);
        }
    }
}