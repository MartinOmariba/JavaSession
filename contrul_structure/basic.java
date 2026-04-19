
import java.util.Scanner;

class Tally {

    public static void main(String[] args) {
        //we will need an interger number
        Scanner scanner = new Scanner(System.in);
        int number;
        
        //tell the user what we expect
        System.out.println("Enter a number between 1 and 5:");
        number = scanner.nextInt();
        
        //while loop
        while (number < 1 || number > 5) {
            System.out.println("Invalid input. Number is between 1 and 5:");
            number = scanner.nextInt();
        }
        
        System.out.println("count is : " + number);
    }
}
