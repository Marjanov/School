/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author user
 */
public class Course {

    private String name;
    private String numberOfClasses;
    private int codeName;

    public Course(String name, String numberOfClasses, int codeName) {
        this.name = name;
        this.numberOfClasses = numberOfClasses;
        this.codeName = codeName;
    }
    public Course ()
    {
        this.name="QA";
        this.numberOfClasses="60";
        this.codeName=137;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(String numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public int getCodeName() {
        return codeName;
    }

    public void setCodeName(int codeName) {
        this.codeName = codeName;
    }
    
    
}
