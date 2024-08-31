// Library Management System

// Book class
class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

// Library class
class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        if (bookCount < books.length) {
            books[bookCount] = new Book(title, author);
            bookCount++;
            System.out.println("Book added: " + title + " by " + author);
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void displayBooks() {
        System.out.println("\nLibrary Catalog:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". " + books[i].getTitle() + " by " + books[i].getAuthor() +
                    " - " + (books[i].isAvailable() ? "Available" : "Checked Out"));
        }
    }

    public void checkOutBook(int bookIndex) {
        if (bookIndex >= 1 && bookIndex <= bookCount) {
            Book book = books[bookIndex - 1];
            if (book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Checked out: " + book.getTitle());
            } else {
                System.out.println("Sorry, this book is already checked out.");
            }
        } else {
            System.out.println("Invalid book number.");
        }
    }

    public void returnBook(int bookIndex) {
        if (bookIndex >= 1 && bookIndex <= bookCount) {
            Book book = books[bookIndex - 1];
            if (!book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("Returned: " + book.getTitle());
            } else {
                System.out.println("This book is already in the library.");
            }
        } else {
            System.out.println("Invalid book number.");
        }
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library(5);

        library.addBook("To Kill a Mockingbird", "Harper Lee");
        library.addBook("1984", "George Orwell");
        library.addBook("Pride and Prejudice", "Jane Austen");

        library.displayBooks();

        library.checkOutBook(2);
        library.checkOutBook(2);

        library.displayBooks();

        library.returnBook(2);

        library.displayBooks();
    }
}