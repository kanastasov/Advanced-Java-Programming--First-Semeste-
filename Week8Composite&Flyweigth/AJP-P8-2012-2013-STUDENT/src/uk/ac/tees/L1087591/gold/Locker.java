package uk.ac.tees.L1087591.gold;

import java.util.ArrayList;
import java.util.List;

/**Locker is responsible for the Lockers in the Flights.
 *
 * @author Anastasov
 */
public class Locker<T extends Gear> {
    
    
    
    /**
     * locker stores anything that is successfully added to the Locker.
     */
    List<T> locker = new ArrayList<T>();
    
    /**
     * store is a list that adds every item.
     */
   List<T> store = new ArrayList<T>();
   
        /**
         * food represent the code for the food
         */
        char food = 'f';
        
        /**
         * medicine represent the code for the medicine.
         */
        char medicine = 'm';
        
        /**
         * bedding represent the code for the beddings.
         */
        char bedding = 'b';
    
    public boolean add(T item)
    {
        store.add(item);
        
        
        /**
         * sum represent the sum of the items weight.
         */
        int sum = 0;
        for(int i=0; i<store.size(); i++)
        {
            sum += store.get(i).getWeight();
            if(sum > 20)
            {
                return false;   
            }
            // bedding food medicine
            if((store.get(i).getCode() == bedding)) 
            {
                    for(int j=0; j<store.size(); j++)
                    {
                       if((store.get(j).getCode() == food)) 
                         {
                             System.out.println("*****" + store.get(i).getCode() );
                             return false;
                         }

                       if((store.get(j).getCode() == medicine)) 
                         {
                             System.out.println("*****" + store.get(i).getCode() );
                             return false;
                         }
                    }
                 
                 //food bedding medicine
                if((store.get(i).getCode() == food)) 
                {
                    for(int j=0; j<store.size(); j++)
                    {

                       if((store.get(j).getCode() == bedding)) 
                         {
                             System.out.println("*****" + store.get(i).getCode() );
                             return false;
                         }

                        if((store.get(j).getCode() == medicine)) 
                         {
                             System.out.println("*****" + store.get(i).getCode() );
                             return false;
                         }
                    }
                }
             }
            
                 //food medicine bedding
            if((store.get(i).getCode() == food)) 
            {
                 for(int j=0; j<store.size(); j++)
                 {
                     
                    if((store.get(j).getCode() == medicine)) 
                      {
                          return false;
                      }
                 }
                 
                 for(int j=0; j<store.size(); j++)
                 {
                     
                    if((store.get(j).getCode() == bedding)) 
                      {
                          return false;
                      }
                 }
                 
                 // medicine food bedding
                if((store.get(i).getCode() == medicine)) 
                {
                    for(int j=0; j<store.size(); j++)
                    {
                       if((store.get(j).getCode() == food)) 
                         {
                             return false;
                         }
                    }

                     for(int j=0; j<store.size(); j++)
                    {
                       if((store.get(j).getCode() == bedding)) 
                         {
                             return false;
                         }
                    }
                }
             }
            }
            //if the items are mixable add them to the list locker.
            locker.add(item);
         return   true;
    }
}
