import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("\nPlease enter a decimal:");

        Scanner keyboard = new Scanner(System.in);

        int input = (int) keyboard.nextDouble();

        //close the scanner to prevent memory leaks
        keyboard.close();

        System.out.println("Your input as an integer is: " + input);

    }

}