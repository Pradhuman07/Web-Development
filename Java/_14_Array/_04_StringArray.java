package Java._14_Array;
import java.util.Scanner;

public class _04_StringArray
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of Array: ");
        
        int size = sc.nextInt();      //Taking input for size of Array
        
        String[] arr = new String[size];    //Creating an Empty array

        for(int i=0 ; i<size ; i++)   //Taking input of elements of Array
        {
            System.out.println("Enter the Elements of Array: ");
            sc.nextLine();
            arr[i] = sc.nextLine();
        }
        
        for(String a : arr)       //Displaying the Array Elements
        {
            System.out.println(a);
        }
    }
}

//Diff b/w next and nextLine
// nextline mein u can take sentencces input(next line compiler ko btata h ki space ke bad bhi )
// next mein only u can take only one word but not sentences