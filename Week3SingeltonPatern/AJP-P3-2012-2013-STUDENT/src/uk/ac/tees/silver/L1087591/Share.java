/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.silver.L1087591;

import java.util.ArrayList;
import java.util.HashMap;

/**Share.java represents one stock market share in the company.
 * the class is an implementation of the multiple design pattern.
 * means (1 private constructor 2 static method and 3 static variable to keep the track)
 * @author Anastasov
 */
public class Share 
{
    /**@param poundsAndPences stores the monetary unit for the share.
     * @unique a  instance of the Share class responsible for the observer pattern*/
    protected static double poundsAndPences = 1.00;
    ArrayList<ShareWatcher> list = new ArrayList<ShareWatcher>();
    
    public boolean addShareWatcher(ShareWatcher sw)
    {
            list.add(sw); 
            if (list.contains(sw))
            {
                return true;
            }
        return false;
    }
    
    public boolean removeShareWatcher(ShareWatcher sw)
    {
        if(list.contains(sw))
        {
             list.remove(sw);
            return true;
        }
        else
        {
          return false;  
        } 
       
        
    }
    
    /** Share(double poundsAndPences) private constructor.
     * 1-st pre-requisite for the multiple pattern 
     * takes and double value and initialized the local
     * variable with the one that have been passed
     * @param poundsAndPences sets the local variable with the current value*/
     Share()
    {
//        this.poundsAndPences = poundsAndPences;
//          changeState();
//        System.out.println("test: " + list);
    }

    /**getPoundsAndPences() is a getter method to. 
     * @return the poundsAndPences
     */
    public double getPrice() 
    {
        return poundsAndPences;
    }

    /**setPoundsAndPences(int poundsAndPences) is a mutator method.
     * @param poundsAndPences set the poundsAndPences passed to the
     * methods to the local ones 
     */
    public void setPrice(double poundsAndPences) 
    {
        this.poundsAndPences = poundsAndPences;
        changeState();
        updateShareWatcher();
    }
    
    public void changeState()
    {
        poundsAndPences = getPrice() ;
    }
    
    public void updateShareWatcher()
    {
//       System.out.println("list: " + list);
        int counter = 0;
        for(ShareWatcher sw: list)
        {
//            System.out.println("list test: "+ counter++  + "  %%% " + sw);
            sw.updatePrice(poundsAndPences);
//            System.out.println(list.toString());
        }
    }
}