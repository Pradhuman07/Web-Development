package Java_Old._02_ConditionalStatements;
//Q8.Write a program to input any alphabet and check whether it is vowel or consonant
// #Unicode  / ASCIII Values
// char x = 65-90 ; sout(x) ; A-Z 
// char x = 97-122; sout(x) ; a-z
public class Q8_VowelsOrConsonant
{
    public static void main(String[] args){

/*******************************************************/

        char v1='a',v2='e',v3='i',v4='o',v5='u';

        char ch = 'o';

        if(ch==v1 || ch==v2 || ch==v3 || ch==v4 || ch==v5){
            System.out.println(ch + " is a vowel");
        }

        else{
            System.out.println(ch + " is a consonant");
        }

        String y = (ch==v1 || ch==v2 || ch==v3 || ch==v4 || ch==v5) ? ch+ " is a vowel" : ch + " is a consonant";
        System.out.println(y);

/*******************************************************/

        char x;
        x='M';

        if( (x=='a') || (x=='e') || (x=='i') || (x=='o') || (x=='u') ){
            System.out.println(x + " is a Vowel");
        }
        else if( (x=='A') || (x=='E') || (x=='I') || (x=='O') || (x=='U') ){
            System.out.println(x + " is a Vowel");
        }
        else{
            System.out.println(x + " is a Consonant");
        }
    }
}