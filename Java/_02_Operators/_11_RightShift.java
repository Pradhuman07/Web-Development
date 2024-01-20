public class _11_RightShift 
{
    public static void main(String[] args) 
    {
        int x=5;
        System.out.println(x>>5);   //pg 27
        System.out.println(x>>32);  
        System.out.println(x>>33);

        int y=-5;                    
        System.out.println(y>>1);    //pg 28
        System.out.println(y>>32);   //29
        System.out.println(y>>33);

        System.out.println(y>>29);   //pg 29

        System.out.println(y>>3);
        System.out.println(y>>4);
        System.out.println(y>>5);
        System.out.println(y>>30);
        System.out.println(y>>31);
        System.out.println(y>>32);

    }
}
//pg 26