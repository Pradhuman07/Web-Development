//Q2.Print Even and Odd Numbers from 1 to n separately
package Revision._03_ForLoop;
import java.util.Scanner;
public class Q2_PrintingEvenOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num = sc.nextInt();

        System.out.println("Even numbers are:-");
        for(int i=1; i<=num ; i++){
            if(i%2==0){
                System.out.print(i + ",");
            }
        }

        System.out.println();
        System.out.println("Odd numbers are:-");
        for(int i=1; i<=num ; i++){
            if(i%2!=0){
                System.out.print(i + ",");
            }
        }
        
        // System.out.println("Even numbers are:-");
        // for(int i=1 ; (i<=num && i%2==0) ; i++){
        //     System.out.print(i + " ");
        // }
    }
}
