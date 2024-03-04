package Java_Old._31_Operators;
public class _16_Question 
{
    public static void main(String[] args) 
    {
        int x=5,y=6;
        System.out.println(x++ + y++ + x + y + ++x + --y);
        //                  5  +  6  + 6 + 7 +  7  +  6          = 37 = o/pccccccccccccccccccccccccccccccccccccccccccccccccccccccccc
    
        int a=5,b=6;
        System.out.println(a + b++ + b + a + a++ + a + b++ + b);
        //                 5 +  6  + 7 + 5 +  5  + 6 +  7  + 8   = 49 = o/p.9

        int m=2;
        System.out.println(--m - m - --m - --m);
    }
}
