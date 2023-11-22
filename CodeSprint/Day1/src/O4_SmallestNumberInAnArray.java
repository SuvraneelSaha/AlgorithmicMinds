import java.util.Arrays;
import java.util.Scanner;

public class O4_SmallestNumberInAnArray {
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
        O4_SmallestNumberInAnArray obj = new O4_SmallestNumberInAnArray();

        System.out.println("The Smallest Number is "+obj.smallestNumber(arr));
    }
    int smallestNumber(int[] arr)
    {
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
