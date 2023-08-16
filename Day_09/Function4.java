package Date_16_8_2023;

public class Function4 {

    // with arg. and with return type

    int tax(int price,int gst){
        gst = (price*gst)/100;
        int mrp = gst+price;
        return mrp;
    }

    public static void main(String[] args) {
        Function4 obj = new Function4();
        int final_price = obj.tax(1200,18);
        System.out.println(final_price+20);
    }
}
