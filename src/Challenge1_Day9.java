public class Challenge1_Day9
{
    static void pattern1(int n)
    {
        if (0 >= n || n > 8)
        {
            throw new ArithmeticException("Enter integer values not less than or " +
                    "equal to 0 or greater than 8");
        }
        else
        {
            for (int row = 1; row <= n; row++)
            {
                for (int col = 1; col <= row; col++)
                {
                    System.out.print("#");
                }
                System.out.println(" ");
            }
        }
    }
    public static void main(String[] args)
    {
        pattern1(15);
    }
}