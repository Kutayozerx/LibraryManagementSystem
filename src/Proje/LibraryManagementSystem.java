package Proje;

import java.util.Scanner;
import java.util.List;



public class LibraryManagementSystem {

    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;

        while (running){
            System.out.println("\nWelcome to the Library Management System!");
            System.out.println("\nPlease select an option:");
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Search for a book by title");
            System.out.println("4. Check out a book");
            System.out.println("5. Return a book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                case 1:
                    addBook();
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    checkOutBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6 :
                    System.out.println("Exiting...Thank you for using the Library Management System!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        library.addBook(new Book(title, author, isbn));
        System.out.println("Book added successfully!");
    }

    private static void searchBook() {
        System.out.print("Enter book title to search: ");
        String title = scanner.nextLine();
        Book book = library.searchBook(title);
        if (book != null) {
            System.out.println("Book found:");
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void checkOutBook() {
        System.out.print("Enter the ISBN of the you want to check out: ");
        String isbn = scanner.nextLine();
        library.checkOutBook(isbn);
    }

    private static void returnBook() {
        System.out.print("Enter the ISBN the book you want to return: ");
        String isbn = scanner.nextLine();
        library.returnBook(isbn);
    }
}
