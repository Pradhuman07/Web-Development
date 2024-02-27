package Revision._02_ConditionalStatements;
/*Q38. Write a java program that accepts three numbers 
from the user and check if numbers are in 
"increasing" or "decreasing" order */

public class Q38_IorderDorder 
{
    public static void main(String[] args) 
    {
        int num1=3,num2=0,num3=1;

        if(num1<num2 && num2<num3)
        {
            System.out.println("Numbers are in Increasing Order");
        }
        
        else if(num1>num2 && num2>num3)
        {
            System.out.println("Numbers are in Decreasing Order");
        }

        else
        {
            System.out.println("No Specific Order");
        }

String y=num1<num2 && num2<num3?"Numbers are in Increasing Order":num1>num2 && num2>num3?"Numbers are in Decreasing Order":"No Specific Order";
System.out.println(y); 
    }
}
