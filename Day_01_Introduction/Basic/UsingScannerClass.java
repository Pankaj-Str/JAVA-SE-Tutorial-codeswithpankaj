package Day_01_Introduction.Basic;

// import Scanner class 
import java.util.Scanner;

public class UsingScannerClass {

    public static void main(String[] args) {
        
        // Create a object of Scanner class

        Scanner sc = new Scanner(System.in);

        String Address;
        String Name;
        int Age;
        long MobileNo;
        float Height;
        char Ltr;

        System.out.println("Enter Your Address : ");
        Address = sc.nextLine();
        System.out.println("Enter Your Name : ");
        Name = sc.next();
        System.out.println("Enter Your Age : ");
        Age = sc.nextInt();
        System.out.println("Enter Your Mobile Number : ");
        MobileNo =  sc.nextLong();
        System.out.println("Enter Your Height : ");
        Height = sc.nextFloat();
        System.out.println("Enter Your Ltr Char : ");
        Ltr = sc.next().charAt(0);

        System.out.println("your name is : "+Name);
        System.out.println("your Address : "+Address);
        System.out.println("your Age : "+Age);
        System.out.println("your Height : "+Height);
        System.out.println("your Mobile No. : "+MobileNo);
        System.out.println("your Ltr : "+Ltr);
        


    }
    
}

// output
// Enter Your Address : 
// dadar west 
// Enter Your Name : 
// pankaj
// Enter Your Age : 
// 78
// Enter Your Mobile Number : 
// 354765876876
// Enter Your Height : 
// 5.6
// Enter Your Ltr Char : 
// u
// your name is : pankaj
// your Address : dadar west 
// your Age : 78
// your Height : 5.6
// your Mobile No. : 354765876876
// your Ltr : u
