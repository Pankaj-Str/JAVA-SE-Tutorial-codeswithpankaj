
public class Client {

    int Price;
    String Name;
    // Parameterized constructor
    public Client(int Price, String Name){
        this.Price = Price;
        this.Name = Name;
    }

    public int getPrice() {
        return Price;
    }

    public String getName() {
        return Name;
    }
}
