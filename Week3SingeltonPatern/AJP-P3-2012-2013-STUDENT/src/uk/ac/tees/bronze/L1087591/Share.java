/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.bronze.L1087591;

import java.util.HashMap;

/**Share.java represents one stock market share in the company.
 * the class is an implementation of the multiple design pattern.
 * means (1 private constructor 2 static method and 3 static variable to keep the track)
 * @author Anastasov
 */
public class Share 
{
    /**@param poundsAndPences stores the monetary unit for the share.
     * @param instances a HashMap that stores the multiple patterns with the key values combination
     * @unique a  instance of the Share class responsible for the singelton pattern*/
    private  double poundsAndPences = 1;
    private static HashMap<String, Share> instances = new HashMap<String, Share>();
    public static Share unique;
    
    /** Share(double poundsAndPences) private constructor.
     * 1-st pre-requisite for the multiple pattern 
     * takes and double value and initialized the local
     * variable with the one that have been passed
     * @param poundsAndPences sets the local variable with the current value*/
    private Share(double poundsAndPences)
    {
        this.poundsAndPences = poundsAndPences;
    }

    /**getPoundsAndPences() is a getter method to. 
     * @return the poundsAndPences
     */
    public double getPoundsAndPences() 
    {
        return poundsAndPences;
    }

    /**setPoundsAndPences(int poundsAndPences) is a mutator method.
     * @param poundsAndPences set the poundsAndPences passed to the
     * methods to the local ones 
     */
    public void setPoundsAndPences(double poundsAndPences) 
    {
        this.poundsAndPences = poundsAndPences;
    }
    
    
    /**getInstance(String key) method is responsible
     * for validation of the multiple pattern with hashMap.
     * @param key is the key in the HashMap
     * @return the instances of the HashMap
     */
    public static Share getInstance(String key)
    {
        
        final int MAX_LENGTH_OF_THE_KEY = 3;
        
        if (key == null)
        {
            return null;
        }
      
        final String keyChecker = key.toUpperCase();
        
        
        if (!key.equals(keyChecker))
        {
            return null;
        }
        
        for (int i = 0; i < key.length(); i++)
        {
            if (!Character.isAlphabetic(key.charAt(i)))
            {
                return null;
            }
        }
        if (key.length() != MAX_LENGTH_OF_THE_KEY)
        {
            return null;
        }
        if (key.isEmpty())
        {
            return null;
        }
        
        if (key.equals(""))
        {
            return null;
        }
        
        Share instance = instances.get(key);
        if (instance == null)
        {
            instance = new Share(1.00);
            instances.put(key, instance);
        }
        
        return instance;
        
        
    }
    
    
    
    
    
}
