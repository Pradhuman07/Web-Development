//Print the even number b/w 1 and the entered number

import java.util.*;       //*means all (all the classes)
public class Q1
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
        int x=s.nextInt();

        System.out.println("The Entered number is: " + x + " and the Even numbers b/w 1 and " + x + " are :-");

        for(int i=1 ; i<=x ; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);    
            }
        }
        
    }   
}

//agr no. of repetitions pta h to use for loop otherwise while 