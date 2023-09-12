package Day_09_ClassObjects.Shop;

import  java.util.Scanner;
public class ClientMainClass {
    public static void main(String[] args) {
        // create a object
        Scanner sc = new Scanner(System.in);
        // ClassName ObjectName = new ClassName();
        Client cl = new Client();
        System.out.println("Enter Client Name : ");
        String name = sc.next();
        System.out.println("Enter Client Mobile number : ");
        long mobile = sc.nextLong();

        cl.name = name;
        cl.mobile = mobile;
        cl.info();

//        cl.name = "Toy";
//        cl.mobile = 7897541230l;
//        cl.info();
    }
}
