/*Q36. Write a Java program that accepts three numbers 
and check All numbers are equal or not */

public class Q36 
{
    public static void main(String[] args) 
    {
        int num1=4,num2=4,num3=4;

        if(num1==num2 && num2==num3)
        {
            System.out.println("All numbers are equal");
        }

        else
        {
            System.out.println("All numbers are Not equal");
        }

        String y = num1==num2 && num2==num3?"All numbers are equal":"All numbers are Not equal";
        System.out.println(y);
    }
}
