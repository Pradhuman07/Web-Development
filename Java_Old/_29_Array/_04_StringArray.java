package Java_Old._29_Array;
import java.util.Scanner;

public class _04_StringArray
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of Array: "); //Taking input for size of Array
        int size = sc.nextInt();      
        
        String[] arr = new String[size];    //Creating an Empty array

        System.out.println("Enter the Elements");

        for(int i=0 ; i<size ; i++)   //Taking input of elements of Array
        {
            arr[i] = sc.next();
        }
        
        System.out.println("Your Array is: -"); 

        for(String a : arr)       //Displaying the Array Elements
        {
            System.out.print(a + " ");
        }
    }
}

//Diff b/w next and nextLine
// nextline mein u can take sentencces input(next line compiler ko btata h ki space ke bad bhi )
// next mein only u can take only one word but not sentences