public class _01_Static 
{
    static int joy(int n)           //parameter
    {
        int num=n;                  
        return num;
    }

    public static void main(String[] args) 
    {
        int R =joy(5);              //argument
        System.out.println(R);
    }
}