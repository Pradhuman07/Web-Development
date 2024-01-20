//Q4.Print 100,95,90,....5.

// import java.util.Scanner;

public class Q4
{
    public static void main(String args[])
    {
        // Scanner ref = new Scanner(System.in);

        // System.out.println("Enter a number: ");
        // int x=ref.nextInt();

        for(int i=100 ; i>0; i--)    //instead of i=100 you can write i=x(user input x=100) thats it only..no other changes
        {
            if(i%5==0)
            {
                System.out.println(i);
            }
        }

        System.out.println("Out of Loop");
    }
}