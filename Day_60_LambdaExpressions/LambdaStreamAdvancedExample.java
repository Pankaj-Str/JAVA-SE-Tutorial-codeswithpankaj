package Day_60_LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
    private String title;
    private String author;
    private Genre genre;
    private int pages;

    public Book(String title, String author, Genre genre, int pages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                ", pages=" + pages +
                '}';
    }
}

enum Genre {
    FICTION, NON_FICTION, MYSTERY, SCIFI
}

public class LambdaStreamAdvancedExample {

    // New hypothetical discount method using a lambda expression
    private static final DiscountFunction codeswithpankajDiscount = pages -> {
        if (pages > 300) {
            return pages * 0.9; // Apply a 10% discount for books with more than 300 pages
        } else {
            return pages;
        }
    };

    // New functional interface for the discount function
    interface DiscountFunction {
        double apply(int pages);
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("The Great Gatsby", "F. Scott Fitzgerald", Genre.FICTION, 180),
                new Book("To Kill a Mockingbird", "Harper Lee", Genre.FICTION, 281),
                new Book("1984", "George Orwell", Genre.SCIFI, 328),
                new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", Genre.SCIFI, 208),
                new Book("Sapiens", "Yuval Noah Harari", Genre.NON_FICTION, 443),
                new Book("The Da Vinci Code", "Dan Brown", Genre.MYSTERY, 454)
        );

        // Sort books by title
        System.out.println("Books sorted by title:");
        books.stream()
                .sorted((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()))
                .forEach(System.out::println);

        // Group books by genre
        System.out.println("\nBooks grouped by genre:");
        Map<Genre, List<Book>> booksByGenre = books.stream()
                .collect(Collectors.groupingBy(Book::getGenre));
        booksByGenre.forEach((genre, genreBooks) -> {
            System.out.println(genre);
            genreBooks.forEach(System.out::println);
        });

        // Calculate the total number of pages for all books
        int totalPages = books.stream()
                .mapToInt(Book::getPages)
                .sum();
        System.out.println("\nTotal number of pages before discount: " + totalPages);

        // Apply the codeswithpankajDiscount to the total number of pages
        double discountedTotalPages = codeswithpankajDiscount.apply(totalPages);
        System.out.println("Total number of pages after codeswithpankajDiscount: " + discountedTotalPages);
    }
}

