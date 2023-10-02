package codeswithpankaj.com.ExceptionHandling;
import java.util.InputMismatchException;
import  java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        int age;
        int height;
        System.out.println("enter age");
        age = sc.nextInt();
        System.out.println("enter height");
        height = sc.nextInt();

        System.out.println("age : "+age);
        System.out.println("height : "+height);
        int bmi = age/height;
        System.out.println("BMI : "+bmi);
        }catch (InputMismatchException e){
            System.out.println("Enter only number...");
        }catch (ArithmeticException e){
            System.out.println("plz do not enter zero...");
        }

    }
}
