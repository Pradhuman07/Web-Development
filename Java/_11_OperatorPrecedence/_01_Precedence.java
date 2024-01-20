public class _01_Precedence
{
    public static void main(String[] args) 
    {
        int x=2 , y=3 ,z=5;
        System.out.println(x + y-- + y + z + x-- * x/z--);
    }
}