public class _01_Square
{
    public static void main(String[] args) 
    {
        for(int r=0; r<6 ;r++)
    {
        for(int c=0; c<6 ; c++)
        {
            System.out.print("* ");
        }      
        System.out.println();   //cursor ko row1 se neeche le aaye
    }

    }
}

//outer loop ka sirf ek hi kaam h curson ko neeche laana
//most important thing to think about is the condition of inner loop