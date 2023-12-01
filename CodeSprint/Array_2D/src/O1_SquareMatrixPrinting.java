import java.util.Arrays;
import java.util.Scanner;

public class O1_SquareMatrixPrinting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the square matrix ");
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Please enter the elements in the matrix ");
        for (int i = 0 ; i< arr.length ; i++)
        {
            for (int j = 0 ; j<arr.length ; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("Printing the matrix ");

        for (int[] row :arr)
        {
            System.out.println(Arrays.toString(row));

        }
    }
}
