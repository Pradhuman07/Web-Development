// How to take Dynamic Input in Array (user ke mood ke hisab se)    
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
            System.out.println("Enter the Elements of Array: ");
            arr[i] = sc.nextInt();
        }

        for(int a : arr)       //Displaying the Array Elements
        {
            System.out.println(a);
        }
    }
}

        // int[] arr= new int[5];

        // arr[0]=10;
        // arr[1]=20;
        // arr[2]=30;
        // arr[3]=40;
        // arr[4]=50;
