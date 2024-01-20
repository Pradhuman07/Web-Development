public class Q5 
{
    public static void main(String[] args) 
    {
        for(int i=0 ; i<4 ; i++)   //2 ki jgh u can write x(user input x=3)
        {
            System.out.println(i);

            for(int j=0 ; j<3 ; j++)
            {
                System.out.println(j);

                for(int k=0 ; k<2 ; k++)      //0,0,0,1,1,0,1,2,0,1,1,0,0,1,1,0,1,2,0,1,2,0,0,1,1,0,1,2,0,1,3,0,0,1,1,0,1,2,0,1,
                {
                    System.out.println(k);
                }
            }
        }
    }
}