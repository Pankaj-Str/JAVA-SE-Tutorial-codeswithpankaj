package Day_17.Singleinheritance;

class tax{

    void gst(){
        System.out.println("18 %");
    }
}
class product extends tax{
    void ProductPrice(){
            System.out.println("300/-");
    }
} 

class PrintBill{

    public static void main(String[] args) {
        product p = new product();
        p.ProductPrice();;
        p.gst();
    }
}
