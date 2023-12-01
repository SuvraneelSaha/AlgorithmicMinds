import java.util.Arrays;
import java.util.Scanner;

public class O9_FrquencyCount {
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

        System.out.println("Enter the Search Element : ");
        int search = in.nextInt();

        if(countFrequency(arr,search) == 0 )
        {
            System.out.println(search + " Element Not Found ");
        }
        else
        {
            System.out.println("Count of "+search+" element is "+countFrequency(arr,search));

        }
    }


    public static int countFrequency(int[][] arr , int search)
    {
        int count = 0 ;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] == search)
                {
                    count ++ ;
                }
            }
        }

        if(count==0)
        {
            return 0 ;
        }
        return count;
    }
}
