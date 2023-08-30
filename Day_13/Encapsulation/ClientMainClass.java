
public class ClientMainClass {

    public static void main(String[] args) {
        Client client = new Client(5000,"Joy");
        System.out.println(client.getName());
        System.out.println(client.getPrice());
    }
}
