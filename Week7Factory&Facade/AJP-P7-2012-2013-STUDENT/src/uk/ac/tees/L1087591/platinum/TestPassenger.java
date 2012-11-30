/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.L1087591.platinum;

import java.util.ArrayList;
import java.util.Collections;

/**TestPassenger is the driver class to test the package.
 *
 * @author Anastasov
 */
public class TestPassenger {
    
    /**main is the main mathod of the package.
     * 
     * @param args 
     */
    public static void main(String []args) {
        
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
          
          
        System.out.println("First part of the Platinum: \n");
        Collections.sort(myList);
        for (Passenger integer : myList) {
            System.out.println(integer.getFirstName() + " " + integer.getLastName() + "\t\t" + integer.getPassportNumber() + "\t" 
                    + integer.getPe() + "\t" + integer.getNt());
        }
        
        
        
        
        
            /**
             * @param myList2 test the second part of the Platinum task and sort the list by Passport number and Country.
             */
         ArrayList<NationalityAndPassportComparator> myList2 = new ArrayList<NationalityAndPassportComparator>();
         
          myList2.add(new NationalityAndPassportComparator("Mark", "Truran", markTruransPassportNumber, PassengerEnum.E, Nationality.GBR)); 
          myList2.add(new NationalityAndPassportComparator("Derek", "Simpson", derekSimpsonsPassportNumber, PassengerEnum.F, Nationality.GER));
          myList2.add(new NationalityAndPassportComparator("Matt", "Damon", mattDamonsPassportNumber, PassengerEnum.F, Nationality.GBR));
          myList2.add(new NationalityAndPassportComparator("Erika", "Downs", erikaDownsPassportNumber, PassengerEnum.B, Nationality.IND));
          myList2.add(new NationalityAndPassportComparator("Mike", "Lockyer", mikeLockyersPassportNumber, PassengerEnum.B, Nationality.USA));
          myList2.add(new NationalityAndPassportComparator("Simon", "Lynch", simonLynchsPassportNumber, PassengerEnum.B, Nationality.BOT));
          myList2.add(new NationalityAndPassportComparator("Gwenn", "Bosser", gwennBossersPassportNumber, PassengerEnum.E, Nationality.BOT));
          myList2.add(new NationalityAndPassportComparator("Zafar", "Khan", zafarKhansPassportNumber, PassengerEnum.E, Nationality.IND));
          myList2.add(new NationalityAndPassportComparator("Simon", "Stoabart", simonStoabartsPassportNumber, PassengerEnum.B, Nationality.GBR));
          myList2.add(new NationalityAndPassportComparator("Jackie", "Dawes", jackieDawessPassportNumber, PassengerEnum.E, Nationality.USA));
        
        System.out.println("\nSecond part of the Platinum: \n");
        Collections.sort(myList2, NationalityAndPassportComparator.nationalityComparator);
        for (NationalityAndPassportComparator integer : myList2) {
            System.out.println(integer.getFirstName() + " " + integer.getLastName() + "\t\t" + integer.getPassportNumber() + "\t" 
                    + integer.getPe() + "\t" + integer.getNt());
        }
        
        
    }
}
