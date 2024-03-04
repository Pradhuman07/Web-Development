//Q7.Write a program to check whether a character is alphabet or not
// #Unicode  / ASCII Values
// char x = 65-90 ; sout(x) ; A-Z 
// char x = 97-122; sout(x) ; a-z
package Java_Old._02_ConditionalStatements;
public class Q7_ASCIII{
    public static void main(String[] args){
        
        char x;
        x=112;
        
        if((x>=65 && x<=90) || (x>=97 && x<=122)){

            if(x>=65 && x<=90){
                System.out.println(x + " is a Upper Case Alphabet");
            }
            if(x>=97 && x<=122){
                System.out.println(x + " is a Lower Case Alphabet");
            }
        }
        
        else{
            System.out.println(x + " is not a Alphabet");
        }

    /**********************************************/
        int m='A';
        System.out.println(m);     // o/p = 65

        char n=65;
        System.out.println(n);     // o/p = A
    /**********************************************/

        char y='@';

        if((y>='a' && y<='z') || (y>='A' && y<='Z') )
        {
            System.out.println(y + " is a Alphabet");
        }

        else
        {
            System.out.println(y + " is not a Alphabet");
        }
    }
}

//Remember: char is a numeric primitive datatpe 
