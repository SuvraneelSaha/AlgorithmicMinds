import java.util.Arrays;
import java.util.Scanner;

public class O14_Concatenate2Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the size of the 1st array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();

        }

        System.out.println("The First Array is "+ Arrays.toString(arr));
        System.out.println("Please enter the size of the 2nd array :");
        int m = in.nextInt();
        int[] arr1 = new int[m];
        System.out.println("Please enter the elements : ");
        for (int i = 0; i < arr1.length; i++)
        {
            arr1[i] = in.nextInt();

        }

        System.out.println("The Second Array is "+ Arrays.toString(arr1));

        int[] arrConcat = new int[n+m];

        // n = 5 , m = 6
        // n+m = 6
        for (int arri = 0,arrj=0,i=0; i < arrConcat.length; i++)
        {
            if(arri<arr.length)
            {

                arrConcat[i] = arr[arri]; // 1 2 3 4 5 now i = 5
                arri++;
            }
            else
            {
                arrConcat[i] = arr1[arrj];
                // 11 22 33 44 55 66 now i = 5
                arrj++;

            }

        }

        System.out.println("Updated Array is "+Arrays.toString(arrConcat));


    }
}
