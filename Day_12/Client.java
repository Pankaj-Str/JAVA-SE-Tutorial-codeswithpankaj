package Aug_21_2023;

public class Client
{
    //Default constructor
    Client(){
        System.out.println("welcome... p4n.in");
    }
    // Constructor with parameters
    Client(String name){
        System.out.println("welcome - "+name);
    }
    public static void main(String[] args) {
        Client obj1 = new Client();
        Client obj = new Client("www.p4n.in");

    }


}
