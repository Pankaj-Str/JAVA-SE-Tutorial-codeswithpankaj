package Day_07_Function.Function2;

public class NonReturnWithArguments {
    // Non-Return Type and With Arguments

    static void getinfo(String name, int age ,float height){

        System.out.println("Your Name is : "+name);
        System.out.println("Your age is : "+age);
        System.out.println("Your height is : "+height);

    }

    public static void main(String[] args) {
        // Calling a method with no return type and with arguments
    
        getinfo("Neha", 21, 4.9f);
        getinfo("Tejal", 18, 4.7f);
        getinfo("Piyush", 20, 5.7f);
    }

}
