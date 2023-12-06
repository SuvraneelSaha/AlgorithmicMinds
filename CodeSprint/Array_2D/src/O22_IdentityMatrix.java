import java.util.Arrays;
import java.util.Scanner;

public class O22_IdentityMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row : ");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Please enter the 0s and 1s in the Array ");
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

        if(IdentityMatrix(arr))
        {
            System.out.println("Identity Matrix");
        }
        else
        {
            System.out.println("NOT");
        }




    }
    public static boolean IdentityMatrix(int[][] arr)
    {
        // for 1s -- 00 , 11 , 22

        boolean check = false;

        for (int i = 0; i < arr.length; i++)  // 1 0 0 ,now i = 0 ,
        {
            for (int j = 0; j < arr.length; j++)   // j = 0 ,   j = 1
             {
                if(arr[i][j] == 0 && (i != j))  //  false , true ,
                {
                    check = true ;
                }
                else
                {
                    if(arr[i][j] == 1 && (i==j)) // true .
                    {
                        check = true ;
                    }
                    else
                    {
                        check = false;
                    }


                }



            }
        }
        return check;

    }
}
