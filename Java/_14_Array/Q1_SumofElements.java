//1. WAP to find sum of Elements present in an Array
package Java._14_Array;
import java.util.Scanner;

public class Q1_SumofElements 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
    
        int arr[] = new int[size];
    
        int sum=0;
    
        System.out.println("Enter the elements of the array");
    
        for(int i=0 ; i<size ; i++)
        {
            arr[i] = sc.nextInt(); 
            sum+=arr[i];
            // System.out.println("Sum upto here is: " + sum);   //for ontime checking
        }
        System.out.println("The sum of the elements of array is: " + sum);   
    }
    
}