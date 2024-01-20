//Q4.WAP to find the sum of even indexed elements.
package Java._14_Array;
import java.util.*;
public class Q4 
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

            if(i%2==0)
            {
                sum+=arr[i];
            }
        }

        System.out.println("The sum of even indexed elements of an array is: " + sum);

    }
}
