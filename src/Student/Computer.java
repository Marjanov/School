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
public class Computer {

    private String operatingSystem;
    private double processTact;
    private double memory;
    private int hardDrive;

    public Computer(String operatingSystem, double processTact, double memory, int hardDrive) {
        this.operatingSystem = operatingSystem;
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }
    public Computer ()
    {
     this.operatingSystem="Windows";   
     this.processTact=3.5;
     this.hardDrive=28;
     this.memory=24.5;
     
    }
}
