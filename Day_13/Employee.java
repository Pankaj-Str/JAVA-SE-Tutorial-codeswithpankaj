
//p4n.in
// codeswithpankaj.com
public class Employee {
    private String name;
    private int age;
    private double salary;
    
    // Parameterized constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getSalary() {
        return salary;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 30, 50000.0);   // Creating an object using the constructor
        System.out.println("Name: " + employee1.getName());          // Output: Name: John Doe
        System.out.println("Age: " + employee1.getAge());            // Output: Age: 30
        System.out.println("Salary: $" + employee1.getSalary());     // Output: Salary: $50000.0
        
        Employee employee2 = new Employee("Jane Smith", 35, 60000.0);  // Creating another object
        System.out.println("Name: " + employee2.getName());           // Output: Name: Jane Smith
        System.out.println("Age: " + employee2.getAge());             // Output: Age: 35
        System.out.println("Salary: $" + employee2.getSalary());      // Output: Salary: $60000.0
    }
}
