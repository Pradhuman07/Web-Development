//Q1.Write a program to find the maximum b/w two number.
package Java_Old._02_ConditionalStatements;
import java.util.Scanner; 
public class Q1_MaxNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1:-");
        int num1=sc.nextInt();

        System.out.println("Enter Number 2:-");
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is greater than " + num2);
        }
        
        else if(num1<num2){
            System.out.println(num2 + " is greater than " + num1);
        }

        else{
            System.out.println("Both " + num1 + " and " + num2 + " are Equal");
        }
    }
}