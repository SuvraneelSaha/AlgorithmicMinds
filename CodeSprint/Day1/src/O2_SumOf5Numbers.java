import java.util.Arrays;
import java.util.Scanner;

public class O2_SumOf5Numbers {
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

        System.out.print("The sum of the numbers present in the array is "+sum(arr));

//        the cursor goes to the next line if we use println -- new line
//        ie it starts from the new line


    }
    public static int sum(int[] arr)
    {
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum+arr[i];
        }
        return sum;
    }
}
