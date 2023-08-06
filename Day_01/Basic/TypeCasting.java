package Basic;

public class TypeCasting {
    
    public static void main(String[] args) {
        
        // Implicit Type Casting (Widening)

        int myInt  = 100; 

        long myLong  = myInt;  // Implicit Type Casting from int to long...

        float myfloat = myLong; // Implicit casting from long to float

        double mydouble = myfloat; // Implicit casting from float to double

        System.out.println("\n Implicit Type Casting \n");
        System.out.println("int : "+ myInt);
        System.out.println("long : "+ myLong);
        System.out.println("float : "+ myfloat);
        System.out.println("double : "+ mydouble);

        // Explicit Type Carsting : (Narrowing)

        double d = 3.456;
        int dInt = (int) d; // Explicit casting from double to int

        System.out.println("\n Explicit Type Casting \n");
        System.out.println("Double : "+d);
        System.out.println("Int "+dInt);



    }

}
