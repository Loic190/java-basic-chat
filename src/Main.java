import java.io.IOException;
import java.util.Scanner;
import Server.Server;
import Client.Client;

public class Main {
    Scanner scanner;

    public Main() {
        scanner = new Scanner(System.in);
        while (!init()); // While our input isn't valid
    }

    public static void main(String[] args) {
        new Main();
    }

    private boolean init() {
        System.out.print("Do you want to host (0) or to join (1)? > "); // Tell the user what to do

        switch (Integer.parseInt(scanner.nextLine())) { // get the input as string, and convert it to an Integer
            case 0: // case 0, behave as a server
                new Server(); // instanciate new server
                return true; // our input is valid
            case 1: // case 1, behave as a client
                new Client(); // instanciate new client
                return true; // our input is valid
            default: // default, input is not valid
                System.out.println("Invalid Input! Try again"); // tell the user whats wrong
                return false; // input is not valid
        }
    }
}
