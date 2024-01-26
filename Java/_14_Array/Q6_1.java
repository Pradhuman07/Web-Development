package Java._14_Array;

import java.util.Scanner;

public class Q6_1 
{
    static int minValue(int[] arr,int size)   //parameter mein datatype daalte h
    {
        int min=Integer.MAX_VALUE;

        for(int i=0 ; i<size ; i++)
        {
            if(arr[i]<min)
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

        System.out.println(minValue(arr,size));   //argument mein datatype nhi daalte
    }
}

//sirf minValue(arr,size);     likhte to sirf call hota ..us case mein andr sout(min) krna pdta uss method ke
//sout(minValue(arr,size)); likhte h to call hota h + return value bhi deta h wrna wo int result=minValue(arr,size); sout(result)