import java.util.Scanner;

class Catalog {

    public static void main(String[] args) {
        //initiate scanner method
        Scanner input = new Scanner(System.in);

        int choice;
        //a simple menu option
        do {
            System.out.println("1. Start");
            System.out.println("2. Exit");
            System.out.print("Choose option: ");
            choice = input.nextInt();
        } while (choice != 2);

        System.out.println("Exited menu.");
    }
}