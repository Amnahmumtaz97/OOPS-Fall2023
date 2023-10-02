package labtask;

import java.util.Arrays;

public class Lab {
    private String labID;
    private Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;

    public Lab(String labID, LabStatus status, Employee labAttendant) {
        this.labID = labID;
        this.status = status;
        this.labAttendant = labAttendant;
        this.computers = new Computer[15];
    }

    public void addComputer(Computer computer) {
        for (int i=0;i<computers.length; i++) {
            if (computers[i]==null) {
                computers[i] =computer;
                break;}}
    }

    public boolean removeComputer(String computerNumber) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i]!=null &&
                computers[i].getComputerNumber().equals(computerNumber)) {
                computers[i]=null;
                return true;}}
        return false;
    }

    public Computer getComputer(String computerNumber) {
        for (Computer computer:computers) {
            if (computer!=null && computer.getComputerNumber().equals(computerNumber)) {
                return computer;}}
        return null;}

    @Override
    public String toString() {
        return "Lab{" +
                "labID='" + labID + '\'' + ", status=" + status + ", labAttendant=" + labAttendant + ", computers=" + Arrays.toString(computers) + '}';
    }

    public String getLabID() {
        return labID;
    }

    public void setLabID(String labID) {
        this.labID = labID;
    }

    public LabStatus getStatus() {
        return status;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }
    public Employee getLabAttendant() {
        return labAttendant;
    }
    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }
    public Computer[] getComputers() {
        return computers;
    }
    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }
}
