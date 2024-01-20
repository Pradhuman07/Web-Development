public class _03_IRAT
{
    public static void main(String[] args) 
    {
        int n=5;   //take user input

        for(int r=0 ; r<n ; r++)      
        {
            for(int c=0 ; c<=r ; c++)
            {
                System.out.print("* ");
            } 
            System.out.println();
        }

        // int n=1;
        // while(n>5)
        // {
        //     for(int c=0 ; c<=n ; c++)
        //     {
        //         System.out.print("* ");
        //     } 
        //     System.out.println();  
        //     n++;
        // }
    }
}

// * 
// * * 
// * * * 
// * * * * 
// * * * * *