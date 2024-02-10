import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Challenge1_Day11
{
    
    public static void separateNegativePositive()
    {
        Scanner input = new Scanner(in);
        out.println("Enter array length: ");
        int arrayLength = input.nextInt();
        out.println("Enter the array elements");
        int[] arrayElements = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
        {
            arrayElements[i] = input.nextInt();
        }
        out.println("ORIGINAL ARRAY: " + Arrays.toString(arrayElements));
        //Determine how many positive and negative values present in the array.
        int positiveCount = 0;
        int negativeCount = 0;
        for (int arrayElement: arrayElements)
        {
            if (arrayElement >= 0)
            {
                ++positiveCount;
            }
            else
            {
                ++negativeCount;
            }
        }

        if (positiveCount == 0)
        {
            out.println("Array contains only negative numbers");
            out.println(Arrays.toString(arrayElements));
        }
        else if (negativeCount == 0)
        {
            out.println("Array contains only positive numbers");
            out.println(Arrays.toString(arrayElements));
        }

        //Create a negative and positive array
        int[] positive = new int[positiveCount];
        int[] negative = new int[negativeCount];

        int p = 0;
        int n = 0;
        for (int element: arrayElements)
        {
            if (element >= 0)
            {
                positive[p++] = element;
            }
            else
            {
                negative[n++] = element;
            }
        }

        //Display positive and negative arrays only
        out.println("Negative numbers " + Arrays.toString(negative));
        out.println("Positive numbers " + Arrays.toString(positive));

        //Sort arrays
        Arrays.sort(arrayElements);
        out.println("SORTED ARRAY: " + Arrays.toString(arrayElements));
    }

    public static void main(String[] args)
    {
        separateNegativePositive();
    }
}
