package campuspeople;


import java.util.*;

/**
 * 
 */
public class Employee extends Person {

    /**
     * 
     */
    protected Date hireDate;

    /**
     * 
     */
    protected String status;

    /**
     * 
     */
    protected String department;

    /**
     * Default constructor
     */
    public Employee() {
        super();
        hireDate = new Date();
        status = "";
        department = "";
    }

    /**
     * @param hireDate 
     * @return
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * @return
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * @param status 
     * @return
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param department 
     * @return
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

}