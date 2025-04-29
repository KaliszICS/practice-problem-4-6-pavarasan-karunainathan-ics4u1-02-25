/**
 * Definition of the Person class
 * @author Pavarasan Karunainathan
 * @version 17.0.1
 */

import java.util.Arrays;

class Person{
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings = 0;
    private Person[] siblings = new Person[0];

    /**
     * Constructor of the Person class
     * @param _firstname The first name of the Person
     * @param _lastname The last name of the Person
     * @param _birthDay The birth day of the Person
     * @param _birthMonth The birth month of the Person
     * @param _birthYear The birth year of the Person
     * @param _ssn The SSN of the Person
     */
    public Person(String _firstname, String _lastname, int _birthDay, int _birthMonth, int _birthYear, String _ssn){
        firstname = _firstname;
        lastname = _lastname;
        birthDay = _birthDay;
        birthMonth = _birthMonth;
        birthYear = _birthYear;
        ssn = _ssn;
    }

    /**
     * Gets the first name of the Person
     * @return The first name of the Person
     */
    public String getFirstname(){return firstname;}

    /**
     * Gets the last name of the Person
     * @return The last name of the Person
     */
    public String getLastname(){return lastname;}

    /**
     * Sets the first name of the person
     * @param _firstname The first name to be set to
     */
    public void setFirstname(String _firstname){firstname = _firstname;}

    /**
     * Sets the last name of the person
     * @param _lastname The last name to set to
     */
    public void setLastname(String _lastname){lastname = _lastname;}
    
    /**
     * Gets the birthday of the Person
     * @return The birthday of the Person, in format DD/MM/YYYY
     */
    public String getBirthday(){
        return String.valueOf(birthDay) + "/" + String.valueOf(birthMonth) + "/" + String.valueOf(birthYear);
    }

    /**
     * Adds a sibling (Person) to siblings
     * @param sibling The Person to add to siblings
     */
    public void addSibling(Person sibling){
        siblings = Arrays.copyOf(siblings, ++numberOfSiblings);
        siblings[numberOfSiblings-1] = sibling;
    }

    /**
     * Gets the siblings of the Person
     * @return The siblings of the Person
     */
    public Person[] getSiblings(){return siblings;}
}