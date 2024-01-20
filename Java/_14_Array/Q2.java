package Java._14_Array;

import java.util.Scanner;

public class Q2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
    
        int arr[] = new int[size];
    
        int product=1;
    
        System.out.println("Enter the elements of the array");
    
        for(int i=0 ; i<size ; i++)
        {
            arr[i] = sc.nextInt(); 
            product*=arr[i];
            // System.out.println("product upto here is: " + product);   //for ontime checking
        }
        System.out.println("The product of the elements of array is: " + product);   
    }    
}
