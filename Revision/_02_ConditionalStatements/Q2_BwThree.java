//Q2.Write a program to find the maximum b/w three numbers.
package Revision._02_ConditionalStatements;
import java.util.Scanner;
public class Q2_BwThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number:-");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number:-");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd number:-");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is the greatest");
        }

        else if(num2>num3 && num2>num1){
            System.out.println(num2 + " is the greatest");
        }

        else if(num3>num1 && num3>num2){
            System.out.println(num3 + " is the greatest");
        }

        else{
            System.out.println("All three are Equal");
        }
    }
}
