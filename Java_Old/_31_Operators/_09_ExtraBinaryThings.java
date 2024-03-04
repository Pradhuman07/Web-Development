package Java_Old._31_Operators;
public class _09_ExtraBinaryThings 
{
public static void main(String[] args) 
{
    int y=0b1000000000000000000000000000011; //2^30+2^1+2^0 //here msb i.e 32nd bit is absent which means by default 0 which means +ve
    System.out.println(y);
    
    int z=0b11111111111111111111111111111000;  //-8 copy page no.25
    System.out.println(z); 
}    
}
