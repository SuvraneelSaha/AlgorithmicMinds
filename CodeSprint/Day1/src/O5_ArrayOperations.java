import java.util.Scanner;

public class O5_ArrayOperations {
    public static void main(String[] args) {
//        find the sum , average largest and smallest using a single loop
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array :");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Please enter the elements in the array : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();

        }

        int sum = 0 ;
        int avg = 0 ;
        int largest = 0 ;
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            sum=sum+arr[i];

            if(arr[i] > largest)
            {
                largest = arr[i];
            }

            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }

        avg = sum / arr.length;

        System.out.println("Smallest = "+smallest);
        System.out.println("Largest = "+largest);
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);

    }
}
