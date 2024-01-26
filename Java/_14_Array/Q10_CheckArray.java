package Java._14_Array;

import java.util.Scanner;

public class Q10_CheckArray 
{
    static boolean checkEqual(int a[],int b[])
    {
        if(a.length!=b.length)
        {
            return false;
        }

        for(int i=0 ; i<a.length ; i++)
        {
            if(a[i]!=b[i])
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) 
    {   
        
        int[] a = new int[3];    //arr1.length=4
        int[] b = new int[3];    //arr2.length=5

        a[0] = 1;
        a[1] = 3;
        a[2] = 2;

        b[0] = 1;
        b[1] = 3;
        b[2] = 2;

        boolean result = checkEqual(a,b);

        if(result==true)
        {
            System.out.println("Equal");
        }

        else
        {
            System.out.println("Not Equal");
        }



    }
}
