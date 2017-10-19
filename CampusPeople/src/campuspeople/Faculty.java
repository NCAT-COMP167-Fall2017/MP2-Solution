package campuspeople;


import java.util.*;

/**
 * 
 */
public class Faculty extends Employee {
    
    /**
     * 
     */
    protected String rank;

    /**
     * 
     */
    protected String researchArea;

    /**
     * 
     */
    protected ArrayList<String> currentCourses;

    /**
     * Default constructor
     */
    public Faculty() {
        super();
        rank = "";
        researchArea = "";
        currentCourses = new ArrayList<>();
    }

    /**
     * @param rank 
     * @return
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * @return
     */
    public String getRank() {
        return rank;
    }

    /**
     * @param researchArea 
     * @return
     */
    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    /**
     * @return
     */
    public String getResearchArea() {
        return researchArea;
    }

    /**
     * @return
     */
    public int getNumCourses() {
        return currentCourses.size();
    }

    /**
     * @param course 
     * @return
     */
    public void addCourse(String course) {
        currentCourses.add(course);
    }

    /**
     * @param course 
     * @param index 
     * @return
     */
    public void setCourse(String course, int index) {
        currentCourses.set(index, course);
    }

    /**
     * @return
     */
    public String getCourse(int index) {
        return currentCourses.get(index);
    }

    /**
     * @param index 
     * @return
     */
    public String deleteCourse(int index) {
        return currentCourses.remove(index);
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        throw new java.lang.UnsupportedOperationException("Not implemented yet");
    }

}