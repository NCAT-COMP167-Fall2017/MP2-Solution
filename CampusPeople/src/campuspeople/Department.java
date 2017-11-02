package campuspeople;


import java.util.ArrayList;

/**
 * 
 */
public class Department {

    private String name;
    private String location;
    private ArrayList<Employee> employees;
    private ArrayList<Student> students;
    
    /**
     * Default constructor
     */
    public Department() {
        name = "";
        location = "";
        employees = new ArrayList();
        students = new ArrayList();
    }
    
    public Department(String name, String location) {
        this();
        this.name = name;
        this.location = location;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void setStudent(int index, Student student) {
        students.set(index, student);
    }
    
    public Student getStudent(int index) {
        return students.get(index);
    }
    
    public int getNumStudents() {
        return students.size();
    }
    
    public Student removeStudent(int index) {
        return students.remove(index);
    }
    
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    
    public void setEmployee(int index, Employee employee) {
        employees.set(index, employee);
    }
    
    public Employee getEmployee(int index) {
        return employees.get(index);
    }
    
    public int getNumEmployees() {
        return employees.size();
    }
    
    public Employee removeEmployee(int index) {
        return employees.remove(index);
    }
    
    public String toString() { 
        String returnString = name + System.lineSeparator() + location;
        
        for(Student student : students) {
            if(student.getClass() == GraduateStudent.class) {
                returnString += System.lineSeparator() + "G" + System.lineSeparator() + student.toString();
            } else {
                returnString += System.lineSeparator() + "U" + System.lineSeparator() + student.toString();
            }
        }
        for(Employee employee : employees) {
            if(employee.getClass() == Faculty.class) { 
                returnString += System.lineSeparator() + "F" + System.lineSeparator() + employee.toString();
            } else {
                returnString += System.lineSeparator() + "S" + System.lineSeparator() + employee.toString();
            }
        }
        
        return returnString;
    }
}