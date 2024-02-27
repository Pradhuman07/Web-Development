//Q5.Write a program to check whether a number is even or odd
package Revision._02_ConditionalStatements;
import java.util.Scanner;
public class Q5_EvenOdd 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num=sc.nextInt();

        String y = num%2==0 ? num + " is a Even Number" : num + " is a Odd Number" ;
        System.out.println(y);
        

        if(num%2==0)
        {
            System.out.println(num + " is a Even Number");
        }

        else
        {
            System.out.println(num + " is a Odd NUmber");
        }
    }
}
