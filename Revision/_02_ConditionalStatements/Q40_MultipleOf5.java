package Revision._02_ConditionalStatements;
//Q40. Write a Java program to check whether 
//the given integer is a multiple of 5 or not.

public class Q40_MultipleOf5 
{
    public static void main(String[] args) 
    {
        int num=53;

        if(num%5==0)
        {
            System.out.println(num + " is a multiple of 5");
        }

        else
        {
            System.out.println(num + " is not a multiple of 5");
        }

        String y = num%5==0 ? num + " is a multiple of 5" : num + " is not a multiple of 5";
        System.out.println(y);
    }
}
