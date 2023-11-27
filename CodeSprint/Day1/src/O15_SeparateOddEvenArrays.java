import java.util.Arrays;
import java.util.Scanner;

public class O15_SeparateOddEvenArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the array : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();

        }

        int oddCount = 0 ;
        int evenCount = 0 ;
        int[] arrOdd = new int[arr.length];
        int[] arrEven = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 ==0)
            {
                arrEven[evenCount] = arr[i];
                evenCount++;
            }
            else
            {
                arrOdd[oddCount] = arr[i];
                oddCount++;
            }
        }
        arrOdd = Arrays.copyOf(arrOdd,oddCount);
        arrEven = Arrays.copyOf(arrEven,evenCount);

        System.out.println("Odd Array = "+ Arrays.toString(arrOdd));
        System.out.println("Even Array = "+ Arrays.toString(arrEven));
    }
}
