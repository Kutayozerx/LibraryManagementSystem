package Proje;

import jdk.jshell.Snippet;

public class Book {

    // kitap oluşturoyurz
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;


    // Constructor ve getter metodları ekliyoruz
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    // to string ekliyoruz
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", Status=" + (isBorrowed ? "Checked Out" : "Available") +
        '}';
    }
}
