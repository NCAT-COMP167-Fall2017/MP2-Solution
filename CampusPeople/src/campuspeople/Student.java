package campuspeople;


import java.util.*;

/**
 * 
 */
public class Student extends Person {

    /**
     * Default constructor
     */
    public Student() {
    }

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
     * 
     */
    public void Student() {
        // TODO implement here
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
    public void Student(String firstname, String lastname, String studentId, String birthDate, String phoneNumber, String major, int creditHours, float gpa) {
        // TODO implement here
    }

    /**
     * @param major 
     * @return
     */
    public void setMajor(String major) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getMajor() {
        // TODO implement here
        return "";
    }

    /**
     * @param creditHours 
     * @return
     */
    public void setCreditHours(int creditHours) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getCreditHours() {
        // TODO implement here
        return 0;
    }

    /**
     * @param gpa 
     * @return
     */
    public void setGpa(float gpa) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public float getGpa() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @return
     */
    public int getNumClasses() {
        // TODO implement here
        return 0;
    }

    /**
     * @param class 
     * @return
     */
    public void addClass(String class) {
        // TODO implement here
        return null;
    }

    /**
     * @param index 
     * @param class 
     * @return
     */
    public null setClass(int index, String class) {
        // TODO implement here
        return null;
    }

    /**
     * @param index 
     * @return
     */
    public String getClass(int index) {
        // TODO implement here
        return "";
    }

    /**
     * @param index 
     * @return
     */
    public String deleteClass(int index) {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

}