package uk.ac.tees.L1087591.platinum;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;


/**PassengersTest is responsible for testing the solution of the Platinum task.
 *
 * @author Anastasov
 */
public class PassengersTest {

    /**
         * @param markTruransPassportNumber represent the passport number of Mark Truran.
         */
         final int markTruransPassportNumber = 691192317;
         
         /**
         * @param derekSimpsonsPassportNumber represent the passport number of Derek Simpson.
         */
         final int derekSimpsonsPassportNumber = 557213131;
         
         /**
         * @param mattDamonsPassportNumber represent the passport number of Matt Damon.
         */
         final int mattDamonsPassportNumber = 547712126;
         
         /**
         * @param erikaDownsPassportNumber represent the passport number of Erika Down.
         */
         final int erikaDownsPassportNumber = 329982763;
         
         /**
         * @param mikeLockyersPassportNumber represent the passport number of Mike Lockers.
         */
         final int mikeLockyersPassportNumber = 459174268;
         
         /**
         * @param simonLynchsPassportNumber represent the passport number of Simon Lynch.
         */
         final int simonLynchsPassportNumber = 117790344;
         
         /**
         * @param gwennBossersPassportNumber represent the passport number of Gwenn Bosser.
         */
         final int gwennBossersPassportNumber = 644626722;
         
         /**
         * @param zafarKhansPassportNumber represent the passport number of Zafar Khan.
         */
         final int zafarKhansPassportNumber = 691192317;
         
         /**
         * @param simonStoabartsPassportNumber represent the passport number of Simon Stoabart.
         */
         final int simonStoabartsPassportNumber = 564253227;
         
         /**
         * @param jackieDawessPassportNumber represent the passport number of Jackie Dawess.
         */
         final int jackieDawessPassportNumber = 112442317;
    
    
    
     @Test
    public void testSortPassengersByCountry() {
        
        
        
         
            /**
             * @param myList test the first part of the Platinum task and sort the list by the lastName of the Passenger.
             */
          ArrayList<Passenger> myList = new ArrayList<Passenger>();
          myList.add(new Passenger("Mark", "Truran", markTruransPassportNumber, PassengerEnum.E, Nationality.GBR)); 
          myList.add(new Passenger("Derek", "Simpson", derekSimpsonsPassportNumber, PassengerEnum.F, Nationality.GER));
          myList.add(new Passenger("Matt", "Damon", mattDamonsPassportNumber, PassengerEnum.F, Nationality.GBR));
          myList.add(new Passenger("Erika", "Downs", erikaDownsPassportNumber, PassengerEnum.B, Nationality.IND));
          myList.add(new Passenger("Mike", "Lockyer", mikeLockyersPassportNumber, PassengerEnum.B, Nationality.USA));
          myList.add(new Passenger("Simon", "Lynch", simonLynchsPassportNumber, PassengerEnum.B, Nationality.BOT));
          myList.add(new Passenger("Gwenn", "Bosser", gwennBossersPassportNumber, PassengerEnum.E, Nationality.BOT));
          myList.add(new Passenger("Zafar", "Khan", zafarKhansPassportNumber, PassengerEnum.E, Nationality.IND));
          myList.add(new Passenger("Simon", "Stoabart", simonStoabartsPassportNumber, PassengerEnum.B, Nationality.GBR));
          myList.add(new Passenger("Jackie", "Dawes", jackieDawessPassportNumber, PassengerEnum.E, Nationality.USA));
         Collections.sort(myList);
         
          ArrayList<Passenger> myList2 = new ArrayList<Passenger>();
          myList2.add(new Passenger("Gwenn", "Bosser", gwennBossersPassportNumber, PassengerEnum.E, Nationality.BOT)); 
          myList2.add(new Passenger("Matt", "Damon", mattDamonsPassportNumber, PassengerEnum.F, Nationality.GBR));
          myList2.add(new Passenger("Jackie", "Dawes", jackieDawessPassportNumber, PassengerEnum.E, Nationality.USA));
          myList2.add(new Passenger("Erika", "Downs", erikaDownsPassportNumber, PassengerEnum.B, Nationality.IND));
          myList2.add(new Passenger("Zafar", "Khan", zafarKhansPassportNumber, PassengerEnum.E, Nationality.IND));
          myList2.add(new Passenger("Mike", "Lockyer", mikeLockyersPassportNumber, PassengerEnum.B, Nationality.USA));
          myList2.add(new Passenger("Simon", "Lynch", simonLynchsPassportNumber, PassengerEnum.B, Nationality.BOT));
          myList2.add(new Passenger("Derek", "Simpson", derekSimpsonsPassportNumber, PassengerEnum.F, Nationality.GER));
          myList2.add(new Passenger("Simon", "Stoabart", simonStoabartsPassportNumber, PassengerEnum.B, Nationality.GBR));
          myList2.add(new Passenger("Mark", "Truran", markTruransPassportNumber, PassengerEnum.E, Nationality.GBR));
          
          
         
        for (Passenger integer : myList) {
            System.out.println(integer.getFirstName() + " " + integer.getLastName() + "\t\t" + integer.getPassportNumber() + "\t" 
                    + integer.getPe() + "\t" + integer.getNt());
            
        }
        
        for(int i=0; i<myList.size(); i++)
        {
            assertEquals(myList.get(i).getFirstName() + " " + myList.get(i).getLastName() + " " + myList.get(i).getPassportNumber()+ " " + myList.get(i).getPe() + " " + myList.get(i).getNt(), 
                    myList2.get(i).getFirstName() + " " + myList2.get(i).getLastName() + " " + myList2.get(i).getPassportNumber()+ " " + myList2.get(i).getPe() + " " + myList2.get(i).getNt());
        }
        System.out.println("testSortPassengersByCountry test OK");
    }
     
