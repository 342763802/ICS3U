import java.util.Scanner;

public class SineLaw {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the length of side a: ");
        double sideA = keyboard.nextDouble();

        System.out.println("Enter the length of side b: ");
        double sideB = keyboard.nextDouble();

        System.out.println("Enter angle A in degrees: ");
        double angleA = keyboard.nextDouble();

        keyboard.close();

        double angleB = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(angleA)) * sideB) / sideA));
        double h = sideB * Math.sin(Math.toRadians(angleA));

        // if angle a is acute
        if (angleA < 90) {

            // if side a is between side b and h
            if (sideA > h && sideB < sideA) {
                System.out.println("The two possible angles are: " + angleB + " and " + (180 - angleB));
            }

            // if side a is larger than side b
            else if (sideA >= sideB) {
                System.out.println("Angle B is: " + angleB);
            }

            // if side a is smaller than h
            else {
                System.out.println("There are no possible values for angle B");
            }
        }

        // if angle a is obtuse
        else {
            System.out.println("Angle B is: " + angleB);
        }
    }
}
