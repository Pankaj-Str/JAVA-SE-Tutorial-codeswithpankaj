package Day_09.Function2;

public class WithReturnWithArguments {
    // With Return Type and With Arguments

    static double tax(long price, double gst){

        long GstAmount = (long) (price*gst)/100;
        long Final_Price = price+GstAmount;    

        return Final_Price;

    }

    public static void main(String[] args) {
        // Calling a method with a return type and with arguments

        long mrp = (long) tax(12000, 18.5);

        long final_mrp = mrp-10;

        System.out.println("Your Final Price : "+final_mrp);
    }
    
}
