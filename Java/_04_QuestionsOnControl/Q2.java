//Q1.Write a program to find the maximum b/w three numbers.

public class Q2 
{
    public static void main(String[] args) 
    {
        int x=4,y=5,z=6;
        
        if(x>y && x>z)
        {
            System.out.println("Greatest no. is " + x);
        }

        else if(y>x && y>z)
        {
            System.out.println("Greatest no. is " + y);
        }

        else
        {
            System.out.println("Greatest no. is " + z);
        }

        
        String R = x>y && x>z ? "Greatest no. is " +x : y>x && y>z ? "Greatest no. is " + y : "Greatest no. is " + z ;
        System.out.println(R);
    }
} 
