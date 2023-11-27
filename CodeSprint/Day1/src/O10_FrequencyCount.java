import java.util.Arrays;
import java.util.Scanner;

public class O10_FrequencyCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();

        }

        System.out.println("Original Array is "+ Arrays.toString(arr));

        System.out.println("Enter the search value : ");
        int search = in.nextInt();

        System.out.println("The Element "+search+" is present in the array "+FrquencyCount(arr,search)+" times");


    }
//    linked list trees hashmap hashset arrays list arraylist
    public  static int FrquencyCount(int[] arr , int search)
    {
        int count = 0 ;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == search)
            {
                count++;
            }

        }
        return count;
    }
}
