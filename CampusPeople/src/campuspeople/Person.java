package campuspeople;


import java.util.*;

/**
 * 
 */
public class Person {

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
        this.birthDate = new Date();
        String[] dateArray = birthDate.split("/");
        this.birthDate.setYear(Integer.parseInt(dateArray[2].trim()));
        this.birthDate.setMonth(Integer.parseInt(dateArray[1].trim()));
        this.birthDate.setYear(Integer.parseInt(dateArray[0].trim()));
        this.phoneNumber = phoneNumber;
    }

    /**
     * @param firstname 
     * @return
     */
    public void setFirstName(String firstname) {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return
     */
    public String getFirstName() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @param lastname 
     * @return
     */
    public void setLastName(String lastname) {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return
     */
    public String getLastName() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");

    }

    /**
     * @param studentId 
     * @return
     */
    public void setStudentId(String studentId) {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return
     */
    public String getStudentId() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @param birthDate 
     * @return
     */
    public void setBirthDate(Date birthDate) {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return
     */
    public Date getBirthDate() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @param phoneNumber 
     * @return
     */
    public void setPhoneNumber(String phoneNumber) {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return
     */
    public String getPhoneNumber() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

}