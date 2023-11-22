import java.util.Arrays;
import java.util.Scanner;

public class O3_LargestNumberInAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Now enter the numbers of the array : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();

        }

        System.out.println("New Array : "+ Arrays.toString(arr));

        System.out.println("The Largest Number in the Array is "+largestNumber(arr));

    }
    static int largestNumber(int[] arr)
    {
        int largest = 0 ;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                largest = arr[i];
            }
        }

        return largest;
    }
}
