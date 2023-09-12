package Day_18;

public class Client {

    void info(){
        System.out.println("Client Name : Kavita ji");
    }

    void info(int age){
        System.out.println("Client Age : "+age);
    }
    void info(float height){
        System.out.println("Client Height : "+height);
    }
    void info(String Address){
        System.out.println("Client Address : "+Address);
    }
    
    public static void main(String[] arg){
        Client obj = new Client();
        obj.info();
        obj.info(42);
        obj.info(4.6f);
        obj.info("Barivali");
    }
}
