package Java._01_Operators;
public class _04_RelationalOperator    
{
    public static void main(String[] args) 
    {
        int a=42;
        int b=36;

        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a!=b);

        int p=5,q=3;
        boolean r=p<q;          // int r=p<q;  Type mismatch since p<q is false and false is boolen datatype
        System.out.println(!r);
    }
}

//In java Relational Operators returns true or false;  Whereas in C,C++ they returns 1 or 0
//Relational Operator are also known as Comparison Operator