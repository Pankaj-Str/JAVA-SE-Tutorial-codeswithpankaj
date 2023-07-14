package Day_2;
import java.util.*;
public class user_input {

	public static void main(String[] args) {
		String name;
		String fullname;
		int age;
		float height;
		char div;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Fullname");
		 fullname = sc.nextLine();
		System.out.println("Enter your name");
			name = sc.next();
		System.out.println("Enter your age");
		age = sc.nextInt();
		System.out.println("Enter your height");
		height = sc.nextFloat();
		System.out.println("Enter your div");
		div = sc.next().charAt(0);
System.out.println("------------------------------------");
			System.out.println("My Name is : "+name);
			System.out.println("My Name is : "+fullname);
			System.out.println("My Age is : "+age);
			System.out.println("My height is : "+height);
			System.out.println("My div is : "+div);
			
	}

}