      @Test
    public void testSortPassengersByCountryAndPassengerNumber() {
         
        
        
         
            /**
             * @param myList test the first part of the Platinum task and sort the list by the lastName of the Passenger.
             */
          ArrayList<NationalityAndPassportComparator> myList = new ArrayList<NationalityAndPassportComparator>();
          myList.add(new NationalityAndPassportComparator("Mark", "Truran", markTruransPassportNumber, PassengerEnum.E, Nationality.GBR)); 
          myList.add(new NationalityAndPassportComparator("Derek", "Simpson", derekSimpsonsPassportNumber, PassengerEnum.F, Nationality.GER));
          myList.add(new NationalityAndPassportComparator("Matt", "Damon", mattDamonsPassportNumber, PassengerEnum.F, Nationality.GBR));
          myList.add(new NationalityAndPassportComparator("Erika", "Downs", erikaDownsPassportNumber, PassengerEnum.B, Nationality.IND));
          myList.add(new NationalityAndPassportComparator("Mike", "Lockyer", mikeLockyersPassportNumber, PassengerEnum.B, Nationality.USA));
          myList.add(new NationalityAndPassportComparator("Simon", "Lynch", simonLynchsPassportNumber, PassengerEnum.B, Nationality.BOT));
          myList.add(new NationalityAndPassportComparator("Gwenn", "Bosser", gwennBossersPassportNumber, PassengerEnum.E, Nationality.BOT));
          myList.add(new NationalityAndPassportComparator("Zafar", "Khan", zafarKhansPassportNumber, PassengerEnum.E, Nationality.IND));
          myList.add(new NationalityAndPassportComparator("Simon", "Stoabart", simonStoabartsPassportNumber, PassengerEnum.B, Nationality.GBR));
          myList.add(new NationalityAndPassportComparator("Jackie", "Dawes", jackieDawessPassportNumber, PassengerEnum.E, Nationality.USA));
         Collections.sort(myList, NationalityAndPassportComparator.nationalityComparator);
       
         
          ArrayList<Passenger> myList2 = new ArrayList<Passenger>();
           myList2.add(new Passenger("Simon", "Lynch", simonLynchsPassportNumber, PassengerEnum.B, Nationality.BOT));
          myList2.add(new Passenger("Gwenn", "Bosser", gwennBossersPassportNumber, PassengerEnum.E, Nationality.BOT)); 
          myList2.add(new Passenger("Matt", "Damon", mattDamonsPassportNumber, PassengerEnum.F, Nationality.GBR));
           myList2.add(new Passenger("Simon", "Stoabart", simonStoabartsPassportNumber, PassengerEnum.B, Nationality.GBR));
            myList2.add(new Passenger("Mark", "Truran", markTruransPassportNumber, PassengerEnum.E, Nationality.GBR));
             myList2.add(new Passenger("Derek", "Simpson", derekSimpsonsPassportNumber, PassengerEnum.F, Nationality.GER));
          myList2.add(new Passenger("Erika", "Downs", erikaDownsPassportNumber, PassengerEnum.B, Nationality.IND));
          myList2.add(new Passenger("Zafar", "Khan", zafarKhansPassportNumber, PassengerEnum.E, Nationality.IND));
          myList2.add(new Passenger("Jackie", "Dawes", jackieDawessPassportNumber, PassengerEnum.E, Nationality.USA));
          myList2.add(new Passenger("Mike", "Lockyer", mikeLockyersPassportNumber, PassengerEnum.B, Nationality.USA));
         
         
         
         
          
         
        for (NationalityAndPassportComparator integer : myList) {
            System.out.println(integer.getFirstName() + " " + integer.getLastName() + "\t\t" + integer.getPassportNumber() + "\t" 
                    + integer.getPe() + "\t" + integer.getNt());
            
        }
        
        for(int i=0; i<myList.size(); i++)
        {
            assertEquals(myList.get(i).getFirstName() + " " + myList.get(i).getLastName() + " " + myList.get(i).getPassportNumber()+ " " + myList.get(i).getPe() + " " + myList.get(i).getNt(), 
                    myList2.get(i).getFirstName() + " " + myList2.get(i).getLastName() + " " + myList2.get(i).getPassportNumber()+ " " + myList2.get(i).getPe() + " " + myList2.get(i).getNt());
        }
          
        System.out.println("testSortPassengersByCountryAndPassengerNumber test OK");
    }

}
