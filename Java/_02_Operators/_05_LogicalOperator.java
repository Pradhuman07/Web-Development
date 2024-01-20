                        //Logical Operators
//3 types   1.&& Logical AND   2.|| Logical OR    3.! Logical NOT
//Logical Operator mein operands are logics i.e true or false

public class _05_LogicalOperator
{
    public static void main(String[] args) 
    {
        int a=36,b=36;
        System.out.println( (a!=b) && (a<b) && (a<=b) && (b>=a) );
        System.out.println(!( (a!=b) && (a<b) && (a<=b) && (b>=a)));
    }
}
