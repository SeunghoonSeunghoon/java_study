package ch16;

public class Employee {

    public static int serialNum = 1000;
    private int employeeId;
    private String employeeName;
    private String department;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

}
