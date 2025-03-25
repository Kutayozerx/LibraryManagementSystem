package Proje;

import java.util.ArrayList;

public class Library {

    private  ArrayList<Book> books = new ArrayList<>();


    public  void addBook(Book book) {
        books.add(book);

    }

    public  Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public  void checkOutBook(String isbn) {
        Book book = searchisbn(isbn);
        if (book != null) {
            if (!book.isBorrowed()) {
                book.borrowBook();
                System.out.println("Book checked out successfully.");
            } else {
                System.out.println("Book not found or already checked out.");
            }
        }
    }

    public Book searchisbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                return book;
            }
        }
        return null;
    }

    public  void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("\nAll Books:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public  void returnBook(String isbn) {
        Book book = searchisbn(isbn);
        if (book != null) {
            if (book.isBorrowed()) {
                book.returnBook();
                System.out.println("Book returned successfully.");
            } else {
                System.out.println("Book was not checked out.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }
}