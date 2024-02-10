import java.util.Scanner;
import static java.lang.System.*;

public class Challenge1_Week1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        out.println("Enter the first number: ");
        while (!input.hasNextDouble())
        {
            input.next();
            out.println("Only integers allowed. Please try again");
        }
        double first = input.nextDouble();

        out.println("Enter the second number: ");
        while (!input.hasNextDouble())
        {
            input.next();
            out.println("Only integers allowed. Please try again");
        }
        double second = input.nextDouble();

        out.println("Choose what operator (+,-,*,/,%): ");
        String operator;

        while (true)
        {
            operator = input.next();
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") ||
                        operator.equals("/") || operator.equals("%"))
            {
                break;
            }
                out.println(operator + " is not valid. Please try again.");
            }

        switch (operator)
        {
            case "+" ->
            {
                double sum = first + second;
                out.println("The sum of " + first + " and " + second + " is " + sum);
            }
            case "-" ->
            {
                double difference = first - second;
                out.println("The difference of " + first + " and " + second + " is " + difference);
            }
            case "*" ->
            {
                double product = first * second;
                out.println("The product of " + first + " and " + second + " is " + product);
            }
            case "/" ->
            {
                double quotient = first / second;
                out.println("The quotient of " + first + " and " + second + " is " + quotient);
            }
            default ->
            {
                double modulus = first % second;
                out.println("The modulus of " + first + " and " + second + " is " + modulus);
            }
        }
    }
}
