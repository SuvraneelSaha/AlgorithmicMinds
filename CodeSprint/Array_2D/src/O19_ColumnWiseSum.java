import java.util.Arrays;
import java.util.Scanner;

public class O19_ColumnWiseSum {
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

        for (int j = 0; j < m; j++)
        {
            int sum = 0 ;
            for (int i = 0; i < n; i++)
            {
                    sum = sum + arr[i][j];
            }
            System.out.println("The sum of the column "+(j+1) + ": "+sum);
        }
    }
}
