public class Book {
    // Instance variables
    private String title;
    private String author;
    private int yearPublished;

    // Constructor with parameters
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }

    public static void main(String[] args) {
        // Create two book objects using the constructor
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

        // Call the displayDetails method to show the book details
        System.out.println("Book 1 Details:");
        book1.displayDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayDetails();
    }
}
