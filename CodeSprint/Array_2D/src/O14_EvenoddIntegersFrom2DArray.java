import java.util.Arrays;
import java.util.Scanner;

public class O14_EvenoddIntegersFrom2DArray {
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

        int evenCount = 0 ;
        int oddCount = 0 ;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j] % 2 == 0 )
                {
                    evenCount ++ ;
                }
                else
                {
                    oddCount++;
                }
            }
        }

        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];

        int e = 0 ;
        int o = 0 ;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] % 2 ==0 )
                {
                    evenArr[e] = arr[i][j];
                    e++;
                }
                else
                {
                    oddArr[o] = arr[i][j];
                    o++;
                }
            }
        }

        System.out.println("Odd Array is : "+Arrays.toString(evenArr));
        System.out.println("Even Array is : "+Arrays.toString(oddArr));



    }
}
