public class Challenge1_Day10
{
    static void multiplication(int n)
    {
        for (int row = 1; row <= n; row++)
        {
            for (int col = 1; col <= n; col++)
            {
                System.out.print((row*col) + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        multiplication(10);
    }
}
