//Q3.WAP to find the sum of even elements of an array.
package Java._14_Array;
import java.util.*;
public class Q3_SumOfEven 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;

        System.out.println("Enter the elements of an array"); 

        for(int i=0 ; i<size ; i++)
        {
            arr[i] = sc.nextInt();

            if(arr[i]%2==0)
            {
                sum+=arr[i];
            }

        }

        System.out.println("The sum of even elements present in the array is: " + sum);

    }
}

