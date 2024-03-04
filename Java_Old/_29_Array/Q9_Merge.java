//Q9.WAP to merge 2 arrays
package Java_Old._29_Array;

import java.util.Scanner;

public class Q9_Merge 
{
    public static void main(String[] args) 
    {   
        
        int[] arr1 = new int[4];    //arr1.length=4
        int[] arr2 = new int[5];    //arr2.length=5

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;

        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        Scanner sc = new Scanner(System.in);

        int size = arr1.length + arr2.length;   //4+5

        int[] arr = new int[size];

        for(int i=0 ; i<arr1.length ; i++)
        {
            arr[i] = arr1[i];
        }

        for(int i=0 ; i<arr2.length ; i++)
        {
            arr[i+arr1.length] = arr2[i];
        }

        for(int a:arr)
        {
            System.out.print(a + " ");
        }
        
    }    
}
