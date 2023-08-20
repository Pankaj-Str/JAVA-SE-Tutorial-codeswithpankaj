package Day_09;

public class Methods1 {

    static void mrp(int price,int tax){
        int TaxAmount = (price*tax)/100;
        int FinalPrice = price + TaxAmount;
        System.out.println("-------------------");
        System.out.println("Price : "+price);
        System.out.println("Tax : "+tax);
        System.out.println("Tax Amount : "+TaxAmount);
        System.out.println("Final Price - include Tax : "+FinalPrice);
        System.out.println("-------------------");
    }


    public static void main(String[] args) {
        mrp(1200, 9);
        mrp(4560, 18);
    }
    
}
