import java.util.Scanner;

public class Challenge1_Day5 {
    public static void main(String[] args) {
        Scanner temperature = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double tempFahrenheit = temperature.nextDouble();
        double tempCelsius = ((tempFahrenheit - 32)*5)/9;
        System.out.println("The temperature in Celsius is: " + tempCelsius);
    }
}
