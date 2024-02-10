import java.util.Scanner;

public class Challenge1_Day8
{
    public static void main(String[] args)
    {
        String email = "Greetings, freshman of CS department";
        String text = "Greetings, freshman of IT department";
        String facebook = "Greetings, sophomores of CSIT or NON-CSIT department";
        String twitter = "Greetings, juniors of CSIT or NON-CSIT department";
        String instagram = "Greetings, freshman and seniors of CSIT or NON-CSIT department";

        Scanner input = new Scanner(System.in);
        System.out.println("What year level are you? Please choose: 1, 2, 3, or 4 only: ");
        int yearLevel = input.nextInt();
        System.out.println("Which department are you under? Please choose: CS, IT, NON-CSIT: ");
        String course = input.next();

        if (course.equals("CS") && yearLevel == 1)
        {
            System.out.println(email);
        }
        else if (course.equals("IT") && yearLevel == 1)
        {
            System.out.println(text);
        }
        else
        {
            if (yearLevel == 2)
            {
                System.out.println(facebook);
            }
            else if (yearLevel == 3)
            {
                System.out.println(twitter);
            }
            else
            {
                System.out.println(instagram);
            }
        }

    }
}
