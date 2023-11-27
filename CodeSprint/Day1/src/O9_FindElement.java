import java.util.Arrays;
import java.util.Scanner;

public class O9_FindElement {
// Question : Find the element and its index position in the array and if not present dont give the index postition
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter specific unique elements : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();

        }

        System.out.println("Original Array is "+ Arrays.toString(arr));

        System.out.println("Enter the search value : ");
        int search = in.nextInt();

        if(FindElementPlace(arr,search) !=-1) {

            System.out.println("The Element " + search + " is present at " + FindElementPlace(arr, search) + " index");
        }
        else {
            System.out.println("Element " + search + " is not found in the array ");

        }





    }

    public  static int FindElementPlace(int[] arr,int search)
    {
        for (int i = 0; i < arr.length; i++)
        {
                if(arr[i] == search)
                {
                    return i;
                }
        }
        return -1;
    }
}
