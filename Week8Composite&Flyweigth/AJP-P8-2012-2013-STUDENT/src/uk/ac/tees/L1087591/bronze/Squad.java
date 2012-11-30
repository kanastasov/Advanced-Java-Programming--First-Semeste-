/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.L1087591.bronze;

import java.util.ArrayList;

/**Squad is concreate class which implements the Deployable.
 *
 * @author Anastasov
 */
public class Squad implements Deployable {

    /**
     * myList stores the Deployable objects.
     */
    ArrayList<Deployable> myList = new ArrayList<Deployable>();
    
    /**add is reponsible for adding a Deployable object to the list.
     * 
     * @param deployableObjectToBeAddedIntoTheList 
     */
    public void add(Deployable deployableObjectToBeAddedIntoTheList) {
        myList.add(deployableObjectToBeAddedIntoTheList);
    }
    
    /**remove is responsible for removing Deployable object from the list.
     * 
     * @param deployableObjectToBeRemovedFromTheList 
     */
    public void remove(Deployable deployableObjectToBeRemovedFromTheList) {
        myList.remove(deployableObjectToBeRemovedFromTheList);
    }
    
    /**
     * counter is responsible for counting the soldiers in the list.
     */
     int counter = 0;
    
    @Override
    public int getStrength() {
        for (Deployable dp: myList) {
            counter += dp.getStrength();
        }
        return counter;
    }
    
}
