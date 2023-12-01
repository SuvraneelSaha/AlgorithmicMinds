import java.util.Arrays;
import java.util.Scanner;

public class O13_MatrixTo1DArray {
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

        int[] OnedArray = new int[n*m];

        int k = 0 ;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j <arr[i].length ; j++,k++)
            {
                OnedArray[k]  =  arr[i][j];
            }
        }

        System.out.println("New Array is : ");
        System.out.println(Arrays.toString(OnedArray));


    }
}
