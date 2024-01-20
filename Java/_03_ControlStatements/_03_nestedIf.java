public class _03_nestedIf 
{
    public static void main(String[] args) 
    {
        int x=10,y=20;

        if(x<y)
        {
            System.out.println("1st");

            if(true)
            {
                System.out.println("2nd");
            }

            if(true)
            {
                System.out.println("3rd");
            }
        }

        if(x<y)
        {
            System.out.println("Reached");
        }
    }
}

//Note:-Run and Debug to see the line by line control of if
