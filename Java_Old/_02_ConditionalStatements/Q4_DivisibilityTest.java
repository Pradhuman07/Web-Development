//Q4.Write a program to check wether the no. is divisible by 5 and 11 or not
package Java_Old._02_ConditionalStatements;
import java.util.Scanner;
public class Q4_DivisibilityTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        if(num%5==0 && num%11==0){
            System.out.println("Number is divisible by both 5 and 11");
        }

        if(num%5==0 && num%11!=0){
            System.out.println("The number is divisible by 5 but not by 11");
        }

        if(num%11==0 && num%5!=0){
            System.out.println("The number is divisible by 11 but not by 5");
        }

        if(num%5!=0 && num%11!=0){
            System.out.println("The number is divisible neither by 5 nor by 11");
        }
    }
}