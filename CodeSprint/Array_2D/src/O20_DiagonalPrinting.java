import java.util.Arrays;
import java.util.Scanner;

public class O20_DiagonalPrinting {
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

        // not printing - 0,1  & 1,0  & 1,2  & 2,1
        // it will a sqaure matrix to be specific
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if(i-j == 1  || j-i == 1 )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();

        }

    }
}
