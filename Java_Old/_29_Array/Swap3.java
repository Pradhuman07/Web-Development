package Java_Old._29_Array;

public class Swap3 
{
    public static void main(String[] args) 
    {//exor mein 0+1=1 , 1+0=1 , 0+0=0, 1+1 =0
        int a=5;    // a = 0000 0101
        int b=3;    // b = 0000 0011
        
        a=a^b;      // a = 0000 0110
        b=a^b;      // b = 0000 0101 = a(5)
        a=a^b;      // a = 0000 0011 = b(3)

        System.out.println(a);   //3
        System.out.println(b);   //5
    }
}
