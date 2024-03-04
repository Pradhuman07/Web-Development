//WAP to swap 2 numbers using third variable 

package Java_Old._29_Array;

public class Swap 
{
    public static void main(String[] args) 
    {
        int a=5;
        int b=7;
        int c;

        c=a;  //c mein a ki value assign hogyi , a khaali
        a=b;  //"a mein b ki value assign hogyi" , b khaali
        b=c;  //"b mein c ki value jo ki a ki value hold kia hua tha"


        System.out.println(a);
        System.out.println(b);
        // System.out.println(c);

        //directly a=b krdenge to a mein to 7 store ho jyegi pr a mein se fir 5 delete ho jayega fir b ko kya doge   ....variable overriding
    }    
}
