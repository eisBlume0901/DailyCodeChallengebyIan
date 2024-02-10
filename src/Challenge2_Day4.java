import java.util.Scanner;

public class Challenge2_Day4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = 0;
        double x = 1;
        System.out.println("Enter how many numbers you like to calculate the average with: ");
        int n = input.nextInt();
        while(x <= n) {
            System.out.println("Enter the number " + "(" + (int) x +")");
            number += input.nextInt();
            x += 1;
        }
        double average = (number/n);
        System.out.println("The average is: " + average);
    }
}
