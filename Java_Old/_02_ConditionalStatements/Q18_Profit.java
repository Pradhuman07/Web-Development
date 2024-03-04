package Java_Old._02_ConditionalStatements;
//Q18. Write a program to calculate profit or loss


public class Q18_Profit 
{
    public static void main(String[] args) 
    {
        int moneyInvested = 2000;
        int moneyEarned = 1500;

        if(moneyEarned>moneyInvested)
        {
            System.out.println("Profit of Rs " + (moneyEarned-moneyInvested));
        }

        else
        {
            System.out.println("Loss of Rs " + (moneyInvested-moneyEarned));
        }

        String y = moneyEarned>moneyInvested ? "Profit of Rs " + (moneyEarned-moneyInvested) : "Loss of Rs " + (moneyInvested-moneyEarned) ;
        System.out.println(y);
    }
}
