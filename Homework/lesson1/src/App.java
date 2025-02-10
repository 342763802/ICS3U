import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("\nInput a decimal: ");

        System.out.println("Your input as an integer is: " + (int) keyboard.nextDouble());

        keyboard.close();
    }

}