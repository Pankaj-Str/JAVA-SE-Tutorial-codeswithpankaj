package Day_21_Polymorphism.JavaPolymorphism;

public class Employee {
    
    public Employee(){
        System.out.println("Employee Company Name Codes With Pankaj");
    }
    public Employee(String address){
        System.out.println("Complay Address : "+address);
    }
    public Employee(long mobile){
        System.out.println("Company Mobile Number : "+mobile);
    }

    void info(){
        System.out.println("Employee Info - IT Development");
    }

    void info(String name){
        System.out.println("Employee Name : "+name);
    }

    void info(String dept,int DevelopmentID){
        System.out.println("Employee DEPT : "+dept);
        System.out.println("Employee Development ID "+DevelopmentID);
    }
    
public static void main(String[] args) {
    Employee emp = new Employee();
    Employee emp1 = new Employee("Andheri West ...");
    Employee emp2 = new Employee(787874512121l);
    emp.info();
    emp.info("Neha");
    emp.info("IOS Development",101);
}
}

