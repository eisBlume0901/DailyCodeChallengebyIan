import java.util.Scanner;

public class Challenge1_Day2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        while(!in.hasNextInt()) {
            in.next();
            System.out.println("Only integers allowed. Please try again.");
        }
        int number1 = in.nextInt();

        System.out.println("Enter second number: ");
        while(!in.hasNextInt()) {
            in.next();
            System.out.println("Only integers allowed. Please try again.");
        }
        int number2 = in.nextInt();

        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        int modulus = number1 % number2;

        System.out.println("The sum of two numbers is: " + addition);
        System.out.println("The difference of two numbers is: " + subtraction);
        System.out.println("The product of two numbers is: " + multiplication);
        System.out.println("The quotient of two numbers is: " + division);
        System.out.println("The remainder of " + number1 + " divided by " + number2 + " is " + modulus);
    }
}
