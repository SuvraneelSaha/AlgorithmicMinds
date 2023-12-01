import java.util.Arrays;
import java.util.Scanner;

public class O6_2DArrayOperations {
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
        int smallest = arr[0][0];
        int largest = 0 ;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                    sum = sum + arr[i][j];

                    if(arr[i][j]  < smallest)
                    {
                        smallest = arr[i][j];
                    }

                    if(arr[i][j] > largest)
                    {
                        largest = arr[i][j];
                    }
            }
        }

        System.out.println("The sum of all the elements in the 2D array is "+sum);
        System.out.println("The largest of all the elements in the 2D array is "+largest);
        System.out.println("The smallest of all the elements in the 2D array is "+smallest);

        int avg = sum / (n*m);

        System.out.println("The Average of all the elements in the 2D array is : "+avg);

    }
}
