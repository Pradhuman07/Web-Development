package Revision._02_ConditionalStatements;
public class TernaryOperator
{
    public static void main(String[] args) 
    {
        int x=5;
        
        if(x>0)
        {
            System.out.println("It is a +ve no.");
        }

        else
        {
            System.out.println("It is a -ve no.");
        }

        String y = x>0 ? "It is a +ve no." : "It is a -ve no." ;
        System.out.println(y);
    }
}

//NO.(?) = NO.(:) #ALWAYS