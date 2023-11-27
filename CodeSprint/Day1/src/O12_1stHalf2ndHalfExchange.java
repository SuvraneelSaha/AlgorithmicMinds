import java.util.Arrays;
import java.util.Scanner;

public class O12_1stHalf2ndHalfExchange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();

        }

        System.out.println("Original Array is "+ Arrays.toString(arr));

        int i = 0 ;
        int j = 0 ;

        if(arr.length % 2 ==0 )
        {
            j = arr.length / 2 ;
            i = 0 ;
        }
        else
        {
            j= ( arr.length / 2 ) + 1 ;
            i = 0 ;
        }

        if(arr.length%2 ==0)
        {
            // even
            while(i< arr.length/2)
            {
                // swap
                swap(arr,i,j);
                j++;
                i++;
            }
        }
        else
        {
            // odd
            while (i<arr.length/2)
            {
                // swap
                swap(arr,i,j);
                i++;
                j++;
            }
        }

        System.out.println("The changed Array is "+Arrays.toString(arr));




    }
    public static void swap(int[] arr , int a , int b )
    {

        int swap_var = 0 ;
        swap_var = arr[a];
        arr[a] = arr[b];
        arr[b] = swap_var;

    }
}
