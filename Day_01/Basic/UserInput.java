package Basic;
// import Scanner Class 
import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) {
        
        // Create object 

        //ClassName ObjectName = new ClassName();

        Scanner sc = new Scanner(System.in);

        // String Line with space ...
        String Line;
        System.out.println("Enter Complete Line ... ");
        Line = sc.nextLine();

        // String 
        String Name;
        System.out.println("Enter your Name : ");
        Name = sc.next();
        
        // int input 
        int number;
        System.out.println("Enter Number");
        number = sc.nextInt();

        // float Inout
        float height;
        System.out.println("Enter Your height ... ");
        height = sc.nextFloat();

        // char input
        char ltr;
        System.out.println("Enter ltr char .... ");
        ltr = sc.next().charAt(0);    

    }


}
