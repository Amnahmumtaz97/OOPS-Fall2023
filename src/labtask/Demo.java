package labtask;

public class Demo {
    public static void main(String[] args) {

        Demo demo = new Demo();
        demo.runDemo();

        Computer orgComputer= new Computer("87",
                "090", 16, 128, false);
        Computer clonedComputer=orgComputer.cloneComputer();

        System.out.println("Cloned Computer Details:");
        System.out.println();

        System.out.println("Computer no.:"+clonedComputer.getComputerNumber());
        System.out.println("LCD Model:"+clonedComputer.getLcdModel());

        System.out.println("RAM:"+clonedComputer.getRamSize() + "GB");
        System.out.println("HDD:"+clonedComputer.getHddSize() + "GB");
        System.out.println("Has GPU:"+clonedComputer.isHasGPU());
        System.out.println();

    }
    public void runDemo() {
        Employee labAttendant = new Employee("A001", "John Doe");

        Lab lab = new Lab("Lab101", LabStatus.OPERATIONAL, labAttendant);
        Lab facultyMultimediaLab = new Lab("Lab102", LabStatus.FACULTY_MULTIMEDIA, labAttendant);

        Computer computer1 = new Computer(
                "C001", "LCD Model 1", 8, 512, true);
        Computer computer2 = new Computer(
                "C002", "LCD Model 2", 16, 1024, false);

        lab.addComputer(computer1);
        facultyMultimediaLab.addComputer(computer2);

        System.out.println("Lab Details:");
        System.out.println(lab);

        String computerNumberToRemove = "C002";
        if (facultyMultimediaLab.removeComputer(computerNumberToRemove)) {
            System.out.println("Computer " + computerNumberToRemove + " removed successfully.");
        } else {
            System.out.println("Computer " + computerNumberToRemove + " not found in the lab.");
        }

        System.out.println("Updated Lab :");
        System.out.println(facultyMultimediaLab);

        String computerNumberToFind = "C002";
        Computer foundComputer= facultyMultimediaLab.getComputer(computerNumberToFind);

        if (foundComputer != null) { System.out.println("Found Computer Details:");
            System.out.println(foundComputer);
        } else {
            System.out.println("Computer " +computerNumberToFind +" not found in the lab.");
        }
    }
}


