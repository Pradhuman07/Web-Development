public class _07_BitwiseOperators
{
    public static void main(String[] args) 
    {
    int x=72;  //x=01001000=72
    int y=122; //y=01111010=122

    int a=x|y; //a=01111010=122  
    int b=x&y; //b=01001000=72
    int c=x^y; //c=00110010=50    In XOR,if both i/p are same then o/p=0 if diff then 1.
    int d=~y;  //d=10000101=-123  

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d); 

}

}
