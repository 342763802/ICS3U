import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input your a value: ");
        double a = keyboard.nextDouble();

        System.out.println("Input your b value: ");
        double b = keyboard.nextDouble();

        System.out.println("Input your c value: ");
        double c = keyboard.nextDouble();

        keyboard.close();

        double discriminant = Math.pow(b,2)-4*a*c;

        double root1 = (-b+Math.sqrt(discriminant))/2*a;
        double root2 = (-b-Math.sqrt(discriminant))/2*a;

        if (Double.isNaN(root1)){
            System.out.println("Your roots are not real");
        }
        
        else{
            System.out.println("Your two roots are: " + root1 + " and " + root2);
        }

    }

}