package labasg;

public class Lab {
    private String labID;
    private Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;

    public String getLabID() {
        return labID;
    }

    public void setLabID(String labID) {
        this.labID = labID;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public LabStatus getStatus() {
        return status;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Lab() {
        this.labID = "first";
        this.computers = new Computer[5];
        this.status = LabStatus.OPERATIONAL;
        this.labAttendant = null;
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer("1", "RTX", 8, 512, true);
        }
    }

    public Lab(String labID, Computer[] computers, LabStatus status, Employee labAttendant) {
        this.labID = labID;
        this.computers = computers;
        this.status = status;
        this.labAttendant = labAttendant;

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer("1", "RTX", 8, 512, true);
        }
    }

    int counter = 0;

    public void addComputer(Computer computer) {
        if (counter < computers.length) {
            computers[counter++] = computer;
        } else {
            System.out.println(" no more computers.");
        }
    }

    public boolean removeComputer(String computerNumber) {
        for (int i = 0; i < counter; i++) {
            if (computers[i].getLcdModel().equals(computerNumber)) {
                for (int j = i; j < counter - 1; j++) {
                    computers[j] = computers[j + 1];
                }
                computers[counter - 1] = null;
                counter--;
                break;
            }
        }
        return false;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public String getLabId() {
        return labID;
    }

    public void setLabId(String labId) {
        this.labID = labId;
    }

    public Computer getComputerByNumber(String computerNumber) {
        for (Computer computer : computers) {
            if (computer != null && computer.getLcdModel().equals(computerNumber)) {
                return computer;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder computerList = new StringBuilder();
        for (Computer computer : computers) {
            if (computer != null) {
                computerList.append(computer.toString()).append("\n");
            }
        }

        return "Lab ID: " + labID + "\n" +
                "Lab Status: " + status + "\n" +
                "Lab Attendant:\n" + labAttendant.toString() + "\n" +
                "Computers:\n" + computerList.toString();
    }
}
