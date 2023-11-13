/**
 * InnerOrderInterface
 */
interface InnerOrderInterface{

       public void getOrderID(); //methods...
       public void getQTid(); //methods...
    
}

public class OrderInterface implements InnerOrderInterface{
    
   public void getOrderID(){
        System.out.println("ORDER ID 10001");
    }

   public void getQTid(){
        System.out.println("QT ID A0099");
    }
    public static void main(String[] agr){
        OrderInterface oi = new OrderInterface();
        oi.getOrderID();
        oi.getQTid();
    }

}
