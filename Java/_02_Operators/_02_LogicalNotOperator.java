public class _02_LogicalNotOperator 
{
    public static void main(String[] args) 
    {
        int x=5;
        System.out.println(!(x<6));
        System.out.println(!(x>6));

        int p=5,q=4;
        System.out.println(p<q);
        System.out.println(!(p<q));
        System.out.println(p>q);
        System.out.println(!(p>q));

        System.out.println(p>q);
        System.out.println(!(p>q));
        System.out.println(!(!(p>q)));      //2! cancels each other
        System.out.println(!(!(!(p>q))));   //3! means 1! since 2 got canceled

        boolean z=true;
        System.out.println(!z);
    } 
}
