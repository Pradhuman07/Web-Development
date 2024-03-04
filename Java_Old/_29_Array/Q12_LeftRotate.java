//WAP to left rotate an by kth terms (let k=3 then 1,3,5,7,9 = 7,9,1,3,5) 
package Java_Old._29_Array;

import java.util.Scanner;

public class Q12_LeftRotate
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

        System.out.println("Enter the value of k(no. of rotations)");
        int k=sc.nextInt();

        int mod=k%size;   //Remember when Nr<Dr then Nr%Dr=Nr  ==> mod=3%5=3

        for(int i=0;i<size;i++)
        {
            System.out.print(arr[(i+mod)%size] + " ");   
        }
    }    
}

//mod=3
//arr[(i+mod)%size]

//i=0,mod=3 (0+3)%5=3 and arr[3]=7
//i=1,mod=3 (1+3)%5=4 and arr[4]=9
//i=2,mod=3 (2+3)%5=0 and arr[0]=1
//i=3,mod=3 (3+3)%5=1 and arr[1]=3
//i=4,mod=3 (4+3)%5=2 and arr[2]=5