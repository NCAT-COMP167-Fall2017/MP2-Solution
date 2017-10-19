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
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return
     */
    public String getThesis() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @param concentration 
     * @return
     */
    public void setConcentration(String concentration) {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return
     */
    public String getConcentration() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @param assistanceType 
     * @return
     */
    public void setAssistanceType(String assistanceType) {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return
     */
    public String getAssistanceType() {
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