public class _02_Ladderofif 
{
    public static void main(String[] args)
    
    {
        int x=10,y=20;

        if(x<y)
        {
            System.out.println("x is smaller than y");
        }

        if(x>y)
        {
            System.out.println("x is greater than y");
        }

        if(x==y)                    //if(x=y) = error....since it is a assignment not a condition 
        {
            System.out.println("x is equal to y");
        }
    }
}
