package campuspeople;


import java.util.*;

/**
 * 
 */
public class Staff extends Employee {
    
    /**
     * 
     */
    protected String jobTitle;

    /**
     * 
     */
    protected String supervisor;

    /**
     * 
     */
    protected String careerBand;

    /**
     * Default constructor
     */
    public Staff() {
        super();
        jobTitle = "";
        supervisor = "";
        careerBand = "";
    }

    /**
     * @param jobTitle 
     * @return
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * @return
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param supervisor 
     * @return
     */
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * @return
     */
    public String getSupervisor() {
        return supervisor;
    }

    /**
     * @param careerBand 
     * @return
     */
    public void setCareerBand(String careerBand) {
        careerBand = careerBand;
    }

    /**
     * @return
     */
    public String getCareerBand() {
        return careerBand;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

}