public class JavaStringBasic {

    public static void main(String[] args) {
        System.out.println("welcome to codes with pankaj");

        // String 

        String FirstName = "Sumit";
        String LastName = "Yadav";

        String FullName = FirstName + LastName;
        System.out.println("My Full Name is : "+FullName);

        // using method to join / append

        System.out.println(String.join(" ", FirstName, LastName));

        // char 

        char ltr = FullName.charAt(2);

        System.out.println(ltr);

        // lenght
        System.out.println(FullName.length());

        // substring
        System.out.println(FullName.substring(3, 7));

    }
    
}
