//Q10.Write a program to check if both the arrays are equal or not
package Java._14_Array;
import java.util.Scanner;
public class Q10_CheckElements 
{
    public static void main(String[] args) 
    {   
        
        int[] arr1 = new int[3];    //arr1.length=4
        int[] arr2 = new int[3];    //arr2.length=5

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 40;

        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;

        boolean flag = false;
        
        for(int i=0 ; i<3 ; i++)
        {
            if(arr1.length==arr2.length)
            {
                if(arr1[i] == arr2[i])
                {
                    flag=true;
                }
            } 
        }  ///gdbd h program

        if(flag=true)
        {
            System.out.println("Equal");
        }
        
    }
}  