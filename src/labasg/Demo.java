package labasg;
public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.runDemo();
    }

    public void runDemo() {
        Employee labAttendant = new Employee("A10", "Ahad");

        Computer[] labComputers = new Computer[4];
        Computer[] facultyMultimediaLabComputers = new Computer[4];

        Lab lab = new Lab("Lab101", labComputers, LabStatus.OPERATIONAL, labAttendant);
        Lab lab2 = new Lab("Lab102", labComputers, LabStatus.OPERATIONAL, labAttendant);
        Lab facultyMultimediaLab = new Lab("Lab1", facultyMultimediaLabComputers, LabStatus.FAULTY_MULTIMEDIA, labAttendant);
        Lab facultyMultimediaLab2 = new Lab("Lab2", facultyMultimediaLabComputers, LabStatus.FAULTY_MULTIMEDIA, labAttendant);

        Computer computer1 = new Computer(
                "1", "LCD Model 1", 8, 512, true);
        Computer computer2 = new Computer(
                "2", "LCD Model 2", 16, 1024, false);

        lab.addComputer(computer1);
        facultyMultimediaLab.addComputer(computer2);

        System.out.println("Lab Details:");
        System.out.println(lab);

        String computerNumberToRemove = "2";
        facultyMultimediaLab.removeComputer(computerNumberToRemove);

        System.out.println(facultyMultimediaLab);

        String computerNumberToFind = "1";
        Computer foundComputer=facultyMultimediaLab.getComputerByNumber(computerNumberToFind);

        if (foundComputer!=null) { System.out.println("Found Computer Details:");
            System.out.println(foundComputer);
        } else {
            System.out.println("Computer " +computerNumberToFind+ " not found in the lab.");
        }
    }
}