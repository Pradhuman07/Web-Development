public class _11_Squaring 
{
    static int Square_of_x(int x)
    {
        int ans=x*x;
        return ans;
    }
    public static void main(String[] args) 
    {
        int x=5;
        
        int R=Square_of_x(x);
        System.out.println("The square of x="+x+" is "+R+".");
    }
}