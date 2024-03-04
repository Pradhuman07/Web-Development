package Java_Old._28_NumberPatterns;

public class _03_Pyramid 
{
        public static void main(String[] args)
        {
            int n=5;

            for(int r=1 ,X=1 ; r<=n ; r++ , X+=1)
            {
                for(int c=1 ; c<=n-r ; c++)
                {
                    System.out.print("  ");
                }
                for(int c=1 ; c<=r ; c++)
                {
                    System.out.print(X + " ");
                }
                for(int c=1 ; c<r ; c++)
                {
                    System.out.print( X + " ");
                }
                           
                System.out.println();
            }
        }
}