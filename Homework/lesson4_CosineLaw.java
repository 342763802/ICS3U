import java.util.Scanner;

public class lesson4_CosineLaw {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\nEnter the length of side a: ");
        double sideA = keyboard.nextDouble();

        System.out.println("Enter the length of side b: ");
        double sideB = keyboard.nextDouble();

        System.out.println("Enter angle C in degrees: ");
        double angleC = keyboard.nextDouble();

        keyboard.close();

        double sideC = Math.sqrt(sideA * sideA + sideB * sideB - 2 * sideA * sideB * Math.cos(Math.toRadians(angleC)));

        System.out.printf("The length of side C is: %.16f or %.2f", sideC, sideC);
    }
}
