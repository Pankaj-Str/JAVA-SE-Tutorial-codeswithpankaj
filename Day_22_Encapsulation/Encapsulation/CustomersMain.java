public class CustomersMain {
    public static void main(String[] args) {
        
        Customers obj = new Customers("esha",22,5.6f);
        System.out.println("Name : "+obj.getname());
        System.out.println("Age : "+obj.getage());
        System.out.println("Height : "+obj.getheight());
    }
}
