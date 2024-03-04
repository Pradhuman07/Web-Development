//Q3.Write a program to find wether the no. is +ve or -ve
package Java_Old._02_ConditionalStatements;
import java.util.Scanner;
public class Q3_PositiveNegative
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.:-");
        int x=sc.nextInt();
        
        if(x>0){
            System.out.println(x + " is a +ve no.");
        }

        else if(x<0){
            System.out.println(x + " is a -ve no."); 
        }

        else{
            System.out.println(x + " is zero ");
        }

        String y = x>0 ? x + " is a +ve no." : x<0 ? x + " is a -ve no." : x + " is zero" ;
        System.out.println(y);
    }
}