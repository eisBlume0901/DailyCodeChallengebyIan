import java.util.ArrayList;
import java.util.Scanner;

public class Challenge1_Day6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> woods_type = new ArrayList<>();
        woods_type.add("oak");
        woods_type.add("birch");
        woods_type.add("dark oak");
        woods_type.add("spruce");
        woods_type.add("acacia");
        woods_type.add("mangrove");
        woods_type.add("warped");

        System.out.println(woods_type);
        System.out.println("Starting from 0 to 6 respectively, choose what wood you would like to purchase: ");

        int n = input.nextInt();
        String index = woods_type.get(n);
        System.out.println("You chose " + index);

        switch (n)
        {
            case 0 -> System.out.println("You have to pay Php 680");
            case 1 -> System.out.println("You have to pay Php 550");
            case 2 -> System.out.println("You have to pay Php 885");
            case 3 -> System.out.println("You have to pay Php 575");
            case 4 -> System.out.println("You have to pay Php 925");
            case 5 -> System.out.println("You have to pay Php 620");
            default -> System.out.println("You have to pay Php 520");
        }
    }
}
