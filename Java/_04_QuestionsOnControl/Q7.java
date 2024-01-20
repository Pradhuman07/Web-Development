//Q7.Write a program to check whether a character is alphabet or not

public class Q7 
{
    public static void main(String[] args) 
    {
        // int m='A';
        // System.out.println(m);     o/p = 65

        char x;
        x=66;

        if((x>=65 && x<=90) || (x>=97 && x<=122))
        {
            System.out.println(x + " is a Alphabet");
        }

        else
        {
            System.out.println(x + " is not a Alphabet");
        }

        // char x;
        // x='a';

        // if((x>='a' && x<='z') || (x>='A' && x<='Z') )
        // {
        //     System.out.println(x + " is a Alphabet");
        // }

        // else
        // {
        //     System.out.println(x + " is not a Alphabet");
        // }
    }
}

//note: char is a numeric primitive datatpe 
//char is of 2 byte (16 bits)
//vharacter sjhould be akela and in the single codes

//char x='65' error
//String x="65" correct

//#Unicode
// char x = 65-90 ; sout(x) ; A-Z 
// char x = 97-122; sout(x) ; a-z