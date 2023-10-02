package labtask;

import java.util.Arrays;

public class University {
    private final Lab[] labs;

    public Lab[] getLabs() {
        return labs;
    }

    public University(int numberOfLabs) {
        labs= new Lab[numberOfLabs];
    }

    public void addLab(Lab lab) {
        for (int i=0;i<labs.length; i++) {
        if (labs[i]==null) {
                labs[i]=lab;
            break; }}}

    public Lab getLabByID(String labID) {
        for (Lab lab:labs) {
            if (lab!=null&&lab.getLabID().equals(labID)) { return lab;} }
        return null;}

    public Computer getComputerByLabAndNumber(String labID, String computerNumber) {
        Lab lab=getLabByID(labID);
        if (lab!=null) {
            Computer[] computers=lab.getComputers();
            for (Computer computer:computers) {
           if (computer!= null&& computer.getComputerNumber().equals(computerNumber)) {
              return computer; }}}
        return null;
    }
}
