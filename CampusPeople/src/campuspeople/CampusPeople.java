/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campuspeople;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        Person dudebuddy = new Person("Chris", "Cannon", "12345678", "03/10/1994", "704-867-5309");
        
        Student dudeguy = new Student("Bob", "McGee", "8993432", "01/10/1998", "123-456-7890", "Computer Science", 42, 3.3f);
        dudeguy.addClass("COMP 123");
        dudeguy.addClass("MATH 132");
        dudeguy.addClass("PHYS 242");
        
        GraduateStudent homeboy = new GraduateStudent("Milly", "Mckillicutty", "34390482", "06/06/2001", "911-999-9191", "Electrical Engineering", 71, 3.12f, "Effects of autonomous technology in mobility", "Autonomous Robotics", "RA");
        homeboy.addClass("COMP 726");
        homeboy.addClass("ECEN 654");
        homeboy.addClass("ECEN 1321");
        
        Employee mrGuy = new Employee();
        mrGuy.setFirstName("John");
        mrGuy.setLastName("Johnson");
        mrGuy.setStudentId("001");
        try {
            mrGuy.setBirthDate(myDateFormat.parse("10/13/1943"));
        } catch (ParseException ex) {
            Logger.getLogger(CampusPeople.class.getName()).log(Level.SEVERE, null, ex);
        }
        mrGuy.setStatus("FT");
        mrGuy.setDepartment("Mechnical Engineering");
        
        Faculty drDude = new Faculty();
        drDude.setFirstName("Kelvin");
        drDude.setLastName("Bryant");
        drDude.setPhoneNumber("098-765-4321");
        try {
            drDude.setBirthDate(myDateFormat.parse("02/10/1990"));
        } catch (ParseException ex) {
            Logger.getLogger(CampusPeople.class.getName()).log(Level.SEVERE, null, ex);
        }
        drDude.setStudentId("434983");
        drDude.setStatus("PT");
        try {
            drDude.setHireDate(myDateFormat.parse("08/20/2016"));
        } catch (ParseException ex) {
            Logger.getLogger(CampusPeople.class.getName()).log(Level.SEVERE, null, ex);
        }
        drDude.setDepartment("Electrical and Computer Engineering");
        drDude.setRank("Associate");
        drDude.setResearchArea("Sparky stff");
    }
    
}
