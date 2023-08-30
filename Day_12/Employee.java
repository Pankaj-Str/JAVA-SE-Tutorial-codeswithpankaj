package Date_21_08_2023;

public class Employee {


        public Employee(String empName, String city, int salary) {
                System.out.println("Employee Name : "+empName);
                System.out.println("Employee City : "+city);
                System.out.println("Employee Salary : "+salary);
        }

        public static void main(String[] args) {
                Employee employee = new Employee("Joy","Mumbai",45000);
                Employee employee1 = new Employee("Toy","Pune",50000);
        }
}
