package Day_01_Introduction.Basic;
// codeswithpankaj.com
// import JAVA Class Scanner
import java.util.Scanner;

public class UserInput {

    public static void main(String[] arg){

        // create a object Scanner Class

        Scanner sc = new Scanner(System.in);
        
        // variable..

        String Address;
        int age;
        String name;
        float height;
        char grade;

        System.out.println("Enter Your Address ... ");
        Address = sc.nextLine();
        System.out.println("Enter Your name ... ");
        name = sc.next();
        System.out.println("Enter Your age  ... ");
        age = sc.nextInt();
        System.out.println("Enter Your height  ... ");
        height = sc.nextFloat();
        System.out.println("Enter Your grade  ... ");
        grade = sc.next().charAt(0);

        System.out.println("\n------output---------------\n");
      
        System.out.println("Your Name : "+name);
        System.out.println("Your age : "+age);
        System.out.println("Your height : "+height);
        System.out.println("Your grade : "+grade);
        System.out.println("Your address : "+Address);
        
    }

}
