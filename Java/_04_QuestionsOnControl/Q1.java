//Q1.Write a program to find the maximum b/w two number.

public class Q1 
{
    public static void main(String[] args) 
    {
        int num1=4,num2=5;

        if(num1>num2)
        {
            System.out.println(num1 + " is greater than " + num2);
        }

        else if(num1<num2)
        {
            System.out.println(num2 + " is greater than " + num1);
        }

        else
        {
            System.out.println("Both" + num1 + " and " + num2 + " are equal");
        } 

        String R = num1>num2 ? num1 + " is greater than " + num2 : num1<num2 ? num2 + " is greater than " + num1 : "Both" + num1 + " and " + num2 + " are equal" ;
        System.out.println(R);
    }
}