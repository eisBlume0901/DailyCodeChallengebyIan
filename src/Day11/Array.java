package Day11;

import java.util.Arrays;
import java.util.Scanner;

public class Array
{
    public static int[] enterArrayLengthAndElements()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLength = input.nextInt();
        System.out.println("Enter the array elements");
        int[] arrayElements = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
        {
            arrayElements[i] = input.nextInt();
        }
        return arrayElements;
    }

    public static void separateNegativePositive()
    {
        //Determine how many positive and negative values present in the array.
        int positiveCount = 0;
        int negativeCount = 0;
        for (int arrayElement: enterArrayLengthAndElements())
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
            System.out.println("Array contains only negative numbers");
            System.out.println(Arrays.toString(enterArrayLengthAndElements()));
        }
        else if (negativeCount == 0)
        {
            System.out.println("Array contains only positive numbers");
            System.out.println(Arrays.toString(enterArrayLengthAndElements()));
        }

        //Create a negative and positive array
        int[] positive = new int[positiveCount];
        int[] negative = new int[negativeCount];

        int p = 0;
        int n = 0;
        for (int element: enterArrayLengthAndElements())
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

        //Display arrays
        System.out.println("Negative numbers " + Arrays.toString(negative));
        System.out.println("Positive numbers " + Arrays.toString(positive));

        //Sort arrays
        Arrays.sort(enterArrayLengthAndElements());
        for (int num : enterArrayLengthAndElements())
        {
            System.out.println(num +" ");
        }
    }

    public static void main(String[] args)
    {
        separateNegativePositive();
    }
}
