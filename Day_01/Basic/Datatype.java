package Basic;

public class Datatype {

    public static void main(String[] args) {
        //https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
        

        byte b = 'L';

        System.out.println("\n byte = \n"+b);

        char ltr = 45;

        System.out.println("\n char = \n"+ltr);

        // byte 

        byte MinByte,MaxByte;

        MinByte = Byte.MIN_VALUE;
        MaxByte = Byte.MAX_VALUE;

        System.out.println("Byte Min Value :- "+MinByte);
        System.out.println("Byte Max Value :- "+MaxByte);

        // Primitive Data Types:
        // byte: 8-bit signed integer (-128 to 127)

        byte mybyte  = 100;
        System.out.println("Byte : "+mybyte);

        // short: 16-bit signed integer (-32,768 to 32,767)

        short myshort = 500;
        
        System.out.println("Short : "+myshort);

        // int: 32-bit signed integer (-2^31 to 2^31 - 1)
        
        int myInt = 10000;
        System.out.println("Int : "+myInt); 
        
        // long: 64-bit signed integer (-2^63 to 2^63 - 1)

        long myLong = 12545454555l;

        System.out.println("Long : "+myLong);
        
        // float: 32-bit floating-point number (single-precision)
        
        float myfloat = 4.5f;
        System.out.println("float : "+myfloat);

        // double: 64-bit floating-point number (double-precision)

        double mydouble = 3.456567;

        System.out.println("Double : "+mydouble);

        // char: 16-bit Unicode character (0 to 65,535)

        char mychar = 'A';
        System.out.println("Char : "+mychar);

        // boolean: Represents a true/false value (true or false)

        boolean myboolean = true;

        System.out.println("Boolean : "+myboolean);

        String myString = "www.codeswithpankaj.com";

        System.out.println("String : "+myString);


        

    }
    
}
