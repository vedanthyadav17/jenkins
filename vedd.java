import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Print a message
        System.out.println("Hello, World!");

        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print personalized message
        System.out.println("Nice to meet you, " + Vedanth + "!");
        
        scanner.close();
    }
}
