package campuspeople;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */
public class Department {

    private String name;
    private String location;
    private ArrayList<Employee> employees;
    private ArrayList<Student> students;
    
    private Scanner reader;
    private final SimpleDateFormat myDateFormat = new SimpleDateFormat("MM/dd/yyyy");
    
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
    
    public void writeDepartment(String filename) {
        try {
            FileWriter writer = new FileWriter(new File(filename));
            
            writer.write(this.toString());
            writer.close();
        } catch (IOException ex) {
            System.err.println("Unable to open " + filename + " to write department.");
            Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void readDepartment(String filename) { 
        try {
            reader = new Scanner(new File(filename));
            
            this.name = reader.nextLine();
            this.location = reader.nextLine();
            
            while(reader.hasNext()) {
                char personType = reader.nextLine().trim().charAt(0);

                switch(personType) {
                    case 'G':
                        readGraduateStudent();
                        break;
                    case 'U':
                        readUndergraduateStudent();
                        break;
                    case 'F':
                        readFacultyMember();
                        break;
                    case 'S':
                        readStaffMember();
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Failed to open " + filename + " for reading");
            Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void readPerson(Person person) {
        String[] personLine = reader.nextLine().split(",");
        person.setFirstName(personLine[0].trim());
        person.setLastName(personLine[1].trim());
        person.setStudentId(personLine[2].trim());
        try {
            person.setBirthDate(myDateFormat.parse(personLine[3].trim()));
        } catch (ParseException ex) {
            System.err.println("Failed to convert birth date for " + person.firstname + " " + person.lastname);
            Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
        }
        person.setPhoneNumber(personLine[4]);
    }
    
    private void readStudent(Student student) {
        String[] studentLine = reader.nextLine().split(",");
        String[] classLine = reader.nextLine().split(",");
        
        student.setMajor(studentLine[0].trim());
        student.setCreditHours(Integer.parseInt(studentLine[1].trim()));
        student.setGpa(Float.parseFloat(studentLine[2].trim()));
        
        for(int i = 0; i < classLine.length; i++) {
            student.addClass(classLine[i].trim());
        }
    }
    
    private void readGraduateStudent() {
        GraduateStudent student = new GraduateStudent();
        readPerson(student);
        readStudent(student);
        
        String[] graduateStudentLine = reader.nextLine().split(",");
        student.setThesis(graduateStudentLine[0].trim());
        student.setConcentration(graduateStudentLine[1].trim());
        student.setAssistanceType(graduateStudentLine[2].trim());
        
        students.add(student);
    }
    
    private void readUndergraduateStudent() {
        Student student = new Student();
        readPerson(student);
        readStudent(student);
        
        students.add(student);
    }
    
    private void readEmployee(Employee employee) {
        String[] employeeLine = reader.nextLine().split(",");
        try {
            employee.setHireDate(myDateFormat.parse(employeeLine[0].trim()));
        } catch (ParseException ex) {
            System.err.println("Failed to convert hire date for " + employee.firstname + " " + employee.lastname);
            Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
        }
        employee.setStatus(employeeLine[1].trim());
        employee.setDepartment(employeeLine[2].trim());
    }
    
    private void readFacultyMember() {
        Faculty faculty = new Faculty();
        readPerson(faculty);
        readEmployee(faculty);
        String[] facultyLine = reader.nextLine().split(",");
        String[] classLine = reader.nextLine().split(",");
        
        faculty.setRank(facultyLine[0].trim());
        faculty.setResearchArea(facultyLine[1].trim());
        
        for(int i = 0; i < classLine.length; i++) {
            faculty.addCourse(classLine[i].trim());
        }
    }
    
    private void readStaffMember() {
        Staff staff = new Staff();
        readPerson(staff);
        readEmployee(staff);
        String[] staffLine = reader.nextLine().split(",");
        
        staff.setJobTitle(staffLine[0].trim());
        staff.setSupervisor(staffLine[1].trim());
        staff.setCareerBand(staffLine[2].trim());
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