package labtask;

public class Employee {
    private String employeeID;
    private String name;
    public static String designation = "Lab Attendant";

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getDesignation() {
        return designation;
    }

    public static void setDesignation(String designation) {
        Employee.designation = designation;
    }

    public Employee(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }
}


