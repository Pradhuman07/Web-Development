public class _08_Whyxleftshift32isnegative
{
    public static void main(String[] args) 
    {
    int x=0b10000000000000000000000000000011;  //2^31 + 2^1 +2^0 = 2147483451....now subtract 2^32 from it
    System.out.println(x);    //-ve bcoz msb(32nd bit) is 1   //Note:-MSB is not last bit though 32nd bit   
    
    //Now the reaseon of _19_doubt x<<30; is this only...just shift the no. and count them...
    //...basically jb msb pr 1 aajata h toh decimal conversion ka tarika alg hojata h i.e total add krke -2^32 krdete h
    
}
}
