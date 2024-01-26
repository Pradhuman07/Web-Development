//5.WAP to search an element in an array
package Java._14_Array;
import java.util.*;
public class Q5_Search 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();

        System.out.println("Enter the elements you want to search");
        int Search_Element = sc.nextInt();
        
        int arr[] = new int[size];
        
        boolean flag=false;
        
        System.out.println("Enter the elements of the array");

        for(int i=0 ; i<size ; i++)
        {
            arr[i]=sc.nextInt();

            if(arr[i]==Search_Element)
            {
                flag = true;
                break;
            }
        }

        if(flag=true)
        {
            System.out.println("Element found");
        }

        else
        {
            System.out.println("Element not found");
        }
        
    }
}

// for(int i=0 ; i<size ; i++)        ........WRONG............
// {
//     arr[i] = sc.nextInt(); 

//     if(arr[i]==Search_Element)
//     {
//         System.out.println("Element Found");
//     }

//     else
//     {
//         System.out.println("Element not found");
//     }                
//}

