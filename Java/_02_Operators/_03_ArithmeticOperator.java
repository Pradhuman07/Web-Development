public class _03_ArithmeticOperator 
{
    public static void main(String[] args) 
    {
        int a=5,b=2;

        int c=a/b;              //division operator always returns Quotient value
        int d=a%b;              //Modulas operator always returns Remainder value

        System.out.println(c);
        System.out.println(d);

        //#Important Point

        int p=2 , q=5;

        System.out.println(p/q);  //Q=0 therefore o/p=0
        System.out.println(p%q);  //Divident=(Divisor*Quotient) + Remainder
        
        //Therefore if Nr(i.e divident)<Dr(i.e divisor) then ans is Nr(i.e divident) only

    }
}
