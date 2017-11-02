/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campuspeople;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TextInputDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author CCannon
 */
public class CampusPeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat myDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        
        Department compSci = new Department();
        if(args.length > 0)
            compSci.readDepartment(args[0]);
        
        Student undergrad = new Student("Bob", "McGee", "8993432", "01/10/1998", "123-456-7890", "Computer Science", 42, 3.3f);
        undergrad.addClass("COMP 123");
        undergrad.addClass("MATH 132");
        undergrad.addClass("PHYS 242");
  
        GraduateStudent gradStudent = new GraduateStudent("Milly", "Mckillicutty", "34390482", "06/06/2001", "911-999-9191", "Electrical Engineering", 71, 3.12f, "Effects of autonomous technology in mobility", "Autonomous Robotics", "RA");
        gradStudent.addClass("COMP 726");
        gradStudent.addClass("ECEN 654");
        gradStudent.addClass("ECEN 1321");
       
        Faculty faculty = new Faculty();
        faculty.setFirstName("Kelvin");
        faculty.setLastName("Bryant");
        faculty.setPhoneNumber("098-765-4321");
        try {
            faculty.setBirthDate(myDateFormat.parse("02/10/1990"));
        } catch (ParseException ex) {
            Logger.getLogger(CampusPeople.class.getName()).log(Level.SEVERE, null, ex);
        }
        faculty.setStudentId("434983");
        faculty.setStatus("PT");
        try {
            faculty.setHireDate(myDateFormat.parse("08/20/2016"));
        } catch (ParseException ex) {
            Logger.getLogger(CampusPeople.class.getName()).log(Level.SEVERE, null, ex);
        }
        faculty.setDepartment("Electrical and Computer Engineering");
        faculty.setRank("Associate");
        faculty.setResearchArea("Sparky stff");
        
        Staff staff = new Staff();
        staff.setFirstName("Amy");
        staff.setLastName("Farfowler");
        try {
            staff.setBirthDate(myDateFormat.parse("7/4/1999"));
        } catch (ParseException ex) {
            Logger.getLogger(CampusPeople.class.getName()).log(Level.SEVERE, null, ex);
        }
        staff.setPhoneNumber("111-867-5309");
        staff.setDepartment("Facilities");
        try {
            staff.setHireDate(myDateFormat.parse("10/16/2017"));
        } catch (ParseException ex) {
            Logger.getLogger(CampusPeople.class.getName()).log(Level.SEVERE, null, ex);
        }
        staff.setSupervisor("Meanie BossMan");
        staff.setStatus("FT");
        staff.setJobTitle("Chief Chiefer in Chief");
        staff.setCareerBand("Advanced");
        
        compSci.addStudent(undergrad);
        compSci.addStudent(gradStudent);
        compSci.addEmployee(faculty);
        compSci.addEmployee(staff);
        
        String filename = JOptionPane.showInputDialog(null, "Please enter a save file name:", "Save Department", JOptionPane.QUESTION_MESSAGE);
        compSci.writeDepartment(filename);
    }
    
}
