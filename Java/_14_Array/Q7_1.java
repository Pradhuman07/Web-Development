package Java._14_Array;

import java.util.Scanner;

public class Q7_1 
{
    static int maxValue(int[] arr, int size)
    {
        int min=Integer.MIN_VALUE;

        for(int i=0 ; i<size ; i++)
        {
            if(arr[i]>min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("Enter the elements of the array");
        
        for(int i=0 ; i<size ; i++)
        {
            arr[i] = sc.nextInt(); 
        }

        System.out.println("The maximum element is: " + maxValue(arr,size));


    }
}
