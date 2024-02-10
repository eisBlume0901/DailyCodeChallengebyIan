import java.util.Scanner;

public class Challenge2_Day5 {
    public static void main(String[] args) {
        Scanner length = new Scanner(System.in);
        System.out.println("Enter in length in inches: ");
        double lengthInch = length.nextDouble();
        double lengthMeters = lengthInch*0.0254;
        System.out.println("The length in meters is: " + lengthMeters);
    }
}
