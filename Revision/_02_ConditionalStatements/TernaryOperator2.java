//Q3.Write a program to find wether the no. is +ve or -ve
package Revision._02_ConditionalStatements;
public class TernaryOperator2
{
    public static void main(String[] args) 
    {
        int x=-89;
        
        if(x>0)
        {
            System.out.println(x + " is a +ve no.");
        }

        else if(x<0)     //(x==0) can also be correct
        {
            System.out.println(x + " is a -ve no."); 
        }

        else
        {
            System.out.println(x + " is zero ");
        }

        String y = x>0 ? x + " is a +ve no." : x<0 ? x + " is a -ve no." : x + " is zero" ;
        System.out.println(y);
    }
}