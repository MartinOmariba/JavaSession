class Packet {

    public static void main(String[] args) {
        
        //we define src ip,port and protocol thet we will use
        String sourceIP = "192.168.1.0";
        String protocol = "TCP";
        int port = 80;

        //using if/else statement
        if (sourceIP.startsWith("192.168.") && port == 80 && protocol.equals("TCP")) {
            System.out.println("Packet accepted: valid HTTP traffic");
        } 
        else if (port == 22 && protocol.equals("TCP")) {
            System.out.println("Packet identified: SSH traffic");
        } 
        else {
            System.out.println("Packet rejected or unknown type");
        }


    }
}