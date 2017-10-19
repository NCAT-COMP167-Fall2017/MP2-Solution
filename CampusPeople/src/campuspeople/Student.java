package campuspeople;


import java.util.*;

/**
 * 
 */
public class Student extends Person {

    /**
     * 
     */
    protected String major;

    /**
     * 
     */
    protected int creditHours;

    /**
     * 
     */
    protected float gpa;

    /**
     * 
     */
    protected ArrayList<String> classSchedule;


    /**
     * Default constructor
     */
    public Student() {
        super();
        major = "";
        creditHours = 0;
        gpa = 0.0f;
        classSchedule = new ArrayList<>();
    }

    /**
     * @param firstname 
     * @param lastname 
     * @param studentId 
     * @param birthDate 
     * @param phoneNumber 
     * @param major 
     * @param creditHours 
     * @param gpa
     */
    public Student(String firstname, String lastname, String studentId, String birthDate, String phoneNumber, String major, int creditHours, float gpa) {
        super(firstname, lastname, studentId, birthDate, phoneNumber);
        this.major = major;
        this.creditHours = creditHours;
        this.gpa = gpa;
        classSchedule = new ArrayList<>();
    }

    /**
     * @param major 
     * @return
     */
    public void setMajor(String major) {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return
     */
    public String getMajor() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @param creditHours 
     * @return
     */
    public void setCreditHours(int creditHours) {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return
     */
    public int getCreditHours() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @param gpa 
     * @return
     */
    public void setGpa(float gpa) {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return
     */
    public float getGpa() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return
     */
    public int getNumClasses() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @param class 
     * @return
     */
    public void addClass(String className) {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @param index 
     * @param class 
     * @return
     */
    public void setClass(int index, String className) {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @param index 
     * @return
     */
    public String getClass(int index) {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @param index 
     * @return
     */
    public String deleteClass(int index) {
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