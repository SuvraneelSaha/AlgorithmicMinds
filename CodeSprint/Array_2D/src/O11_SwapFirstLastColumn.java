import java.util.Arrays;
import java.util.Scanner;

public class O11_SwapFirstLastColumn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row :");
        int n = in.nextInt();
        System.out.println("Please enter the size of the columns : ");
        int m = in.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Please enter the elements in the array : ");
        for (int i = 0 ; i < arr.length ; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("The original Matrix is : ");
        for (int[] row : arr )
        {
            System.out.println(Arrays.toString(row));

        }

        // Swap the 1st column with the last column

        int swap = 0 ;

        for (int i = 0,first_col = 0,last_col = m-1; i < arr.length; i++)
        {
            swap = arr[i][first_col];
            arr[i][first_col] = arr[i][last_col];
            arr[i][last_col] = swap;
        }

        System.out.println("New Matrix is : ");
        for (int[] row : arr )
        {
            System.out.println(Arrays.toString(row));

        }


    }
}
