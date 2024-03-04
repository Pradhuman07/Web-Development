package Java_Old._29_Array;
import java.util.Scanner;

public class _03_FloatArray
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();      //Taking input for size of Array
        
        float[] arr = new float[size];    //Creating an Empty array

        for(int i=0 ; i<size ; i++)   //Taking input of elements of Array
        {
            System.out.println("Enter the Elements of Array: ");
            arr[i] = sc.nextFloat();
        }
        
        for(float a : arr)       //Displaying the Array Elements
        {
            System.out.println(a);
        }
    }
}

//Diff b/w next and nextLine