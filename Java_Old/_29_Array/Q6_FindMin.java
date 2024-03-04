//Q6.WAP to find the minimum element in the array
package Java_Old._29_Array;
import java.util.Scanner;

public class Q6_FindMin 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("Enter the elements of the array");
        
        int min=Integer.MAX_VALUE;

        for(int i=0 ; i<size ; i++)
        {
            arr[i] = sc.nextInt();        //array creation ko touch mt kia kro jo bhi h bahr kra kro
        }

        for(int i=0 ; i<size ; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("The minimum element is: " + min);
        

    }
}

//Q7.WAP to display the index at which search element is present
//WAP to find the maximum element from an array