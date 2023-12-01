import java.util.Arrays;
import java.util.Scanner;

public class O17_MiddleColumnPrinting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the size of the row : ");
        int n = in.nextInt();
        System.out.println("Please enter the size of the column : ");
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Please enter the elements in the Array ");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("The Original Matrix is : ");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

        // if the number of columns is odd then print the middle most column

        // if even
        if(m%2==0)
        {
            for (int i = 0; i < n; i++)
            {
                System.out.print(arr[i][m/2] +" ");
            }
            System.out.println();
            for (int i = 0; i < n; i++)
            {
                System.out.print(arr[i][(m/2)-1] +" ");
            }

        }
        // if odd
        else
        {
            for (int i = 0; i < n; i++)
            {
                System.out.print(arr[i][m/2] +" ");
            }
            System.out.println();
        }

    }
}
