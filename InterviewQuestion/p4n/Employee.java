package p4n;

public class Employee {
  
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

   
    public Employee(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

  
    public int getEmployeeId() {
        return employeeId;
    }

  
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

   
    public String getEmployeeName() {
        return employeeName;
    }


    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    
    public String getEmployeeSalary() {
        return String.format("$%.2f", employeeSalary);
    }

    public static void main(String[] args) {
    
        Employee emp = new Employee(101, "Nishant Chouhan", 50000.0);

       
        System.out.println("Initial Employee ID: " + emp.getEmployeeId());
        System.out.println("Initial Employee Name: " + emp.getEmployeeName());
        System.out.println("Initial Employee Salary: " + emp.getEmployeeSalary());

        emp.setEmployeeId(102);
        emp.setEmployeeName("Pankaj Chouhan");
        emp.employeeSalary = 60000.0; 

        System.out.println("\nUpdated Employee ID: " + emp.getEmployeeId());
        System.out.println("Updated Employee Name: " + emp.getEmployeeName());
        System.out.println("Updated Employee Salary: " + emp.getEmployeeSalary());
    }
}
