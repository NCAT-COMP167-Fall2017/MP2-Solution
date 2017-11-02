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
        this.major = major;
    }

    /**
     * @return
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param creditHours 
     * @return
     */
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    /**
     * @return
     */
    public int getCreditHours() {
        return creditHours;
    }

    /**
     * @param gpa 
     * @return
     */
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    /**
     * @return
     */
    public float getGpa() {
        return gpa;
    }

    /**
     * @return
     */
    public int getNumClasses() {
        return classSchedule.size();
    }

    /**
     * @param class 
     * @return
     */
    public void addClass(String className) {
        classSchedule.add(className);
    }

    /**
     * @param index 
     * @param class 
     * @return
     */
    public void setClass(int index, String className) {
        classSchedule.set(index, className);
    }

    /**
     * @param index 
     * @return
     */
    public String getClass(int index) {
        return classSchedule.get(index);
    }

    /**
     * @param index 
     * @return
     */
    public String deleteClass(int index) {
        return classSchedule.remove(index);
    }

    /**
     * @return
     */
    public String toString() {
        String returnString = super.toString() + System.lineSeparator() + major + ", " + creditHours + ", " + gpa;
        
        if(classSchedule.size() > 0) {
            returnString += System.lineSeparator() + classSchedule.get(0) + ", ";
            for(int i = 1; i < classSchedule.size(); i++) {
                returnString += ", " + classSchedule.get(i);
            }
        }
        
        return returnString;
    }

}