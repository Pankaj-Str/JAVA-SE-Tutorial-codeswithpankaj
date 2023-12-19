package dec_19_2023;
import java.util.Scanner;
public class UserInput {
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Your Name : ");
		String name = sc.nextLine();
		System.out.println("Your Age : ");
		int age = sc.nextInt();
		System.out.println("Your Ltr : ");
		char ltr = sc.next().charAt(0);
		System.out.println("Your height : ");
		float height = sc.nextFloat();
		System.out.println("-----------------------");
		System.out.println("Your Name is : "+name);
		System.out.println("Your age is : "+age);
		System.out.println("Your ltr is : "+ltr);
		System.out.println("Your height is : "+height);
		
	}
	
}
