// 1.Take Size Input
// 2.Create Empty Array of that size
// 3.Take Elements Input through "for loop"

package Java._14_Array;
import java.util.Scanner;
public class _02_DynamicInput
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");

        int size = sc.nextInt();      //Taking input for size of Array
        
        int[] arr = new int[size];    //Creating an Empty array
        
        for(int i=0 ; i<size ; i++)   //Taking input of elements of Array
        {
            System.out.println("Enter the Element of Array at index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The Array is :-");
        
        for(int a : arr)       //Displaying the Array Elements
        {
            System.out.print(a + " ");
        }

    }
}

        // int[] arr= new int[5];

        // arr[0]=10;
        // arr[1]=20;
        // arr[2]=30;
        // arr[3]=40;
        // arr[4]=50;
