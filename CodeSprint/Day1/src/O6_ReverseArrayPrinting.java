import java.util.Scanner;

public class O6_ReverseArrayPrinting {
    public static void main(String[] args) {
//        print an array with reverse order
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array :");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Please enter the elements in the array : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();

        }
        int i = arr.length-1;
        while (i>=0)
        {
            System.out.print(arr[i] +" ");
            i--;
        }

    }
}
