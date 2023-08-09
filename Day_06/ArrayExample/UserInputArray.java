package ArrayExample;
// import class Scanner
import java.util.Scanner;
public class UserInputArray {

    
    public static void main(String[] args) {
        // Create a Object
        Scanner sc = new Scanner(System.in);
        // Size of array 
        System.out.println("Enter Array Size ... ");
        int size;
        size = sc.nextInt();
        
        String Course[]  = new String[size];
        
        for (int i = 0; i < Course.length; i++) {
            
            System.out.println("Enter Course Name = "+(i+1));
            Course[i] = sc.next();

        }

        System.out.println("------output-------------");
        for (int i = 0; i < Course.length; i++) {
            System.out.println((i+1)+" = "+Course[i]);
        }



    }

    
}
