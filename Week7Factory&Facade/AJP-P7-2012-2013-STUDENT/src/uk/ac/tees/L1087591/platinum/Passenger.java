/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.L1087591.platinum;

/**Passanger represent a passenger of the flight company.
 *
 * @author Anastasov
 */
public class Passenger implements Comparable {
    /**
     * @param firstName represent the first name of the passenger.
     */
    private String firstName;
    
    /**
     * @param lastName represent the last name of the passenger.
     */
    private String lastName;
    
    /**
     * @param passportNumber represent a 9 digit passport number.
     */
    private int passportNumber;
    
    
    /**
     * @param pe is a type of flight.
     */
    PassengerEnum pe;
    
    /**
     * @param nt represent the nationality of the passenger.
     */
    Nationality nt;

    
    
     /**Passenger initialized the current values to the passed ones to the consctructor.
     * 
     * @param firstName sets the first name of the passenger.
     * @param lastName sets the last name of the passenger.
     * @param passportNumber sets the passport number of the passenger.
     * @param pe sets the flight type of the passenger.
     * @param nt sets the nationality fo the passenger.
     */
    public Passenger(String firstName, String lastName, int passportNumber, PassengerEnum pe, Nationality nt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.pe = pe;
        this.nt = nt;
    }
    
    /**Natioanlity return the nationalit of the passenger.
     * 
     * @return nt
     */
    public Nationality getNt() {
        return nt;
    }

    /**setNt sets the nationality of the passenger.
     * 
     * @param nt sets the current nationality
     */
    public void setNt(Nationality nt) {
        this.nt = nt;
    }

   

    /** getFirstName() return the first name of the passenger.
     * 
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**setFirstName sets the first name of the passenger.
     * 
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**getLastName return the last name of the passenger.
     * 
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**setLastName sets the last name of the Passanger.
     * 
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**gerPassortNumber() gets the passport number of the passenger.
     * 
     * @return passportNumber
     */
    public int getPassportNumber() {
        return passportNumber;
    }

    /**setPassportNumber sets the passport number of the passenger.
     * 
     * @param passportNumber 
     */
    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    /**getPe gets the type of flight of the passenger.
     * 
     * @return pe 
     */
    public PassengerEnum getPe() {
        return pe;
    }

    /**setPe sets the type of the flight of the passenger.
     * 
     * @param pe 
     */
    public void setPe(PassengerEnum pe) {
        this.pe = pe;
    }

    @Override
    public int compareTo(Object o) {
        final Passenger p1 = (Passenger) o;
        if (this.lastName.compareTo(p1.lastName) > 0) {
            return 1;
        } else if (this.lastName.compareTo(p1.lastName) == 0) {
            return 0;
        } else {
             return -1;   
        }
    }
}
