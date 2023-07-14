
import java.util.Scanner;
public class userinput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,address;
        int age;
        float height;
        char div;
        System.out.println("Enter Your address : ");
        address = sc.nextLine();
        System.out.println("Enter Your name : ");
        name = sc.next();
        System.out.println("Enter Your age : ");
        age = sc.nextInt();
        System.out.println("Enter Your height : ");
        height = sc.nextFloat();

        System.out.println("Enter Your Div : ");
        div = sc.next().charAt(0);
        System.out.println("---------------------");
        System.out.println("My name is : = "+name);
        System.out.println("My age is : = "+age);
        System.out.println("My height is : = "+height);
        System.out.println("My address is : = "+address);
        System.out.println("My div is : = "+div);



    }
}
