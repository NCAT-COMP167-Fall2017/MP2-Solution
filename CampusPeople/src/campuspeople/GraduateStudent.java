package campuspeople;


import java.util.*;

/**
 * 
 */
public class GraduateStudent extends Student {

    /**
     * 
     */
    protected String thesis;

    /**
     * 
     */
    protected String concentration;

    /**
     * 
     */
    protected String assistanceType;

    /**
     * Default constructor
     */
    public GraduateStudent() {
        super();
        thesis = "";
        concentration = "";
        assistanceType = "";
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
     * @param thesis 
     * @param concentration 
     * @param assistanceType
     */
    public GraduateStudent(String firstname, String lastname, String studentId, String birthDate, String phoneNumber, String major, int creditHours, float gpa, String thesis, String concentration, String assistanceType) {
        super(firstname, lastname, studentId, birthDate, phoneNumber, major, creditHours, gpa);
        this.thesis = thesis;
        this.concentration = concentration;
        this.assistanceType = assistanceType;
    }

    /**
     * @param thesis 
     * @return
     */
    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    /**
     * @return
     */
    public String getThesis() {
        return thesis;
    }

    /**
     * @param concentration 
     * @return
     */
    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    /**
     * @return
     */
    public String getConcentration() {
        return concentration;
    }

    /**
     * @param assistanceType 
     * @return
     */
    public void setAssistanceType(String assistanceType) {
        this.assistanceType = assistanceType;
    }

    /**
     * @return
     */
    public String getAssistanceType() {
        return assistanceType;
    }

    /**
     * @return
     */
    public String toString() {
        return super.toString() + System.lineSeparator() + thesis + ", " + concentration + ", " + assistanceType;
    }

}