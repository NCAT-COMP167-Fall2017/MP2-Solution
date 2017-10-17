package campuspeople;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * 
 */
public class Person {

    private final SimpleDateFormat myDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    
    /**
     * The given name of a Person
     */
    protected String firstname;

    /**
     * The family name of a Person
     */
    protected String lastname;

    /**
     * Assigned 9-digit number for a Person
     */
    protected String studentId;

    /**
     * Date of a person's birth
     */
    protected Date birthDate;

    /**
     * 10-digit phone number separated with "-"
     */
    protected String phoneNumber;
    
    /**
     * Default constructor
     */
    public Person() {
        firstname = "";
        lastname = "";
        studentId = "";
        birthDate = new Date();
        phoneNumber = "";
    }

    /**
     * Instantiates a Person and initializes each value to the given param
     * @param firstname 
     * @param lastname 
     * @param studentId 
     * @param birthDate 
     * @param phoneNumber
     */
    public Person(String firstname, String lastname, String studentId, String birthDate, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentId = studentId;
        try {
            this.birthDate = myDateFormat.parse(birthDate);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Invalid Birth Date Format. Birth Date Note Set.", "Birth Date Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.phoneNumber = phoneNumber;
    }

    /**
     * Set this Person's firstname to the given firstname
     * @param firstname
     */
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Retrieve firstname
     * @return this Person's assigned value for first name
     */
    public String getFirstName() {
        return this.firstname;
    }

    /**
     * Assign the given lastname to the Person's lastname
     * @param lastname
     */
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Retrieve the family name of this Person
     * @return this Person objects assigned lastname
     */
    public String getLastName() {
        return this.lastname;
    }

    /**
     * Assign the given String to this Person's studentId
     * @param studentId a 9 digit number assigned by the school 
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * Retrieve the school issues 9-digit ID for this Person as a String
     * @return the studentId for this Person
     */
    public String getStudentId() {
        return this.studentId;
    }

    /**
     * Sets the given java date to this Person's birthDate
     * @param birthDate as a java Data
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Retrieves the Person's date of birth
     * @return java Date for the Person's birthday
     */
    public Date getBirthDate() {
        return this.birthDate;
    }

    /**
     * Sets the given 10-digit formatted phone number this Person's phone number 
     * @param phoneNumber as a String in the format "###-###-####"
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Retrieves this Person's phone number
     * @return phone number as a String in the format "###-###-####"
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Returns a string representation of this Person
     * @return String representing this person in accordance with the documentation
     */
    public String toString() {
        String birthDateString = myDateFormat.format(lastname);
        return this.firstname + ", " + this.lastname + ", " + this.studentId + ", " + birthDateString + ", " + this.phoneNumber;
    }

}