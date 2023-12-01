import java.util.Arrays;
import java.util.Scanner;

public class O3_SumofElementsIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the row : ");
        int n = in.nextInt();
        System.out.println("Enter the size of the column : ");
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("Please enter the elements in the 2d array :");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("Printing the matrix ");

        for (int[] row :arr)
        {
            System.out.println(Arrays.toString(row));

        }

        int sum = 0 ;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                sum = sum + arr[i][j] ;
            }
        }

        System.out.println("The sum of the elements present in the 2d Array is : "+sum);


    }
}
