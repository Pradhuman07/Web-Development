//Q9.. Write a program to input any character and check whether it is 
//alphabet, digit or special character

public class Q9 
{
    public static void main(String[] args) 
    {
        char x;
        x='5';

        if((x>='a' && x<='z') || (x>='A' && x<='Z') )
        {
            System.out.println(x + " is a Alphabet");
        }

        else if(x>='0'  && x<='9')
        {
            System.out.println(x + " is a number");
        }

        else
        {
            System.out.println(x + " is a Special Character");
        }
    }
}
