//Q4.Write a program to check wether the no. is divisible by 5 and 11 or not

public class Q4 
{
    public static void main(String[] args) 
    {
        int num=55;

        if(num%5==0 && num%11==0)
        {
            System.out.println("Number is divisible by both 5 and 11");
        }

        if(num%5==0 && num%11!=0)
        {
            System.out.println("The number is divided by 5 but not by 11");
        }

        if(num%11==0 && num%5!=0)
        {
            System.out.println("The number is divisible by 11 but not by 5");
        }

        if(num%5!=0 && num%11!=0)
        {
            System.out.println("The number is divisible neither by 5 nor by 11");
        }
    }
}
