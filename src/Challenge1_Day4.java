import java.util.ArrayList;
import java.util.Scanner;

public class Challenge1_Day4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Peach");
        System.out.println(fruitList);
        System.out.println("Enter the index of the fruit you want to get: ");
        int i = input.nextInt();
        String index = fruitList.get(i);
        System.out.println(index);
    }
}
