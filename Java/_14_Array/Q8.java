//Q8.WAP to reverse an array.
package Java._14_Array;

import java.util.Scanner;

public class Q8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of Array");   //Taking size input
        int size = sc.nextInt();
        
        int arr[] = new int[size];                          //Creating an Empty Array
        
        System.out.println("Enter the elements of the array");

        for(int i=0 ; i<size ; i++)                         //Inputting Elements through loop
        {
            arr[i] = sc.nextInt();                          //Creation waale loop mein no chedchad
        }

        for(int j=size-1 ; j>=0 ; j--)   //metjhod mein dlao isko
        {
            System.out.print(arr[j]);   //hmne already array bna liya h ye loop kya krrha  h usnhi array ke element sulti indexing ki through bss print kara rha h #no storing
        }         
        
        //dkho ek aur array bnate to space complexity = double
        // 1st array---memory occupied = 4*size=20bytes same 2nd array bhi 20 bytes space comp double 

    }
}
