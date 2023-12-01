import java.util.Scanner;
class User_1{

        public static void main(String[] arg){
            
            // Create a Scanner Class Object

            Scanner sc = new Scanner(System.in);

            String name;
            int age;
            char ltr;
            float height;

            System.out.println("Enter Your Name - ");
            name = sc.next();
            System.out.println("Enter Your age - ");
            age = sc.nextInt();
            System.out.println("Enter Your ltr - ");
            ltr = sc.next().charAt(0);
            System.out.println("Enter Your height - ");
            height = sc.nextFloat();


            System.out.println("Your Name - "+name);
            System.out.println("Your age - "+age);
            System.out.println("Your ltr - "+ltr);
            System.out.println("Your height - "+height);

            

        }

}