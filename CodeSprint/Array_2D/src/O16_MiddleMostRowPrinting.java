import java.util.Arrays;
import java.util.Scanner;

public class O16_MiddleMostRowPrinting {
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

        // print the middle most row if the number of rows is odd
        // else print the 2 rows if the number of rows is even

        System.out.println("Middle row = ");

        if(arr.length % 2 ==0 )
        {
            // even
            System.out.println(Arrays.toString(arr[arr.length / 2 ]));
            System.out.println(Arrays.toString(arr[(arr.length / 2) -1  ]));
        }
        else
        {
            // odd

                System.out.println(Arrays.toString(arr[arr.length / 2 ]));


        }
    }
}
