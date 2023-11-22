import java.util.Arrays;
import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 5 numbers : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("The newly created array is ");
        System.out.println(Arrays.toString(arr));

    }
}
