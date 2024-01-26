package Java._14_Array;

import java.util.Scanner;

public class Q9_userInput 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        /**************** Array 1 ***************************/
 
        System.out.print("Enter the length of Array1: ");
        int length1 = sc.nextInt();
        
        int[] arr1 = new int[length1];
        
        for(int i=0 ; i<length1 ; i++)
        {
            System.out.println("Enter the ELements of Array1 at " + i);
            arr1[i]=sc.nextInt();
        }
        
        /**************** Array 2 ***************************/
        
        System.out.print("Enter the length of Array2: ");
        int length2 = sc.nextInt();
        
        int[] arr2 = new int[length2];
        
        for(int i=0 ; i<length2 ; i++)
        {
            System.out.println("Enter the ELements of Array2 at " + i);
            arr2[i]=sc.nextInt();
        }
        
        /**************** Final Array *************************/
        
        int length = length1+length2;
        
        int[] arr = new int[length];
        
        for(int i=0 ; i<length1 ; i++)
        {
            arr[i]=arr1[i];
        }

        for(int i=0 ; i<length2 ; i++)
        {
            arr[i+length1]=arr2[i];
        }

        for(int a:arr)
        {
            System.out.print(a + " ");
        }
        
    }
}
