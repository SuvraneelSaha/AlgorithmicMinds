import java.util.Arrays;
import java.util.Scanner;

public class O10_Swap_FirstLastRows {
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

        // Swap the 1st row with the last row
        int swap = 0 ;
        for (int i = 0,first_row=0,last_row= n-1 ;  i < m; i++)
        {
                swap = arr[first_row][i];
                arr[first_row][i] = arr[last_row][i];
                arr[last_row][i] = swap;
        }

        System.out.println("New Matrix is : ");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));

        }





    }
}
