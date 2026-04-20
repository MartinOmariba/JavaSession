import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//the class book will have title,author and quantity
class Book {
    String title;
    String author;
    int quantity;

    public Book(String title, String author, int quantity) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }
}

//To store key value pairs in java we will use map
//The liblary system will contail all elemrnts of a liblary process
//We will use a switch case because we wnat the code block to terminate
//if choice is not found we will do invalid
class LibrarySystem {

    static Map<String, Book> library = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n***** LIBRARY SYSTEM *****");
            System.out.println("1. Add Books");
            System.out.println("2. Borrow Books");
            System.out.println("3. Return Books");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    borrowBook(scanner);
                    break;
                case 3:
                    returnBook(scanner);
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }

    // Adding Books Function
    //The programme captures book title,author,quantity
    public static void addBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        
        //conditional statement using key
        //we get the title and increament the quantity
        // if the book alraedy exist
        //else we will add title, author,quantity
        if (library.containsKey(title)) {
            Book existingBook = library.get(title);
            existingBook.quantity += quantity;
            System.out.println("Book updated successfully.");
        } else {
            library.put(title, new Book(title, author, quantity));
            System.out.println("Book added successfully.");
        }
    }

    // When we borrow books, the programme
    // will prompt the user for book title
    public static void borrowBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        
        //then the quantity needed
        System.out.print("Enter quantity to borrow: ");
        int qty = scanner.nextInt();
        scanner.nextLine();

        //if the liblary contains the book titile
        //and the desired quantity
        //the borrow will be successfull unless
        //there is no books
        if (library.containsKey(title)) {
            Book book = library.get(title);

            if (book.quantity >= qty) {
                book.quantity -= qty;
                System.out.println("Borrow successful.");
            } else {
                System.out.println("Error: Not enough books available.");
            }
        } else {
            System.out.println("Error: Book not found.");
        }
    }

    // When returning the books
    //the program prompts for book title
    //then the quantity
    //if the title exist then we increament the quantity unless its not there
    public static void returnBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter quantity to return: ");
        int qty = scanner.nextInt();
        scanner.nextLine();

        if (library.containsKey(title)) {
            Book book = library.get(title);
            book.quantity += qty;
            System.out.println("Return successful.");
        } else {
            System.out.println("Error: This book does not belong to the library system.");
        }
    }
}