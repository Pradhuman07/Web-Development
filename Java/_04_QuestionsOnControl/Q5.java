//Q5.Write a program to check whether a number is even or odd

public class Q5 
{
    public static void main(String[] args) 
    {
        int num=11;

        String y = num%2==0 ? "It is a Even Number" : "It is a Odd Number" ;
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
