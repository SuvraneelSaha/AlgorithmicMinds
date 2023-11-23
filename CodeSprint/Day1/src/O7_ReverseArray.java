import java.util.Arrays;
import java.util.Scanner;

public class O7_ReverseArray {
    public static void main(String[] args) {
//        Physically store the array in reverse order

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array :");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Please enter the elements in the array : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();

        }
        System.out.println("Original Array is : "+ Arrays.toString(arr));

        int i = 0 ;
        int j = arr.length-1;

        while (i<j)
        {
            int swap_var = arr[i];
            arr[i] =arr[j];
            arr[j] = swap_var;

//            for incrementing i and decrementing j
            i++;
            j--;
        }

        System.out.println("Reversed Array = "+Arrays.toString(arr));


    }
}
