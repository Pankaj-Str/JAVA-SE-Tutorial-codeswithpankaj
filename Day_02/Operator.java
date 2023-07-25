
class Operator{
    
    public static void main(String[] arg){


        // Arithmetic Operators :
        System.out.println("Addition (+):"+(23+90));
        System.out.println("Subtraction (-) "+(90-67));
        System.out.println("Multiplication (*) "+(56*9));
        System.out.println("Division (/) "+(88/5));
        System.out.println("Modulus (%) "+(56%2));

        //Assignment Operators

        int number = 100;

        System.out.println("number is : "+number);

        //number = number + 10;
        number +=10;
        System.out.println(number);
        number *=10;
        System.out.println(number);
        number /=10;
        System.out.println(number);
        number %=10;
        System.out.println(number);
        number -=10;
        System.out.println(number);

        //Increment and Decrement Operators:

        // Increment (++)
        int a = 10;
        a++;
        System.out.println(a);
        // and Decrement (--)

        a--;
        System.out.println(a);

    }

}