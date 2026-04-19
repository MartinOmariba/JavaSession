import java.util.Scanner;

class ProtocolHandler {

    public static void main(String[] args) {

        //implemtnt the scanner method
        Scanner input = new Scanner(System.in);

        //The user will enter any protocol
        //input should be in uppercase
        System.out.println("Enter protocol command (HTTP, FTP): ");
        String command = input.nextLine().toUpperCase();

        // Switch statement for direct mapping
        switch (command) {
            case "HTTP":
                System.out.println("Handling HTTP request...");
                break;

            case "FTP":
                System.out.println("Handling FTP file transfer...");
                break;
        }

        input.close();
    }
}