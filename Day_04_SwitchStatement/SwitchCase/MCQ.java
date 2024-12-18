import java.util.Scanner;

public class MCQ {

    public static void main(String[] agr){

        // object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Who invented Java Programming?\r\n" + //
                        "a) Guido van Rossum\r\n" + //
                        "b) James Gosling\r\n" + //
                        "c) Dennis Ritchie\r\n" + //
                        "d) Bjarne Stroustrup\n");

        char option = sc.next().charAt(0);
        
        switch (option) {
            case 'a': System.out.println("Wrong Answer");
            break;
            case 'b': System.out.println("Answer: b \r\n" + //
                                "Explanation: Java programming was developed by James Gosling at Sun Microsystems in 1995. James Gosling is well known as the father of Java.");
            break;
            case 'c': System.out.println("Wrong Answer");
            break;
            case 'd': System.out.println("Wrong Answer");
            break;
            default :
            System.out.println("select only a,b,c,d");
            
        }

        

        

    }
    

}