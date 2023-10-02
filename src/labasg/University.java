package labasg;
import java.util.Arrays;
public class University {
    private Lab[] labs;

    public University(int maxLabs) {
        this.labs = new Lab[2];
    }

    public void addLab(Lab lab) {
        for (int i = 0; i < labs.length; i++) {
            if (labs[i] == null) {
                labs[i] = lab;
                break;
            }
        }
    }

    public void removeLab(String labID) {
        for (int i = 0; i < labs.length; i++) {
            if (labs[i] != null && labs[i].getLabID().equals(labID)) {
                labs[i] = null;
                break;
            }
        }
    }

    public Lab getLab(String labID) {
        for (Lab lab : labs) {
            if (lab != null && lab.getLabID().equals(labID)) {
                return lab;
            }
        }
        return null;
    }

    public Computer getComputerInLab(String labID, String computerNumber) {
        Lab lab = getLab(labID);
        if (lab != null) {
            for (Computer computer : lab.getComputers()) {
                if (computer != null && computer.getComputerNumber().equals(computerNumber)) {
                    return computer;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder labList = new StringBuilder();
        for (Lab lab : labs) {
            if (lab != null) {
                labList.append(lab.toString()).append("\n");
            }
        }
        return labList.toString();
    }
}
