/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author qa-popodne
 */
public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;

    public Computer getComputer() {
        return computer;
    }
 
    public Course getCourse() {
        return course;
    }
   
    public Student() {
        this.firstName="Mihailo";
        this.lastName="Marjanovic";
        this.yearOfBirth=1989;
        this.course=new Course();
        this.computer=new Computer();
    }

    public Student(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void info() {
        System.out.println("First Name : " + this.firstName);
        System.out.println("Last Name : " + this.lastName);
        System.out.println("Year of Birth : " + this.yearOfBirth);
    }
}
