//WAP to find the subarray with sum. Eg: 1,2,3,4,5,6,7 Sum=14 
package Java._14_Array;

import java.util.Scanner;

public class Q14_SubArraywithSum {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of Array");   //Taking size input
        int size = sc.nextInt();
        
        int arr[] = new int[size];                          //Creating an Empty Array
        
        System.out.println("Enter the elements of the array");

        for(int i=0 ; i<size ; i++)                         //Inputting Elements through loop
        {
            arr[i] = sc.nextInt();                          //Creation waale loop mein no 
        }    

        System.out.println("Enter Sum you want to extract: ");
        int sum=sc.nextInt();

        int csum=arr[0];
        int start=0;  
        // System.out.println("Cummulative Sum is: ");


        for(int i=1 ; i<size ; i++)
        {   
            while(csum>sum && start<i)
            {
                csum=csum-arr[start];
                start++;
            }
            
            if(csum==sum)
            {
                System.out.println("Start=" + start);
                System.out.println("End=" + (i-1));
            }

            if(i<size)
            {
                csum=csum+arr[i];
            }
        }

    }    
}

//SUBARRAY OF 1,2,3,4 are:-
// 1
// 2
// 3
// 4
// 1 2
// 2 3
// 3 4 
// 1 2 3
// 2 3 4
// 1 2 3 4    no.of Subarrays with array of n elements are=[n*(n+1)]/2