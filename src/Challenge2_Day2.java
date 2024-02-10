import java.util.Scanner;

public class Challenge2_Day2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to determine if it is positive or negative: ");
        String number = in.next();

        if(number.contains("-")) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is positive");
        }
        System.out.println();

        //Best alternative
        System.out.println("Enter a number to determine if it is positive or negative: ");
        while(!in.hasNextInt()) {
            in.next();
            System.out.println("Only integers allowed. Please try again.");
        }
        int newNumber = in.nextInt();
        String result = (newNumber>0) ? "Positive" : "Negative";
        System.out.println(result);
         /*Ternary operator should have the same data type in all arguments.
        https://www.programiz.com/java-programming/ternary-operator
        Syntax:
        Datatype variableName = condition ? expression1 : expression2

        If condition is true, expression1 is executed
        If condition is false, expression2 is executed.
        expression1 and expression 2 should match in the datatype used.
          */

    }
}
