```java
import java.util.Arrays;
import java.util.Scanner;

public class O4_SmallestNumberInAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Now enter the numbers of the array : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();

        }

        System.out.println("New Array : "+ Arrays.toString(arr));
        O4_SmallestNumberInAnArray obj = new O4_SmallestNumberInAnArray();

        System.out.println("The Smallest Number is "+obj.smallestNumber(arr));
    }
    int smallestNumber(int[] arr)
    {
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
```

```java
O4_SmallestNumberInAnArray obj = new O4_SmallestNumberInAnArray();

        System.out.println("The Smallest Number is "+obj.smallestNumber(arr));

        Access Modifiers:

public: The method is accessible from any other class.
protected: The method is accessible within its own package and by subclasses.
default: (no modifier): The method is accessible only within its own package.
private: The method is accessible only within its own class.

Static vs. Instance Methods:

static: The method belongs to the class rather than an instance of the class. You can call a static method without creating an instance of the class.
No static: The method is an instance method. It operates on an instance of the class and can access instance variables.

```

```java
Now, if you define a method without specifying an access modifier or static keyword, it will use the default access level (package-private) and be an instance method.
Example : 
O4_SmallestNumberInAnArray obj = new O4_SmallestNumberInAnArray();

so here in this case we have to create an object of the class inside the main function and then 
use its methods 

like this : 
System.out.println("The Smallest Number is "+obj.smallestNumber(arr));
``````