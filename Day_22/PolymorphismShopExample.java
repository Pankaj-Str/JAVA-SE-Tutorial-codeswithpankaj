package Day_22;

// Base class representing a product in a shop
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

// Subclasses representing different types of products
class Book extends Product {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class Toy extends Product {
    private int recommendedAge;

    public Toy(String name, double price, int recommendedAge) {
        super(name, price);
        this.recommendedAge = recommendedAge;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }
}

// Client class that shops for products
class Client {
    public void purchase(Product product) {
        System.out.println("Purchased: " + product.getName() + " for $" + product.getPrice());
    }
}

public class PolymorphismShopExample {
    public static void main(String[] args) {
        // Create some products
        Book book = new Book("Java Programming", 29.99, "John Doe");
        Toy toy = new Toy("Remote Control Car", 19.99, 5);

        // Create a client
        Client client = new Client();

        // The client can purchase different types of products
        client.purchase(book);
        client.purchase(toy);
    }
}

