package Revision._08_PatternPrinting;
public class _05_B
{
    public static void main(String[] args) 
    {
        int n=5;

        for(int r=0; r<n ; r++)
        {
            for(int c=0 ; c<n-r ; c++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1 ; i<n ; i++)
        {
            for(int j=0 ; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// * * * * *
// * * * *
// * * *
// * *
// * 
// * * 
// * * * 
// * * * * 
// * * * * *