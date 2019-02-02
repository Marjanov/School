
package main;
import Student.Student;

/**
 *
 * @author user
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Milutin");
        student.setLastName("Marjanovic");
        student.setYearOfBirth(1998);
        
       
        student.getComputer().setHardDrive(58);
        student.getComputer().setMemory(14.7);
        student.getComputer().setOperatingSystem("Linux");
        student.getComputer().setProcessTact(8.9);
        
        student.getCourse().setName("JAva");
        student.getCourse().setCodeName(567);
        student.getCourse().setNumberOfClasses("23");
        
        student.info();
        
        
    }
    
}
