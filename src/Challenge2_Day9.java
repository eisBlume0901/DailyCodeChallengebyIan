public class Challenge2_Day9
{
    static void pattern2(int n)
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
                int noOfSpaces = n - row;
                for (int s = 0; s < noOfSpaces; s++)
                {
                    System.out.print("  ");
                }
                for (int col = 0; col < row; col++)
                {
                    System.out.print("# ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
        pattern2(75);
    }
}
